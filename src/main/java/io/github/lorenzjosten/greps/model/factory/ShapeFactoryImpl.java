package io.github.lorenzjosten.greps.model.factory;

import io.github.lorenzjosten.greps.model.value.*;

public class ShapeFactoryImpl implements IShapeFactory {

    @Override
    public IShape create(IShapeParameters parameters) {
        return switch(parameters) {
            case null -> throw new IllegalArgumentException("ShapeParameters must not be null.");
            case SquareParameters params -> new Square(params);
            case RectangleParameters params -> new Rectangle(params);
            case CircleParameters params -> new Circle(params);
            default -> throw new IllegalStateException("Unexpected value: " + parameters);
        };
    }
}
