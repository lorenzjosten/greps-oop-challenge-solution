package io.github.lorenzjosten.greps.model.value;

public record Rectangle(double length, double width) implements IShape {
    public Rectangle(RectangleParameters parameters) {
        this(parameters.length(), parameters.width());
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * length + 2 * width;
    }
}
