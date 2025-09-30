package io.github.lorenzjosten.greps.model.value;

public class Square extends AShape {
    private static final int PARAMETER_COUNT = 1;
    private static final int PARAMETER_INDEX_LENGTH = 0;

    private double length;

    public Square(double... parameters) {
        super(parameters);
    }

    @Override
    public double area() {
        return this.length * this.length;
    }

    @Override
    public double perimeter() {
        return 4 * this.length;
    }

    @Override
    protected void parse(double... parameters) throws IllegalArgumentException {
        if (parameters.length < PARAMETER_COUNT) {
            throw new IllegalArgumentException("Missing parameter length for square.");
        }

        this.length = parameters[PARAMETER_INDEX_LENGTH];
    }
}
