package io.github.lorenzjosten.greps.model.factory;

import io.github.lorenzjosten.greps.model.value.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShapeFactoryImplTest {

    private final IShapeFactory builder = new ShapeFactoryImpl();

    @Test
    @DisplayName("Should create circle")
    public void shouldCreateCircle() {
        CircleParameters parameters = new CircleParameters(1);
        IShape circle = builder.parameters(parameters).build();

        assertInstanceOf(Circle.class, circle);
    }

    @Test
    @DisplayName("Should create square")
    public void shouldCreateSquare() {
        SquareParameters parameters = new SquareParameters(1);
        IShape square = builder.parameters(parameters).build();

        assertInstanceOf(Square.class, square);
    }

    @Test
    @DisplayName("Should create rectangle")
    public void shouldCreateRectangle() {
        RectangleParameters parameters = new RectangleParameters(1, 2);
        IShape rectangle = builder.parameters(parameters).build();

        assertInstanceOf(Rectangle.class, rectangle);
    }

    @Test
    @DisplayName("Should throw when parameters missing")
    public void shouldThrowWhenParametersMissing() {
        assertThrows(IllegalArgumentException.class, builder::build);
    }
}
