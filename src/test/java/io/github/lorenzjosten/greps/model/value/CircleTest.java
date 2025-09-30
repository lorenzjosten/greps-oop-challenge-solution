package io.github.lorenzjosten.greps.model.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
