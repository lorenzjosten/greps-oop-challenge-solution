package io.github.lorenzjosten.greps.io;

import io.github.lorenzjosten.greps.model.value.IShapeParameters;
import io.github.lorenzjosten.greps.model.value.Input;

public interface IInputProcessor {

    IShapeParameters process(Input input);
}
