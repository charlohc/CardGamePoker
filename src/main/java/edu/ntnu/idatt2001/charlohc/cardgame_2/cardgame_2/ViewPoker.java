package edu.ntnu.idatt2001.charlohc.cardgame_2.cardgame_2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Class ViewPoker, shows the methods and classes visually with the help of JavaFx
 */
public class ViewPoker extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ViewPoker.class.getResource("ViewPoker.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 550, 450);
        stage.setTitle("Poker");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}