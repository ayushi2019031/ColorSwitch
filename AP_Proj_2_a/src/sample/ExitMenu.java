package sample;

import javafx.animation.AnimationTimer;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ExitMenu extends GameElements implements Serializable {
    Game game;
    transient Stage stage;
    public ExitMenu() throws IOException {

    }
    public void initializeGame(Stage s, AnimationTimer animationTimer){
        try{
      //      s.close();
            game.pause[0] = true;
            animationTimer.stop();
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

             stage = new Stage();
            // stage.
            //    Button btnExitGameMenu  = new Button("Exit Game");

            stage.setTitle("Exit Menu");
  //          stage.setScene(new Scene(root, 270, 325));
            stage.show();
            AnchorPane pane = new AnchorPane();
            Button btnExitGame = new Button("Exit Without Saving");
            setBtnExitWithoutSaving(btnExitGame, stage, s);
       //     Button btnSaveAndExit = new Button("Exit With Saving");
         //   setBtnSaveAndExit(btnSaveAndExit, stage, s, game);
            Button ResumeGame = new Button("Resume Game");
            setBtnResumeGame(ResumeGame, stage, s);
            Button btnSaveAndExit = new Button("Exit With Saving");
            setBtnSaveAndExit(btnSaveAndExit, stage, s, game);
            pane.getChildren().add(btnExitGame);
            pane.getChildren().add(btnSaveAndExit);
            pane.getChildren().add(ResumeGame);
            pane.setStyle("-fx-background-color: #393f38;");
            stage.setScene(new Scene(pane, 270, 325));
            stage.setResizable(false);
         //   Scene scene = new Scene(pane, 200, 200);
           // stage.setScene(scene);
            game.listOFOpenStages.add(stage);
            stage.setOnHiding(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent windowEvent) {
                    game.listOFOpenStages.remove(stage);
                    game.animationTimer.start();
                }
            });
            stage.show();}
        catch (Exception e){
            System.out.println("PRINT");
            return ;
        }
    }
    public void setGame(Game game){
        this.game = game;
    }
    public void setBtnResumeGame(Button btnResumeGame, Stage stage, Stage s1){
        btnResumeGame.setLayoutY(190);
        btnResumeGame.setLayoutX(50);
        game.pause[0] = true;
        btnResumeGame.setStyle("-fx-background-color: #7d827d;"+
                "-fx-text-fill: #ffffff;"+"-fx-font-size: 2em"
        );
        btnResumeGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
            //    s1.close();
                stage.close();
             //   game.app.primaryStage.show();
            }
        });
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

//                    FileOutputStream fileOut =
//                            new FileOutputStream("game.txt");
//                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
//                    game.app.observableListSavedGames.add(game);
//                    out.writeObject(game.app.savedGamesList);
//                    out.close();
//                    fileOut.close();
                try {
                 //   game.serialise();
               //     System.out.printf("Serialized data is saved in game.txt");
                }
                catch (Exception e){
                    System.out.println("Sorry peepe");
                }
                s1.close();
                stage.close();
                game.app.primaryStage.show();
          //  game.app.primaryStage.show();
            }
        });
    }
}