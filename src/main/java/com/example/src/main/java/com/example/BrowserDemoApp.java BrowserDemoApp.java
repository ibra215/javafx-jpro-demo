package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class BrowserDemoApp extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("مرحباً من JavaFX داخل المتصفح على iPad باستخدام JPro!");
        Scene scene = new Scene(label, 400, 200);
        stage.setScene(scene);
        stage.setTitle("JPro + JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
