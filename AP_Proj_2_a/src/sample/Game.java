package sample;
import com.sun.javafx.scene.shape.CircleHelper;
import javafx.animation.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.*;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

//import static javafx.scene.web.WebEngine.PulseTimer.animation;

public class Game implements Serializable {
    AnchorPane Obstaclespane = new AnchorPane();
    static int score;
    Ball ball;
    Random random = new Random();
    boolean[] pause = new boolean[1];
    String date;
    Square square = new Square();
    ArrayList<Obstacles> listOfObstacles;
    ArrayList<Stage> listOFOpenStages = new ArrayList<>();
    int numOfStars;
    ColourSwitcher switcher;
    boolean ifTouched;
    Main app;
    Circle_ circle_= new Circle_();
    LayeredCircles lCirci  = new LayeredCircles();
    LayeredSquares lsquare = new LayeredSquares();
    Octa octagon = new Octa();
    static int num_of_restoration_points;
    ExitMenu exitMenu;
    EndGameMenu endGameMenu;
    ImageView starD;
    Random randomForColor;

    IntersectingCircle cirCirI = new IntersectingCircle();
    AnimationTimer animationTimer;
    public Game(Main app) throws IOException {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.date = dtf.format(now);
        score = 0;
        this.randomForColor = new Random();
        this.ball = new Ball();
        this.listOfObstacles = new ArrayList<>();
        this.numOfStars = 0;
        this.switcher = new ColourSwitcher();
        this.app = app;
        this.endGameMenu = new EndGameMenu();
        this.exitMenu = new ExitMenu();
        Obstaclespane.setLayoutY(20);
        exitMenu.setGame(this);
        endGameMenu.setGame(this);
        initializeGame();


    }
    public void initializeGame(){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

            Stage stage = new Stage();
            // stage.
            //    Button btnExitGameMenu  = new Button("Exit Game");

            stage.setTitle("Game started");

            Rectangle2D bounds = Screen.getPrimary().getVisualBounds();

            stage.setX(bounds.getMinX());
            stage.setY(bounds.getMinY());
            AnchorPane pane = new AnchorPane();
            Button btnExitGame = new Button();
            Image imageDecline = new Image(getClass().getResourceAsStream("pause.png"), 45, 45, false, false);

            btnExitGame.setGraphic(new ImageView(imageDecline));
            setBtnExitGame(btnExitGame, stage);pane.getChildren().add(btnExitGame);
            Text text4 = new Text();
            text4.setText("0");
            text4.setFont((Font.font("cambria", FontWeight.BOLD, FontPosture.REGULAR, 50)));
            text4.setFill(Color.WHITE);
            text4.setStrokeWidth(10);
            text4.setX(10);
            text4.setY(45);
            pane.getChildren().add(text4);
            Scene scene = new Scene(pane, 540, 650);
            pane.prefHeight(600.0);
            pane.prefHeight(645.0);
            pane.setStyle("-fx-background-color: #393f38;");
            ball.setPane(pane, scene, stage);

            System.out.println("Hi");
//            Obstaclespane.setPrefSize(100,10);
            final long[] lastNanoTime = {System.nanoTime()};
            stage.setScene(scene);
            int[] boo = {0};
            ArrayList<String> setInputs = new ArrayList<>();
            scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent keyEvent) {
                    String e = keyEvent.getCode().toString();
                    if (!setInputs.contains("UP") && boo[0] != 1) {
                        setInputs.add(e); boo[0] = 1;
                        //    System.out.println("Registering the input UP");
                        //     System.out.println(setInputs.toString());
                    }
                }
            });
            scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent keyEvent) {
                    String e = keyEvent.getCode().toString();
                    setInputs.remove(e);
                    setInputs.remove("UP");
                    boo[0] = 0;
                    //        System.out.println("REGISTERING THE INPUT DOWN ");
                    //       System.out.println(setInputs.toString());
                }
            });


            animationTimer  =     new AnimationTimer() {

                Obstacles activeObstacle = null;
                Obstacles activeObstacle2 = null;

                @Override
                public void handle(long l) {

//                if (activeObstacle == null){}
                    if (activeObstacle == null){
                        activeObstacle = displayObstacle();
                        activeObstacle.display(Obstaclespane);
                        try {
                            displayStar(Obstaclespane);
                            switcher.setScene(scene, Obstaclespane, stage);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (pause[0]) {

                        lastNanoTime[0] = l;
                        pause[0] = false;
                    }
                    double elapsedTime = (double) (l - lastNanoTime[0]) / (double) 10e9;
                    double aj = ball.circle.getLayoutY() + ball.circle.getTranslateY();

//                    System.out.println("LASTNANO: " + lastNanoTime[0]);
                    lastNanoTime[0] = l;
                    ball.setVelocity(0, 0);
                    if (setInputs.contains("UP") && boo[0] == 1) {
                        Obstaclespane.setLayoutY(Obstaclespane.getLayoutY() + 3);
                        if (Math.abs(aj - (Obstaclespane.getLayoutY()+350+20)) <= 10) {
                            Obstaclespane.getChildren().remove(starD);
                            score++;
                            text4.setText(score+"");
                        }

                        if (Math.abs(aj - (Obstaclespane.getLayoutY()+168+20)) <= 20) {
                            Obstaclespane.getChildren().remove(switcher.cir1);
                            Obstaclespane.getChildren().remove(switcher.cir2);
                            Obstaclespane.getChildren().remove(switcher.cir3);
                            int color = randomForColor.nextInt(4);
                            ball.setBallColor(color);
                        }

                        ball.addVelocity(0, -10000);
                        ball.update(elapsedTime);
                        ball.addVelocity(0, 200);
                        ball.update(elapsedTime);
                        pane.getChildren().remove(ball.circle);
                        ball.render(pane);
                        boo[0] = 0;
                    }
                    else {
                        ball.addVelocity(0, 800);
                        ball.update(elapsedTime);
                        pane.getChildren().remove(ball.circle);
                        ball.render(pane);
                    }

                    if (Obstaclespane.getLayoutY() >= 600) {
                        int i = 0;
                        HashSet<Integer> set = new HashSet<>();
                        for (Object obj: Obstaclespane.getChildren()){
                            if (obj instanceof Node){
                                set.add(i);
                            }
                            i += 1;
                        }
                        for (int o: set){
                            Obstaclespane.getChildren().remove(o);}
                        activeObstacle = null;

                        Obstaclespane.setLayoutY(0);}
                };

                //pane.getChildren().add(Obstaclespane);
            };
            animationTimer.start();
            stage.setResizable(false);
            stage.setScene(scene);
            while (listOFOpenStages.contains(exitMenu.stage)){
                pause[0] = true;
                animationTimer.stop();
            }
//            Obstaclespane.setPrefSize(100,100);
            pane.getChildren().add(Obstaclespane);
            Obstaclespane.setStyle("-fx-background-color: #393f38;");
            stage.show();
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("PRINT");
            return ;
        }
    }
    public void displayStar(AnchorPane pane) throws IOException{
        System.out.println("Stars ");
        Image image  = new Image(new FileInputStream("./src/sample/star.png"));
        starD = new ImageView(image);
        starD.setX(280);
        starD.setY(350);
        starD.setFitHeight(25);
        starD.setFitWidth(25);
        RotateTransition rt = new RotateTransition(Duration.millis(3000), starD);
        rt.setByAngle(-360);
        rt.setCycleCount(Animation.INDEFINITE);
        rt.setInterpolator(Interpolator.LINEAR);
        rt.play();
        pane.getChildren().add(starD);

    }

    private TranslateTransition createTranslateTransition(Circle circle) {
        final TranslateTransition transition = new TranslateTransition(Duration.seconds(0.25), circle);
        transition.setOnFinished(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent t) {
                circle.setCenterX(circle.getTranslateX() + circle.getCenterX());
                circle.setCenterY(circle.getTranslateY() + circle.getCenterY());
                circle.setTranslateX(0);
                circle.setTranslateY(0);
            }
        });
        return transition;
    }

    public void setBtnExitGame(Button btnExitGame, Stage stage){

        btnExitGame.setLayoutY(8);
        btnExitGame.setLayoutX(480);
        btnExitGame.setStyle("-fx-background-color: #393f38;");
        btnExitGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
//                animationTimer.stop();
                exitMenu.initializeGame(stage, animationTimer);

//                for (Obstacles obstacles: listOfObstacles){
//
//                }
                //stage.close();
            }
        });
    }
    public String toString(){
        return date;
    }
    public void AddToPane(AnchorPane pane){

        pane.prefHeight(600.0);
        pane.prefWidth(645.0);
        square.display(pane);
        circle_.display(pane);
        octagon.display(pane);
        pane.setStyle
                (
                        "-fx-padding: 10;" +
                                "-fx-border-style: solid inside;" +
                                "-fx-border-width: 2;" +
                                "-fx-border-insets: 5;" +
                                "-fx-border-radius: 5;" +
                                "-fx-border-color: blue;"
                );
        //
    }

    public Obstacles displayObstacle(){

        int obstacleNumber = random.nextInt(6);

        if(obstacleNumber==0){
            Circle_ circle_ = new Circle_();
            return circle_;
        }
        else if(obstacleNumber==1){
            IntersectingCircle circle = new IntersectingCircle();
            return circle;
        }
        else if(obstacleNumber==2){
            LayeredCircles circles = new LayeredCircles();
            return  circles;
        }
        else if(obstacleNumber==3){
            LayeredSquares squares = new LayeredSquares();
            return squares;
        }
        else if(obstacleNumber==4){
            Octa octa = new Octa();
            return octa;
        }
        else{
            Square square = new Square();
            return square;
        }
    }
}