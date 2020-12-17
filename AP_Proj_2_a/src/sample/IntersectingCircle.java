package sample;

import javafx.animation.*;
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

public class IntersectingCircle implements Obstacles, Serializable {
    transient Circle_ c1;
    transient Circle_ c2;
static int id = 1;
    public IntersectingCircle() {
        c1 = new Circle_();
        c2 = new Circle_();
        //  System.out.println(c1.arc1);
    }
    public int getId(){return id;};
    public void display(AnchorPane pane, Game game) {
        c1 = new Circle_();
        c2 = new Circle_();
        c1.arc1.setCenterX(250);
        c1.arc2.setCenterX(250);
        c1.arc3.setCenterX(250);
        c1.arc4.setCenterX(250);
        c2.arc1.setCenterX(330);
        c2.arc2.setCenterX(330);
        c2.arc3.setCenterX(330);
        c2.arc4.setCenterX(330);
        c1.arc1.setCenterX(290);
        c1.arc1.setCenterY(370.0);
        c1.arc1.setLength(100.0);
        c1.arc1.setRadiusX(90);
        c1.arc1.setRadiusY(90);
        c1.arc1.setStartAngle(40);
        c1.arc1.setFill(Color.TRANSPARENT);
        c1.arc1.setStroke(Color.GREEN);
        c1.arc1.setStrokeWidth(15);
        c1.arc1.setType(ArcType.OPEN);

        c1.arc2.setCenterX(290.0);
        c1.arc2.setCenterY(370.0);
        c1.arc2.setLength(100);
        c1.arc2.setRadiusX(90);
        c1.arc2.setRadiusY(90);
        c1.arc2.setStartAngle(130);
        c1.arc2.setFill(Color.TRANSPARENT);
        c1.arc2.setStroke(Color.RED);
        c1.arc2.setStrokeWidth(15);
        c1.arc2.setType(ArcType.OPEN);

        c1.arc3.setCenterX(290.0);
        c1.arc3.setCenterY(370.0);
        c1.arc3.setLength(100);
        c1.arc3.setRadiusX(90);
        c1.arc3.setRadiusY(90);
        c1.arc3.setStartAngle(-140.4);
        c1.arc3.setFill(Color.TRANSPARENT);
        c1.arc3.setStroke(Color.BLUE);
        c1.arc3.setStrokeWidth(15);
        c1.arc3.setType(ArcType.OPEN);

        c1.arc4.setCenterX(290.0);
        c1.arc4.setCenterY(370.0);
        c1.arc4.setLength(90);
        c1.arc4.setRadiusX(90);
        c1.arc4.setRadiusY(90);
        c1.arc4.setStartAngle(-50);
        c1.arc4.setFill(Color.TRANSPARENT);
        c1.arc4.setStroke(Color.YELLOW);
        c1.arc4.setStrokeWidth(15);
        c1.arc4.setType(ArcType.OPEN);

        c2.arc1.setCenterX(250);
        c2.arc2.setCenterX(250);
        c2.arc3.setCenterX(250);
        c2.arc4.setCenterX(250);
        c2.arc1.setCenterX(330);
        c2.arc2.setCenterX(330);
        c2.arc3.setCenterX(330);
        c2.arc4.setCenterX(330);
        c2.arc1.setCenterX(290);
        c2.arc1.setCenterY(370.0);
        c2.arc1.setLength(100.0);
        c2.arc1.setRadiusX(90);
        c2.arc1.setRadiusY(90);
        c2.arc1.setStartAngle(40);
        c2.arc1.setFill(Color.TRANSPARENT);
        c2.arc1.setStroke(Color.GREEN);
        c2.arc1.setStrokeWidth(15);
        c2.arc1.setType(ArcType.OPEN);


        c2.arc2.setCenterX(290.0);
        c2.arc2.setCenterY(370.0);
        c2.arc2.setLength(100);
        c2.arc2.setRadiusX(90);
        c2.arc2.setRadiusY(90);
        c2.arc2.setStartAngle(130);
        c2.arc2.setFill(Color.TRANSPARENT);
        c2.arc2.setStroke(Color.YELLOW);
        c2.arc2.setStrokeWidth(15);
        c2.arc2.setType(ArcType.OPEN);

        c2.arc3.setCenterX(290.0);
        c2.arc3.setCenterY(370.0);
        c2.arc3.setLength(100);
        c2.arc3.setRadiusX(90);
        c2.arc3.setRadiusY(90);
        c2.arc3.setStartAngle(-140.4);
        c2.arc3.setFill(Color.TRANSPARENT);
        c2.arc3.setStroke(Color.BLUE);
        c2.arc3.setStrokeWidth(15);
        c2.arc3.setType(ArcType.OPEN);

        c2.arc4.setCenterX(290.0);
        c2.arc4.setCenterY(370.0);
        c2.arc4.setLength(90);
        c2.arc4.setRadiusX(90);
        c2.arc4.setRadiusY(90);
        c2.arc4.setStartAngle(-50);
        c2.arc4.setFill(Color.TRANSPARENT);
        c2.arc4.setStroke(Color.RED);
        c2.arc4.setStrokeWidth(15);
        c2.arc4.setType(ArcType.OPEN);
        c1.arc1.setCenterX(250);
        c1.arc2.setCenterX(250);
        c1.arc3.setCenterX(250);
        c1.arc4.setCenterX(250);
        c2.arc1.setCenterX(330);
        c2.arc2.setCenterX(330);
        c2.arc3.setCenterX(330);
        c2.arc4.setCenterX(330);

        initialize(c1.animation1, c1.arc1, game);
        initialize(c1.animation2, c1.arc2, game);
        initialize(c1.animation3, c1.arc3, game);
        initialize(c1.animation4, c1.arc4, game);
        initialize1(c2.animation1, c2.arc1, game);
        initialize1(c2.animation2, c2.arc2, game);
        initialize1(c2.animation3,c2.arc3, game);
        initialize1(c2.animation4, c2.arc4, game);

        pane.getChildren().add(c1.arc1);
        pane.getChildren().add(c1.arc2);
        pane.getChildren().add(c1.arc3);
        pane.getChildren().add(c1.arc4);
        pane.getChildren().add(c2.arc1);
        pane.getChildren().add(c2.arc2);
        pane.getChildren().add(c2.arc3);
        pane.getChildren().add(c2.arc4);

    }

