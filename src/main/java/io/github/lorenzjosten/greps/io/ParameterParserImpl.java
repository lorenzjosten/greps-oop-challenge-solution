package io.github.lorenzjosten.greps.io;

import io.github.lorenzjosten.greps.model.value.*;

import static io.github.lorenzjosten.greps.model.value.Shape.*;

public class ParameterParserImpl implements IParameterParser {
    private static final int PARAMETER_COUNT_SQUARE = 1;
    private static final int PARAMETER_INDEX_SQUARE_LENGTH = 0;

    private static final int PARAMETER_COUNT_RECTANGLE = 2;
    private static final int PARAMETER_INDEX_RECTANGLE_LENGTH = 0;
    private static final int PARAMETER_INDEX_RECTANGLE_WIDTH = 1;

    private static final int PARAMETER_COUNT_CIRCLE = 1;
    private static final int PARAMETER_INDEX_CIRCLE_RADIUS = 0;

    @Override
    public IShapeParameters parse(Shape type, double... parameters) {
        validateInput(type, parameters);

        return switch (type) {
            case SQUARE -> parseSquare(parameters);
            case RECTANGLE -> parseRectangle(parameters);
            case CIRCLE -> parseCircle(parameters);
        };
    }

    private void validateInput(Shape type, double... parameters) {
        if (type == null) throw new IllegalArgumentException("Missing shape type.");

        if (type == SQUARE && parameters.length < PARAMETER_COUNT_SQUARE) throw new IllegalArgumentException("Missing parameters for square.");
        if (type == RECTANGLE && parameters.length < PARAMETER_COUNT_RECTANGLE) throw new IllegalArgumentException("Missing parameters for rectangle.");
        if (type == CIRCLE && parameters.length < PARAMETER_COUNT_CIRCLE) throw new IllegalArgumentException("Missing parameters for circle.");
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
