package sample;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.Serializable;

public class Ball extends GameElements implements Serializable {
    int color;
    Pane pane;
    Stage stage;
    Scene scene;
    Circle circle;
    public Ball() throws IOException {
        circle = new Circle(10, Color.RED);
        circle.setLayoutY(414.0);
        circle.setLayoutX(190.0);
        circle.setRadius(27);
    }
    public void setPane(Pane pane, Scene scene, Stage stage){
        this.pane = pane;
        this.scene = scene;
        this.stage = stage;
        System.out.println("Hello");
       // circle.relocate(0, 10);
        pane.getChildren().add(circle);

        stage.setScene(scene);

    }
    public void changeBallPosition(boolean ifTouched){

    }
    public void changeBallColour(ColourSwitcher switcher){

    }
    public int getColor(){
        return color;
    }
    public void setBallColor(int color){

    }
}