    public void initialize(Timeline animationT, Arc arc, Game game) {
        int x = game.score;
        x = x%7;
        if(5-x>1){
            animationT = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
                    new KeyFrame(Duration.seconds(5-x), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() - 360, Interpolator.LINEAR))
            );}
        else{
            animationT = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
                    new KeyFrame(Duration.seconds(5), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() - 360, Interpolator.LINEAR))
            );
        }
        animationT.setCycleCount(Animation.INDEFINITE);
        animationT.play();

    }

    public void initialize1(Timeline animationT, Arc arc, Game game) {
        int x = game.score;
        x = x%7;
        if(5-x>1){
            animationT = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
                    new KeyFrame(Duration.seconds(5-x), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() + 360, Interpolator.LINEAR))
            );}
        else{
            animationT = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
                    new KeyFrame(Duration.seconds(5), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() + 360, Interpolator.LINEAR))
            );
        }
        animationT.setCycleCount(Animation.INDEFINITE);
        animationT.play();

    }

    public boolean isObstacleCrossed(Game game, IntersectingCircle activeObstacle, Ball ball, AnchorPane Obstaclespane, Stage stage, boolean[] breking_bad, Text text4) {
        Shape s1 = Shape.intersect(ball.circle, c1.arc2);
        Shape s2 = Shape.intersect(ball.circle, c1.arc3);
        Shape s3 = Shape.intersect(ball.circle, c1.arc4);
        Shape s4 = Shape.intersect(ball.circle, c1.arc1);
        if (ball.color == 0) {
            boolean k1 = s1.getBoundsInLocal().getWidth() == -1;
            boolean k2 = (s2.getBoundsInLocal().getWidth() == -1) && (s3.getBoundsInLocal().getWidth() == -1) && (s4.getBoundsInLocal().getWidth() == -1);

            if (!k1 && k2) {
//                text4.setText("Yayyy");
            } else if (k2){
//                text4.setText("Ohh");
                return false;
            }
            else {
//                text4.setText("NA");
            }

        }

        else if(ball.color ==1)

        {
            boolean k1 = s2.getBoundsInLocal().getWidth() == -1;
            boolean k2 = (s1.getBoundsInLocal().getWidth() == -1) && (s3.getBoundsInLocal().getWidth() == -1) && (s4.getBoundsInLocal().getWidth() == -1);

            if (!k1 && k2) {
//                text4.setText("Yayyy");
            } else if (k2){
//                text4.setText("Ohh");
                return false;
            }
            else {
//                text4.setText("NA");
            }
        }
        else if(ball.color ==2)

        {

            boolean k1 = s3.getBoundsInLocal().getWidth() == -1;
            boolean k2 = (s2.getBoundsInLocal().getWidth() == -1) && (s1.getBoundsInLocal().getWidth() == -1) && (s4.getBoundsInLocal().getWidth() == -1);

            if (!k1 && k2) {
//                text4.setText("Yayyy");
            } else if (k2){
//                text4.setText("Ohh");
                return false;
            }
            else {
//                text4.setText("NA");
            }
        }
        else

        {
            boolean k1 = s4.getBoundsInLocal().getWidth() == -1;
            boolean k2 = (s2.getBoundsInLocal().getWidth() == -1) && (s3.getBoundsInLocal().getWidth() == -1) && (s1.getBoundsInLocal().getWidth() == -1);

            if (!k1 && k2) {
//                text4.setText("Yayyy");
            } else if (k2){
//                text4.setText("Ohh");
                return false;
            }
            else {
//                text4.setText("NA");
            }

        }
        return true;
    }
}