package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LayeredSquares implements Obstacles{
    public Timeline animationT;
    Rectangle l1; Rectangle l2; Rectangle l3; Rectangle l4;
    Rectangle line1; Rectangle line2; Rectangle line3; Rectangle line4;

    public LayeredSquares(){
        l1 = new Rectangle();
        l2 = new Rectangle();
        l3 = new Rectangle();
        l4 = new Rectangle();
        line1 = new Rectangle();
        line2 = new Rectangle();
        line3 = new Rectangle();
        line4 = new Rectangle();
    }

    public void display(AnchorPane pane){

        l1.setWidth(147);
        l1.setHeight(13);
        l1.setLayoutX(206);
        l1.setLayoutY(280);
        l1.setStroke(Color.RED);
        l1.setFill(Color.RED);
        l1.setStrokeWidth(5);

        l2.setWidth(13);
        l2.setHeight(131);
        l2.setLayoutX(203);
        l2.setLayoutY(281);
        l2.setStroke(Color.BLUE);
        l2.setFill(Color.BLUE);
        l2.setStrokeWidth(5);

        l3.setWidth(13);
        l3.setHeight(119);
        l3.setLayoutX(337);
        l3.setLayoutY(280);
        l3.setStroke(Color.YELLOW);
        l3.setFill(Color.YELLOW);
        l3.setStrokeWidth(5);

        l4.setWidth(147);
        l4.setHeight(13);
        l4.setLayoutX(206);
        l4.setLayoutY(400);
        l4.setStroke(Color.GREEN);
        l4.setFill(Color.GREEN);
        l4.setStrokeWidth(5);

        l1.setArcHeight(15);
        l1.setArcWidth(15);
        l2.setArcHeight(15);
        l2.setArcWidth(15);
        l3.setArcHeight(15);
        l3.setArcWidth(15);
        l4.setArcHeight(15);
        l4.setArcWidth(15);
        line1.setArcWidth(15);
        line1.setArcHeight(15);
        line2.setArcHeight(15);
        line2.setArcWidth(15);
        line3.setArcHeight(15);
        line3.setArcWidth(15);
        line4.setArcHeight(15);
        line4.setArcWidth(15);

        Group group2 = new Group();
        group2.getChildren().add(l1); group2.getChildren().add(l2); group2.getChildren().add(l3); group2.getChildren().add(l4);
        Rotate rotation = new Rotate();
        ObservableValue<Integer> obsInt1 = new ReadOnlyObjectWrapper<>(280);
        ObservableValue<Integer> obsInt2 = new ReadOnlyObjectWrapper<>(360);
        rotation.pivotXProperty().bind(obsInt1);
        rotation.pivotYProperty().bind(obsInt2);
        group2.getTransforms().add(rotation);
        group2.setLayoutX(0);group2.setLayoutY(0);
        group2.setTranslateX(0);
//        pane.getChildren().add(group2);

        line1.setWidth(197);
        line1.setHeight(13);
        line1.setLayoutX(179);
        line1.setLayoutY(255);
        line1.setStroke(Color.RED);
        line1.setFill(Color.RED);
        line1.setStrokeWidth(5);

        line2.setWidth(13);
        line2.setHeight(183);
        line2.setLayoutX(179);
        line2.setLayoutY(256);
        line2.setStroke(Color.BLUE);
        line2.setFill(Color.BLUE);
        line2.setStrokeWidth(5);

        line3.setWidth(13);
        line3.setHeight(183);
        line3.setLayoutX(360);
        line3.setLayoutY(256);
        line3.setStroke(Color.YELLOW);
        line3.setFill(Color.YELLOW);
        line3.setStrokeWidth(5);

        line4.setWidth(197);
        line4.setHeight(14);
        line4.setLayoutX(179);
        line4.setLayoutY(425);
        line4.setStroke(Color.GREEN);
        line4.setFill(Color.GREEN);
        line4.setStrokeWidth(5);

        Group group = new Group();
        group.getChildren().add(line1); group.getChildren().add(line2); group.getChildren().add(line3); group.getChildren().add(line4);
        Rotate rotation2 = new Rotate();
        rotation2.pivotXProperty().bind(obsInt1);
        rotation2.pivotYProperty().bind(obsInt2);
        group.getTransforms().add(rotation2);
        group.setLayoutX(0);group.setLayoutY(0);
        group.setTranslateX(0);

        Timeline timeRectangle2 = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(rotation2.angleProperty(), 0)),
                new KeyFrame(Duration.millis(3000), new KeyValue(rotation2.angleProperty(), 360)));
        timeRectangle2.setCycleCount(Animation.INDEFINITE);
        timeRectangle2.play();
        pane.getChildren().add(group);

        Timeline timeRectangle = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(rotation.angleProperty(), 0)),
                new KeyFrame(Duration.millis(3000), new KeyValue(rotation.angleProperty(), 360)));
        timeRectangle.setCycleCount(Animation.INDEFINITE);
        timeRectangle.play();
        pane.getChildren().add(group2);


    }
    public boolean isObstacleCrossed(Game game, Ball ball, AnchorPane Obstaclespane, Obstacles activeObstacle, Stage stage, boolean[] breking_bad, Text text4){
        Bounds b1 = ball.circle.localToScene(ball.circle.getBoundsInLocal());
        if (ball.color == 0) {
            Bounds sq1 = ((LayeredSquares) activeObstacle).l1.localToScene(((LayeredSquares) activeObstacle).l1.getBoundsInLocal());
            Bounds sq2 = ((LayeredSquares) activeObstacle).line1.localToScene(((LayeredSquares) activeObstacle).line1.getBoundsInLocal());
            System.out.println(b1 + " " + sq1);
            boolean k = b1.intersects(sq1) && b1.intersects(sq2);
            if (k) {
                text4.setText("Yayyy");
            } else {
                text4.setText("Ohh");
            }
        }
        if (ball.color == 1) {
            Bounds sq1 = ((LayeredSquares) activeObstacle).l2.localToScene(((LayeredSquares) activeObstacle).l2.getBoundsInLocal());
            Bounds sq2 = ((LayeredSquares) activeObstacle).line2.localToScene(((LayeredSquares) activeObstacle).line2.getBoundsInLocal());
            System.out.println(b1 + " " + sq1);
            boolean k = b1.intersects(sq1) && b1.intersects(sq2);
            if (k) {
                text4.setText("Yayyy");
            } else {
                text4.setText("Ohh");
            }
        }
        if (ball.color == 2) {
            Bounds sq1 = ((LayeredSquares) activeObstacle).l3.localToScene(((LayeredSquares) activeObstacle).l3.getBoundsInLocal());
            Bounds sq2 = ((LayeredSquares) activeObstacle).line3.localToScene(((LayeredSquares) activeObstacle).line3.getBoundsInLocal());
            System.out.println(b1 + " " + sq1);
            boolean k = b1.intersects(sq1) && b1.intersects(sq2);
            if (k) {
                text4.setText("Yayyy");
            } else {
                text4.setText("Ohh");
            }
        }
        if (ball.color == 3) {
            Bounds sq1 = ((LayeredSquares) activeObstacle).l4.localToScene(((LayeredSquares) activeObstacle).l4.getBoundsInLocal());
            Bounds sq2 = ((LayeredSquares) activeObstacle).line4.localToScene(((LayeredSquares) activeObstacle).line4.getBoundsInLocal());
            System.out.println(b1 + " " + sq1);
            boolean k = b1.intersects(sq1) && b1.intersects(sq2);
            if (k) {
                text4.setText("Yayyy");
            } else {
                text4.setText("Ohh");
            }
        }
        return true;
    }
}
