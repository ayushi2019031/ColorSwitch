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

public class ExitMenu extends GameElements{

    public ExitMenu() throws IOException {

    }
    public void initializeGame(){
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
            btnExitGame.setTranslateY(100);
            btnExitGame.setTranslateX(280);
            btnExitGame.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    stage.close();
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
