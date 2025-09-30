package io.github.lorenzjosten.greps.model.builder;

import io.github.lorenzjosten.greps.model.value.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class ShapeBuilderImplTest {

    private final IShapeBuilder builder = new ShapeBuilderImpl();

    @Test
    public void should_create_circle() {
        AShape circle = builder.type(Shape.CIRCLE).parameters(1).build();

        assertInstanceOf(Circle.class, circle);
    }

    @Test
    public void should_create_square() {
        AShape square = builder.type(Shape.SQUARE).parameters(1).build();

        assertInstanceOf(Square.class, square);
    }

    @Test
    public void should_create_rectangle() {
        AShape rectangle = builder.type(Shape.RECTANGLE).parameters(1, 1).build();

        assertInstanceOf(Rectangle.class, rectangle);
    }
}
