package sample;

import javafx.animation.AnimationTimer;
import javafx.animation.Timeline;

import java.io.IOException;
import java.io.Serializable;

public class GameElements implements Serializable {
    double y_pos;
    double  x_pos;
    transient Timeline animationTimer;
    public GameElements() throws IOException {

    }
}
