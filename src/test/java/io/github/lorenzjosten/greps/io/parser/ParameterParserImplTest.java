package io.github.lorenzjosten.greps.io.parser;

import io.github.lorenzjosten.greps.model.value.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.github.lorenzjosten.greps.model.value.Shape.SQUARE;
import static io.github.lorenzjosten.greps.model.value.Shape.RECTANGLE;
import static io.github.lorenzjosten.greps.model.value.Shape.CIRCLE;
import static org.junit.jupiter.api.Assertions.*;

public class ParameterParserImplTest {

    private final double[] ONE_PARAMETER = {1};
    private final double[] TWO_PARAMETERS = {1, 2};

    IParameterParser parser = new ParameterParserImpl();

    @Test
    @DisplayName("Should parse square")
    public void shouldParseSquare() {
        Input input = new Input(SQUARE, ONE_PARAMETER);
        IShapeParameters parameters = assertDoesNotThrow(() -> parser.parse(input));

        assertInstanceOf(SquareParameters.class, parameters);
        assertEquals(1, ((SquareParameters) parameters).length());
    }

    @Test
    @DisplayName("Should parse rectangle")
    public void shouldParseRectangle() {
        Input input = new Input(RECTANGLE, TWO_PARAMETERS);
        IShapeParameters parameters = assertDoesNotThrow(() -> parser.parse(input));

        assertInstanceOf(RectangleParameters.class, parameters);
        assertEquals(1, ((RectangleParameters) parameters).length());
        assertEquals(2, ((RectangleParameters) parameters).width());
    }

    @Test
    @DisplayName("Should parse circle")
    public void shouldParseCircle() {
        Input input = new Input(CIRCLE, ONE_PARAMETER);
        IShapeParameters parameters = assertDoesNotThrow(() -> parser.parse(input));

        assertInstanceOf(CircleParameters.class, parameters);
        assertEquals(1, ((CircleParameters) parameters).radius());
    }
}
