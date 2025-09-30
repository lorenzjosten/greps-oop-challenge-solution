package io.github.lorenzjosten.greps.model.value;

public class Circle implements IShape {
    private final double radius;

    public Circle(CircleParameters parameters) {
        this.radius = parameters.radius();
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
