package sample;

import javafx.animation.*;
import javafx.geometry.Bounds;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.Serializable;

public class Circle_ implements Obstacles , Serializable {
    static int id = 0;
    transient Arc arc1;transient  Arc arc2;transient  Arc arc3;transient  Arc arc4;
    transient Timeline animation1,  animation2, animation3,  animation4;

    public  Circle_(){
        arc1 = new Arc(); arc2 = new Arc(); arc3 = new Arc(); arc4 = new Arc();
        System.out.println("Initialised");
    }  public int getId(){return id;};

    public void display(AnchorPane root, Game game){
        arc1 = new Arc(); arc2 = new Arc(); arc3 = new Arc(); arc4 = new Arc();
        arc1.setCenterX(290);
        arc1.setCenterY(370.0);
        arc1.setLength(100.0);
        arc1.setRadiusX(90);
        arc1.setRadiusY(90);
        arc1.setStartAngle(40);
        arc1.setFill(Color.TRANSPARENT);
        arc1.setStroke(Color.GREEN);
        arc1.setStrokeWidth(15);
        arc1.setType(ArcType.OPEN);

        arc2.setCenterX(290.0);
        arc2.setCenterY(370.0);
        arc2.setLength(100);
        arc2.setRadiusX(90);
        arc2.setRadiusY(90);
        arc2.setStartAngle(130);
        arc2.setFill(Color.TRANSPARENT);
        arc2.setStroke(Color.RED);
        arc2.setStrokeWidth(15);
        arc2.setType(ArcType.OPEN);

        arc3.setCenterX(290.0);
        arc3.setCenterY(370.0);
        arc3.setLength(100);
        arc3.setRadiusX(90);
        arc3.setRadiusY(90);
        arc3.setStartAngle(-140.4);
        arc3.setFill(Color.TRANSPARENT);
        arc3.setStroke(Color.BLUE);
        arc3.setStrokeWidth(15);
        arc3.setType(ArcType.OPEN);

        arc4.setCenterX(290.0);
        arc4.setCenterY(370.0);
        arc4.setLength(90);
        arc4.setRadiusX(90);
        arc4.setRadiusY(90);
        arc4.setStartAngle(-50);
        arc4.setFill(Color.TRANSPARENT);
        arc4.setStroke(Color.YELLOW);
        arc4.setStrokeWidth(15);
        arc4.setType(ArcType.OPEN);

        root.getChildren().add(arc1);
        root.getChildren().add(arc2);
        root.getChildren().add(arc3);
        root.getChildren().add(arc4);

        initialize(animation1, arc1, game);
        initialize(animation2, arc2, game);
        initialize(animation3, arc3, game);
        initialize(animation4, arc4, game);

    }

    public void initialize(Timeline animation, Arc arc, Game game) {
        int x = game.score;
        x = x%7;
        if(5-x>1){
            animation = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
                    new KeyFrame(Duration.seconds(5 - x), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() - 360, Interpolator.LINEAR))
            );}
        else{
            animation = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
                    new KeyFrame(Duration.seconds(5), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() - 360, Interpolator.LINEAR))
            );
        }
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();

    }

    public int isObstacleCrossed(Game game, Circle_ activeObstacle, Ball ball, AnchorPane Obstaclespane, Stage stage, boolean[] breking_bad, Text text4) {
        Shape s1 = Shape.intersect(ball.circle ,arc2);
        Shape s2 = Shape.intersect(ball.circle, arc3);
        Shape s3 = Shape.intersect(ball.circle, arc4);
        Shape s4 = Shape.intersect(ball.circle, arc1);
        if (ball.color == 0) {
            boolean k1 = s1.getBoundsInLocal().getWidth() == -1;
            boolean k2 = (s2.getBoundsInLocal().getWidth() == -1) && (s3.getBoundsInLocal().getWidth() == -1) && (s4.getBoundsInLocal().getWidth() == -1);

            if (!k1 && k2) {
                return 2;
//                text4.setText("Yayyy");
            } else if (k2){
                return -1;
//                text4.setText("Ohh");
            }
            else {
                return 0;
//                text4.setText("NA");
            }

        }

        else if(ball.color ==1)

        {
            boolean k1 = s2.getBoundsInLocal().getWidth() == -1;
            boolean k2 = (s1.getBoundsInLocal().getWidth() == -1) && (s3.getBoundsInLocal().getWidth() == -1) && (s4.getBoundsInLocal().getWidth() == -1);

            if (!k1 && k2) {
                return 2;
//                text4.setText("Yayyy");
            } else if (k2){
                return -1;
//                text4.setText("Ohh");

            }
            else {
                return 0;
//                text4.setText("NA");
            }
        }
        else if(ball.color ==2)

        {
            boolean k1 = s3.getBoundsInLocal().getWidth() == -1;
            boolean k2 = (s2.getBoundsInLocal().getWidth() == -1) && (s1.getBoundsInLocal().getWidth() == -1) && (s4.getBoundsInLocal().getWidth() == -1);

            if (!k1 && k2) {
                return 2;
//                text4.setText("Yayyy");
            } else if (k2){ return -1;
//                text4.setText("Ohh");
            }
            else { return 0;
//                text4.setText("NA");
            }
        }
        else

        {
            boolean k1 = s4.getBoundsInLocal().getWidth() == -1;
            boolean k2 = (s2.getBoundsInLocal().getWidth() == -1) && (s3.getBoundsInLocal().getWidth() == -1) && (s1.getBoundsInLocal().getWidth() == -1);

            if (!k1 && k2) { return 2;
//                text4.setText("Yayyy");
            } else if (k2){ return -1;
//                text4.setText("Ohh");

            }
            else { return 0;
//                text4.setText("NA");
            }

        }
    }
}
