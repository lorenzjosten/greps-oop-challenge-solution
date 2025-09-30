package io.github.lorenzjosten.greps.model.value;

public class Circle extends AShape<CircleParameters> {
    public Circle(CircleParameters parameters) {
        super(parameters);
    }

    @Override
    public double area() {
        return Math.PI * getRadius();
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getRadius() {
        return parameters.getRadius();
    }
}
