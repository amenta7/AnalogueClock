package analogueclock;

import javafx.scene.shape.Line;

public class Hand extends Line {

    public Hand(double startX, double startY, double endX, double endY) {
        this.setStartX(startX);
        this.setStartY(startY);
        this.setEndX(endX);
        this.setEndY(endY);
    }

}
