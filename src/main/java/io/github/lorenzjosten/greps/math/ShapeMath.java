package io.github.lorenzjosten.greps.math;

import io.github.lorenzjosten.greps.model.builder.IShapeBuilder;
import io.github.lorenzjosten.greps.model.builder.ShapeBuilderImpl;
import io.github.lorenzjosten.greps.model.value.AShape;
import io.github.lorenzjosten.greps.model.value.Shape;

/**
 * Given by the challenge. Signatures should not be changed.
 */
public final class ShapeMath {
    private static final IShapeBuilder builder = new ShapeBuilderImpl();

    private ShapeMath() {

    }

    public static double perimeter(Shape shape, double... parameters) {
        return create(shape, parameters).perimeter();
    }

    public static double area(Shape shape, double... parameters) {
        return create(shape, parameters).area();
    }

    private static AShape create(Shape shape, double... parameters) {
        return builder.type(shape).parameters(parameters).build();
    }
}
