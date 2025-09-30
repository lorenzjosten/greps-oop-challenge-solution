package io.github.lorenzjosten.greps.model.value;

public class Rectangle extends AShape<RectangleParameters> {
    public Rectangle(RectangleParameters parameters) {
        super(parameters);
    }

    @Override
    public double area() {
        return getLength() * getWidth();
    }

    @Override
    public double perimeter() {
        return 2 * getLength() + 2 * getWidth();
    }

    public double getLength() {
        return parameters.getLength();
    }

    public double getWidth() {
        return parameters.getWidth();
    }
}
