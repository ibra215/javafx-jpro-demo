package com.example;

import com.jpro.webapi.JProApplication;
import com.jpro.webapi.JProSession;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends JProApplication {
    @Override
    public void start(JProSession session) {
        Stage stage = session.getStage();
        Button btn = new Button("اضغط هنا");
        btn.setOnAction(e -> btn.setText("تم الضغط!"));
        StackPane root = new StackPane(btn);
        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.setTitle("تطبيق JPro على الآيباد");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
