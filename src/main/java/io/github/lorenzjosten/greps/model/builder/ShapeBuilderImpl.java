package io.github.lorenzjosten.greps.model.builder;

import io.github.lorenzjosten.greps.model.value.*;

public class ShapeBuilderImpl implements IShapeBuilder {
    private IShapeParameters parameters;

    @Override
    public IShapeBuilder parameters(IShapeParameters parameters) {
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
