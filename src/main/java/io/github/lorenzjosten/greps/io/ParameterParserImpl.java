package io.github.lorenzjosten.greps.io;

public class ParameterParserImpl implements IParameterParser {
    private static final int PARAMETER_COUNT_SQUARE = 1;
    private static final int PARAMETER_COUNT_RECTANGLE = 2;
    private static final int PARAMETER_COUNT_CIRCLE = 1;

    private static final int PARAMETER_INDEX_SQUARE_LENGTH = 0;
    private static final int PARAMETER_INDEX_RECTANGLE_LENGTH = 0;
    private static final int PARAMETER_INDEX_RECTANGLE_WIDTH = 1;
    private static final int PARAMETER_INDEX_CIRCLE_RADIUS = 0;

    private final double[] parameters;

    public ParameterParserImpl(double... parameters) {
        this.parameters = parameters;
    }

    @Override
    public double getSquareLength() {
        if (parameters.length < PARAMETER_COUNT_SQUARE) {
            throw new IllegalArgumentException("Missing parameter square length.");
        }

        return parameters[PARAMETER_INDEX_SQUARE_LENGTH];
    }

    @Override
    public double getRectangleLength() {
        if (parameters.length < PARAMETER_COUNT_RECTANGLE) {
            throw new IllegalArgumentException("Missing parameter rectangle width / length.");
        }

        return parameters[PARAMETER_INDEX_RECTANGLE_LENGTH];
    }

    @Override
    public double getRectangleWidth() {
        if (parameters.length < PARAMETER_COUNT_RECTANGLE) {
            throw new IllegalArgumentException("Missing parameter rectangle width / length.");
        }

        return parameters[PARAMETER_INDEX_RECTANGLE_WIDTH];
    }

    @Override
    public double getCircleRadius() {
        if (parameters.length < PARAMETER_COUNT_CIRCLE) {
            throw new IllegalArgumentException("Missing parameter circle radius.");
        }

        return parameters[PARAMETER_INDEX_CIRCLE_RADIUS];
    }
}
