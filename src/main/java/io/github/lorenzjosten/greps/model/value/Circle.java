package io.github.lorenzjosten.greps.model.value;

public class Circle extends AShape {
    private final static int PARAMETER_COUNT = 1;
    private final static int PARAMETER_INDEX_RADIUS = 0;

    private double radius;

    Circle(double... parameters) {
        super(parameters);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    protected void parse(double... parameters) throws IllegalArgumentException {

    }

}
