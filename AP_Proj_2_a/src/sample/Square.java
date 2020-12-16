package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.Timeline;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Square implements Obstacles {
    Rectangle l1;
    Rectangle l2;
    Rectangle l3;
    Rectangle l4;
    public Timeline animationT;

    public Square() {
        l1 = new Rectangle();
        l2 = new Rectangle();
        l3 = new Rectangle();
        l4 = new Rectangle();
    }

    public void display(AnchorPane pane) {

        l1.setWidth(156);
        l1.setHeight(16);
        l1.setLayoutX(206);
        l1.setLayoutY(267);
        l1.setStroke(Color.RED);
        l1.setFill(Color.RED);
        l1.setStrokeWidth(5);

        l2.setWidth(16);
        l2.setHeight(132);
        l2.setLayoutX(203);
        l2.setLayoutY(267);
        l2.setStroke(Color.BLUE);
        l2.setFill(Color.BLUE);
        l2.setStrokeWidth(5);

        l3.setWidth(16);
        l3.setHeight(143);
        l3.setLayoutX(345);
        l3.setLayoutY(266);
        l3.setStroke(Color.YELLOW);
        l3.setFill(Color.YELLOW);
        l3.setStrokeWidth(5);

        l4.setWidth(156);
        l4.setHeight(16);
        l4.setLayoutX(203);
        l4.setLayoutY(397);
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

//        l1.setStrokeRectangleCap(StrokeRectangleCap.ROUND);
//        l2.setStrokeRectangleCap(StrokeRectangleCap.ROUND);
//        l3.setStrokeRectangleCap(StrokeRectangleCap.ROUND);
//        l4.setStrokeRectangleCap(StrokeRectangleCap.ROUND);

        Group group2 = new Group();
        group2.getChildren().add(l1);
        group2.getChildren().add(l2);
        group2.getChildren().add(l3);
        group2.getChildren().add(l4);
        Rotate rotation = new Rotate();
        ObservableValue<Integer> obsInt1 = new ReadOnlyObjectWrapper<>(280);
        ObservableValue<Integer> obsInt2 = new ReadOnlyObjectWrapper<>(360);
        rotation.pivotXProperty().bind(obsInt1);
        rotation.pivotYProperty().bind(obsInt2);
        group2.getTransforms().add(rotation);
        group2.setLayoutX(0);
        group2.setLayoutY(0);
        group2.setTranslateX(0);
        initialise(rotation);
        pane.getChildren().add(group2);
    }

    public void initialise(Rotate rotation) {
        this.animationT = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(rotation.angleProperty(), 0)),
                new KeyFrame(Duration.millis(3000), new KeyValue(rotation.angleProperty(), 360)));
        animationT.setCycleCount(Animation.INDEFINITE);
        animationT.play();
    }
    public boolean isObstacleCrossed(Game game, Square activeObstacle, Ball ball, AnchorPane Obstaclespane, Stage stage, boolean[] breking_bad, Text text4)
    {if(ball.color ==0)

    {
        Bounds b1 = ball.circle.localToScene(ball.circle.getBoundsInLocal());
        Bounds sq = ((Square) activeObstacle).l1.localToScene(((Square) activeObstacle).l1.getBoundsInLocal());
        System.out.println(b1 + " " + sq);
        boolean k = b1.intersects(sq);
        if (k) {
            text4.setText("Yayyy");
        } else {
            text4.setText("Ohh");
        }
    }
                            else if(ball.color ==1)

    {
        Bounds b1 = ball.circle.localToScene(ball.circle.getBoundsInLocal());
        Bounds sq = ((Square) activeObstacle).l2.localToScene(((Square) activeObstacle).l2.getBoundsInLocal());
        System.out.println(b1 + " " + sq);
        boolean k = b1.intersects(sq);
        if (k) {
            text4.setText("Yayyy");
        } else {
            text4.setText("Ohh");
        }
    }
                            else if(ball.color ==2)

    {
        Bounds b1 = ball.circle.localToScene(ball.circle.getBoundsInLocal());
        Bounds sq = ((Square) activeObstacle).l3.localToScene(((Square) activeObstacle).l3.getBoundsInLocal());
        System.out.println(b1 + " " + sq);
        boolean k = b1.intersects(sq);
        if (k) {
            text4.setText("Yayyy");
        } else {
            text4.setText("Ohh");
        }
    }
                            else

    {
        Bounds b1 = ball.circle.localToScene(ball.circle.getBoundsInLocal());
        Bounds sq = ((Square) activeObstacle).l4.localToScene(((Square) activeObstacle).l4.getBoundsInLocal());
        System.out.println(b1 + " " + sq);
        boolean k = b1.intersects(sq);
        if (k) {
            text4.setText("Yayyy");
        } else {
            text4.setText("Ohh");
        }
    }
return true;
    }

}