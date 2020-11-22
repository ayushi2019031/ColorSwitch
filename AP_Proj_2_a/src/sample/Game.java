package sample;
import com.sun.javafx.scene.shape.CircleHelper;
import javafx.animation.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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

//import static javafx.scene.web.WebEngine.PulseTimer.animation;

public class Game implements Serializable {
    Ball ball;
    String date;
    Square square = new Square();
    ArrayList<Obstacles> listOfObstacles;
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
    IntersectingCircle cirCirI = new IntersectingCircle();

    public Game(Main app) throws IOException {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.date = dtf.format(now);
        this.ball = new Ball();
        this.listOfObstacles = new ArrayList<>();
        this.numOfStars = 0;
        this.switcher = new ColourSwitcher();
        this.app = app;
        this.endGameMenu = new EndGameMenu();
        this.exitMenu = new ExitMenu();

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
            stage.setScene(new Scene(root, 300, 275));
            stage.show();
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
            switcher.setScene(scene, pane, stage);

            System.out.println("Hi");
        //         square.display( pane);
            //octagon.display(pane);
            displayStar(pane);
        //    lCirci.display(pane);
           // circle_.display(pane);
          //  cirCirI.display(pane);
            lsquare.display(pane);
        stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        //    endGameMenu.initializeGame(stage);
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
        pane.getChildren().add(starD);
    }
    private void moveBall(Scene scene){
        scene.addEventFilter(KeyEvent.KEY_PRESSED, (KeyEvent event) -> {
            System.out.println("Key pressed");
            if (event.getCode() == KeyCode.UP) {
                TranslateTransition transition = createTranslateTransition(ball.circle);
                System.out.println("F1 pressed");
                ball.circle.setCenterY(ball.circle.getCenterY() + 1000);
                //ball.circle.setRadius(0);

            }
            event.consume();
        });
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
                exitMenu.initializeGame(stage);
                //stage.close();
            }
        });
    }
    public String toString(){
        return date;
    }
    public void AddToPane(AnchorPane pane){
//        AnchorPane root = new AnchorPane();
//        root.setMaxHeight(Double.MIN_VALUE);
//        root.setMaxWidth(Double.MIN_VALUE);
//        root.setMinHeight(Double.MAX_VALUE);
//        root.setMinWidth(Double.MAX_VALUE);
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
    public void initialize(Arc arc) {
        Timeline animation = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
                new KeyFrame(Duration.seconds(2), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() - 360, Interpolator.LINEAR))
        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
    }
}