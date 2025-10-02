package io.github.lorenzjosten.greps.model.builder;

import io.github.lorenzjosten.greps.model.value.IShape;
import io.github.lorenzjosten.greps.model.value.IShapeParameters;

public interface IShapeBuilder {

    IShapeBuilder parameters(IShapeParameters parameters);

    IShape build();
}
