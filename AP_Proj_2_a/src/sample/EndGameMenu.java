package sample;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EndGameMenu extends GameElements implements Serializable {
    Game game;
    transient AnchorPane pane;
    public EndGameMenu() throws IOException {
        pane  = new AnchorPane();
    }

    public void initializeGame(Stage s){
        try{
            //      s.close();
            //      Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

            System.out.println("Hello Ayushi ");
            Stage stage = new Stage();
            // stage.
            //    Button btnExitGameMenu  = new Button("Exit Game");

            stage.setTitle("End Menu");
            //          stage.setScene(new Scene(root, 270, 325));
            //    AnchorPane pane = new AnchorPane();
            System.out.println("Hullo");
            Button btnExitGame = new Button();
            btnExitGame.setStyle("-fx-background-color: #393f38;");
            Button reloadWithStars = new Button();
            reloadWithStars.setStyle("-fx-background-color: #393f38;");
            System.out.println("Hullo");
            setBtnExitWithoutSaving(btnExitGame, stage, s);
            System.out.println("Hullo");
            pane.getChildren().add(btnExitGame);
            System.out.println("Hullo");
            pane.setStyle("-fx-background-color: #393f38;");
            stage.setScene(new Scene(pane, 540, 650));
            stage.setResizable(false);
            //   Scene scene = new Scene(pane, 200, 200);
            //stage.setScene(scene);


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

            Label label = new Label("                                            Score");
            //Setting font to the label
            Font font = Font.font("cambria", FontWeight.BOLD, FontPosture.REGULAR, 25);
            label.setFont(font);
            //Filling color to the label
            label.setTextFill(Color.WHITE);
            label.setTextAlignment(TextAlignment.CENTER);
            label.setLayoutX(0);
            label.setLayoutY(200);
            label.setPrefWidth(650);
            label.setPrefHeight(40);
            label.setStyle("-fx-background-color: #000000;");

            Text text4 = new Text();
            text4.setText("4");
            text4.setFont((Font.font("cambria", FontWeight.BOLD, FontPosture.REGULAR, 50)));
            text4.setFill(Color.WHITE);
            text4.setStrokeWidth(10);
            text4.setX(260);
            text4.setY(290);

            Label label1 = new Label("                                        Best Score");
            //Setting font to the label
            Font font1 = Font.font("cambria", FontWeight.BOLD, FontPosture.REGULAR, 25);
            label1.setFont(font);
            //Filling color to the label
            label1.setTextFill(Color.WHITE);
            label1.setTextAlignment(TextAlignment.CENTER);
            label1.setLayoutX(0);
            label1.setLayoutY(320);
            label1.setPrefWidth(650);
            label1.setPrefHeight(40);
            label1.setStyle("-fx-background-color: #949420;");

            Text text5 = new Text();
            text5.setText("16");
            text5.setFont((Font.font("cambria", FontWeight.BOLD, FontPosture.REGULAR, 50)));
            text5.setFill(Color.WHITE);
            text5.setStrokeWidth(10);
            text5.setX(250);
            text5.setY(410);

            Image gear = new Image(getClass().getResourceAsStream("return.png"), 50, 50, false, false);
            ImageView gear1 = new ImageView(gear);
            btnExitGame.setGraphic(gear1);

            Image stars = new Image(getClass().getResourceAsStream("stars.png"), 70, 70, false, false);
            ImageView stars1 = new ImageView(stars);
            stars1.setX(20);
            stars1.setY(450);
            stars1.setRotate(stars1.getRotate() + 330);

            Text text6 = new Text();
            text6.setText("125");
            text6.setFont((Font.font("cambria", FontWeight.BOLD, FontPosture.REGULAR, 30)));
            text6.setFill(Color.WHITE);
            text6.setStrokeWidth(10);
            text6.setX(60);
            text6.setY(520);

            Image reload = new Image(getClass().getResourceAsStream("reload.png"), 70, 70, false, false);
            ImageView reload1 = new ImageView(reload);
            reloadWithStars.setGraphic(reload1);
            reloadWithStars.setLayoutX(240);
            reloadWithStars.setLayoutY(450);

            pane.getChildren().add(text6);
            pane.getChildren().add(stars1);
            pane.getChildren().add(text5);
            pane.getChildren().add(label1);
            pane.getChildren().add(text4);
            pane.getChildren().add(label);
            pane.getChildren().add(arc1122);
            pane.getChildren().add(arc221);
            pane.getChildren().add(arc223);
            pane.getChildren().add(arc220);
            pane.getChildren().add(reloadWithStars);
            pane.getChildren().add(arc120);
            pane.getChildren().add(arc121);
            pane.getChildren().add(arc122);
            pane.getChildren().add(arc123);
            pane.getChildren().add(text);
            pane.getChildren().add(text1);
            pane.getChildren().add(text2);
            pane.getChildren().add(text3);
            stage.show();}
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println("PRINT");
            return ;
        }
    }
    public void setGame(Game game){
        this.game = game;
    }
    public void setBtnExitWithoutSaving(Button btnExitGame, Stage stage, Stage s1){
        btnExitGame.setLayoutY(10);
        btnExitGame.setLayoutX(10);
        btnExitGame.setStyle("-fx-background-color: #393f38;"+
                "-fx-text-fill: #ffffff;"+"-fx-font-size: 2em"
        );
        btnExitGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                s1.close();
                stage.close();
                game.app.primaryStage.show();
            }
        });
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
