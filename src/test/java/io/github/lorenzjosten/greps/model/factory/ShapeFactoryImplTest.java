package io.github.lorenzjosten.greps.model.factory;

import io.github.lorenzjosten.greps.model.value.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShapeFactoryImplTest {

    private final IShapeFactory factory = new ShapeFactoryImpl();

    @Test
    @DisplayName("Should create circle")
    public void shouldCreateCircle() {
        CircleParameters parameters = new CircleParameters(1);
        IShape circle = factory.create(parameters);

        assertInstanceOf(Circle.class, circle);
    }

    @Test
    @DisplayName("Should create square")
    public void shouldCreateSquare() {
        SquareParameters parameters = new SquareParameters(1);
        IShape square = factory.create(parameters);

        assertInstanceOf(Square.class, square);
    }

    @Test
    @DisplayName("Should create rectangle")
    public void shouldCreateRectangle() {
        RectangleParameters parameters = new RectangleParameters(1, 2);
        IShape rectangle = factory.create(parameters);

        assertInstanceOf(Rectangle.class, rectangle);
    }

    @Test
    @DisplayName("Should throw when parameters null")
    public void shouldThrowWhenParametersNull() {
        assertThrows(IllegalArgumentException.class, () -> factory.create(null));
    }
}
