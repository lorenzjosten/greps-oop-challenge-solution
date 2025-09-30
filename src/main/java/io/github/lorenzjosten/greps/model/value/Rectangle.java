package io.github.lorenzjosten.greps.model.value;

public class Rectangle extends AShape {
    private static final int PARAMETER_COUNT = 2;
    private static final int PARAMETER_INDEX_LENGTH = 0;
    private static final int PARAMETER_INDEX_WIDTH = 1;

    private double length;
    private double width;

    public Rectangle(double... parameters) {
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
