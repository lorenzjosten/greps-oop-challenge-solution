package io.github.lorenzjosten.greps.model.factory;

import io.github.lorenzjosten.greps.model.value.shape.IShape;
import io.github.lorenzjosten.greps.model.value.shape.parameter.IShapeParameters;

public interface IShapeFactory {

    IShape create(IShapeParameters parameters);
}
