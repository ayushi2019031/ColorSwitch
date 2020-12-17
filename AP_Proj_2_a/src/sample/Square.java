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
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.Serializable;

public class Square implements Obstacles , Serializable {
    transient Rectangle l1;
    transient Rectangle l2;
    transient Rectangle l3;
    transient Rectangle l4;
    public transient Timeline animationT;
    static int id = 5;
    public Square() {
         l1 = new Rectangle();l2 = new Rectangle();
         l3 = new Rectangle();
        l4 = new Rectangle();
    }
    public int getId(){return id;};
    public void display(AnchorPane pane, Game game) {
        l1 = new Rectangle();l2 = new Rectangle();
        l3 = new Rectangle();
        l4 = new Rectangle();
        l1.setWidth(145);
        l1.setHeight(13);
        l1.setLayoutX(206);
        l1.setLayoutY(280);
        l1.setStroke(Color.RED);
        l1.setFill(Color.RED);
        l1.setStrokeWidth(5);

        l2.setWidth(13);
        l2.setHeight(129);
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
        initialise(rotation, game);
        pane.getChildren().add(group2);
    }

    public void initialise(Rotate rotation, Game game) {
        int x = game.score;
        x = x%7;
        this.animationT = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(rotation.angleProperty(), 0)),
                new KeyFrame(Duration.millis(10000-x*1000), new KeyValue(rotation.angleProperty(), 360)));
        animationT.setCycleCount(Animation.INDEFINITE);
        animationT.play();
    }

    public int isObstacleCrossed(Game game, Square activeObstacle, Ball ball, AnchorPane Obstaclespane, Stage stage, boolean[] breking_bad, Text text4) {

        Shape s1 = Shape.intersect(ball.circle ,l1);
        Shape s2 = Shape.intersect(ball.circle, l2);
        Shape s3 = Shape.intersect(ball.circle, l3);
        Shape s4 = Shape.intersect(ball.circle,  l4);
        if (ball.color == 0) {
            boolean k1 = s1.getBoundsInLocal().getWidth() == -1;
            boolean k2 = (s2.getBoundsInLocal().getWidth() == -1) && (s3.getBoundsInLocal().getWidth() == -1) && (s4.getBoundsInLocal().getWidth() == -1);

            if (!k1 && k2) {
//                text4.setText("Yayyy");
                return 2;
            } else if (k2){
//                text4.setText("Ohh");
                return -1;
            }
            else {return 0;
//                text4.setText("NA");
            }

        }

        else if(ball.color ==1)

        {
            boolean k1 = s2.getBoundsInLocal().getWidth() == -1;
            boolean k2 = (s1.getBoundsInLocal().getWidth() == -1) && (s3.getBoundsInLocal().getWidth() == -1) && (s4.getBoundsInLocal().getWidth() == -1);

            if (!k1 && k2) {return 2;
//                text4.setText("Yayyy");
            } else if (k2){return -1;
//                text4.setText("Ohh");

            }
            else {return 0;
//                text4.setText("NA");
            }
        }
        else if(ball.color ==2)

        {

            boolean k1 = s3.getBoundsInLocal().getWidth() == -1;
            boolean k2 = (s2.getBoundsInLocal().getWidth() == -1) && (s1.getBoundsInLocal().getWidth() == -1) && (s4.getBoundsInLocal().getWidth() == -1);

            if (!k1 && k2) {return 2;
//                text4.setText("Yayyy");
            } else if (k2){return -1;
//                text4.setText("Ohh");

            }
            else {return 0;
//                text4.setText("NA");
            }
        }
        else

        {
            boolean k1 = s4.getBoundsInLocal().getWidth() == -1;
            boolean k2 = (s2.getBoundsInLocal().getWidth() == -1) && (s3.getBoundsInLocal().getWidth() == -1) && (s1.getBoundsInLocal().getWidth() == -1);

            if (!k1 && k2) {return 2;
//                text4.setText("Yayyy");
            } else if (k2){return -1;
//                text4.setText("Ohh");

            }
            else {return 0;
//                text4.setText("NA");
            }

        }

    }

}