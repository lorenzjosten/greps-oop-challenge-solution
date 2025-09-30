package io.github.lorenzjosten.greps.model.builder;

import io.github.lorenzjosten.greps.model.value.IShape;
import io.github.lorenzjosten.greps.model.value.IShapeParameters;
import io.github.lorenzjosten.greps.model.value.Shape;

public interface IShapeBuilder {

    IShapeBuilder type(Shape shape);

    IShapeBuilder parameters(IShapeParameters parameters);

    IShape build();
}
