package io.github.lorenzjosten.greps.io.parser;

import io.github.lorenzjosten.greps.model.value.*;

public class ParameterParserImpl implements IParameterParser {
    private static final int PARAMETER_INDEX_SQUARE_LENGTH = 0;
    private static final int PARAMETER_INDEX_RECTANGLE_LENGTH = 0;
    private static final int PARAMETER_INDEX_RECTANGLE_WIDTH = 1;
    private static final int PARAMETER_INDEX_CIRCLE_RADIUS = 0;

    @Override
    public IShapeParameters parse(Shape type, double... parameters) {
        return switch (type) {
            case SQUARE -> parseSquare(parameters);
            case RECTANGLE -> parseRectangle(parameters);
            case CIRCLE -> parseCircle(parameters);
        };
    }

    private SquareParameters parseSquare(double... parameters) {
        double length = parameters[PARAMETER_INDEX_SQUARE_LENGTH];

        return new SquareParameters(length);
    }

    private RectangleParameters parseRectangle(double... parameters) {
        double length = parameters[PARAMETER_INDEX_RECTANGLE_LENGTH];
        double width = parameters[PARAMETER_INDEX_RECTANGLE_WIDTH];

        return new RectangleParameters(length, width);
    }

    private CircleParameters parseCircle(double... parameters) {
        double radius = parameters[PARAMETER_INDEX_CIRCLE_RADIUS];

        return new CircleParameters(radius);
    }
}
