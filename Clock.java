package com.example.analogueclock;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Clock extends Circle {

    public Clock(int centerX, int centerY, int radius, Color color) {
        this.setCenterX(centerX);
        this.setCenterY(centerY);
        this.setRadius(radius);
        this.setStroke(color);
        this.setFill(color);
    }

    public void changeColor() {
        this.setStroke(Color.DARKBLUE);
        this.setFill(Color.DARKBLUE);
    }
}
