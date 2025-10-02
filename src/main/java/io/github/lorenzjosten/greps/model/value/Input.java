package io.github.lorenzjosten.greps.model.value;

import java.util.Arrays;

public record Input(Shape type, double... parameters) {

    public boolean isSquare() {
        return type == Shape.SQUARE;
    }

    public boolean isRectangle() {
        return type == Shape.RECTANGLE;
    }

    public boolean isCircle() {
        return type == Shape.CIRCLE;
    }

    public boolean isShorterThan(int length) {
        return parameters.length < length;
    }

    public boolean isNegative() {
        return Arrays.stream(parameters).anyMatch((double x) -> x < 0);
    }

    public double get(int index) {
        return parameters[index];
    }
}
