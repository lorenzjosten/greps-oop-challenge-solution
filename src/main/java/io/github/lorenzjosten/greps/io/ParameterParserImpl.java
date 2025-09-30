package io.github.lorenzjosten.greps.io;

import io.github.lorenzjosten.greps.model.value.CircleParameters;
import io.github.lorenzjosten.greps.model.value.RectangleParameters;
import io.github.lorenzjosten.greps.model.value.SquareParameters;

public class ParameterParserImpl implements IParameterParser {
    private static final int PARAMETER_COUNT_SQUARE = 1;
    private static final int PARAMETER_INDEX_SQUARE_LENGTH = 0;

    private static final int PARAMETER_COUNT_RECTANGLE = 2;
    private static final int PARAMETER_INDEX_RECTANGLE_LENGTH = 0;
    private static final int PARAMETER_INDEX_RECTANGLE_WIDTH = 1;

    private static final int PARAMETER_COUNT_CIRCLE = 1;
    private static final int PARAMETER_INDEX_CIRCLE_RADIUS = 0;

    private SquareParameters squareParameters = null;
    private RectangleParameters rectangleParameters = null;
    private CircleParameters circleParameters = null;

    @Override
    public SquareParameters squareParameters() {
        if (squareParameters == null) {
            throw new IllegalArgumentException("Missing parameter length for square.");
        }

        return squareParameters;
    }

    @Override
    public RectangleParameters rectangleParameters() {
        if (rectangleParameters == null) {
            throw new IllegalArgumentException("Missing parameters length and width for rectangle.");
        }

        return rectangleParameters;
    }

    @Override
    public CircleParameters circleParameters() {
        if (circleParameters == null) {
            throw new IllegalArgumentException("Missing parameter radius for circle.");
        }

        return circleParameters;
    }

    @Override
    public void parse(double... parameters) {
        parseSquareParameters(parameters);

        parseRectangleParameters(parameters);

        parseCircleParameters(parameters);
    }

    private void parseCircleParameters(double[] parameters) {
        if (parameters.length >= PARAMETER_COUNT_CIRCLE) {
            double radius = parameters[PARAMETER_INDEX_CIRCLE_RADIUS];

            circleParameters = new CircleParameters(radius);
        } else {
            circleParameters = null;
        }
    }

    private void parseRectangleParameters(double[] parameters) {
        if (parameters.length >= PARAMETER_COUNT_RECTANGLE) {
            double length = parameters[PARAMETER_INDEX_RECTANGLE_LENGTH];
            double width = parameters[PARAMETER_INDEX_RECTANGLE_WIDTH];

            rectangleParameters = new RectangleParameters(length, width);
        } else {
            circleParameters = null;
        }
    }

    private void parseSquareParameters(double... parameters) {
        if (parameters.length >= PARAMETER_COUNT_SQUARE) {
            double length = parameters[PARAMETER_INDEX_SQUARE_LENGTH];

            squareParameters = new SquareParameters(length);
        } else {
            squareParameters = null;
        }
    }
}
