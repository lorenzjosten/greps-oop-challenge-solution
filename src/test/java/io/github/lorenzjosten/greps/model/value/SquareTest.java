package io.github.lorenzjosten.greps.model.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    private final Square square = new Square(1);

    @Test
    public void should_calculate_area() {
        assertEquals(1, square.area());
    }

    @Test
    public void should_calculate_perimeter() {
        assertEquals(4, square.perimeter());
    }
}
