package io.github.lorenzjosten.greps.model.value;

public class Square implements IShape {
    private final double length;

    public Square(SquareParameters parameters) {
        this.length = parameters.length();
    }

    @Override
    public double area() {
        return length * length;
    }

    @Override
    public double perimeter() {
        return 4 * length;
    }
}
