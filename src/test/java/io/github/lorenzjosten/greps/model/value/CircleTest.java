package io.github.lorenzjosten.greps.model.value;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    private final Circle circle = new Circle(1);

    @Test
    @DisplayName("Should calculate circle area")
    public void shouldCalculateArea() {
        assertEquals(Math.PI, circle.area());
    }

    @Test
    @DisplayName("Should calculate circle perimeter")
    public void shouldCalculatePerimeter() {
        assertEquals(2 * Math.PI, circle.perimeter());
    }
}
