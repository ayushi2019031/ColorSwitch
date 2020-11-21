package sample;
import javafx.animation.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
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
    ArrayList<Obstacles> listOfObstacles;
    int numOfStars;
    ColourSwitcher switcher;
    boolean ifTouched;
    Main app;
    static int num_of_restoration_points;
    ExitMenu exitMenu;
    EndGameMenu endGameMenu;
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
        Button btnExitGame = new Button("Exit Game. ");setBtnExitGame(btnExitGame, stage);pane.getChildren().add(btnExitGame);
        Scene scene = new Scene(pane, 200, 200);
        ball.setPane(pane, scene, stage);
        switcher.setScene(scene, pane, stage);
        final TranslateTransition transition = createTranslateTransition(ball.circle);
        AddToPane(pane);
        moveBall(scene);

        stage.setScene(scene);
        stage.show();

        }
        catch (Exception e){
            System.out.println("PRINT");
            return ;
        }
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

        btnExitGame.setLayoutY(22);
        btnExitGame.setLayoutX(369);
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
        Arc arc1 = new Arc();
        arc1.setCenterX(183.0);
        arc1.setCenterY(130.0);
        arc1.setLength(100.0);
        arc1.setRadiusX(90);
        arc1.setRadiusY(90);
        arc1.setStartAngle(40);
        arc1.setFill(Color.TRANSPARENT);
        arc1.setStroke(Color.GREEN);
        arc1.setStrokeWidth(10);
        arc1.setType(ArcType.OPEN);

        Arc arc2 = new Arc();
        arc2.setCenterX(183.0);
        arc2.setCenterY(130.0);
        arc2.setLength(100);
        arc2.setRadiusX(90);
        arc2.setRadiusY(90);
        arc2.setStartAngle(130);
        arc2.setFill(Color.TRANSPARENT);
        arc2.setStroke(Color.RED);
        arc2.setStrokeWidth(10);
        arc2.setType(ArcType.OPEN);

        Arc arc3 = new Arc();
        arc3.setCenterX(183.0);
        arc3.setCenterY(130.0);
        arc3.setLength(100);
        arc3.setRadiusX(90);
        arc3.setRadiusY(90);
        arc3.setStartAngle(-140.4);
        arc3.setFill(Color.TRANSPARENT);
        arc3.setStroke(Color.BLUE);
        arc3.setStrokeWidth(10);
        arc3.setType(ArcType.OPEN);

        Arc arc4 = new Arc();
        arc4.setCenterX(183.0);
        arc4.setCenterY(130.0);
        arc4.setLength(90);
        arc4.setRadiusX(90);
        arc4.setRadiusY(90);
        arc4.setStartAngle(-50);
        arc4.setFill(Color.TRANSPARENT);
        arc4.setStroke(Color.YELLOW);
        arc4.setStrokeWidth(10);
        arc4.setType(ArcType.OPEN);
        AnchorPane root = new AnchorPane();
        root.setMaxHeight(Double.MIN_VALUE);
        root.setMaxWidth(Double.MIN_VALUE);
        root.setMinHeight(Double.MAX_VALUE);
        root.setMinWidth(Double.MAX_VALUE);
        root.prefHeight(400.0);
        root.prefWidth(600.0);

        root.getChildren().add(arc1);
        root.getChildren().add(arc2);
        root.getChildren().add(arc3);
        root.getChildren().add(arc4);

        initialize(arc1);
        initialize(arc2);
        initialize(arc3);
        initialize(arc4);

        root.setStyle
                (
                        "-fx-padding: 10;" +
                                "-fx-border-style: solid inside;" +
                                "-fx-border-width: 2;" +
                                "-fx-border-insets: 5;" +
                                "-fx-border-radius: 5;" +
                                "-fx-border-color: blue;"
                );
        pane.getChildren().add(arc1);pane.getChildren().add(arc2);pane.getChildren().add(arc3);pane.getChildren().add(arc4);
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
