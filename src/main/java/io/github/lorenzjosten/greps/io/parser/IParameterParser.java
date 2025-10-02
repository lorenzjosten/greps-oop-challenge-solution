package io.github.lorenzjosten.greps.io.parser;

import io.github.lorenzjosten.greps.model.value.IShapeParameters;
import io.github.lorenzjosten.greps.model.value.Input;

public interface IParameterParser {

    IShapeParameters parse(Input input);
}