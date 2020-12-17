package sample;

import javafx.application.Application;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import java.net.URL;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.animation.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Screen;
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



import java.io.*;
import java.net.URL;
import java.nio.file.DirectoryStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Main extends Application implements Serializable {
    public ArrayList<Game> list ;

    public ArrayList<Game> savedGamesList;
    transient ObservableList<Game> observableListSavedGames;
    transient ListView<Game> listView;
    transient Stage ori;
    transient Stage primaryStage;



    public void music(){
        String s = "C:/Users/ayush/IdeaProjects/AP_Proj_2_a/src/sample/music.mp3";
        Media h = new Media(Paths.get(s).toUri().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(h);
        mediaPlayer.setOnEndOfMedia(new Runnable() {
            public void run() {
                mediaPlayer.seek(Duration.ZERO);
            }
        });
        mediaPlayer.play();
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        music();
        list = new ArrayList<>();
        savedGamesList = new ArrayList<>();
        observableListSavedGames = FXCollections.observableArrayList(savedGamesList);
        listView  = new ListView<>(observableListSavedGames);
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Button btn = new Button("Aj");
        showGameMenu(primaryStage);
        this.primaryStage = primaryStage;
        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();

        primaryStage.setX(bounds.getMinX());
        primaryStage.setY(bounds.getMinY());
        String url = System.getProperty("user.dir") + "\\src\\sample\\parapara.mp3";
        File fi = new File(url);
        String tmp = fi.getCanonicalPath();
        tmp = tmp.replaceAll("\\\\", "/");

//        final Media media = new Media("file:///" + System.getProperty("user.dir").replace('\\', '/') + "/" + "parapara.mp3");
//        final MediaPlayer mediaPlayer = new MediaPlayer(media);

    }
    public void showGameMenu(Stage primaryStage) throws IOException{
        ori = primaryStage;
        primaryStage.setTitle("Hello World");
        primaryStage.show();
        primaryStage.setResizable(false);
        //primaryStage.
        AnchorPane pane = new AnchorPane();

        Button btnNewGame = new Button();
        btnNewGame.setLayoutX(230);
        btnNewGame.setLayoutY(247);

        //  Image infinity = new Image(getClass().getResourceAsStream("Inf.png"), 100, 100, false, false);

        Image imageDecline = new Image(getClass().getResourceAsStream("play.png"), 90, 90, false, false);
        setBtnNewGame(btnNewGame, this);
        btnNewGame.setGraphic(new ImageView(imageDecline));
        btnNewGame.setStyle("-fx-background-color: #393f38;");

        Image aboutScreen  = new Image(getClass().getResourceAsStream("mark.png"), 90, 90, false, false);
        Button about = new Button();
        Image mark = new Image(getClass().getResourceAsStream("mark.png"), 50, 50, false, false);
        ImageView mark1 = new ImageView(mark);
        mark1.setStyle("-fx-background-color: #393f38;");
        about.setStyle("-fx-background-color: #393f38;");
        about.setLayoutX(475);
        about.setLayoutY(7);
        about.setGraphic(mark1);
        RotateTransition rt = new RotateTransition(Duration.millis(2000), mark1);
        rt.setByAngle(360);
        rt.setCycleCount(Animation.INDEFINITE);
        rt.setInterpolator(Interpolator.LINEAR);
        rt.play();
        about.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage aboutS = new Stage();
                Pane pane = new Pane();


                Text text1 = new Text();
                text1.setText("Produced by");
                text1.setFont((Font.font("cursive", FontWeight.BOLD, FontPosture.REGULAR, 30)));
                text1.setFill(Color.WHITE);
                text1.setStrokeWidth(10);
                text1.setX(120);
                text1.setY(65);

                Text text2 = new Text();
                text2.setText("Ayushi Jain");
                text2.setFont((Font.font("cursive", FontWeight.BOLD, FontPosture.REGULAR, 30)));
                text2.setFill(Color.WHITE);
                text2.setStrokeWidth(10);
                text2.setX(130);
                text2.setY(140);

                Text text3 = new Text();
                text3.setText("2019031");
                text3.setFont((Font.font("cursive", FontWeight.BOLD, FontPosture.REGULAR, 30)));
                text3.setFill(Color.WHITE);
                text3.setStrokeWidth(10);
                text3.setX(140);
                text3.setY(180);

                Text text4 = new Text();
                text4.setText("Kesar Shrivastava");
                text4.setFont((Font.font("cursive", FontWeight.BOLD, FontPosture.REGULAR, 30)));
                text4.setFill(Color.WHITE);
                text4.setStrokeWidth(10);
                text4.setX(85);
                text4.setY(255);

                Text text5 = new Text();
                text5.setText("2019051");
                text5.setFont((Font.font("cursive", FontWeight.BOLD, FontPosture.REGULAR, 30)));
                text5.setFill(Color.WHITE);
                text5.setStrokeWidth(10);
                text5.setX(140);
                text5.setY(295);

                pane.getChildren().add(text4);
                pane.getChildren().add(text1);
                pane.getChildren().add(text2);
                pane.getChildren().add(text3);
                pane.getChildren().add(text5);
                Scene scene = new Scene(pane, 400, 450);
                pane.setStyle("-fx-background-color: #393f38;");
                scene.getStylesheets().add("./sample/style.css");
                aboutS.setScene(scene);
                aboutS.setResizable(false);
                //aboutS.setStyle("-fx-background-color: #393f38;");
                aboutS.show();
            }
        });

        pane.getChildren().add(about);
        Arc arc11 = new Arc();
        arc11.setCenterX(273);
        arc11.setCenterY(336);
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
        arc22.setCenterY(336);
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
        arc33.setCenterY(336);
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
        arc44.setCenterY(336);
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
        arc1.setCenterY(336);
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
        arc2.setCenterY(336);
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
        arc3.setCenterY(336);
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
        arc4.setCenterY(336);
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
        arc111.setCenterY(336);
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
        arc222.setCenterY(336);
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
        arc333.setCenterY(336);
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
        arc444.setCenterY(336);
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

        Image infinity = new Image(getClass().getResourceAsStream("Inf.jpg"), 76, 41, false, false);
        ImageView infi = new ImageView(infinity);
        infi.setX(240);
        infi.setY(150);

        Image gear = new Image(getClass().getResourceAsStream("gear.png"), 50, 50, false, false);
        ImageView gear1 = new ImageView(gear);
        RotateTransition rt1 = new RotateTransition(Duration.millis(2500), gear1);
        rt1.setByAngle(-360);
        rt1.setCycleCount(Animation.INDEFINITE);
        rt1.setInterpolator(Interpolator.LINEAR);
        rt1.play();
        gear1.setY(10);
        gear1.setX(10);
