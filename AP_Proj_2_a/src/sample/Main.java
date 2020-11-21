package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
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

    Stage ori;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Button btn = new Button("Aj");
        showGameMenu(primaryStage);
    }
    public void showGameMenu(Stage primaryStage) throws IOException{
       ori = primaryStage;
        primaryStage.setTitle("Hello World");
        primaryStage.show();
        primaryStage.setResizable(false);
        //primaryStage.
        AnchorPane pane = new AnchorPane();

        Button btnNewGame = new Button();
        btnNewGame.setLayoutX(213);
        btnNewGame.setLayoutY(220);

   //  Image infinity = new Image(getClass().getResourceAsStream("Inf.png"), 100, 100, false, false);

        Image imageDecline = new Image(getClass().getResourceAsStream("Untitled.png"), 100, 100, false, false);
        setBtnNewGame(btnNewGame, this);
       btnNewGame.setGraphic(new ImageView(imageDecline));
       btnNewGame.setStyle("-fx-background-color: #393f38;");

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

        Arc arc120 = new Arc();
        arc120.setCenterX(240);
        arc120.setCenterY(52);
        arc120.setLength(90.0);
        arc120.setRadiusX(20);
        arc120.setRadiusY(20);
        arc120.setStartAngle(-50);
        arc120.setFill(Color.TRANSPARENT);
        arc120.setStroke(Color.YELLOW);
        arc120.setStrokeWidth(5);
        arc120.setType(ArcType.OPEN);

        Arc arc121 = new Arc();
        arc121.setCenterX(240);
        arc121.setCenterY(52);
        arc121.setLength(90.0);
        arc121.setRadiusX(20);
        arc121.setRadiusY(20);
        arc121.setStartAngle(39);
        arc121.setFill(Color.TRANSPARENT);
        arc121.setStroke(Color.GREEN);
        arc121.setStrokeWidth(5);
        arc121.setType(ArcType.OPEN);

        Arc arc122 = new Arc();
        arc122.setCenterX(240);
        arc122.setCenterY(52);
        arc122.setLength(90.0);
        arc122.setRadiusX(20);
        arc122.setRadiusY(20);
        arc122.setStartAngle(-140.4);
        arc122.setFill(Color.TRANSPARENT);
        arc122.setStroke(Color.BLUE);
        arc122.setStrokeWidth(5);
        arc122.setType(ArcType.OPEN);

        Arc arc123 = new Arc();
        arc123.setCenterX(240);
        arc123.setCenterY(52);
        arc123.setLength(90.0);
        arc123.setRadiusX(20);
        arc123.setRadiusY(20);
        arc123.setStartAngle(129.8);
        arc123.setFill(Color.TRANSPARENT);
        arc123.setStroke(Color.RED);
        arc123.setStrokeWidth(5);
        arc123.setType(ArcType.OPEN);

        Arc arc220 = new Arc();
        arc220.setCenterX(320);
        arc220.setCenterY(52);
        arc220.setLength(90.0);
        arc220.setRadiusX(20);
        arc220.setRadiusY(20);
        arc220.setStartAngle(-50);
        arc220.setFill(Color.TRANSPARENT);
        arc220.setStroke(Color.YELLOW);
        arc220.setStrokeWidth(5);
        arc220.setType(ArcType.OPEN);

        Arc arc221 = new Arc();
        arc221.setCenterX(320);
        arc221.setCenterY(52);
        arc221.setLength(90.0);
        arc221.setRadiusX(20);
        arc221.setRadiusY(20);
        arc221.setStartAngle(39);
        arc221.setFill(Color.TRANSPARENT);
        arc221.setStroke(Color.GREEN);
        arc221.setStrokeWidth(5);
        arc221.setType(ArcType.OPEN);

        Arc arc1122 = new Arc();
        arc1122.setCenterX(320);
        arc1122.setCenterY(52);
        arc1122.setLength(90.0);
        arc1122.setRadiusX(20);
        arc1122.setRadiusY(20);
        arc1122.setStartAngle(-140.4);
        arc1122.setFill(Color.TRANSPARENT);
        arc1122.setStroke(Color.BLUE);
        arc1122.setStrokeWidth(5);
        arc1122.setType(ArcType.OPEN);

        Arc arc223 = new Arc();
        arc223.setCenterX(320);
        arc223.setCenterY(52);
        arc223.setLength(90.0);
        arc223.setRadiusX(20);
        arc223.setRadiusY(20);
        arc223.setStartAngle(129.8);
        arc223.setFill(Color.TRANSPARENT);
        arc223.setStroke(Color.RED);
        arc223.setStrokeWidth(5);
        arc223.setType(ArcType.OPEN);

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

        initialize(arc120);
        initialize(arc121);
        initialize(arc122);
        initialize(arc123);

        initialize1(arc220);
        initialize1(arc221);
        initialize1(arc1122);
        initialize1(arc223);


        Text text = new Text();
        text.setText("C");
        text.setFont((Font.font("cambria", FontWeight.BOLD, FontPosture.REGULAR, 50)));
        text.setFill(Color.WHITE);
        text.setStrokeWidth(10);

        text.setX(185);
        text.setY(69);

        Text text1 = new Text();
        text1.setText("L");
        text1.setFont((Font.font("cambria", FontWeight.BOLD, FontPosture.REGULAR, 50)));
        text1.setFill(Color.WHITE);
        text1.setStrokeWidth(10);

        text1.setX(265);
        text1.setY(69);

        Text text2 = new Text();
        text2.setText("R");
        text2.setFont((Font.font("cambria", FontWeight.BOLD, FontPosture.REGULAR, 50)));
        text2.setFill(Color.WHITE);
        text2.setStrokeWidth(10);

        text2.setX(345);
        text2.setY(69);

        Text text3 = new Text();
        text3.setText("SWITCH");
        text3.setFont((Font.font("cambria", FontWeight.BOLD, FontPosture.REGULAR, 50)));
        text3.setFill(Color.WHITE);
        text3.setStrokeWidth(10);

        text3.setX(190);
        text3.setY(115);

        Button btnloadSavedGame = new Button("Resume Game");setBtnLoadSavedGame(btnloadSavedGame);
        btnloadSavedGame.setLayoutX(190);
        btnloadSavedGame.setLayoutY(380);
        btnloadSavedGame.setStyle("-fx-background-color: #7d827d;"+
                                    "-fx-text-fill: #ffffff;"+"-fx-font-size: 2em"
                );

        Button btnExitApp = new Button("Exit Game");setBtnExitGame(btnExitApp, primaryStage);
        btnExitApp.setLayoutX(215);
        btnExitApp.setLayoutY(360);
        btnExitApp.setStyle("-fx-background-color: #7d827d;"+
             "-fx-text-fill: #ffffff;"+"-fx-font-size: 2em"
           );

        pane.getChildren().add(text2);
        pane.getChildren().add(text3);
        pane.getChildren().add(arc1122);
        pane.getChildren().add(arc221);
        pane.getChildren().add(arc223);
        pane.getChildren().add(arc220);
        pane.getChildren().add(text1);
        pane.getChildren().add(arc120);
        pane.getChildren().add(arc121);
        pane.getChildren().add(arc122);
        pane.getChildren().add(arc123);
        pane.getChildren().add(text);
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
        Scene scene = new Scene(pane, 540, 650);
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
       ori.close();
       Stage stage = new Stage();
       Pane pane = new Pane();
       System.out.println("Load saved Game. ");
       Text text3 = new Text();
       text3.setText("SAVED");
       text3.setFont((Font.font("cambria", FontWeight.BOLD, FontPosture.REGULAR, 50)));
       text3.setFill(Color.WHITE);
       text3.setStrokeWidth(10);

       text3.setX(195);
       text3.setY(60);

       Text text4 = new Text();
       text4.setText("GAMES");
       text4.setFont((Font.font("cambria", FontWeight.BOLD, FontPosture.REGULAR, 50)));
       text4.setFill(Color.WHITE);
       text4.setStrokeWidth(10);

       text4.setX(190);
       text4.setY(105);
       Image imageDecline = new Image(getClass().getResourceAsStream("Home.png"), 50, 50, false, false);
       listView.setPrefSize(500, 500);
       listView.setOrientation(Orientation.VERTICAL);
       listView.setStyle("-fx-background-color: #393f38;");
       listView.setLayoutY(120);
       listView.setLayoutX(20);
       
       pane.getChildren().add(listView);
       Scene scene = new Scene(pane, 540, 650);
       pane.prefHeight(600.0);
       pane.prefHeight(645.0);
       pane.setStyle("-fx-background-color: #393f38;");
       stage.setScene(scene);
       stage.setResizable(false);
       Button btnReturn = new Button();
       btnReturn.setGraphic(new ImageView(imageDecline));
       btnReturn.setStyle("-fx-background-color: #393f38;");
       btnReturn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
         stage.close();ori.show();
        }
       });
       pane.getChildren().add(btnReturn);
       pane.getChildren().add(text3);
       pane.getChildren().add(text4);
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
                new KeyFrame(Duration.seconds(3), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() - 360, Interpolator.LINEAR))
        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
    }

    public void initialize1(Arc arc) {
        Timeline animation = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
                new KeyFrame(Duration.seconds(3), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() + 360, Interpolator.LINEAR))
        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
    }

}
