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

import java.io.*;
import java.util.Date;

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

                try {
                   String d = game.serialise(game);
                 Game game1 =   deserialise(d);
                 Game game2 = new Game(game1.app);
                game2.score = game1.score;
                game2.ball = game1.ball;
                game2.listofYs = game1.listofYs;
                game2.listOfObs_deserialisation = game1.listOfObs_deserialisation;

                //game2.listOFOpenStages = game1.listOFOpenStages;
                game2.listOfObstacles = game1.listOfObstacles;
                game2.listOfObs_deserialisation = game1.listOfObs_deserialisation;
                    System.out.println(game2.score + " " + game2.ball.color + " " + game2.listOfObs_deserialisation.size());
                    game2.ball.setPane(game2.pane, game2.scene,game2.stage);
                    game2.ball.setBallColor(game1.ball.color);
                    game2.ball.circle.setTranslateY(game1.ball.y_pos);
                    game2.pane.getChildren().remove(game2.ball.circle);
                   game2.ball.render(game2.pane);
                   game2.baa = true;
                   game2.jugaad = game1.refer;
                  game2.jugaad2 = true;
                  System.out.println(game1.hero);
                    System.out.println(game2.ball.y_pos);

                    for (int i = 0; i < game2.listOfObs_deserialisation.size(); i++){
                        System.out.println("Oops I did it again: " + game2.listOfObs_deserialisation.get(i));
                    }
                    game2.ball.setBallColor(game1.ball.color);

                    //if (game1.jugaad2 == true){
//    game2.jugaad = game1.jugaad;
//}
game2.initializeGame();

               // game2.listOFOpenStages = game1.listOFOpenStages;

              //   game2.ball = game1.ball;
           //      game2.initializeGame();
                         //    game1.ball.circle.setTranslateY(game1.ball.y_pos);
              //   game1.initializeGame();
                //    System.out.printf("Serialized data is saved in game.txt");
                    System.out.println("Sore: " + game2.score + " y_pos  " + game2.ball.y_pos);
                }
                catch (Exception e){
                    e.printStackTrace();
                    System.out.println("Sorry peepe");
                }
                s1.close();
                stage.close();
                game.app.primaryStage.show();
          //  game.app.primaryStage.show();
            }
        });
    }
    public void serialise(Game game){
        Date date = new Date();
        String name_of_game = date.toString();
        String str_ = name_of_game.replaceAll("//s", "_");
        String str__ = str_.replaceAll(":", "_");
        String fileName = str_ + ".txt";
        try {
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject((Object)  game);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
        }
        catch (Exception e){
         e.printStackTrace();
        }
    }
    public Game deserialise(String filename) {
        try{
    //    String ref  =  System.getProperty("user.dir") + "/" + filename;
        FileInputStream file = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(file);

        // Method for deserialization of object
        Game object1 = (Game) in.readObject();

        //object1.initializeGame();

        in.close();
        file.close();

        System.out.println("Object has been deserialized Ayushi");
      //  object1.initializeGame();
        return object1;
    }
    catch (Exception e){
        e.printStackTrace(); return null;}
    }
}