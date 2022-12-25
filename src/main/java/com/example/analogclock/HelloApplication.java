package com.example.analogclock;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Clock clock = new Clock(210, 210, 150, Color.HOTPINK);

        Text pg = new Text(" PG");
        pg.setX(170);
        pg.setY(260);
        pg.setFont(Font.font("Edwardian Script ITC", 35));

        Button button = new Button();
        button.setText("Click me :D");
        button.setTranslateX(50);
        button.setTranslateY(50);
        button.setOnAction(actionEvent -> clock.changeColor());

        Group root = new Group();
        root.getChildren().add(clock);
        root.getChildren().add(pg);
        root.getChildren().add(button);
        stage.setTitle("PG Analogue Clock");
        Scene scene = new Scene(root, 420, 420, Color.DARKSLATEBLUE);
        stage.setScene(scene);
        stage.setFullScreen(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}