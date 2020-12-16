package sample;

import javafx.animation.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Circle_ implements Obstacles {

    Arc arc1;
    Arc arc2;
    Arc arc3;
    Arc arc4;

    public Circle_() {
        arc1 = new Arc();
        arc2 = new Arc();
        arc3 = new Arc();
        arc4 = new Arc();
        System.out.println("Initialised");
    }

    public void display(AnchorPane root) {

        arc1.setCenterX(290);
        arc1.setCenterY(370.0);
        arc1.setLength(100.0);
        arc1.setRadiusX(150);
        arc1.setRadiusY(150);
        arc1.setStartAngle(40);
        arc1.setFill(Color.TRANSPARENT);
        arc1.setStroke(Color.GREEN);
        arc1.setStrokeWidth(15);
        arc1.setType(ArcType.OPEN);

        arc2.setCenterX(290.0);
        arc2.setCenterY(370.0);
        arc2.setLength(100);
        arc2.setRadiusX(150);
        arc2.setRadiusY(150);
        arc2.setStartAngle(130);
        arc2.setFill(Color.TRANSPARENT);
        arc2.setStroke(Color.RED);
        arc2.setStrokeWidth(15);
        arc2.setType(ArcType.OPEN);

        arc3.setCenterX(290.0);
        arc3.setCenterY(370.0);
        arc3.setLength(100);
        arc3.setRadiusX(150);
        arc3.setRadiusY(150);
        arc3.setStartAngle(-140.4);
        arc3.setFill(Color.TRANSPARENT);
        arc3.setStroke(Color.BLUE);
        arc3.setStrokeWidth(15);
        arc3.setType(ArcType.OPEN);

        arc4.setCenterX(290.0);
        arc4.setCenterY(370.0);
        arc4.setLength(90);
        arc4.setRadiusX(150);
        arc4.setRadiusY(150);
        arc4.setStartAngle(-50);
        arc4.setFill(Color.TRANSPARENT);
        arc4.setStroke(Color.YELLOW);
        arc4.setStrokeWidth(15);
        arc4.setType(ArcType.OPEN);

        root.getChildren().add(arc1);
        root.getChildren().add(arc2);
        root.getChildren().add(arc3);
        root.getChildren().add(arc4);

        initialize(arc1);
        initialize(arc2);
        initialize(arc3);
        initialize(arc4);
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
    }

    public void initialize(Arc arc) {
        Timeline animation = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
                new KeyFrame(Duration.seconds(3), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() - 360, Interpolator.LINEAR))
        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();

    }
    public boolean isObstacleCrossed(Game game, Ball ball, AnchorPane Obstaclespane, Obstacles activeObstacle, Stage stage, boolean[] breking_bad, Text text4) {
    boolean Inside = false;
        double aj = ball.circle.getLayoutY() + ball.circle.getTranslateY();
                            if(ball.circle.getFill().equals(((Circle_) activeObstacle).arc1.getStroke()))

    {
        if ((Math.abs(aj - (Obstaclespane.getLayoutY() + 350 + 20)) >= 50) && (Math.abs(aj - (Obstaclespane.getLayoutY() + 350 + 20)) <= 180) && ball.circle.getBoundsInParent().intersects(((Circle_) activeObstacle).arc1.getBoundsInParent())) {
            Inside = true;
            Circle circle = new Circle(10, Color.WHITE);
            circle.setCenterX(280);
            circle.setCenterY(350);
            Obstaclespane.getChildren().add(circle);
            System.out.println("hello");
        } else {
//                                    try {
//                                        endGameMenu = new EndGameMenu();
//                                        endGameMenu.initializeGame(stage);
//                                    } catch (IOException e) {
//                                        e.printStackTrace();
//                                    }
        }
    } else if(ball.circle.getFill().

    equals(((Circle_) activeObstacle).arc2.getStroke()))

    {
        if ((Math.abs(aj - (Obstaclespane.getLayoutY() + 350 + 20)) >= 50) && (Math.abs(aj - (Obstaclespane.getLayoutY() + 350 + 20)) <= 180) && ball.circle.getBoundsInParent().intersects(((Circle_) activeObstacle).arc2.getBoundsInParent())) {
            Inside = true;
            Circle circle = new Circle(10, Color.WHITE);
            circle.setCenterX(280);
            circle.setCenterY(350);
            Obstaclespane.getChildren().add(circle);
            System.out.println("hello");
        } else {
//                                    try {
//                                        endGameMenu = new EndGameMenu();
//                                        endGameMenu.initializeGame(stage);
//                                    } catch (IOException e) {
//                                        e.printStackTrace();
//                                    }
        }
    } else if(ball.circle.getFill().

    equals(((Circle_) activeObstacle).arc3.getStroke()))

    {
        if ((Math.abs(aj - (Obstaclespane.getLayoutY() + 350 + 20)) >= 50) && (Math.abs(aj - (Obstaclespane.getLayoutY() + 350 + 20)) <= 180) && ball.circle.getBoundsInParent().intersects(((Circle_) activeObstacle).arc3.getBoundsInParent())) {
            Inside = true;
            Circle circle = new Circle(10, Color.WHITE);
            circle.setCenterX(280);
            circle.setCenterY(350);
            Obstaclespane.getChildren().add(circle);
            System.out.println("hello");
        } else {
//                                    try {
//                                        endGameMenu = new EndGameMenu();
//                                        endGameMenu.initializeGame(stage);
//                                    } catch (IOException e) {
//                                        e.printStackTrace();
//                                    }
        }
    } else

    {
        if ((Math.abs(aj - (Obstaclespane.getLayoutY() + 350 + 20)) >= 50) && (Math.abs(aj - (Obstaclespane.getLayoutY() + 350 + 20)) <= 180) && ball.circle.getBoundsInParent().intersects(((Circle_) activeObstacle).arc4.getBoundsInParent())) {
            Inside = true;
            Circle circle = new Circle(10, Color.WHITE);
            circle.setCenterX(280);
            circle.setCenterY(350);
            Obstaclespane.getChildren().add(circle);
            System.out.println("hello");
        } else {
//                                    try {
//                                        endGameMenu = new EndGameMenu();
//                                        endGameMenu.initializeGame(stage);
//                                    } catch (IOException e) {
//                                        e.printStackTrace();
//                                    }
        }
    }
                            System.out.println(Inside);
                            System.out.println(ball.circle.getLayoutY()+320+" "+Obstaclespane.getLayoutY());
                            if(Inside &&ball.circle.getLayoutY() < 370&&ball.circle.getLayoutY()>0)

    {
        System.out.println("Ooooh");
        if (ball.circle.getFill().equals(((Circle_) activeObstacle).arc1.getStroke())) {
            if (ball.circle.getBoundsInParent().intersects(((Circle_) activeObstacle).arc1.getBoundsInParent())) {
                System.out.println("green");
                text4.setText("Passed");
                return true;
            }
            else {
                return false;
            }
        } else if (ball.circle.getFill().equals(((Circle_) activeObstacle).arc2.getStroke())) {
            if (ball.circle.getBoundsInParent().intersects(((Circle_) activeObstacle).arc2.getBoundsInParent())) {
                System.out.println("....");
                text4.setText("Passed");
                return true;
            }
            else {return false;}
        } else if (ball.circle.getFill().equals(((Circle_) activeObstacle).arc3.getStroke())) {
            if (ball.circle.getBoundsInParent().intersects(((Circle_) activeObstacle).arc3.getBoundsInParent())) {
                text4.setText("Passed");
                return true;
            }
            else {
                return false;
            }
        } else {
            if (ball.circle.getBoundsInParent().intersects(((Circle_) activeObstacle).arc4.getBoundsInParent())) {
                text4.setText("Passed");
                return true;
            }
            else {
                text4.setText("Ohh");
                return false;
            }
        }
    }
                            return true;
}
}
