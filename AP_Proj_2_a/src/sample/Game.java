package sample;


import com.sun.javafx.scene.shape.CircleHelper;
import javafx.animation.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Bounds;
import javafx.geometry.Rectangle2D;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
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
import java.nio.charset.IllegalCharsetNameException;
import java.nio.file.Paths;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import javafx.animation.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Bounds;
import javafx.geometry.Rectangle2D;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
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
import org.w3c.dom.ls.LSOutput;

import java.io.*;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.file.Paths;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;


public class Game implements Serializable {
    transient  AnchorPane Obstaclespane = new AnchorPane();
    int score = 0;
    Ball ball;
    Random random = new Random();
    boolean[] pause = new boolean[1];
    String date;
    ArrayList<Obstacles> listOfObstacles;
    transient ArrayList<Stage> listOFOpenStages;
    int numOfStars;
    transient ColourSwitcher switcher;
    boolean ifTouched;
    Main app;
    static int num_of_restoration_points;
    transient ExitMenu exitMenu;
    transient EndGameMenu endGameMenu;
    transient ImageView starD;
    transient Random randomForColor;
    transient AnimationTimer animationTimer;
    ArrayList<Integer> listOfObs_deserialisation;
    transient AnchorPane pane;
    ArrayList<Double> listofYs;
    transient Stage stage;
    transient Scene scene;
    transient  Obstacles jugaad;
    boolean jugaad2 = false;
    boolean baa = false;
     Obstacles refer;
     int hero = -1;
 //   ArrayList<AnchorPane> listOfObstaclesObject;
    public Game(Main app) throws IOException {
        System.out.println("Oye oye oye ");

        this.listofYs = new ArrayList<>();
        this.listOfObs_deserialisation = new ArrayList<>();
        AnchorPane Obstaclespane = new AnchorPane();
            pane = new AnchorPane();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.stage = new Stage();
        this.scene = new Scene(pane,540,650);
        this.date = dtf.format(now);
        this.listOFOpenStages = new ArrayList<>();
        this.randomForColor = new Random();
       this.ball = new Ball();
        this.listOfObstacles = new ArrayList<>();
     //   this.listOfObstaclesObject = new ArrayList<>();
        this.switcher = new ColourSwitcher();
        this.app = app;
        this.endGameMenu = new EndGameMenu();
        this.exitMenu = new ExitMenu();
 //       Obstaclespane.setLayoutY(20);
        exitMenu.setGame(this);
        endGameMenu.setGame(this);//initializeGame();
        ball.setPane(pane, scene, stage);
    numOfStars = 0;
//        for (int i = 0; i < listOfObs_deserialisation.size(); i++){
//            numOfStars += 1;
//            System.out.println("Baby one more time");
//            AnchorPane pp = new AnchorPane();
//            pp.setLayoutY(listofYs.get(i));
//            int r = listOfObs_deserialisation.get(i);
//            if (r == 0) {
//                Circle_ circle_ = new Circle_();
//                //return circle_;
//                circle_.display(pp);
//            } else if (r == 1) {
//                IntersectingCircle circle = new IntersectingCircle();
//                //return circle;
//                circle.display(pp);
//            } else if (r == 2) {
//                LayeredCircles circles = new LayeredCircles();
//                // return  circles;
//                circles.display(pp);
//            } else if (r == 3) {
//                LayeredSquares squares = new LayeredSquares();
//                squares.display(pp);
//                //return squares;
//            } else if (r == 4) {
//                Octa octa = new Octa();
//                octa.display(pp);
//                ///return octa;
//            } else {
//                Square square = new Square();
//                square.display(pp);
//                //    return square;
//            }
//            pane.getChildren().add(pp);
//        }

    }
    public void music(){
        String s = "C:/Users/ayush/IdeaProjects/AP_Proj_2_a/src/sample/chink.mp3";
        Media h = new Media(Paths.get(s).toUri().toString());
        MediaPlayer  mediaPlayer = new MediaPlayer(h);
        mediaPlayer.play();
    }


