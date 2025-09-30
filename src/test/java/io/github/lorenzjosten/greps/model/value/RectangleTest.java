package io.github.lorenzjosten.greps.model.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {

    private final Rectangle rectangle = new Rectangle(1, 2);

    @Test
    public void should_calculate_area() {
        assertEquals(2, rectangle.area());
    }

    @Test
    public void should_calculate_perimeter() {
        assertEquals(6, rectangle.perimeter());
    }

    @Test
    public void should_throw_when_missing_parameters() {
        assertThrows(IllegalArgumentException.class, Rectangle::new);
    }
}
