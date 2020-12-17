package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.Serializable;

public class LayeredOcta implements Obstacles, Serializable {
    public transient Timeline animationT; static int id = 9;
    transient Rectangle l1;transient  Rectangle l2;transient  Rectangle l3;transient  Rectangle l4;
    transient Rectangle line1;transient  Rectangle line2;transient  Rectangle line3;transient  Rectangle line4;
    transient Rectangle l0;transient  Rectangle l5;transient  Rectangle l6;transient  Rectangle l7;
    transient Rectangle line0;transient  Rectangle line5;transient  Rectangle line6;transient  Rectangle line7;
    public int getId(){return id;};
    public LayeredOcta(){
        l0 = new Rectangle();
        l1 = new Rectangle();
        l2 = new Rectangle();
        l3 = new Rectangle();
        l4 = new Rectangle();
        l5 = new Rectangle();
        l6 = new Rectangle();
        l7 = new Rectangle();
        line0 = new Rectangle();
        line1 = new Rectangle();
        line2 = new Rectangle();
        line3 = new Rectangle();
        line4 = new Rectangle();
        line5 = new Rectangle();
        line6 = new Rectangle();
        line7 = new Rectangle();
    }


    @Override
    public void display(AnchorPane Pane, Game game){

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

        line0.setWidth(78);
        line0.setHeight(10);
        line0.setLayoutX(268);
        line0.setLayoutY(312);
        line0.setStroke(Color.BLUE);
        line0.setFill(Color.BLUE);

        line1.setWidth(78);
        line1.setHeight(10);
        line1.setLayoutX(264);
        line1.setLayoutY(444);
        line1.setStroke(Color.BLUE);
        line1.setFill(Color.BLUE);

        line2.setWidth(10);
        line2.setHeight(64);
        line2.setLayoutX(225);
        line2.setLayoutY(354);
        line2.setStroke(Color.RED);
        line2.setFill(Color.RED);

        line3.setWidth(10);
        line3.setHeight(64);
        line3.setLayoutX(364);
        line3.setLayoutY(360);
        line3.setStroke(Color.RED);
        line3.setFill(Color.RED);

        line4.setWidth(65);
        line4.setHeight(10);
        line4.setLayoutX(324);
        line4.setLayoutY(337);
        line4.setStroke(Color.YELLOW);
        line4.setRotate(55.3);
        line4.setFill(Color.YELLOW);

        line5.setWidth(65);
        line5.setHeight(10);
        line5.setLayoutX(218);
        line5.setLayoutY(427);
        line5.setStroke(Color.YELLOW);
        line5.setRotate(50);
        line5.setFill(Color.YELLOW);

        line6.setWidth(10);
        line6.setHeight(61);
        line6.setLayoutX(243);
        line6.setLayoutY(307);
        line6.setStroke(Color.GREEN);
        line6.setRotate(47);
        line6.setFill(Color.GREEN);

        line7.setWidth(10);
        line7.setHeight(61);
        line7.setLayoutX(348);
        line7.setLayoutY(404);
        line7.setStroke(Color.GREEN);
        line7.setRotate(43);
        line7.setFill(Color.GREEN);

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
        line0.setArcHeight(10);
        line0.setArcWidth(10);
        line1.setArcHeight(10);
        line1.setArcWidth(10);
        line2.setArcHeight(10);
        line2.setArcWidth(10);
        line3.setArcHeight(10);
        line3.setArcWidth(10);
        line4.setArcHeight(10);
        line4.setArcWidth(10);
        line5.setArcHeight(10);
        line5.setArcWidth(10);
        line6.setArcHeight(10);
        line6.setArcWidth(10);
        line7.setArcHeight(10);
        line7.setArcWidth(10);

//        l1.setStrokeWidth(5);l0.setStrokeWidth(5);l2.setStrokeWidth(5);l3.setStrokeWidth(5);
//        l4.setStrokeWidth(5);l5.setStrokeWidth(5);l6.setStrokeWidth(5);l7.setStrokeWidth(5);

        l0.setFill(Color.RED); l3.setFill(Color.YELLOW); l2.setFill(Color.BLUE); l1.setFill(Color.GREEN);
        l4.setFill(Color.YELLOW); l6.setFill(Color.BLUE); l7.setFill(Color.GREEN); l5.setFill(Color.RED);

        Group g3 = new Group();
        g3.getChildren().add(l1);g3.getChildren().add(l2);g3.getChildren().add(l3);g3.getChildren().add(l4);
        g3.getChildren().add(l5);g3.getChildren().add(l6);g3.getChildren().add(l7);g3.getChildren().add(l0);
        g3.getChildren().add(line1);g3.getChildren().add(line2);g3.getChildren().add(line3);g3.getChildren().add(line4);
        g3.getChildren().add(line5);g3.getChildren().add(line6);g3.getChildren().add(line7);g3.getChildren().add(line0);
        Rotate rotation = new Rotate();
        ObservableValue<Integer> obsInt1 = new ReadOnlyObjectWrapper<>(280);
        ObservableValue<Integer> obsInt2 = new ReadOnlyObjectWrapper<>(380);
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

    public boolean isObstacleCrossed(Game game, LayeredOcta activeObstacle, Ball ball, AnchorPane Obstaclespane, Stage stage, boolean[] breking_bad, Text text4) {

        Shape s0 = Shape.intersect(ball.circle, line3);
        Shape s00 = Shape.intersect(ball.circle, l0);
        Shape s1 = Shape.intersect(ball.circle ,line1);
        Shape s11 = Shape.intersect(ball.circle, l6);
        Shape s2 = Shape.intersect(ball.circle, line5);
        Shape s22 = Shape.intersect(ball.circle, l4);
        Shape s3 = Shape.intersect(ball.circle, line6);
        Shape s33 = Shape.intersect(ball.circle, l1);
        Shape s4 = Shape.intersect(ball.circle, line2);
        Shape s44 = Shape.intersect(ball.circle, l5);
        Shape s5 = Shape.intersect(ball.circle, line0);
        Shape s55 = Shape.intersect(ball.circle, l2);
        Shape s6 = Shape.intersect(ball.circle, line4);
        Shape s66 = Shape.intersect(ball.circle, l3);
        Shape s7 = Shape.intersect(ball.circle, line7);
        Shape s77 = Shape.intersect(ball.circle, l7);

        boolean b1 = (s0.getBoundsInLocal().getWidth() == -1) && (s00.getBoundsInLocal().getWidth()==-1) && (s4.getBoundsInLocal().getWidth() == -1) && (s44.getBoundsInLocal().getWidth()==-1);
        boolean b2 = (s1.getBoundsInLocal().getWidth() == -1) && (s11.getBoundsInLocal().getWidth()==-1) && (s5.getBoundsInLocal().getWidth() == -1) && (s55.getBoundsInLocal().getWidth()==-1);
        boolean b3 = (s2.getBoundsInLocal().getWidth() == -1) && (s22.getBoundsInLocal().getWidth()==-1) && (s6.getBoundsInLocal().getWidth() == -1) && (s66.getBoundsInLocal().getWidth()==-1);
        boolean b4 = (s3.getBoundsInLocal().getWidth() == -1) && (s33.getBoundsInLocal().getWidth()==-1) && (s7.getBoundsInLocal().getWidth() == -1) && (s77.getBoundsInLocal().getWidth()==-1);

        if (ball.color == 0) {
            boolean k1 = b1;
            boolean k2 = b2 && b3 && b4;

            if (!k1 && k2) {
//                text4.setText("Yayyyyyyyyyyyyyyyyyyyyyyyyyy KESAR");
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
            boolean k1 = b2;
            boolean k2 = b1 && b3 && b4;

            if (!k1 && k2) {
//                text4.setText("Yayyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
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

            boolean k1 = b3;
            boolean k2 = b2 && b1 && b4;

            if (!k1 && k2) {
//                text4.setText("Yayyyyyyyyyyyyyyyyyyyyyy");
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
            boolean k1 = b4;
            boolean k2 = b2 && b3 && b1;

            if (!k1 && k2) {
//                text4.setText("Yayyyyyyyyyyyyyyyyyyyyyyyyyy");
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
