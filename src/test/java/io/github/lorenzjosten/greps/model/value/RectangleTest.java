package io.github.lorenzjosten.greps.model.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
