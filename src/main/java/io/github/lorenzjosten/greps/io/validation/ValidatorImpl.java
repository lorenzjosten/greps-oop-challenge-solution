package io.github.lorenzjosten.greps.io.validation;

import io.github.lorenzjosten.greps.model.value.Shape;

import static io.github.lorenzjosten.greps.model.value.Shape.*;

public class ValidatorImpl implements IValidator {

    private static final int PARAMETER_COUNT_CIRCLE = 1;
    private static final int PARAMETER_COUNT_SQUARE = 1;
    private static final int PARAMETER_COUNT_RECTANGLE = 2;

    @Override
    public void validate(Shape type, double... parameters) {
        if (type == null) throw new IllegalArgumentException("Missing shape type.");

        if (type == SQUARE && parameters.length < PARAMETER_COUNT_SQUARE)
            throw new IllegalArgumentException("Missing parameters for square.");

        if (type == RECTANGLE && parameters.length < PARAMETER_COUNT_RECTANGLE)
            throw new IllegalArgumentException("Missing parameters for rectangle.");

        if (type == CIRCLE && parameters.length < PARAMETER_COUNT_CIRCLE)
            throw new IllegalArgumentException("Missing parameters for circle.");
    }

}
