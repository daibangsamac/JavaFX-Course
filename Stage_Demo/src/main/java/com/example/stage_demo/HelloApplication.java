package com.example.stage_demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import javafx.scene.paint.Color;
import javafx.scene.image.Image;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // If you need to create a new state
        // Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        //Add Icon and title
        Image image = new Image("file:src/MyIcon.png");
        stage.getIcons().add(image);
        stage.setTitle("Stage Demo");
        stage.setWidth(840);
        stage.setHeight(720);
        stage.setResizable(false);
//        stage.setX(500);
//        stage.setY(500);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press Q to exit");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.setScene(scene);
        // Open the application's window
        // NOTE: Should be keep at the very last line
        stage.show();

        // stage = Window, Scene = Jframe, Root - branch - leaf
    }
}