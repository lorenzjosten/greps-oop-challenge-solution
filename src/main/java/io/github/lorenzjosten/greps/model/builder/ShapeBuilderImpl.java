package io.github.lorenzjosten.greps.model.builder;

import io.github.lorenzjosten.greps.model.value.*;

public class ShapeBuilderImpl implements IShapeBuilder {
    private Shape type;
    private double[] parameters;

    @Override
    public IShapeBuilder type(Shape shape) {
        this.type = shape;

        return this;
    }

    @Override
    public IShapeBuilder parameters(double... parameters) {
        this.parameters = parameters;

        return this;
    }

    @Override
    public AShape build() {
        if (this.type == null) {
            throw new IllegalArgumentException("Missing shape type.");
        }

        return switch(this.type) {
            case SQUARE -> new Square(this.parameters);
            case RECTANGLE -> new Rectangle(this.parameters);
            case CIRCLE -> new Circle(this.parameters);
        };
    }
}
