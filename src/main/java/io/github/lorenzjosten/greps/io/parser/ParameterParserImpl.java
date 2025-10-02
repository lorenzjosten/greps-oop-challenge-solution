package io.github.lorenzjosten.greps.io.parser;

import io.github.lorenzjosten.greps.model.value.*;

public class ParameterParserImpl implements IParameterParser {
    private static final int PARAMETER_INDEX_SQUARE_LENGTH = 0;
    private static final int PARAMETER_INDEX_RECTANGLE_LENGTH = 0;
    private static final int PARAMETER_INDEX_RECTANGLE_WIDTH = 1;
    private static final int PARAMETER_INDEX_CIRCLE_RADIUS = 0;

    @Override
    public IShapeParameters parse(Input input) {
        return switch (input.type()) {
            case SQUARE -> parseSquare(input);
            case RECTANGLE -> parseRectangle(input);
            case CIRCLE -> parseCircle(input);
        };
    }

    private SquareParameters parseSquare(Input input) {
        double length = input.get(PARAMETER_INDEX_SQUARE_LENGTH);

        return new SquareParameters(length);
    }

    private RectangleParameters parseRectangle(Input input) {
        double length = input.get(PARAMETER_INDEX_RECTANGLE_LENGTH);
        double width = input.get(PARAMETER_INDEX_RECTANGLE_WIDTH);

        return new RectangleParameters(length, width);
    }

    private CircleParameters parseCircle(Input input) {
        double radius = input.get(PARAMETER_INDEX_CIRCLE_RADIUS);

        return new CircleParameters(radius);
    }
}
