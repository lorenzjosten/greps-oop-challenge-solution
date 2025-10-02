package io.github.lorenzjosten.greps.model.factory;

import io.github.lorenzjosten.greps.model.value.IShape;
import io.github.lorenzjosten.greps.model.value.IShapeParameters;

public interface IShapeFactory {

    IShapeFactory parameters(IShapeParameters parameters);

    IShape build();
}
