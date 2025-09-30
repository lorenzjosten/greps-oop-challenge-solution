package io.github.lorenzjosten.greps.model.value;

public class SquareParameters extends AShapeParameters {
    private final double length;

    public SquareParameters(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
}
