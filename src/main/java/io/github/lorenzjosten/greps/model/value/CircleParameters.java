package io.github.lorenzjosten.greps.model.value;

public class CircleParameters extends AShapeParameters {
    private final double radius;

    public CircleParameters(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
