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
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Octa implements Obstacles {
    Rectangle l0; Rectangle l1; Rectangle l2; Rectangle l3;
    Rectangle l4; Rectangle l5; Rectangle l6; Rectangle l7;
    public Timeline animationT;

    public Octa(){
        l0 = new Rectangle();
        l1 = new Rectangle();
        l2 = new Rectangle();
        l3 = new Rectangle();
        l4 = new Rectangle();
        l5 = new Rectangle();
        l6 = new Rectangle();
        l7 = new Rectangle();
    }

    public void display(AnchorPane Pane){

        //  Line l1 = new Line();
        l0.setWidth(14);
        l0.setHeight(84);
        l0.setLayoutX(387);
        l0.setLayoutY(350);
        l0.setStroke(Color.RED);

        l1.setWidth(14);
        l1.setHeight(74);
        l1.setLayoutX(225);
        l1.setLayoutY(282);
        l1.setStroke(Color.GREEN);
        l1.setRotate(47);

        l2.setWidth(105);
        l2.setHeight(14);
        l2.setLayoutX(254);
        l2.setLayoutY(291);
        l2.setStroke(Color.BLUE);

        l3.setWidth(79);
        l3.setHeight(14);
        l3.setLayoutX(335);
        l3.setLayoutY(320);
        l3.setStroke(Color.YELLOW);
        l3.setRotate(55.3);

        l4.setWidth(79);
        l4.setHeight(14);
        l4.setLayoutX(193);
        l4.setLayoutY(444);
        l4.setStroke(Color.YELLOW);
        l4.setRotate(45);

        l5.setWidth(14);
        l5.setHeight(84);
        l5.setLayoutX(194);
        l5.setLayoutY(344);
        l5.setStroke(Color.RED);

        l6.setWidth(105);
        l6.setHeight(14);
        l6.setLayoutX(251);
        l6.setLayoutY(468);
        l6.setStroke(Color.BLUE);

        l7.setWidth(14);
        l7.setHeight(74);
        l7.setLayoutX(364);
        l7.setLayoutY(414);
        l7.setStroke(Color.GREEN);
        l7.setRotate(43);

        l0.setArcHeight(10);
        l0.setArcWidth(10);
        l1.setArcHeight(10);
        l1.setArcWidth(10);
        l2.setArcHeight(10);
        l2.setArcWidth(10);
        l3.setArcHeight(10);
        l3.setArcWidth(10);
        l4.setArcHeight(10);
        l4.setArcWidth(10);
        l5.setArcHeight(10);
        l5.setArcWidth(10);
        l6.setArcHeight(10);
        l6.setArcWidth(10);
        l7.setArcHeight(10);
        l7.setArcWidth(10);

//        l1.setStrokeWidth(5);l0.setStrokeWidth(5);l2.setStrokeWidth(5);l3.setStrokeWidth(5);
//        l4.setStrokeWidth(5);l5.setStrokeWidth(5);l6.setStrokeWidth(5);l7.setStrokeWidth(5);

        l0.setFill(Color.RED); l3.setFill(Color.YELLOW); l2.setFill(Color.BLUE); l1.setFill(Color.GREEN);
        l4.setFill(Color.YELLOW); l6.setFill(Color.BLUE); l7.setFill(Color.GREEN); l5.setFill(Color.RED);

        Group g3 = new Group();
        g3.getChildren().add(l1);g3.getChildren().add(l2);g3.getChildren().add(l3);g3.getChildren().add(l4);
        g3.getChildren().add(l5);g3.getChildren().add(l6);g3.getChildren().add(l7);g3.getChildren().add(l0);
        Rotate rotation = new Rotate();
        ObservableValue<Integer> obsInt1 = new ReadOnlyObjectWrapper<>(280);
        ObservableValue<Integer> obsInt2 = new ReadOnlyObjectWrapper<>(360);
        rotation.pivotXProperty().bind(obsInt1);
        rotation.pivotYProperty().bind(obsInt2);
        g3.getTransforms().add(rotation);
        initialize(rotation);
        Pane.getChildren().add(g3);
    }
    public void initialize(Rotate rotation){
        animationT = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(rotation.angleProperty(), 0)),
                new KeyFrame(Duration.millis(5000), new KeyValue(rotation.angleProperty(), 360)));
        animationT.setCycleCount(Animation.INDEFINITE);
        animationT.play();
    }
    public boolean isObstacleCrossed(Game game, Ball ball, AnchorPane Obstaclespane, Obstacles activeObstacle, Stage stage, boolean[] breking_bad, Text text4){
        if (ball.color == 0) {
            Bounds b1 = ball.circle.localToScene(ball.circle.getBoundsInLocal());
            Bounds sq1 = ((Octa) activeObstacle).l0.localToScene(((Octa) activeObstacle).l0.getBoundsInLocal());
            Bounds sq2 = ((Octa) activeObstacle).l5.localToScene(((Octa) activeObstacle).l5.getBoundsInLocal());
            System.out.println(b1 + " " + sq1);
            boolean k = b1.intersects(sq1) || b1.intersects(sq2);
            if (k) {
                text4.setText("Yayyy");
            } else {
                text4.setText("Ohh");
            }
        }
        if (ball.color == 1) {
            Bounds b1 = ball.circle.localToScene(ball.circle.getBoundsInLocal());
            Bounds sq1 = ((Octa) activeObstacle).l2.localToScene(((Octa) activeObstacle).l2.getBoundsInLocal());
            Bounds sq2 = ((Octa) activeObstacle).l6.localToScene(((Octa) activeObstacle).l6.getBoundsInLocal());
            System.out.println(b1 + " " + sq1);
            boolean k = b1.intersects(sq1) || b1.intersects(sq2);
            if (k) {
                text4.setText("Yayyy");
            } else {
                text4.setText("Ohh");
            }
        }
        if (ball.color == 2) {
            Bounds b1 = ball.circle.localToScene(ball.circle.getBoundsInLocal());
            Bounds sq1 = ((Octa) activeObstacle).l3.localToScene(((Octa) activeObstacle).l3.getBoundsInLocal());
            Bounds sq2 = ((Octa) activeObstacle).l4.localToScene(((Octa) activeObstacle).l4.getBoundsInLocal());
            System.out.println(b1 + " " + sq1);
            boolean k = b1.intersects(sq1) || b1.intersects(sq2);
            if (k) {
                text4.setText("Yayyy");
            } else {
                text4.setText("Ohh");
            }
        }
        if (ball.color == 3) {
            Bounds b1 = ball.circle.localToScene(ball.circle.getBoundsInLocal());
            Bounds sq1 = ((Octa) activeObstacle).l1.localToScene(((Octa) activeObstacle).l1.getBoundsInLocal());
            Bounds sq2 = ((Octa) activeObstacle).l7.localToScene(((Octa) activeObstacle).l7.getBoundsInLocal());
            System.out.println(b1 + " " + sq1);
            boolean k = b1.intersects(sq1) || b1.intersects(sq2);
            if (k) {
                text4.setText("Yayyy");
            } else {
                text4.setText("Ohh");
            }
        }
        return true;

    }
}