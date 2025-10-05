package io.github.lorenzjosten.greps.io.validation;

import io.github.lorenzjosten.greps.model.value.io.Input;

public class ValidatorImpl implements IValidator {

    private static final int PARAMETER_COUNT_CIRCLE = 1;
    private static final int PARAMETER_COUNT_SQUARE = 1;
    private static final int PARAMETER_COUNT_RECTANGLE = 2;

    @Override
    public void validate(Input input) {
        if (input.type() == null) throw new IllegalArgumentException("Missing shape type.");

        if (input.isSquare() && input.isShorterThan(PARAMETER_COUNT_SQUARE))
            throw new IllegalArgumentException("Missing parameters for square.");

        if (input.isRectangle() && input.isShorterThan(PARAMETER_COUNT_RECTANGLE))
            throw new IllegalArgumentException("Missing parameters for rectangle.");

        if (input.isCircle() && input.isShorterThan(PARAMETER_COUNT_CIRCLE))
            throw new IllegalArgumentException("Missing parameters for circle.");

        if (input.isNegative())
            throw new IllegalArgumentException("Negative numbers not allowed.");
    }

}
