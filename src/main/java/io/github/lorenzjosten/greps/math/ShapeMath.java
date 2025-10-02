package io.github.lorenzjosten.greps.math;

import io.github.lorenzjosten.greps.io.parser.IParameterParser;
import io.github.lorenzjosten.greps.io.parser.ParameterParserImpl;
import io.github.lorenzjosten.greps.io.validation.IValidator;
import io.github.lorenzjosten.greps.io.validation.ValidatorImpl;
import io.github.lorenzjosten.greps.model.factory.IShapeFactory;
import io.github.lorenzjosten.greps.model.factory.ShapeFactoryImpl;
import io.github.lorenzjosten.greps.model.value.IShape;
import io.github.lorenzjosten.greps.model.value.IShapeParameters;
import io.github.lorenzjosten.greps.model.value.Input;
import io.github.lorenzjosten.greps.model.value.Shape;

/**
 * Given by the challenge. Signatures should not be changed.
 */
public final class ShapeMath {
    private static final IValidator validator = new ValidatorImpl();
    private static final IParameterParser parser = new ParameterParserImpl();
    private static final IShapeFactory builder = new ShapeFactoryImpl();

    private ShapeMath() {}

    public static double perimeter(Shape shape, double... parameters) {
        Input input = new Input(shape, parameters);

        return createShape(input).perimeter();
    }

    public static double area(Shape shape, double... parameters) {
        Input input = new Input(shape, parameters);

        return createShape(input).area();
    }

    private static IShape createShape(Input input) {
        IShapeParameters shapeParameters = parser.parse(input);

        return builder.parameters(shapeParameters).build();
    }
}
