package io.github.lorenzjosten.greps.model.value.shape;

import io.github.lorenzjosten.greps.model.value.io.Input;
import io.github.lorenzjosten.greps.model.value.io.Shape;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InputTest {

    private final double[] NO_PARAMETER = { };
    private final double[] ONE_PARAMETER = { 1 };
    private final double[] TWO_PARAMETERS = { 1, 2 };
    private final double[] NEGATIVE_PARAMETERS = { 1, -2 };

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

    @Test
    @DisplayName("Should not be negative")
    public void shouldNotBeNegative() {
        Input input = new Input(null, TWO_PARAMETERS);

        assertFalse(input.isNegative());
    }

    @Test
    @DisplayName("Should be negative")
    public void shouldBeNegative() {
        Input input = new Input(null, NEGATIVE_PARAMETERS);

        assertTrue(input.isNegative());
    }

    @Test
    @DisplayName("Should get at index")
    public void shouldGetAtIndex() {
        Input input = new Input(null, TWO_PARAMETERS);

        assertEquals(2, input.get(1));
    }
}
