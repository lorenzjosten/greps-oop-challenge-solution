package io.github.lorenzjosten.greps.io;

import io.github.lorenzjosten.greps.model.value.shape.parameter.IShapeParameters;
import io.github.lorenzjosten.greps.model.value.io.Input;

public interface IInputProcessor {

    IShapeParameters process(Input input);
}
