package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

            Stage stage = new Stage();
            // stage.
            //    Button btnExitGameMenu  = new Button("Exit Game");

            stage.setTitle("Exit Menu");
            stage.setScene(new Scene(root, 300, 275));
            stage.show();
            StackPane pane = new StackPane();
            Button btnExitGame = new Button("Exit Game. ");
            setBtnExitWithoutSaving(btnExitGame, stage, s);
            Button btnSaveAndExit = new Button("Save and Exit Game. ");
            setBtnSaveAndExit(btnSaveAndExit, stage, s, game);
            pane.getChildren().add(btnExitGame);
            pane.getChildren().add(btnSaveAndExit);
            Scene scene = new Scene(pane, 200, 200);
            stage.setScene(scene);
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
        btnExitGame.setTranslateY(100);
        btnExitGame.setTranslateX(280);
        btnExitGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                s1.close();
                stage.close();
            }
        });
    }
    public void setBtnSaveAndExit(Button btnSaveAndExit, Stage stage,  Stage s1, Game game){
        btnSaveAndExit.setTranslateY(140);
        btnSaveAndExit.setTranslateX(280);
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
            }
        });
    }
}
