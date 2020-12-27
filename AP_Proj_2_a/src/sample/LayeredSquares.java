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
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class LayeredSquares {
    public void display(AnchorPane pane){

        Line l1 = new Line();
        l1.setLayoutX(311);
        l1.setLayoutY(288);
        l1.setStartX(-100);
        l1.setStartY(0);
        l1.setEndX(86.199);
        l1.setEndY(0.7);
        l1.setStroke(Color.RED);
        l1.setStrokeWidth(10);

        Line l2 = new Line();
        l2.setLayoutX(211);
        l2.setLayoutY(377);
        l2.setStartX(0.499);
        l2.setStartY(-87.5);
        l2.setEndX(0.4999);
        l2.setEndY(73.200);
        l2.setStroke(Color.BLUE);
        l2.setStrokeWidth(10);

        Line l3 = new Line();
        l3.setLayoutX(431);
        l3.setLayoutY(335);
        l3.setStartX(-33.3);
        l3.setStartY(-45.799);
        l3.setEndX(-33.3);
        l3.setEndY(115.5);
        l3.setStroke(Color.YELLOW);
        l3.setStrokeWidth(10);

        Line l4 = new Line();
        l4.setLayoutX(311);
        l4.setLayoutY(451);
        l4.setStartX(-100);
        l4.setStartY(0);
        l4.setEndX(85.199);
        l4.setEndY(0);
        l4.setStroke(Color.GREEN);
        l4.setStrokeWidth(10);

        Group group2 = new Group();
        group2.getChildren().add(l1); group2.getChildren().add(l2); group2.getChildren().add(l3); group2.getChildren().add(l4);
        Rotate rotation = new Rotate();
        ObservableValue<Integer> obsInt1 = new ReadOnlyObjectWrapper<>(280);
        ObservableValue<Integer> obsInt2 = new ReadOnlyObjectWrapper<>(380);
        rotation.pivotXProperty().bind(obsInt1);
        rotation.pivotYProperty().bind(obsInt2);
        group2.getTransforms().add(rotation);
        group2.setLayoutX(0);group2.setLayoutY(0);
        group2.setTranslateX(0);
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(rotation.angleProperty(), 0)),
                new KeyFrame(Duration.millis(3000), new KeyValue(rotation.angleProperty(), 360)));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        pane.getChildren().add(group2);


        Line line1 = new Line();
        line1.setLayoutX(311);
        line1.setLayoutY(250);
        line1.setStartX(-116);
        line1.setStartY(0);
        line1.setEndX(101.199);
        line1.setEndY(0.7);
        line1.setStroke(Color.RED);
        line1.setStrokeWidth(10);

        Line line2 = new Line();
        line2.setLayoutX(195);
        line2.setLayoutY(377);
        line2.setStartX(0.499);
        line2.setStartY(-115.5);
        line2.setEndX(0.4999);
        line2.setEndY(100.200);
        line2.setStroke(Color.BLUE);
        line2.setStrokeWidth(10);

        Line line3 = new Line();
        line3.setLayoutX(445);
        line3.setLayoutY(335);
        line3.setStartX(-33.3);
        line3.setStartY(-72.799);
        line3.setEndX(-33.3);
        line3.setEndY(135.5);
        line3.setStroke(Color.YELLOW);
        line3.setStrokeWidth(10);

        Line line4 = new Line();
        line4.setLayoutX(311);
        line4.setLayoutY(480);
        line4.setStartX(-116);
        line4.setStartY(0);
        line4.setEndX(101.199);
        line4.setEndY(0);
        line4.setStroke(Color.GREEN);
        line4.setStrokeWidth(10);

        Group group = new Group();
        group.getChildren().add(line1); group.getChildren().add(line2); group.getChildren().add(line3); group.getChildren().add(line4);
        Rotate rotation2 = new Rotate();
        ObservableValue<Integer> obsInteger1 = new ReadOnlyObjectWrapper<>(280);
        ObservableValue<Integer> obsInteger2 = new ReadOnlyObjectWrapper<>(380);
        rotation2.pivotXProperty().bind(obsInt1);
        rotation2.pivotYProperty().bind(obsInt2);
        group.getTransforms().add(rotation2);
        group.setLayoutX(0);group.setLayoutY(0);
        group.setTranslateX(0);

        Timeline timeline2 = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(rotation2.angleProperty(), 0)),
                new KeyFrame(Duration.millis(3000), new KeyValue(rotation2.angleProperty(), 360)));
        timeline2.setCycleCount(Animation.INDEFINITE);
        timeline2.play();
        pane.getChildren().add(group);
    }
}
