package analogueclock;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Clock extends Circle {

    public static int changeColorCounter = 1;

    public Clock(int centerX, int centerY, int radius, Color color) {
        this.setCenterX(centerX);
        this.setCenterY(centerY);
        this.setRadius(radius);
        this.setStroke(color);
        this.setFill(color);
    }

    public void changeColor() {
        if (changeColorCounter == 0) {
            this.setStroke(Color.HOTPINK);
            this.setFill(Color.HOTPINK);
        } else if (changeColorCounter == 1) {
            this.setStroke(Color.BLANCHEDALMOND);
            this.setFill(Color.BLANCHEDALMOND);
        } else if (changeColorCounter == 2) {
            this.setStroke(Color.DARKSEAGREEN);
            this.setFill(Color.DARKSEAGREEN);
        } else if (changeColorCounter == 3) {
            this.setStroke(Color.DARKBLUE);
            this.setFill(Color.DARKBLUE);
        }
        changeColorCounter++;

        if (changeColorCounter == 4) {
            changeColorCounter = 0;
        }
    }
}
