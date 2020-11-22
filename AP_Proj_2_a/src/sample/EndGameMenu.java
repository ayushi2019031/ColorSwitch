package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EndGameMenu extends GameElements implements Serializable {
    Game game;
    AnchorPane pane;
    public EndGameMenu() throws IOException {
        pane  = new AnchorPane();
    }

    public void initializeGame(Stage s){
        try{
            //      s.close();
     //      Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            System.out.println("Hello Ayushi ");
            Stage stage = new Stage();
            // stage.
            //    Button btnExitGameMenu  = new Button("Exit Game");

            stage.setTitle("End Menu");
            //          stage.setScene(new Scene(root, 270, 325));
        //    AnchorPane pane = new AnchorPane();
            System.out.println("Hullo");
            Button btnExitGame = new Button("Exit");
            System.out.println("Hullo");
            setBtnExitWithoutSaving(btnExitGame, stage, s);
            System.out.println("Hullo");
            pane.getChildren().add(btnExitGame);
            System.out.println("Hullo");
            pane.setStyle("-fx-background-color: #393f38;");
            stage.setScene(new Scene(pane, 270, 325));
            stage.setResizable(false);
            //   Scene scene = new Scene(pane, 200, 200);
             //stage.setScene(scene);
            stage.show();}
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println("PRINT");
            return ;
        }
    }
    public void setGame(Game game){
        this.game = game;
    }
    public void setBtnExitWithoutSaving(Button btnExitGame, Stage stage, Stage s1){
        btnExitGame.setLayoutY(70);
        btnExitGame.setLayoutX(25);
        btnExitGame.setStyle("-fx-background-color: #7d827d;"+
                "-fx-text-fill: #ffffff;"+"-fx-font-size: 2em"
        );
        btnExitGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                s1.close();
                stage.close();
                game.app.primaryStage.show();
            }
        });
    }

}