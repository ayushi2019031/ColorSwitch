package sample;

import javafx.animation.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

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
        c1.arc1.setStrokeWidth(10);
        c1.arc1.setType(ArcType.OPEN);


        c1.arc2.setCenterX(290.0);
        c1.arc2.setCenterY(370.0);
        c1.arc2.setLength(100);
        c1.arc2.setRadiusX(90);
        c1.arc2.setRadiusY(90);
        c1.arc2.setStartAngle(130);
        c1.arc2.setFill(Color.TRANSPARENT);
        c1.arc2.setStroke(Color.RED);
        c1.arc2.setStrokeWidth(10);
        c1.arc2.setType(ArcType.OPEN);

        c1.arc3.setCenterX(290.0);
        c1.arc3.setCenterY(370.0);
        c1.arc3.setLength(100);
        c1.arc3.setRadiusX(90);
        c1.arc3.setRadiusY(90);
        c1.arc3.setStartAngle(-140.4);
        c1.arc3.setFill(Color.TRANSPARENT);
        c1.arc3.setStroke(Color.BLUE);
        c1.arc3.setStrokeWidth(10);
        c1.arc3.setType(ArcType.OPEN);

        c1.arc4.setCenterX(290.0);
        c1.arc4.setCenterY(370.0);
        c1.arc4.setLength(90);
        c1.arc4.setRadiusX(90);
        c1.arc4.setRadiusY(90);
        c1.arc4.setStartAngle(-50);
        c1.arc4.setFill(Color.TRANSPARENT);
        c1.arc4.setStroke(Color.YELLOW);
        c1.arc4.setStrokeWidth(10);
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
        c2.arc1.setStrokeWidth(10);
        c2.arc1.setType(ArcType.OPEN);


        c2.arc2.setCenterX(290.0);
        c2.arc2.setCenterY(370.0);
        c2.arc2.setLength(100);
        c2.arc2.setRadiusX(90);
        c2.arc2.setRadiusY(90);
        c2.arc2.setStartAngle(130);
        c2.arc2.setFill(Color.TRANSPARENT);
        c2.arc2.setStroke(Color.RED);
        c2.arc2.setStrokeWidth(10);
        c2.arc2.setType(ArcType.OPEN);

        c2.arc3.setCenterX(290.0);
        c2.arc3.setCenterY(370.0);
        c2.arc3.setLength(100);
        c2.arc3.setRadiusX(90);
        c2.arc3.setRadiusY(90);
        c2.arc3.setStartAngle(-140.4);
        c2.arc3.setFill(Color.TRANSPARENT);
        c2.arc3.setStroke(Color.BLUE);
        c2.arc3.setStrokeWidth(10);
        c2.arc3.setType(ArcType.OPEN);

        c2.arc4.setCenterX(290.0);
        c2.arc4.setCenterY(370.0);
        c2.arc4.setLength(90);
        c2.arc4.setRadiusX(90);
        c2.arc4.setRadiusY(90);
        c2.arc4.setStartAngle(-50);
        c2.arc4.setFill(Color.TRANSPARENT);
        c2.arc4.setStroke(Color.YELLOW);
        c2.arc4.setStrokeWidth(10);
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
        initialize(c2.arc1);
        initialize(c2.arc2);
        initialize(c2.arc3);
        initialize(c2.arc4);

//
//        root.setStyle
//                (
//                        "-fx-padding: 10;" +
//                                "-fx-border-style: solid inside;" +
//                                "-fx-border-width: 2;" +
//                                "-fx-border-insets: 5;" +
//                                "-fx-border-radius: 5;" +
//                                "-fx-border-color: blue;"
//                );
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

}
