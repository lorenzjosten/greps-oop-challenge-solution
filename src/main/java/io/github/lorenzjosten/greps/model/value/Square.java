package io.github.lorenzjosten.greps.model.value;

public class Square extends AShape {
    private static final int PARAMETER_COUNT = 1;
    private static final int PARAMETER_INDEX_LENGTH = 0;

    public Square(double... parameters) {
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
