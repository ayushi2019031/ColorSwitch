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
    double velocityX = 0;
    double velocityY = 0;
    public Ball() throws IOException {
        circle = new Circle(10, Color.RED);
        circle.setLayoutY(600.0);
        circle.setLayoutX(290.0);
        circle.setRadius(10);
        color = 0;
        setBallColor(color);
    }
    public void setPane(Pane pane, Scene scene, Stage stage){
        this.pane = pane;
        this.scene = scene;
        this.stage = stage;
        System.out.println("Hello Ball");
        // circle.relocate(0, 10);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                KeyCode t = keyEvent.getCode();
                if (t == KeyCode.UP){
                    circle.setLayoutY(circle.getLayoutY() - 50);
                }
            }
        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.println("Key has been pressed");
            }
        });
        pane.getChildren().add(this.circle);
        stage.setScene(scene);

    }
    public void jump(){
        circle.setLayoutY(circle.getLayoutY() -10);
    }
    public void changeBallPosition(boolean ifTouched){

    }

    public int getColor(){
        return color;
    }
    public void setBallColor(int color){
        if(color == 0){
            circle.setFill(Color.RED);
        }
        else if(color == 1){
            circle.setFill(Color.BLUE);
        }
        else if(color==2){
            circle.setFill(Color.YELLOW);
        }
        else{
            circle.setFill(Color.GREEN);
        }
    }
    public void setPosition(double x, double y)
    {
        x_pos = x;
        y_pos = y;
    }

    public void setVelocity(double x, double y)
    {
        velocityX = x;
        velocityY = y;
    }

    public void addVelocity(double x, double y)
    {
        velocityX += x;
        velocityY += y;
    }

    public void update(double time)
    {
        x_pos += velocityX * time;
        y_pos += velocityY * time;
    }
    public void render(Pane pane){
        this.circle.setTranslateX(x_pos);
        this.circle.setTranslateY(y_pos);
        pane.getChildren().add(this.circle);
    }
}