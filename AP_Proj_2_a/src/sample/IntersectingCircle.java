package sample;

import javafx.animation.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class IntersectingCircle implements Obstacles{
    Circle_ c1;
    Circle_ c2;
    public Timeline animationT;
    public IntersectingCircle() {
        c1 = new Circle_();
        c2 = new Circle_();
        //  System.out.println(c1.arc1);


    }
    public void display(AnchorPane pane){

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
        //  AnchorPane root = new AnchorPane();
//        root.setMaxHeight(Double.MIN_VALUE);
//        root.setMaxWidth(Double.MIN_VALUE);
//        root.setMinHeight(Double.MAX_VALUE);
//        root.setMinWidth(Double.MAX_VALUE);
//        root.prefHeight(400.0);
//        root.prefWidth(600.0);
        c1.arc1.setCenterX(250);
        c1.arc2.setCenterX(250);
        c1.arc3.setCenterX(250);
        c1.arc4.setCenterX(250);
        c2.arc1.setCenterX(330);
        c2.arc2.setCenterX(330);
        c2.arc3.setCenterX(330);
        c2.arc4.setCenterX(330);

        initialize(c1.arc1);
        initialize(c1.arc2);
        initialize(c1.arc3);
        initialize(c1.arc4);
        initialize1(c2.arc1);
        initialize1(c2.arc2);
        initialize1(c2.arc3);
        initialize1(c2.arc4);

        pane.getChildren().add(c1.arc1);pane.getChildren().add(c1.arc2);pane.getChildren().add(c1.arc3);pane.getChildren().add(c1.arc4);
        pane.getChildren().add(c2.arc1);pane.getChildren().add(c2.arc2);pane.getChildren().add(c2.arc3);pane.getChildren().add(c2.arc4);

    }
    public void initialize(Arc arc) {
        animationT = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
                new KeyFrame(Duration.seconds(2), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() - 360, Interpolator.LINEAR))
        );
        animationT.setCycleCount(Animation.INDEFINITE);
        animationT.play();

    }

    public void initialize1(Arc arc) {
        animationT = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
                new KeyFrame(Duration.seconds(2), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() + 360, Interpolator.LINEAR))
        );
        animationT.setCycleCount(Animation.INDEFINITE);
        animationT.play();

    }
    public boolean isObstacleCrossed(Game game, Ball ball, AnchorPane Obstaclespane, Obstacles activeObstacle, Stage stage, boolean[] breking_bad, int a1, int a2, int a3){
        //    System.out.println("AJ: " + aj + "ObstaclesPane LayoutY: " + Obstaclespane.getLayoutY());
        double aj =ball.circle.getLayoutY() + ball.circle.getTranslateY();
        if (ball.circle.getFill().equals(((IntersectingCircle) activeObstacle).c1.arc2.getStroke())) {
            aj = ball.circle.getLayoutY() + ball.circle.getTranslateY();
            if (Math.abs(aj - (Obstaclespane.getLayoutY() + a1)) <= a2 && !breking_bad[0]) {
                System.out.println("helo peeps ayushi " + ball.circle.getBoundsInParent().getMinY()  + " " + ((IntersectingCircle) activeObstacle).c1.arc2.getBoundsInParent().getMinY());
                System.out.println(ball.circle.getBoundsInParent().getMinY() + " " + ((IntersectingCircle) activeObstacle).c2.arc4.getBoundsInParent().getMinY()) ;
                if (!breking_bad[0] &&  Math.abs(ball.circle.getBoundsInParent().getMinY() - ((IntersectingCircle) activeObstacle).c1.arc2.getBoundsInParent().getMinY())  <= a3  && Math.abs(ball.circle.getBoundsInParent().getMinY() - ((IntersectingCircle) activeObstacle).c2.arc4.getBoundsInParent().getMinY())  <= a3) {
                    Circle circle = new Circle(10, Color.WHITE);
                    circle.setCenterX(280);
                    circle.setCenterY(350);
                    Obstaclespane.getChildren().add(circle);
                    System.out.println("hello peeps kesar");
                    breking_bad[0] = true;
                    return true;
                } else if (Math.abs(aj - (Obstaclespane.getLayoutY() + a1)) <= a2){
                    if (!breking_bad[0]){
                        try {
                            game.endGameMenu = new EndGameMenu();
                            game.endGameMenu.initializeGame(stage);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }}
                    return false;
                }
            } else if (ball.circle.getFill().equals(((IntersectingCircle) activeObstacle).c1.arc2.getStroke())) {

            } else if (ball.circle.getFill().equals(((IntersectingCircle) activeObstacle).c1.arc3.getStroke())) {

            } else {

            }
        }
        return false;
    }
}
