package io.github.lorenzjosten.greps.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParameterParserImplTest {
    @Test
    public void should_parse_square_length() {
        IParameterParser parser = new ParameterParserImpl(1);

        assertEquals(1, parser.getSquareLength());
    }

    @Test
    public void should_parse_rectangle_length() {
        IParameterParser parser = new ParameterParserImpl(1);

        assertEquals(1, parser.getRectangleLength());
    }

    @Test
    public void should_parse_rectangle_width() {
        IParameterParser parser = new ParameterParserImpl(1, 2);

        assertEquals(2, parser.getRectangleWidth());
    }

    @Test
    public void should_parse_circle_radius() {
        IParameterParser parser = new ParameterParserImpl(1);

        assertEquals(1, parser.getCircleRadius());
    }

    @Test
    public void should_throw_when_no_square_length() {
        IParameterParser parser = new ParameterParserImpl();

        assertThrows(IllegalArgumentException.class, parser::getSquareLength);
    }

    @Test
    public void should_throw_when_no_rectangle_length() {
        IParameterParser parser = new ParameterParserImpl();

        assertThrows(IllegalArgumentException.class, parser::getRectangleLength);
    }

    @Test
    public void should_throw_when_no_rectangle_width() {
        IParameterParser parser = new ParameterParserImpl(1);

        assertThrows(IllegalArgumentException.class, parser::getRectangleWidth);
    }

    @Test
    public void should_throw_when_no_circle_radius() {
        IParameterParser parser = new ParameterParserImpl();

        assertThrows(IllegalArgumentException.class, parser::getCircleRadius);
    }
}
