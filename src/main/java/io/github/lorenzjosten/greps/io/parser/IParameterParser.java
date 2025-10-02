package io.github.lorenzjosten.greps.io.parser;

import io.github.lorenzjosten.greps.model.value.IShapeParameters;
import io.github.lorenzjosten.greps.model.value.Shape;

public interface IParameterParser {

    IShapeParameters parse(Shape type, double... parameters);
}