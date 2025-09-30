package io.github.lorenzjosten.greps.io;

import io.github.lorenzjosten.greps.model.value.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterParserImplTest {

    private final double[] NO_PARAMETER = { };
    private final double[] ONE_PARAMETER = { 1 };
    private final double[] TWO_PARAMETERS = { 1, 2 };

    IParameterParser parser = new ParameterParserImpl();

    @Test
    public void should_parse_square() {
        IShapeParameters parameters = assertDoesNotThrow(() -> parser.parse(Shape.SQUARE, ONE_PARAMETER));

        assertInstanceOf(SquareParameters.class, parameters);
        assertEquals(1, ((SquareParameters) parameters).length());
    }

    @Test
    public void should_parse_rectangle() {
        IShapeParameters parameters = assertDoesNotThrow(() -> parser.parse(Shape.RECTANGLE, TWO_PARAMETERS));

        assertInstanceOf(RectangleParameters.class, parameters);
        assertEquals(1, ((RectangleParameters) parameters).length());
        assertEquals(2, ((RectangleParameters) parameters).width());
    }

    @Test
    public void should_parse_circle() {
        IShapeParameters parameters = assertDoesNotThrow(() -> parser.parse(Shape.CIRCLE, ONE_PARAMETER));

        assertInstanceOf(CircleParameters.class, parameters);
        assertEquals(1, ((CircleParameters) parameters).radius());
    }

    @Test
    public void should_throw_when_missing_square_parameters() {
        assertThrows(IllegalArgumentException.class, () -> parser.parse(Shape.SQUARE, NO_PARAMETER));
    }

    @Test
    public void should_throw_when_missing_rectangle_parameters() {
        assertThrows(IllegalArgumentException.class, () -> parser.parse(Shape.RECTANGLE, ONE_PARAMETER));
    }

    @Test
    public void should_throw_when_missing_circle_parameters() {
        assertThrows(IllegalArgumentException.class, () -> parser.parse(Shape.CIRCLE, NO_PARAMETER));
    }
}
