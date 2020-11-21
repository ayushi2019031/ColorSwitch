package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main extends Application implements Serializable {
    public ArrayList<Game> list = new ArrayList<>();
    public Game activeGame;
    public ArrayList<Game> savedGamesList = new ArrayList<>();
    ObservableList<Game> observableListSavedGames = FXCollections.observableArrayList(savedGamesList);
    ListView<Game> listView = new ListView<Game>(observableListSavedGames);
    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Button btn = new Button("Aj");
        showGameMenu(primaryStage);
    }
    public void showGameMenu(Stage primaryStage) throws IOException{
        primaryStage.setTitle("Hello World");
        primaryStage.show();
        primaryStage.setResizable(false);
        //primaryStage.
        AnchorPane pane = new AnchorPane();

        Button btnNewGame = new Button();
        btnNewGame.setLayoutX(210);
        btnNewGame.setLayoutY(220);
        Image imageDecline = new Image(getClass().getResourceAsStream("Playbutton.jpg"), 100, 100, false, false);
        setBtnNewGame(btnNewGame, this);
        btnNewGame.setGraphic(new ImageView(imageDecline));

        Arc arc1 = new Arc();
        arc1.setCenterX(273);
        arc1.setCenterY(316.0);
        arc1.setLength(90.0);
        arc1.setRadiusX(90);
        arc1.setRadiusY(90);
        arc1.setStartAngle(-50.1);
        arc1.setFill(Color.TRANSPARENT);
        arc1.setStroke(Color.GREEN);
        arc1.setStrokeWidth(15);
        arc1.setType(ArcType.OPEN);

        Arc arc2 = new Arc();
        arc2.setCenterX(266);
        arc2.setCenterY(310);
        arc2.setLength(90);
        arc2.setRadiusX(90);
        arc2.setRadiusY(90);
        arc2.setStartAngle(39);
        arc2.setFill(javafx.scene.paint.Color.TRANSPARENT);
        arc2.setStroke(Color.RED);
        arc2.setStrokeWidth(15);
        arc2.setType(ArcType.OPEN);

        Arc arc3 = new Arc();
        arc3.setCenterX(268.0);
        arc3.setCenterY(324);
        arc3.setLength(90);
        arc3.setRadiusX(90);
        arc3.setRadiusY(90);
        arc3.setStartAngle(-140.4);
        arc3.setFill(Color.TRANSPARENT);
        arc3.setStroke(Color.BLUE);
        arc3.setStrokeWidth(15);
        arc3.setType(ArcType.OPEN);

        Arc arc4 = new Arc();
        arc4.setCenterX(261);
        arc4.setCenterY(317);
        arc4.setLength(90);
        arc4.setRadiusX(90);
        arc4.setRadiusY(90);
        arc4.setStartAngle(129.8);
        arc4.setFill(Color.TRANSPARENT);
        arc4.setStroke(Color.YELLOW);
        arc4.setStrokeWidth(15);
        arc4.setType(ArcType.OPEN);

        initialize(arc1);
        initialize(arc2);
        initialize(arc3);
        initialize(arc4);
        Group group = new Group();
        group.getChildren().add(arc1); group.getChildren().add(arc2);
        group.getChildren().add(arc3); group.getChildren().add(arc4);
        RotateTransition rotate = new RotateTransition();
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.setByAngle(360);
        rotate.setCycleCount(Animation.INDEFINITE);
        rotate.setDuration(Duration.millis(0));
        rotate.setNode(group);

        rotate.play();
        pane.getChildren().add(group);
        Line l1 = new Line();
        l1.setLayoutX(200);
        l1.setLayoutY(106);
        l1.setStartX(-100);
        l1.setStartY(0);
        l1.setEndX(42.399);
        l1.setEndY(7.62);

        Line l2 = new Line();
        l2.setLayoutX(281);
        l2.setLayoutY(134);
        l2.setStartX(-36.3);
        l2.setStartY(-25.20);
        l2.setEndX(-36.3);
        l2.setEndY(103);

        Line l3 = new Line();
        l3.setLayoutX(198);
        l3.setLayoutY(237);
        l3.setStartX(-100);
        l3.setStartY(-0);
        l3.setEndX(46.199);
        l3.setEndY(0);

        Line l4 = new Line();
        l4.setLayoutX(199);
        l4.setLayoutY(106);
        l4.setStartX(-100);
        l4.setStartY(0);
        l4.setEndX(-99.99);
        l4.setEndY(130.799);

        Group group2 = new Group();
        group2.getChildren().add(l1); group2.getChildren().add(l2); group2.getChildren().add(l3); group2.getChildren().add(l4);
        Rotate rotation = new Rotate();
        ObservableValue<Integer> obsInt1 = new ReadOnlyObjectWrapper<>(180);
        ObservableValue<Integer> obsInt2 = new ReadOnlyObjectWrapper<>(180);
        rotation.pivotXProperty().bind(obsInt1);
        rotation.pivotYProperty().bind(obsInt2);
        group2.getTransforms().add(rotation);

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(rotation.angleProperty(), 0)),
                new KeyFrame(Duration.millis(1000), new KeyValue(rotation.angleProperty(), 360)));
        timeline.setCycleCount(Animation.INDEFINITE);
         timeline.play();
        pane.getChildren().add(group2);
        Button btnloadSavedGame = new Button("Load saved Game. ");setBtnLoadSavedGame(btnloadSavedGame);
        Button btnExitApp = new Button("Exit Game. ");setBtnExitGame(btnExitApp, primaryStage);
        pane.getChildren().add(btnNewGame);
        pane.getChildren().add(btnloadSavedGame);
        pane.getChildren().add(btnExitApp);

        Scene scene = new Scene(pane, 540, 620);
        pane.setStyle("-fx-background-color: #393f38;");
        pane.prefHeight(600.0);
        pane.prefHeight(645.0);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    public void setBtnNewGame(Button btnNewGame, Main app){
        btnNewGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("New Game Started");
                System.out.println("Hello");
                //      Game game = new Game(app);
            }

        });
        btnNewGame.setTranslateY(40);
    }
    public  void setBtnLoadSavedGame(Button btnLoadSavedGame){
        btnLoadSavedGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = new Stage();
                Pane pane = new Pane();
                System.out.println("Load saved Game. ");
                pane.getChildren().add(listView);
                Scene scene = new Scene(pane, 100, 100);
                stage.setScene(scene);
                stage.show();
            }
        });
        btnLoadSavedGame.setTranslateY(120);
    }
    public  void setBtnExitGame(Button btnExitApp, Stage stage){
        btnExitApp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Exit Game"); stage.close();
            }
        });
        btnExitApp.setTranslateY(200);
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