package io.github.lorenzjosten.greps.model.value.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    private final Square square = new Square(1);

    @Test
    @DisplayName("Should calculate square area")
    public void shouldCalculateArea() {
        assertEquals(1, square.area());
    }

    @Test
    @DisplayName("Should calculate square perimeter")
    public void shouldCalculatePerimeter() {
        assertEquals(4, square.perimeter());
    }
}
