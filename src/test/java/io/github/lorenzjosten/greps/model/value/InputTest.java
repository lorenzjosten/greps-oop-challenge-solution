package io.github.lorenzjosten.greps.model.value;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InputTest {

    private final double[] NO_PARAMETER = { };
    private final double[] ONE_PARAMETER = { 1 };
    private final double[] TWO_PARAMETERS = { 1, 2 };

    @Test
    @DisplayName("Should be square")
    public void shouldBeSquare() {
        Input input = new Input(Shape.SQUARE, NO_PARAMETER);

        assertTrue(input.isSquare());
    }

    @Test
    @DisplayName("Should be rectangle")
    public void shouldBeRectangle() {
        Input input = new Input(Shape.RECTANGLE, NO_PARAMETER);

        assertTrue(input.isRectangle());
    }

    @Test
    @DisplayName("Should be circle")
    public void shouldBeCircle() {
        Input input = new Input(Shape.CIRCLE, NO_PARAMETER);

        assertTrue(input.isCircle());
    }

    @Test
    @DisplayName("Should be shorter than two")
    public void shouldBeShorterThanTwo() {
        Input input = new Input(null, ONE_PARAMETER);

        assertTrue(input.isShorterThan(2));
    }

    @Test
    @DisplayName("Should not be shorter than two")
    public void shouldNotBeShorterThanTwo() {
        Input input = new Input(null, TWO_PARAMETERS);

        assertFalse(input.isShorterThan(2));
    }
}
