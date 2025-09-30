package io.github.lorenzjosten.greps.model.value;

public class Rectangle implements IShape {
    private final double length;
    private final double width;

    public Rectangle(RectangleParameters parameters) {
        this.length = parameters.length();
        this.width = parameters.width();
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
