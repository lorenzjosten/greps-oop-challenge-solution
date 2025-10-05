package io.github.lorenzjosten.greps.model.factory;

import io.github.lorenzjosten.greps.model.value.shape.Circle;
import io.github.lorenzjosten.greps.model.value.shape.IShape;
import io.github.lorenzjosten.greps.model.value.shape.Rectangle;
import io.github.lorenzjosten.greps.model.value.shape.Square;
import io.github.lorenzjosten.greps.model.value.shape.parameter.CircleParameters;
import io.github.lorenzjosten.greps.model.value.shape.parameter.IShapeParameters;
import io.github.lorenzjosten.greps.model.value.shape.parameter.RectangleParameters;
import io.github.lorenzjosten.greps.model.value.shape.parameter.SquareParameters;

public class ShapeFactoryImpl implements IShapeFactory {

    @Override
    public IShape create(IShapeParameters parameters) {
        return switch(parameters) {
            case null -> throw new IllegalArgumentException("ShapeParameters must not be null.");
            case SquareParameters params -> new Square(params);
            case RectangleParameters params -> new Rectangle(params);
            case CircleParameters params -> new Circle(params);
        };
    }
}