    MediaPlayer mediaPlayer1;
    public void music1(){
        String s = "C:/Users/ayush/IdeaProjects/AP_Proj_2_a/src/sample/dhum.mp3";
        Media h = new Media(Paths.get(s).toUri().toString());
        MediaPlayer mediaPlayer1 = new MediaPlayer(h);
        mediaPlayer1.play();
    }
    public void initializeGame(){
        try {
            ArrayList<AnchorPane> listOfObstaclesObject = new ArrayList<>();
            for (int i = 0; i < listOfObs_deserialisation.size(); i++){
                numOfStars += 1;
                System.out.println("Baby one more time " + listOfObs_deserialisation.get(i));
                AnchorPane pp = new AnchorPane();
                pp.setLayoutY(listofYs.get(i));
                int r = listOfObs_deserialisation.get(i);
                if (r == 0) {
                    Circle_ circle_ = new Circle_();
                    //return circle_;
                    circle_.display(pp, Game.this);
                } else if (r == 1) {
                    IntersectingCircle circle = new IntersectingCircle();
                    //return circle;
                    circle.display(pp, Game.this);
                } else if (r == 2) {
                    LayeredCircles circles = new LayeredCircles();
                    // return  circles;
                    circles.display(pp, Game.this);
                } else if (r == 3) {
                    LayeredSquares squares = new LayeredSquares();
                    squares.display(pp, Game.this);
                    //return squares;
                } else if (r == 4) {
                    Octa octa = new Octa();
                    octa.display(pp, Game.this);
                    ///return octa;
                } else {
                    Square square = new Square();
                    square.display(pp, Game.this);
                    //    return square;
                }

                pane.getChildren().add(pp);
                listOfObstaclesObject.add(pp);
            }

            System.out.println(listOfObstacles.size());
            //     this.date = dtf.format(now);

            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

          //  Stage stage = new Stage();
            // stage.
            Button btnExitGameMenu = new Button("Exit Game");

            stage.setTitle("Game started");
            boolean[] started = {false};
            Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
            for (int r: listOfObs_deserialisation){
                System.out.println("R: " + r);
            }

            stage.setX(bounds.getMinX());
            stage.setY(bounds.getMinY());
          //  AnchorPane pane = new AnchorPane();
            Button btnExitGame = new Button();
            Image imageDecline = new Image(getClass().getResourceAsStream("pause.png"), 45, 45, false, false);

            btnExitGame.setGraphic(new ImageView(imageDecline));
            setBtnExitGame(btnExitGame, stage);
            pane.getChildren().add(btnExitGame);
            Text text4 = new Text();
            text4.setText("0");
            text4.setFont((Font.font("cambria", FontWeight.BOLD, FontPosture.REGULAR, 50)));
            text4.setFill(Color.WHITE);
            text4.setStrokeWidth(10);
            text4.setX(10);
            text4.setY(45);
            pane.getChildren().add(text4);
         //   Scene scene = new Scene(pane, 540, 650);
            pane.prefHeight(600.0);
            pane.prefHeight(645.0);
            pane.setStyle("-fx-background-color: #393f38;");

//        for (AnchorPane p: listOfObstaclesObject){
//            pane.getChildren().add(p);
//        }
            int u = 0;
            System.out.println("Ohoh ohooh ohoh ohoh ohoh ohoh ohoh");

            final long[] lastNanoTime = {System.nanoTime()};
            stage.setScene(scene);
            int[] boo = {0};
            ArrayList<String> setInputs = new ArrayList<>();
            boolean[] finalStarted = started;
         //   ball.setPane(pane, scene, stage);
            scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent keyEvent) {
                    String e = keyEvent.getCode().toString();
                    if (!setInputs.contains("UP") && boo[0] != 1) {
                        if (!finalStarted[0]) {
                            animationTimer.start();
                            finalStarted[0] = true;
                        }
                        setInputs.add(e);
                        boo[0] = 1;
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

            boolean[] peeps = {true};
            animationTimer = new AnimationTimer() {
                boolean m; boolean d = false;
                Obstacles activeObstacle = null;
                boolean activeObstacleColorSwitcher = false;
                boolean activeObstacleScore = false;
                Obstacles activeObstacle2 = null;
                boolean activeObstacle2ColorSwitcher = false;
                boolean activeObstacle2Score = false;
                boolean[] breking_bad = {false};
                boolean[] breking_bad2 = {false};

                @Override
                public void handle(long l) {
                 //   System.out.println(refer);
                    if (activeObstacle == null ) {
                        System.out.println("Ok");
//                        switcher.setScene(scene, Obstaclespane, stage);
                        System.out.println("Swither");

                   // displayStar(Obstaclespane);
                        try {
                      //      switcher.setScene(scene, Obstaclespane, stage);
                            listOfObstaclesObject.add(new AnchorPane());
                            Obstaclespane = listOfObstaclesObject.get(listOfObstaclesObject.size() - 1);
                            Obstaclespane.setLayoutY(-180);
                            m = false;

                            if (!jugaad2){
                           activeObstacle = displayObstacle();}
                            else {
                                activeObstacle = jugaad;
                            }
                            for (int i = 0; i < listOfObstaclesObject.size(); i++){
                                if (listofYs.size()< i + 1){listofYs.add( listOfObstaclesObject.get(i).getLayoutY());}
                                else{  listofYs.set(i, listOfObstaclesObject.get(i).getLayoutY());}
                            }
                            if (activeObstacle instanceof Circle_){ listOfObs_deserialisation.add(0);}
                            if (activeObstacle instanceof IntersectingCircle){ listOfObs_deserialisation.add(1);}
                            if (activeObstacle instanceof LayeredCircles){ listOfObs_deserialisation.add(2);}
                            if (activeObstacle instanceof LayeredSquares){ listOfObs_deserialisation.add(3);}
                            if (activeObstacle instanceof Octa){ listOfObs_deserialisation.add(4);}
                            if (activeObstacle instanceof Square){ listOfObs_deserialisation.add(5);}
                    //       jugaad = activeObstacle;
                        //   jugaad2 = false;
  //                          activeObstacle = new Square();
//                            ball.color = 1;
//                            ball.setBallColor(1);
                            boolean dubdub = false; refer = activeObstacle;
                            hero = activeObstacle.getId();
                            for (Node k: Obstaclespane.getChildren()){if ((k instanceof Arc) || k instanceof Rectangle) {dubdub = true;}}
                            if (!dubdub){

                            activeObstacle.display(Obstaclespane, Game.this);}
                            activeObstacleScore = false;
                            activeObstacleColorSwitcher = false;
                            displayStar(Obstaclespane);
                            pane.getChildren().add(Obstaclespane);
                            breking_bad[0] = false;
//                            circle_.display(Obstaclespane);

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

          //  refer = activeObstacle;
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
                        for (AnchorPane panes_Obs : listOfObstaclesObject) {
                            panes_Obs.setLayoutY(panes_Obs.getLayoutY() + 5);
                        }
                        //    Obstaclespane.setLayoutY(Obstaclespane.getLayoutY() + 5);
                        if (!(ball.circle.getTranslateY() + 610 < 400)) {
                            ball.addVelocity(0, -8000);
                        }
                        ball.update(elapsedTime);

                       ball.addVelocity(0, 200);
                        ball.update(elapsedTime);
                        pane.getChildren().remove(ball.circle);
                        ball.render(pane);
                        boo[0] = 0;
                    } else {
                        // for (AnchorPane panes_Obs: listOfObstaclesObject){panes_Obs.setLayoutY(panes_Obs.getLayoutY() -1);}
                        //    Obstaclespane.setLayoutY(Obstaclespane.getLayoutY() -1);
                    //   ball.addVelocity(0, 800);
                        ball.update(elapsedTime);

                        pane.getChildren().remove(ball.circle);
                        ball.render(pane);
                    //    System.out.println(ball.circle.getBoundsInParent());
                    }

                    //Star
                    if (activeObstacle instanceof Circle_) {
                        peeps[0] = ((Circle_) activeObstacle).isObstacleCrossed(Game.this,(Circle_)activeObstacle, ball, Obstaclespane,  stage, breking_bad, text4);
                    }
                    if (activeObstacle instanceof LayeredCircles) {
                        peeps[0] = ((LayeredCircles) activeObstacle).isObstacleCrossed(Game.this,(LayeredCircles)activeObstacle, ball, Obstaclespane,  stage, breking_bad, text4);
                    } else if (activeObstacle instanceof Square) {
                        peeps[0] = ((Square) activeObstacle).isObstacleCrossed(Game.this, (Square) activeObstacle, ball, Obstaclespane, stage, breking_bad, text4);
                    } else if (activeObstacle instanceof IntersectingCircle) {
                        boolean Inside = false;
                        peeps[0] = ((IntersectingCircle) activeObstacle).isObstacleCrossed(Game.this, (IntersectingCircle) activeObstacle, ball, Obstaclespane, stage, breking_bad, text4);
                    } else if (activeObstacle instanceof LayeredSquares) {
                        peeps[0] = ((LayeredSquares) activeObstacle).isObstacleCrossed(Game.this,(LayeredSquares) activeObstacle,ball, Obstaclespane,  stage, breking_bad, text4);
                    } else if (activeObstacle instanceof Octa) {
                        peeps[0] = ((Octa) activeObstacle).isObstacleCrossed(Game.this,(Octa)activeObstacle, ball,  Obstaclespane, stage, breking_bad, text4);
                    } else if (activeObstacle instanceof LayeredOcta) {
                        peeps[0] = ((LayeredOcta) activeObstacle).isObstacleCrossed(Game.this,(LayeredOcta)activeObstacle, ball, Obstaclespane,  stage, breking_bad, text4);
                    }

//                    if (!peeps[0]) {
//                        try{
//                            endGameMenu.initializeGame(stage);
//                        }
//                        catch (Exception e){
//                            e.printStackTrace();
//                        }
//                    }
                    if (Math.abs(aj - (Obstaclespane.getLayoutY() + 350 + 20)) <= 20) {

                        Obstaclespane.getChildren().remove(starD);
                        if (!activeObstacleScore) {
                            score++;
                            text4.setText(score + "");
                            activeObstacleScore = true;
                        }
                        Obstaclespane.getChildren().remove(starD);
                        if(!m){
                            music();
                            m = true;
                        }
                        if(!activeObstacleScore) {
                            score++;
                            text4.setText(score + "");
                            activeObstacleScore = true;
                        }
                    }
//switcher.setScene(scene, listOfObstaclesObject.get(listOfObstaclesObject.size() - 1) , stage);
                    if (Math.abs(aj - (Obstaclespane.getLayoutY() + 168 + 20)) <= 20) {
                        switcher.setScene(scene, listOfObstaclesObject.get(listOfObstaclesObject.size() - 1) , stage);
                        if(!d){
                            music1();
                            d = true;
                        }
                        int color;
                        System.out.println("OyeOye Oye Oyeoooooooooooooooooooooooooooooooooooooooooooo");
                       // jugaad2 = true;
//                        for (int i = 0; i < listOfObstaclesObject.size(); i++){
//                            if (listofYs.size()< i + 1){listofYs.add( listOfObstaclesObject.get(i).getLayoutY());}
//                            else{  listofYs.set(i, listOfObstaclesObject.get(i).getLayoutY());}
//                        }
//                        if (activeObstacle instanceof Circle_){ listOfObs_deserialisation.add(0);}
//                        if (activeObstacle instanceof IntersectingCircle){ listOfObs_deserialisation.add(1);}
//                        if (activeObstacle instanceof LayeredCircles){ listOfObs_deserialisation.add(2);}
//                        if (activeObstacle instanceof LayeredSquares){ listOfObs_deserialisation.add(3);}
//                        if (activeObstacle instanceof Octa){ listOfObs_deserialisation.add(4);}
//                        if (activeObstacle instanceof Square){ listOfObs_deserialisation.add(5);}
                        if (!activeObstacleColorSwitcher) {
                            do {
                                color = randomForColor.nextInt(4);
                            }
                            while (color == ball.getColor());
                            ball.setBallColor(color);
                            activeObstacleColorSwitcher = true;
                        }

                        int i = 0;
                        System.out.println("Ok so new pane ");
                        HashSet<Integer> set = new HashSet<>();
//                                for (Object obj: Obstaclespane.getChildren()){
//                                    if (obj instanceof Node && !(obj instanceof Circle)){
//                                        set.add(i);
//                                    }
//                                    i += 1;
//                                }
//                                for (int o: set){
//                                    Obstaclespane.getChildren().remove(o);}
                        activeObstacle = null;
//                        Obstaclespane.getChildren().remove(switcher.cir1);
//                        Obstaclespane.getChildren().remove(switcher.cir2);
//                        Obstaclespane.getChildren().remove(switcher.cir3);

                        //  Obstaclespane.setLayoutY(0);
                    }
                }


//                    if (Obstaclespane.getLayoutY() >= 300) {
//                        int i = 0;
//                        System.out.println("Ok so new pane ");
//                        HashSet<Integer> set = new HashSet<>();
//                        for (Object obj: Obstaclespane.getChildren()){
//                            if (obj instanceof Node){
//                                set.add(i);
//                            }
//                            i += 1;
//                        }
//                        for (int o: set){
//                            Obstaclespane.getChildren().remove(o);}
//                        activeObstacle = null;
//
//                        //  Obstaclespane.setLayoutY(0);
//                    }
                         //};


            };
                    animationTimer.start();
                    finalStarted[0] = true;
                    stage.setResizable(false);
                    stage.setScene(scene);
                  //  stage.show()

                    while (listOFOpenStages.contains(exitMenu.stage)) {
                        pause[0] = true;
                        animationTimer.stop(); //jugaad = refer;
//                        if (jugaad != null && jugaad2){
//                            listofYs.add( listOfObstaclesObject.get(listOfObstaclesObject.size() - 1).getLayoutY());
//
//                            if (jugaad instanceof Circle_){ listOfObs_deserialisation.add(0);}
//                            if (jugaad instanceof IntersectingCircle){ listOfObs_deserialisation.add(1);}
//                            if (jugaad instanceof LayeredCircles){ listOfObs_deserialisation.add(2);}
//                            if (jugaad instanceof LayeredSquares){ listOfObs_deserialisation.add(3);}
//                            if (jugaad instanceof Octa){ listOfObs_deserialisation.add(4);}
//                            if (jugaad instanceof Square){ listOfObs_deserialisation.add(5);}
//jugaad = null;
//                            ;}

                    }

//                activeObstacleColorSwitcher = true;



                    for (int i = 0; i < listOfObstaclesObject.size(); i++) {
                        listofYs.add((double) (listOfObstaclesObject.get(i).getLayoutY()));
                    }
//            Obstaclespane.setPrefSize(100,100);
//            Obstaclespane = listOfObstaclesObject.get(listOfObstaclesObject.size() - 1);
//            System.out.println(pane);
//            pane.getChildren().add(Obstaclespane);
//            Obstaclespane.setStyle("-fx-background-color: #393f38;");
                    stage.show();

        }
        catch(Exception e)

                {
                    System.out.println(e);
                    e.printStackTrace();
                    System.out.println("PRINT");
                    return;
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
                animationTimer.stop();
                exitMenu.initializeGame(stage, animationTimer);
            }
        });
    }
    public String toString(){
        return date;
    }
    public void AddToPane(AnchorPane pane){

        pane.prefHeight(600.0);
        pane.prefWidth(645.0);
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
     //   this.listOfObs_deserialisation.add(obstacleNumber);
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
    public String serialise(Game game){


        try
        {
            String filename_ = (new Date()).toString();
            String filegg = filename_.replaceAll("//s", "-");
                    String dd = filegg.replaceAll(":", "_");
            System.out.println(dd);
            String filename = dd + ".txt";
            File myObj = new File(filename);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(game);

            out.close();
            file.close();
            return filename;
            //System.out.println("Object has been serialized");

        }

        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println("IOException is caught");
            return null;
        }

    }
}
