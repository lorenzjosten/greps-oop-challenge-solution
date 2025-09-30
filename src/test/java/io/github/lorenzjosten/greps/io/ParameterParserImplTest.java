package io.github.lorenzjosten.greps.io;

import io.github.lorenzjosten.greps.model.value.CircleParameters;
import io.github.lorenzjosten.greps.model.value.RectangleParameters;
import io.github.lorenzjosten.greps.model.value.SquareParameters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterParserImplTest {

    private final double[] NO_PARAMETER = { };
    private final double[] ONE_PARAMETER = { 1 };
    private final double[] TWO_PARAMETERS = { 1, 2 };

    private final IParameterParser parser = new ParameterParserImpl();

    @Test
    public void should_parse_no_parameter() {
        assertDoesNotThrow(() -> parser.parse(NO_PARAMETER));
    }

    @Test
    public void should_parse_one_parameter() {
        assertDoesNotThrow(() -> parser.parse(ONE_PARAMETER));
    }

    @Test
    public void should_parse_two_parameters() {
        assertDoesNotThrow(() -> parser.parse(TWO_PARAMETERS));
    }

    @Test
    public void should_retrieve_square_parameters() {
        parser.parse(ONE_PARAMETER);

        assertEquals(new SquareParameters(1), parser.squareParameters());
    }

    @Test
    public void should_retrieve_rectangle_parameters() {
        assertDoesNotThrow(() -> parser.parse(TWO_PARAMETERS));

        assertEquals(new RectangleParameters(1, 2), parser.rectangleParameters());
    }

    @Test
    public void should_retrieve_circle_parameters() {
        parser.parse(ONE_PARAMETER);

        assertEquals(new CircleParameters(1), parser.circleParameters());
    }

    @Test
    public void should_throw_when_null_square_parameters() {
        parser.parse(NO_PARAMETER);

        assertThrows(IllegalArgumentException.class, parser::squareParameters);
    }

    @Test
    public void should_throw_when_null_rectangle_parameters() {
        parser.parse(ONE_PARAMETER);

        assertThrows(IllegalArgumentException.class, parser::rectangleParameters);
    }

    @Test
    public void should_throw_when_null_circle_parameters() {
        parser.parse(NO_PARAMETER);

        assertThrows(IllegalArgumentException.class, parser::circleParameters);
    }
}
