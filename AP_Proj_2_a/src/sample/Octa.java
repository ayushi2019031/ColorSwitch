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
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.Serializable;

public class Octa implements Obstacles , Serializable {
    transient Rectangle l0; transient Rectangle l1;transient  Rectangle l2;transient  Rectangle l3;
    transient Rectangle l4;transient  Rectangle l5;transient  Rectangle l6;transient  Rectangle l7;
    public transient Timeline animationT;
    static int id = 4;  public int getId(){return id;};
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

    public void display(AnchorPane Pane, Game game){
        l0 = new Rectangle();
        l1 = new Rectangle();
        l2 = new Rectangle();
        l3 = new Rectangle();
        l4 = new Rectangle();
        l5 = new Rectangle();
        l6 = new Rectangle();
        l7 = new Rectangle();
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
        initialize(rotation, game);
        Pane.getChildren().add(g3);
    }
    public void initialize(Rotate rotation, Game game){
        int x = game.score;
        x = x%7;
        animationT = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(rotation.angleProperty(), 0)),
                new KeyFrame(Duration.millis(10000-x*1000), new KeyValue(rotation.angleProperty(), 360)));
        animationT.setCycleCount(Animation.INDEFINITE);
        animationT.play();
    }
    public int isObstacleCrossed(Game game, Octa activeObstacle, Ball ball, AnchorPane Obstaclespane, Stage stage, boolean[] breking_bad, Text text4) {

        Shape s0 = Shape.intersect(ball.circle, l0);
        Shape s1 = Shape.intersect(ball.circle ,l1);
        Shape s2 = Shape.intersect(ball.circle, l2);
        Shape s3 = Shape.intersect(ball.circle, l3);
        Shape s4 = Shape.intersect(ball.circle, l4);
        Shape s5 = Shape.intersect(ball.circle, l5);
        Shape s6 = Shape.intersect(ball.circle, l6);
        Shape s7 = Shape.intersect(ball.circle, l7);

        boolean b1 = (s5.getBoundsInLocal().getWidth() == -1) && (s0.getBoundsInLocal().getWidth()==-1);
        boolean b2 = (s2.getBoundsInLocal().getWidth() == -1) && (s6.getBoundsInLocal().getWidth()==-1);
        boolean b3 = (s3.getBoundsInLocal().getWidth() == -1) && (s4.getBoundsInLocal().getWidth()==-1);
        boolean b4 = (s1.getBoundsInLocal().getWidth() == -1) && (s7.getBoundsInLocal().getWidth()==-1);

        if (ball.color == 0) {
            boolean k1 = b1;
            boolean k2 = b2 && b3 && b4;

            if (!k1 && k2) {return 2;
//                text4.setText("Yayyyyyyyyyyyyyyyyyyyyyyyyyy KESAR");
            } else if (k2){return -1;
//                text4.setText("Ohh");

            }
            else {return 0;
//                text4.setText("NA");
            }

        }

        else if(ball.color ==1)

        {
            boolean k1 = b2;
            boolean k2 = b1 && b3 && b4;

            if (!k1 && k2) {return 2;
//                text4.setText("Yayyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
            } else if (k2){return -1;
//                text4.setText("Ohh");

            }
            else {return 0;
//                text4.setText("NA");
            }
        }
        else if(ball.color ==2)

        {

            boolean k1 = b3;
            boolean k2 = b2 && b1 && b4;

            if (!k1 && k2) {return 2;
//                text4.setText("Yayyyyyyyyyyyyyyyyyyyyyy");
            } else if (k2){return -1;
//
            }
            else {return 0;
//                text4.setText("NA");
            }
        }
        else

        {
            boolean k1 = b4;
            boolean k2 = b2 && b3 && b1;

            if (!k1 && k2) {return 2;
//                text4.setText("Yayyyyyyyyyyyyyyyyyyyyyyyyyy");
            } else if (k2){return -1;
//                text4.setText("Ohh");

            }
            else {return 0;
//                text4.setText("NA");
            }

        }

    }

}