package io.github.lorenzjosten.greps.model.value;

public class RectangleParameters extends AShapeParameters {
    private final double width;
    private final double length;

    public RectangleParameters(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
