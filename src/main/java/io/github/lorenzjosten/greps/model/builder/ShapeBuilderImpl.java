package io.github.lorenzjosten.greps.model.builder;

import io.github.lorenzjosten.greps.model.value.*;

import static io.github.lorenzjosten.greps.model.value.Shape.*;

public class ShapeBuilderImpl implements IShapeBuilder {
    private Shape type;
    private IShapeParameters parameters;

    @Override
    public IShapeBuilder type(Shape shape) {
        this.type = shape;

        return this;
    }

    @Override
    public IShapeBuilder parameters(IShapeParameters parameters) {
        this.parameters = parameters;

        return this;
    }

    @Override
    public IShape build() {
        validateInput();

        return switch(this.type) {
            case SQUARE -> new Square((SquareParameters) parameters);
            case RECTANGLE -> new Rectangle((RectangleParameters) parameters);
            case CIRCLE -> new Circle((CircleParameters) parameters);
        };
    }

    private void validateInput() {
        if (this.type == null) throw new IllegalArgumentException("Missing shape type.");

        if (type == SQUARE && !(parameters instanceof SquareParameters)) throw new IllegalArgumentException("Missing parameters for square.");
        if (type == RECTANGLE && !(parameters instanceof RectangleParameters)) throw new IllegalArgumentException("Missing parameters for rectangle.");
        if (type == CIRCLE && !(parameters instanceof CircleParameters)) throw new IllegalArgumentException("Missing parameters for circle.");
    }
}
