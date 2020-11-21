package sample;


import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;

public class ColourSwitcher extends GameElements implements Serializable {
    Scene scene; Pane pane; Stage stage;
    ImageView imageView;
    Line line = new Line();

    public ColourSwitcher() throws IOException {
        Image image  = new Image(new FileInputStream("./images/switcher.jpg"));
        imageView = new ImageView(image);
        imageView.setX(0);
        imageView.setY(0);

        //setting the fit height and width of the image view
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);

        //Setting the preserve ratio of the image view
        imageView.setPreserveRatio(true);
     // addToPane();
    }
    public void setScene(Scene scene, Pane pane, Stage stage){
        this.scene = scene;
        this.pane = pane;
        this.stage = stage;
        addToPane();
    }
    public void addToPane(){
        pane.getChildren().add(imageView);
    }
}
