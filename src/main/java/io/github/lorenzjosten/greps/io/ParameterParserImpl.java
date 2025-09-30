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
        return 0;
    }

    @Override
    public double getRectangleLength() {
        return 0;
    }

    @Override
    public double getRectangleWidth() {
        return 0;
    }

    @Override
    public double getCircleRadius() {
        return 0;
    }
}
