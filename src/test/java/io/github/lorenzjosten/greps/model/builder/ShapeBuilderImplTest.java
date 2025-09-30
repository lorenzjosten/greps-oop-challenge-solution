package io.github.lorenzjosten.greps.model.builder;

import io.github.lorenzjosten.greps.model.value.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShapeBuilderImplTest {

    private final IShapeBuilder builder = new ShapeBuilderImpl();

    @Test
    public void should_create_circle() {
        CircleParameters parameters = new CircleParameters(1);
        IShape circle = builder.type(Shape.CIRCLE).parameters(parameters).build();

        assertInstanceOf(Circle.class, circle);
    }

    @Test
    public void should_create_square() {
        SquareParameters parameters = new SquareParameters(1);
        IShape square = builder.type(Shape.SQUARE).parameters(parameters).build();

        assertInstanceOf(Square.class, square);
    }

    @Test
    public void should_create_rectangle() {
        RectangleParameters parameters = new RectangleParameters(1, 2);
        IShape rectangle = builder.type(Shape.RECTANGLE).parameters(parameters).build();

        assertInstanceOf(Rectangle.class, rectangle);
    }

    @Test
    public void should_throw_when_type_missing() {
        IShapeParameters parameters = new SquareParameters(1);

        assertThrows(IllegalArgumentException.class, () -> builder.parameters(parameters).build());
    }

    @Test
    public void should_throw_when_parameters_missing() {
        assertThrows(IllegalArgumentException.class, () -> builder.type(Shape.SQUARE).build());
    }
}
