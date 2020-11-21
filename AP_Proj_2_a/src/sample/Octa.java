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
        l0.setEndX(-43);
        l0.setEndY(-7.62);
        l0.setLayoutY(56.0);
        l0.setLayoutX(532);
        l0.setStartX(-100);
        l0.setStroke(Color.BLUE);

        Line l1 = new Line();
        l1.setEndX(-68.66);
        l1.setLayoutX(590);
        l1.setLayoutY(56);
        l1.setStartX(-100);
        l1.setEndY(33.999);
        l1.setStroke(Color.RED);
       // l1.setStroke(Paint.valueOf("#1f8a2a"));

        Line l2 = new Line();
        l2.setEndX(-33.45);
        l2.setLayoutX(555);
        l2.setLayoutY(143);
        l2.setStartX(-65.29);
        l2.setStartY(30.29);
        l2.setEndY(-3.16666);
        l2.setStroke(Color.GREEN);
        //l2.setStroke(Paint.valueOf("#1f8a2a"));

        Line l3 = new Line();
        l3.setEndX(-91.95);
        l3.setEndY(44.33);
        l3.setLayoutX(614.0);
        l3.setLayoutY(95);
        l3.setStartX(-91);
        l3.setStartY(-4.29);
        l3.setStroke(Color.YELLOW);
        //l0.setStroke(Paint.valueOf("#1f8a2a"));

        Line l4 = new Line();
        l4.setEndY(-7.62);
        l4.setLayoutX(532);
        l4.setLayoutY(174);
        l4.setStartX(-100);
        l4.setStroke(Color.RED);

        Line l5 = new Line();
        l5.setEndX(-41.707);
        l5.setEndY(-0.707);
        l5.setLayoutX(473);
        l5.setLayoutY(174);
        l5.setStartX(-80.5);
        l5.setStartY(-28.833);
        l5.setStroke(Color.BLUE);

        Line l6 = new Line();
        l6.setEndX(-43);
        l6.setEndY(-7.62);
        l6.setLayoutX(436);
        l6.setLayoutY(92.0);
        l6.setStartX(-43);
        l6.setStartY(52.66);
        l6.setStroke(Color.GREEN);

        Line l7 = new Line();
        l7.setEndX(-71.70);
        l7.setEndY(-17.29);
        l7.setLayoutX(503);
        l7.setLayoutY(74.0);
        l7.setStartX(-110.5);
        l7.setStartY(17.49);
        l7.setStroke(Color.YELLOW);

        l1.setStrokeWidth(10);l0.setStrokeWidth(10);l2.setStrokeWidth(10);l3.setStrokeWidth(10);
        l4.setStrokeWidth(10);l5.setStrokeWidth(10);l6.setStrokeWidth(10);l7.setStrokeWidth(10);
        Group g3 = new Group();
        g3.getChildren().add(l1);g3.getChildren().add(l2);g3.getChildren().add(l3);g3.getChildren().add(l4);
        g3.getChildren().add(l5);g3.getChildren().add(l6);g3.getChildren().add(l7);g3.getChildren().add(l0);
        Rotate rotation = new Rotate();
        ObservableValue<Integer> obsInt1 = new ReadOnlyObjectWrapper<>(440);
        ObservableValue<Integer> obsInt2 = new ReadOnlyObjectWrapper<>(140);
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
