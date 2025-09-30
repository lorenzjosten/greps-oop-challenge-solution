package io.github.lorenzjosten.greps.math;

import io.github.lorenzjosten.greps.io.IParameterParser;
import io.github.lorenzjosten.greps.io.ParameterParserImpl;
import io.github.lorenzjosten.greps.model.builder.IShapeBuilder;
import io.github.lorenzjosten.greps.model.builder.ShapeBuilderImpl;
import io.github.lorenzjosten.greps.model.value.IShape;
import io.github.lorenzjosten.greps.model.value.IShapeParameters;
import io.github.lorenzjosten.greps.model.value.Shape;

/**
 * Given by the challenge. Signatures should not be changed.
 */
public final class ShapeMath {
    private static final IParameterParser parser = new ParameterParserImpl();
    private static final IShapeBuilder builder = new ShapeBuilderImpl();

    private ShapeMath() {}

    public static double perimeter(Shape shape, double... parameters) {
        return createShape(shape, parameters).perimeter();
    }

    public static double area(Shape shape, double... parameters) {
        return createShape(shape, parameters).area();
    }

    private static IShape createShape(Shape shape, double... parameters) {
        IShapeParameters shapeParameters = parser.parse(shape, parameters);

        return builder.type(shape).parameters(shapeParameters).build();
    }
}
