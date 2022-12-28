package analogueclock;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Clock clock = new Clock(210, 210, 150, Color.HOTPINK);
        Hand hourHand = new Hand(210, 210, 210, 280);
        hourHand.setStrokeWidth(2);
        Hand minuteHand = new Hand(210, 210, 300, 280);
        minuteHand.setStrokeWidth(2);

        Text pg = new Text(" PG");
        pg.setX(170);
        pg.setY(260);
        pg.setFont(Font.font("Edwardian Script ITC", 35));

        Button button = new Button();
        button.setText("Face colour");
        button.setTranslateX(50);
        button.setTranslateY(50);
        button.setOnAction(actionEvent -> clock.changeColor());

        Group root = new Group();
        root.getChildren().add(clock);
        root.getChildren().add(pg);
        root.getChildren().add(button);
        root.getChildren().add(hourHand);
        root.getChildren().add(minuteHand);
        stage.setTitle("PG Analogue Clock");
        Scene scene = new Scene(root, 420, 420, Color.DARKSLATEBLUE);
        stage.setScene(scene);
        stage.getIcons().add(new Image("C:/users/mjaki/IdeaProjects/AnalogueClock/programming.png"));
        stage.setFullScreen(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}