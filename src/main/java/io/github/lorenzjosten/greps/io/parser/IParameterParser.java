package io.github.lorenzjosten.greps.io.parser;

import io.github.lorenzjosten.greps.model.value.shape.parameter.IShapeParameters;
import io.github.lorenzjosten.greps.model.value.io.Input;

public interface IParameterParser {

    IShapeParameters parse(Input input);
}