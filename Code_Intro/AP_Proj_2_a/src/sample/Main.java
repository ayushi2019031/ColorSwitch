package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {
    public ArrayList<Game> list = new ArrayList<>();
    public Game activeGame;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Button btn = new Button("Aj");
        showGameMenu(primaryStage, root);
    }
    public void showGameMenu(Stage primaryStage, Parent root){
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        StackPane pane = new StackPane();
        Button btnNewGame = new Button("Play New Game");setBtnNewGame(btnNewGame, this);
        Button btnloadSavedGame = new Button("Load saved Game. ");setBtnLoadSavedGame(btnloadSavedGame);
        Button btnExitApp = new Button("Exit Game. ");setExitGame(btnExitApp);
        pane.getChildren().add(btnNewGame);
        pane.getChildren().add(btnloadSavedGame);
        pane.getChildren().add(btnExitApp);
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    public void setBtnNewGame(Button btnNewGame, Main app){
        btnNewGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("New Game Started");
                try {
                    Game game = new Game(app);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });
        btnNewGame.setTranslateY(40);
    }
    public  void setBtnLoadSavedGame(Button btnLoadSavedGame){
        btnLoadSavedGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Load saved Game. ");
            }
        });
        btnLoadSavedGame.setTranslateY(120);
    }
    public  void setExitGame(Button btnExitApp){
        btnExitApp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Exit Game");
            }
        });
        btnExitApp.setTranslateY(200);
    }

}
