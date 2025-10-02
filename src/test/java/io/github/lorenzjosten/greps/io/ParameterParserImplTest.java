package io.github.lorenzjosten.greps.io;

import io.github.lorenzjosten.greps.model.value.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterParserImplTest {

    private final double[] NO_PARAMETER = { };
    private final double[] ONE_PARAMETER = { 1 };
    private final double[] TWO_PARAMETERS = { 1, 2 };

    IParameterParser parser = new ParameterParserImpl();

    @Test
    @DisplayName("Should parse square")
    public void shouldParseSquare() {
        IShapeParameters parameters = assertDoesNotThrow(() -> parser.parse(Shape.SQUARE, ONE_PARAMETER));

        assertInstanceOf(SquareParameters.class, parameters);
        assertEquals(1, ((SquareParameters) parameters).length());
    }

    @Test
    @DisplayName("Should parse rectangle")
    public void shouldParseRectangle() {
        IShapeParameters parameters = assertDoesNotThrow(() -> parser.parse(Shape.RECTANGLE, TWO_PARAMETERS));

        assertInstanceOf(RectangleParameters.class, parameters);
        assertEquals(1, ((RectangleParameters) parameters).length());
        assertEquals(2, ((RectangleParameters) parameters).width());
    }

    @Test
    @DisplayName("Should parse circle")
    public void shouldParseCircle() {
        IShapeParameters parameters = assertDoesNotThrow(() -> parser.parse(Shape.CIRCLE, ONE_PARAMETER));

        assertInstanceOf(CircleParameters.class, parameters);
        assertEquals(1, ((CircleParameters) parameters).radius());
    }

    @Test
    @DisplayName("Should throw when missing square parameters")
    public void shouldThrowWhenMissingSquareParameters() {
        assertThrows(IllegalArgumentException.class, () -> parser.parse(Shape.SQUARE, NO_PARAMETER));
    }

    @Test
    @DisplayName("Should throw when missing rectangle parameters")
    public void shouldThrowWhenMissingRectangleParameters() {
        assertThrows(IllegalArgumentException.class, () -> parser.parse(Shape.RECTANGLE, ONE_PARAMETER));
    }

    @Test
    @DisplayName("Should throw when missing circle parameters")
    public void shouldThrowWhenMissingCircleParameters() {
        assertThrows(IllegalArgumentException.class, () -> parser.parse(Shape.CIRCLE, NO_PARAMETER));
    }
}
