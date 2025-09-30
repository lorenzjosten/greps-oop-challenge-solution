package io.github.lorenzjosten.greps.model.builder;

import io.github.lorenzjosten.greps.model.value.AShape;
import io.github.lorenzjosten.greps.model.value.Shape;

public interface IShapeBuilder {

    public IShapeBuilder type(Shape shape);

    public IShapeBuilder parameters(double... parameters);

    public AShape build();
}