//        InputStream resource = getClass().getResourceAsStream();
        //System.out.println(resource);
//        String url = System.getProperty("user.dir") + "\\src\\sample\\parapara.mp3";
//        System.out.println(url);
//        File f = new File(url);
//        String documentBase = getHostServices().getDocumentBase();
//        String trying =documentBase + "/" + "parapara.mp3";
//        final Media media = new Media(f.toURI().toASCIIString());
//        final MediaPlayer mediaPlayer = new MediaPlayer(media);
//     //   mediaPlayer.play();
        pane.getChildren().add(infi);
        pane.getChildren().add(gear1);
     //   pane.getChildren().add(mark1);
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
                    game.initializeGame();

                    ori.close();
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
                listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        System.out.println(listView.getSelectionModel().getSelectedItem());
                    }
                });
                listView.setOrientation(Orientation.VERTICAL);
                listView.setBorder(new Border(new BorderStroke(Color.WHITE,
                        BorderStrokeStyle.SOLID, new CornerRadii(2), BorderWidths.DEFAULT)));
                listView.setStyle("-fx-background-color: #393f38;"+"-fx-font-size: 2em;");
                listView.setLayoutY(140);
                listView.setLayoutX(20);


                pane.getChildren().add(listView);
                Scene scene = new Scene(pane, 540, 650);
                scene.getStylesheets().add("./sample/style.css");
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
//    public void deserialise(String filename) throws IOException, ClassNotFoundException {
//        String ref  =  System.getProperty("user.dir") + "/" + filename;
//        FileInputStream file = new FileInputStream(ref);
//        ObjectInputStream in = new ObjectInputStream(file);
//
//        // Method for deserialization of object
//        Game object1 = (Game) in.readObject();
//        object1.initializeGame();
//        in.close();
//        file.close();
//
//        System.out.println("Object has been deserialized ");
//        object1.initializeGame();
//    }
//    public void update() throws IOException, ClassNotFoundException {
//        File u = new File(System.getProperty("user.dir"));
//        File[] files = u.listFiles();
//        for (int i = 0; i < files.length; i++){
//            System.out.println(files[i].toString());
//            String g = files[i].toString().substring(files[i].toString().lastIndexOf(".") + 1, files[i].toString().length());
//            System.out.println(g);
//            if (g.equals("txt")) {
//                System.out.println(files[i].toString());
//                deserialise(files[i].toString());
//            }
//        }
//    }
}