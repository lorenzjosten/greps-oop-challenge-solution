package io.github.lorenzjosten.greps.model.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    private final SquareParameters parameters = new SquareParameters(1);
    private final Square square = new Square(parameters);

    @Test
    public void should_calculate_area() {
        assertEquals(1, square.area());
    }

    @Test
    public void should_calculate_perimeter() {
        assertEquals(4, square.perimeter());
    }
}
