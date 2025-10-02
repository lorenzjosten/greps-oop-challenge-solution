package io.github.lorenzjosten.greps.io.validation;

import io.github.lorenzjosten.greps.model.value.Shape;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidatorImplTest {

    private final double[] NO_PARAMETER = { };
    private final double[] ONE_PARAMETER = { 1 };
    private final double[] TWO_PARAMETERS = { 1, 2 };

    private final IValidator validator = new ValidatorImpl();

    @Test
    @DisplayName("Should not throw when square")
    public void shouldNotThrowWhenSquare() {
        assertDoesNotThrow(() -> validator.validate(Shape.SQUARE, ONE_PARAMETER));
    }

    @Test
    @DisplayName("Should not throw when rectangle")
    public void shouldNotThrowWhenRectangle() {
        assertDoesNotThrow(() -> validator.validate(Shape.RECTANGLE, TWO_PARAMETERS));
    }

    @Test
    @DisplayName("Should not throw when circle")
    public void shouldNotThrowWhenCircle() {
        assertDoesNotThrow(() -> validator.validate(Shape.CIRCLE, ONE_PARAMETER));
    }

    @Test
    @DisplayName("Should throw when type null")
    public void shouldThrowWhenTypeNull() {
        assertThrows(IllegalArgumentException.class, () -> validator.validate(null, NO_PARAMETER));
    }

    @Test
    @DisplayName("Should throw when missing square parameters")
    public void shouldThrowWhenMissingSquareParameters() {
        assertThrows(IllegalArgumentException.class, () -> validator.validate(Shape.SQUARE, NO_PARAMETER));
    }

    @Test
    @DisplayName("Should throw when missing rectangle parameters")
    public void shouldThrowWhenMissingRectangleParameters() {
        assertThrows(IllegalArgumentException.class, () -> validator.validate(Shape.RECTANGLE, ONE_PARAMETER));
    }

    @Test
    @DisplayName("Should throw when missing circle parameters")
    public void shouldThrowWhenMissingCircleParameters() {
        assertThrows(IllegalArgumentException.class, () -> validator.validate(Shape.CIRCLE, NO_PARAMETER));
    }
}
