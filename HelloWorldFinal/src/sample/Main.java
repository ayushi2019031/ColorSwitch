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

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Creating four arcs for a circle
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

       //Creating the anchor pane to add all the arcs
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

        // Create the Scene
        Scene scene = new Scene(root);
        // Add the Scene to the Stage
        Stage stage = new Stage();
        stage.setScene(scene);
        // Set the Title of the Stage
        stage.setTitle("A JavaFX Circle Example");
        // Display the Stage
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
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

