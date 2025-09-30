package io.github.lorenzjosten.greps.model.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    private final CircleParameters parameters = new CircleParameters(1);
    private final Circle circle = new Circle(parameters);

    @Test
    public void should_calculate_area() {
        assertEquals(Math.PI, circle.area());
    }

    @Test
    public void should_calculate_perimeter() {
        assertEquals(2 * Math.PI, circle.perimeter());
    }
}
