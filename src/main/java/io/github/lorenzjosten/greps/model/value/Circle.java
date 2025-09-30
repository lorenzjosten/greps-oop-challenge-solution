package io.github.lorenzjosten.greps.model.value;

public record Circle(double radius) implements IShape {
    public Circle(CircleParameters parameters) {
        this(parameters.radius());
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
