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

public class ExitMenu extends GameElements implements Serializable {
    Game game;

    public ExitMenu() throws IOException {

    }
    public void initializeGame(Stage s){
        try{
      //      s.close();
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

            Stage stage = new Stage();
            // stage.
            //    Button btnExitGameMenu  = new Button("Exit Game");

            stage.setTitle("Exit Menu");
  //          stage.setScene(new Scene(root, 270, 325));
            stage.show();
            AnchorPane pane = new AnchorPane();
            Button btnExitGame = new Button("Exit Without Saving");
            setBtnExitWithoutSaving(btnExitGame, stage, s);
            Button btnSaveAndExit = new Button("Exit With Saving");
            setBtnSaveAndExit(btnSaveAndExit, stage, s, game);
            pane.getChildren().add(btnExitGame);
            pane.getChildren().add(btnSaveAndExit);
            pane.setStyle("-fx-background-color: #393f38;");
            stage.setScene(new Scene(pane, 270, 325));
            stage.setResizable(false);
         //   Scene scene = new Scene(pane, 200, 200);
           // stage.setScene(scene);
            stage.show();}
        catch (Exception e){
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
    public void setBtnSaveAndExit(Button btnSaveAndExit, Stage stage,  Stage s1, Game game){
        btnSaveAndExit.setTranslateY(130);
        btnSaveAndExit.setTranslateX(45);
        btnSaveAndExit.setStyle("-fx-background-color: #7d827d;"+
                "-fx-text-fill: #ffffff;"+"-fx-font-size: 2em"
        );
        btnSaveAndExit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    FileOutputStream fileOut =
                            new FileOutputStream("game.txt");
                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    game.app.observableListSavedGames.add(game);
                    out.writeObject(game.app.savedGamesList);
                    out.close();
                    fileOut.close();
                    System.out.printf("Serialized data is saved in game.txt");

                } catch (IOException i) {
                    i.printStackTrace();
                }
                s1.close();
                stage.close();
                game.app.primaryStage.show();
          //  game.app.primaryStage.show();
            }
        });
    }
}