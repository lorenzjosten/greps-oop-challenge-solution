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
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    protected void parse(double... parameters) throws IllegalArgumentException {
        if (parameters.length < PARAMETER_COUNT) {
            throw new IllegalArgumentException("Missing parameter radius for circle.");
        }

        this.radius = parameters[PARAMETER_INDEX_RADIUS];
    }

}
