package io.github.lorenzjosten.greps.model.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void should_throw_when_missing_parameters() {
        assertThrows(IllegalArgumentException.class, Square::new);
    }
}
