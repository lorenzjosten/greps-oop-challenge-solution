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
        return this.length * this.width;
    }

    @Override
    public double perimeter() {
        return 2 * this.length + 2 * this.width;
    }

    @Override
    protected void parse(double... parameters) throws IllegalArgumentException {
        if (parameters.length < PARAMETER_COUNT) {
            throw new IllegalArgumentException("Missing parameters length and width for rectangle.");
        }

        this.length = parameters[PARAMETER_INDEX_LENGTH];
        this.width = parameters[PARAMETER_INDEX_WIDTH];
    }
}
