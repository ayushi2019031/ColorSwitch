package sample;


import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;

public class ColourSwitcher extends GameElements implements Serializable {
    Scene scene; Pane pane; Stage stage;
    ImageView imageView;
    Circle cir1  = new Circle();
    Circle cir2 = new Circle();
    Circle cir3= new Circle();
    Line line = new Line();

    public ColourSwitcher() throws IOException {


        // addToPane();
    }
    public void setScene(Scene scene, Pane pane, Stage stage){
        this.scene = scene;
        this.pane = pane;
        this.stage = stage;
        display();
        //addToPane();
    }
    public void display(){
        cir1.setRadius(18);
        cir1.setFill(Color.LAVENDER);
        cir1.setStroke(Color.DEEPPINK);
        cir3.setRadius(15);
        cir3.setFill(Color.LIGHTCORAL);
        cir3.setCenterX(290);
        cir3.setCenterY(200);

        cir2.setRadius(10);
        cir2.setFill(Color.LEMONCHIFFON);
        cir1.setCenterX(290);
        cir1.setCenterY(200);
        cir2.setCenterX(290);
        cir2.setCenterY(200);

        pane.getChildren().add(cir1);
        pane.getChildren().add(cir3);
        pane.getChildren().add(cir2);
    }
    public void addToPane(){
        pane.getChildren().add(imageView);
    }
}