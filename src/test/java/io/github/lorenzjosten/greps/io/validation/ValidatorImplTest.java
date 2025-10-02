package io.github.lorenzjosten.greps.io.validation;

import io.github.lorenzjosten.greps.model.value.Shape;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import io.github.lorenzjosten.greps.model.value.Input;

public class ValidatorImplTest {

    private final double[] NO_PARAMETER = { };
    private final double[] ONE_PARAMETER = { 1 };
    private final double[] TWO_PARAMETERS = { 1, 2 };
    private final double[] NEGATIVE_PARAMETERS = { 1, -2 };

    private final IValidator validator = new ValidatorImpl();

    @Test
    @DisplayName("Should not throw when square")
    public void shouldNotThrowWhenSquare() {
        Input input = new Input(Shape.SQUARE, ONE_PARAMETER);

        assertDoesNotThrow(() -> validator.validate(input));
    }

    @Test
    @DisplayName("Should not throw when rectangle")
    public void shouldNotThrowWhenRectangle() {
        Input input = new Input(Shape.RECTANGLE, TWO_PARAMETERS);

        assertDoesNotThrow(() -> validator.validate(input));
    }

    @Test
    @DisplayName("Should not throw when circle")
    public void shouldNotThrowWhenCircle() {
        Input input = new Input(Shape.CIRCLE, ONE_PARAMETER);

        assertDoesNotThrow(() -> validator.validate(input));
    }

    @Test
    @DisplayName("Should throw when type null")
    public void shouldThrowWhenTypeNull() {
        Input input = new Input(null, NO_PARAMETER);

        assertThrows(IllegalArgumentException.class, () -> validator.validate(input));
    }

    @Test
    @DisplayName("Should throw when missing square parameters")
    public void shouldThrowWhenMissingSquareParameters() {
        Input input = new Input(Shape.SQUARE, NO_PARAMETER);

        assertThrows(IllegalArgumentException.class, () -> validator.validate(input));
    }

    @Test
    @DisplayName("Should throw when missing rectangle parameters")
    public void shouldThrowWhenMissingRectangleParameters() {
        Input input = new Input(Shape.RECTANGLE, ONE_PARAMETER);

        assertThrows(IllegalArgumentException.class, () -> validator.validate(input));
    }

    @Test
    @DisplayName("Should throw when missing circle parameters")
    public void shouldThrowWhenMissingCircleParameters() {
        Input input = new Input(Shape.CIRCLE, NO_PARAMETER);

        assertThrows(IllegalArgumentException.class, () -> validator.validate(input));
    }

    @Test
    @DisplayName("Should throw when negative parameters")
    public void shouldThrowWhenNegativeParameters() {
        Input input = new Input(Shape.CIRCLE, NEGATIVE_PARAMETERS);

        assertThrows(IllegalArgumentException.class, () -> validator.validate(input));
    }
}
