package io.github.lorenzjosten.greps.model.factory;

import io.github.lorenzjosten.greps.model.value.*;

public class ShapeFactoryImpl implements IShapeFactory {
    private IShapeParameters parameters;

    @Override
    public IShapeFactory parameters(IShapeParameters parameters) {
        this.parameters = parameters;

        return this;
    }

    @Override
    public IShape build() {
        return switch(parameters) {
            case SquareParameters params -> new Square(params);
            case RectangleParameters params -> new Rectangle(params);
            case CircleParameters params -> new Circle(params);
            default -> throw new IllegalStateException("Unexpected value: " + parameters);
        };
    }
}
