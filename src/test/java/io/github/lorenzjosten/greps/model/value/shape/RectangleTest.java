package io.github.lorenzjosten.greps.model.value.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    private final Rectangle rectangle = new Rectangle(1, 2);

    @Test
    @DisplayName("Should calculate rectangle area")
    public void shouldCalculateArea() {
        assertEquals(2, rectangle.area());
    }

    @Test
    @DisplayName("Should calculate rectangle perimeter")
    public void shouldCalculatePerimeter() {
        assertEquals(6, rectangle.perimeter());
    }
}
