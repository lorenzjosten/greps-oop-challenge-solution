package io.github.lorenzjosten.greps.model.builder;

import io.github.lorenzjosten.greps.model.value.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShapeBuilderImplTest {

    private final IShapeBuilder builder = new ShapeBuilderImpl();

    @Test
    @DisplayName("Should create circle")
    public void shouldCreateCircle() {
        CircleParameters parameters = new CircleParameters(1);
        IShape circle = builder.type(Shape.CIRCLE).parameters(parameters).build();

        assertInstanceOf(Circle.class, circle);
    }

    @Test
    @DisplayName("Should create square")
    public void shouldCreateSquare() {
        SquareParameters parameters = new SquareParameters(1);
        IShape square = builder.type(Shape.SQUARE).parameters(parameters).build();

        assertInstanceOf(Square.class, square);
    }

    @Test
    @DisplayName("Should create rectangle")
    public void shouldCreateRectangle() {
        RectangleParameters parameters = new RectangleParameters(1, 2);
        IShape rectangle = builder.type(Shape.RECTANGLE).parameters(parameters).build();

        assertInstanceOf(Rectangle.class, rectangle);
    }

    @Test
    @DisplayName("Should throw when type missing")
    public void shouldThrowWhenTypeMissing() {
        IShapeParameters parameters = new SquareParameters(1);

        assertThrows(IllegalArgumentException.class, () -> builder.parameters(parameters).build());
    }

    @Test
    @DisplayName("Should throw when parameters missing")
    public void shouldThrowWhenParametersMissing() {
        assertThrows(IllegalArgumentException.class, () -> builder.type(Shape.SQUARE).build());
    }
}
