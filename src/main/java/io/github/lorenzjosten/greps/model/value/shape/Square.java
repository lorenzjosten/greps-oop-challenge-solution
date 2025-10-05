package io.github.lorenzjosten.greps.model.value.shape;

import io.github.lorenzjosten.greps.model.value.shape.parameter.SquareParameters;

public record Square(double length) implements IShape {
    public Square(SquareParameters parameters) {
        this(parameters.length());
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
