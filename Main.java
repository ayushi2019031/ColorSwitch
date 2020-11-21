package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
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
        btnNewGame.setLayoutX(213);
        btnNewGame.setLayoutY(220);
        Image imageDecline = new Image(getClass().getResourceAsStream("Untitled.png"), 100, 100, false, false);
        setBtnNewGame(btnNewGame, this);
       btnNewGame.setGraphic(new ImageView(imageDecline));
       btnNewGame.setStyle("-fx-border-color: #393f38;");

        Arc arc11 = new Arc();
        arc11.setCenterX(273);
        arc11.setCenterY(316);
        arc11.setLength(90.0);
        arc11.setRadiusX(72);
        arc11.setRadiusY(72);
        arc11.setStartAngle(-50.1);
        arc11.setFill(Color.TRANSPARENT);
        arc11.setStroke(Color.GREEN);
        arc11.setStrokeWidth(12);
        arc11.setType(ArcType.OPEN);

        Arc arc22 = new Arc();
        arc22.setCenterX(273);
        arc22.setCenterY(316);
        arc22.setLength(90);
        arc22.setRadiusX(72);
        arc22.setRadiusY(72);
        arc22.setStartAngle(39);
        arc22.setFill(javafx.scene.paint.Color.TRANSPARENT);
        arc22.setStroke(Color.RED);
        arc22.setStrokeWidth(12);
        arc22.setType(ArcType.OPEN);

        Arc arc33 = new Arc();
        arc33.setCenterX(273);
        arc33.setCenterY(316);
        arc33.setLength(90);
        arc33.setRadiusX(72);
        arc33.setRadiusY(72);
        arc33.setStartAngle(-140.4);
        arc33.setFill(Color.TRANSPARENT);
        arc33.setStroke(Color.BLUE);
        arc33.setStrokeWidth(12);
        arc33.setType(ArcType.OPEN);

        Arc arc44 = new Arc();
        arc44.setCenterX(273);
        arc44.setCenterY(316);
        arc44.setLength(90);
        arc44.setRadiusX(72);
        arc44.setRadiusY(72);
        arc44.setStartAngle(129.8);
        arc44.setFill(Color.TRANSPARENT);
        arc44.setStroke(Color.YELLOW);
        arc44.setStrokeWidth(12);
        arc44.setType(ArcType.OPEN);

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
        arc2.setCenterX(273);
        arc2.setCenterY(316);
        arc2.setLength(90);
        arc2.setRadiusX(90);
        arc2.setRadiusY(90);
        arc2.setStartAngle(39);
        arc2.setFill(javafx.scene.paint.Color.TRANSPARENT);
        arc2.setStroke(Color.RED);
        arc2.setStrokeWidth(15);
        arc2.setType(ArcType.OPEN);

        Arc arc3 = new Arc();
        arc3.setCenterX(273);
        arc3.setCenterY(316);
        arc3.setLength(90);
        arc3.setRadiusX(90);
        arc3.setRadiusY(90);
        arc3.setStartAngle(-140.4);
        arc3.setFill(Color.TRANSPARENT);
        arc3.setStroke(Color.BLUE);
        arc3.setStrokeWidth(15);
        arc3.setType(ArcType.OPEN);

        Arc arc4 = new Arc();
        arc4.setCenterX(273);
        arc4.setCenterY(316);
        arc4.setLength(90);
        arc4.setRadiusX(90);
        arc4.setRadiusY(90);
        arc4.setStartAngle(129.8);
        arc4.setFill(Color.TRANSPARENT);
        arc4.setStroke(Color.YELLOW);
        arc4.setStrokeWidth(15);
        arc4.setType(ArcType.OPEN);

        Arc arc111 = new Arc();
        arc111.setCenterX(273);
        arc111.setCenterY(316.0);
        arc111.setLength(90.0);
        arc111.setRadiusX(57);
        arc111.setRadiusY(57);
        arc111.setStartAngle(-50.1);
        arc111.setFill(Color.TRANSPARENT);
        arc111.setStroke(Color.GREEN);
        arc111.setStrokeWidth(9);
        arc111.setType(ArcType.OPEN);

        Arc arc222 = new Arc();
        arc222.setCenterX(273);
        arc222.setCenterY(316);
        arc222.setLength(90);
        arc222.setRadiusX(57);
        arc222.setRadiusY(57);
        arc222.setStartAngle(39);
        arc222.setFill(javafx.scene.paint.Color.TRANSPARENT);
        arc222.setStroke(Color.RED);
        arc222.setStrokeWidth(9);
        arc222.setType(ArcType.OPEN);

        Arc arc333 = new Arc();
        arc333.setCenterX(273);
        arc333.setCenterY(316);
        arc333.setLength(90);
        arc333.setRadiusX(57);
        arc333.setRadiusY(57);
        arc333.setStartAngle(-140.4);
        arc333.setFill(Color.TRANSPARENT);
        arc333.setStroke(Color.BLUE);
        arc333.setStrokeWidth(9);
        arc333.setType(ArcType.OPEN);

        Arc arc444 = new Arc();
        arc444.setCenterX(273);
        arc444.setCenterY(316);
        arc444.setLength(90);
        arc444.setRadiusX(57);
        arc444.setRadiusY(57);
        arc444.setStartAngle(129.8);
        arc444.setFill(Color.TRANSPARENT);
        arc444.setStroke(Color.YELLOW);
        arc444.setStrokeWidth(9);
        arc444.setType(ArcType.OPEN);

        initialize(arc1);
        initialize(arc2);
        initialize(arc3);
        initialize(arc4);

        initialize1(arc11);
        initialize1(arc22);
        initialize1(arc33);
        initialize1(arc44);

        initialize(arc111);
        initialize(arc222);
        initialize(arc333);
        initialize(arc444);

        Button btnloadSavedGame = new Button("Load saved Game. ");setBtnLoadSavedGame(btnloadSavedGame);
        Button btnExitApp = new Button("Exit Game. ");setBtnExitGame(btnExitApp, primaryStage);
        pane.getChildren().add(btnNewGame);
        pane.getChildren().add(btnloadSavedGame);
        pane.getChildren().add(btnExitApp);
        pane.getChildren().add(arc1);
        pane.getChildren().add(arc2);
        pane.getChildren().add(arc3);
        pane.getChildren().add(arc4);
        pane.getChildren().add(arc11);
        pane.getChildren().add(arc22);
        pane.getChildren().add(arc33);
        pane.getChildren().add(arc44);
        pane.getChildren().add(arc111);
        pane.getChildren().add(arc222);
        pane.getChildren().add(arc333);
        pane.getChildren().add(arc444);
        Scene scene = new Scene(pane, 540, 620);
        pane.prefHeight(600.0);
        pane.prefHeight(645.0);
        pane.setStyle("-fx-background-color: #393f38;");
        //scene.setFill(Color.GREEN);
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
                try {
                    Game game = new Game(app);
                } catch (IOException e) {
                    e.printStackTrace();
                }
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

    public void initialize1(Arc arc) {
        Timeline animation = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
                new KeyFrame(Duration.seconds(2), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() + 360, Interpolator.LINEAR))
        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
    }

}
