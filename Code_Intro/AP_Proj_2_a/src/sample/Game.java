package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Game {
    Ball ball;
    ArrayList<Obstacles> listOfObstacles;
    int numOfStars;
    ColourSwitcher switcher;
    boolean ifTouched;
    Main app;
    static int num_of_restoration_points;
    ExitMenu exitMenu;
    EndGameMenu endGameMenu;
    public Game(Main app) throws IOException {
        this.ball = new Ball();
        this.listOfObstacles = new ArrayList<>();
        this.numOfStars = 0;
        this.switcher = new ColourSwitcher();
        this.app = app;
        this.endGameMenu = new EndGameMenu();
        this.exitMenu = new ExitMenu();
        initializeGame();
    }
    public void initializeGame(){
        try{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Stage stage = new Stage();
        // stage.
        //    Button btnExitGameMenu  = new Button("Exit Game");

        stage.setTitle("Game started");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
        StackPane pane = new StackPane();
        Button btnExitGame = new Button("Exit Game. ");
        btnExitGame.setTranslateY(100);
        btnExitGame.setTranslateX(280);
        btnExitGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                exitMenu.initializeGame();
                //stage.close();
            }
        });
        pane.getChildren().add(btnExitGame);
        Scene scene = new Scene(pane, 200, 200);
        stage.setScene(scene);
        stage.show();}
        catch (Exception e){
            System.out.println("PRINT");
            return ;
        }
    }
}
