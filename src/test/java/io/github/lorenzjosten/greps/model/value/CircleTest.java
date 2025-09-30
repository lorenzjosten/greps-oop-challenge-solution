package io.github.lorenzjosten.greps.model.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CircleTest {

    private final Circle circle = new Circle(1);

    @Test
    public void should_calculate_area() {
        assertEquals(Math.PI, circle.area());
    }

    @Test
    public void should_calculate_perimeter() {
        assertEquals(2 * Math.PI, circle.perimeter());
    }

    @Test
    public void should_throw_when_missing_parameters() {
        assertThrows(IllegalArgumentException.class, Circle::new);
    }
}
