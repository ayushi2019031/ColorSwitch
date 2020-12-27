package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Octa {
    public void display(AnchorPane Pane){
        System.out.println("Hello duniya");
        Line l0 = new Line();
        //  Line l1 = new Line();
        l0.setLayoutX(209);
        l0.setLayoutY(352);
        l0.setStartX(0.29);
        l0.setStartY(-7.29);
        l0.setEndX(0.499);
        l0.setEndY(73.2);
        l0.setStroke(Color.RED);
        l0.setStrokeWidth(15);

        Line l1 = new Line();
        //  Line l1 = new Line();
        l1.setLayoutX(305);
        l1.setLayoutY(349);
        l1.setStartX(-94.79);
        l1.setStartY(-5);
        l1.setEndX(-39.399);
        l1.setEndY(-42.6);
        l1.setStroke(Color.GREEN);
        l1.setStrokeWidth(15);

        // l1.setStroke(Paint.valueOf("#1f8a2a"));
        Line l2 = new Line();
        //  Line l1 = new Line();
        l2.setLayoutX(362);
        l2.setLayoutY(305);
        l2.setStartX(-94.29);
        l2.setStartY(0.6928);
        l2.setEndX(-11.8);
        l2.setEndY(0.6928);
        l2.setStroke(Color.BLUE);
        l2.setStrokeWidth(15);

        //l2.setStroke(Paint.valueOf("#1f8a2a"));

        Line l3 = new Line();
        //  Line l1 = new Line();
        l3.setLayoutX(439);
        l3.setLayoutY(307);
        l3.setStartX(-87.3);
        l3.setStartY(0.307);
        l3.setEndX(-35.8);
        l3.setEndY(45.799);
        l3.setStroke(Color.YELLOW);
        l3.setStrokeWidth(15);
        //l0.setStroke(Paint.valueOf("#1f8a2a"));

        Line l4 = new Line();
        //  Line l1 = new Line();
        l4.setLayoutX(309);
        l4.setLayoutY(508);
        l4.setStartX(-99.79);
        l4.setStartY(-81.09);
        l4.setEndX(-52.6);
        l4.setEndY(-33.4);
        l4.setStroke(Color.YELLOW);
        l4.setStrokeWidth(10);

        Line l5 = new Line();
        l5.setLayoutX(439);
        l5.setLayoutY(475);
        l5.setStartX(-90.699);
        l5.setStartY(-0.1929);
        l5.setEndX(-34.1988);
        l5.setEndY(-48.599);
        l5.setStroke(Color.RED);
        l5.setStrokeWidth(10);

        Line l6 = new Line();
        l6.setLayoutX(430);
        l6.setLayoutY(392);
        l6.setStartX(-171.89);
        l6.setStartY(83.303);
        l6.setEndX(-82.199);
        l6.setEndY(83.303);
        l6.setStroke(Color.BLUE);
        l6.setStrokeWidth(10);

        Line l7 = new Line();
        l7.setLayoutX(404);
        l7.setLayoutY(385);
        l7.setStartX(-0.0929);
        l7.setStartY(-31.49);
        l7.setEndX(1.507);
        l7.setEndY(40.6929);
        l7.setStroke(Color.GREEN);
        l7.setStrokeWidth(10);


        l1.setStrokeWidth(10);l0.setStrokeWidth(10);l2.setStrokeWidth(10);l3.setStrokeWidth(10);
        l4.setStrokeWidth(10);l5.setStrokeWidth(10);l6.setStrokeWidth(10);l7.setStrokeWidth(10);
        Group g3 = new Group();
        g3.getChildren().add(l1);g3.getChildren().add(l2);g3.getChildren().add(l3);g3.getChildren().add(l4);
        g3.getChildren().add(l5);g3.getChildren().add(l6);g3.getChildren().add(l7);g3.getChildren().add(l0);
        Rotate rotation = new Rotate();
        ObservableValue<Integer> obsInt1 = new ReadOnlyObjectWrapper<>(280);
        ObservableValue<Integer> obsInt2 = new ReadOnlyObjectWrapper<>(380);
        rotation.pivotXProperty().bind(obsInt1);
        rotation.pivotYProperty().bind(obsInt2);
        g3.getTransforms().add(rotation);

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(rotation.angleProperty(), 0)),
                new KeyFrame(Duration.millis(5000), new KeyValue(rotation.angleProperty(), 360)));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        Pane.getChildren().add(g3);
    }
}