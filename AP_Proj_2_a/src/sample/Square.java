package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Square {
    public void display(AnchorPane pane){

        Line l1 = new Line();
        l1.setLayoutX(200);
        l1.setLayoutY(106);
        l1.setStartX(-100);
        l1.setStartY(0);
        l1.setEndX(42.399);
        l1.setEndY(7.62);
        l1.setStroke(Color.RED);
        l1.setStrokeWidth(10);

        Line l2 = new Line();
        l2.setLayoutX(281);
        l2.setLayoutY(134);
        l2.setStartX(-36.3);
        l2.setStartY(-25.20);
        l2.setEndX(-36.3);
        l2.setEndY(103);
        l2.setStroke(Color.BLUE);
        l2.setStrokeWidth(10);

        Line l3 = new Line();
        l3.setLayoutX(198);
        l3.setLayoutY(237);
        l3.setStartX(-100);
        l3.setStartY(-0);
        l3.setEndX(46.199);
        l3.setEndY(0);
        l3.setStroke(Color.YELLOW);
        l3.setStrokeWidth(10);

        Line l4 = new Line();
        l4.setLayoutX(199);
        l4.setLayoutY(106);
        l4.setStartX(-100);
        l4.setStartY(0);
        l4.setEndX(-99.99);
        l4.setEndY(130.799);
        l4.setStroke(Color.GREEN);
        l4.setStrokeWidth(10);

        Group group2 = new Group();
        group2.getChildren().add(l1); group2.getChildren().add(l2); group2.getChildren().add(l3); group2.getChildren().add(l4);
        Rotate rotation = new Rotate();
        ObservableValue<Integer> obsInt1 = new ReadOnlyObjectWrapper<>(180);
        ObservableValue<Integer> obsInt2 = new ReadOnlyObjectWrapper<>(180);
        rotation.pivotXProperty().bind(obsInt1);
        rotation.pivotYProperty().bind(obsInt2);
        group2.getTransforms().add(rotation);

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(rotation.angleProperty(), 0)),
                new KeyFrame(Duration.millis(1000), new KeyValue(rotation.angleProperty(), 360)));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        pane.getChildren().add(group2);
    }
}
