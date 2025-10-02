package io.github.lorenzjosten.greps.io;

import io.github.lorenzjosten.greps.model.value.IShapeParameters;
import io.github.lorenzjosten.greps.model.value.Shape;

public interface IInputProcessor {

    IShapeParameters process(Shape shape, double... args);
}
