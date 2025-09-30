package io.github.lorenzjosten.greps.io;

import io.github.lorenzjosten.greps.model.value.CircleParameters;
import io.github.lorenzjosten.greps.model.value.RectangleParameters;
import io.github.lorenzjosten.greps.model.value.SquareParameters;

public interface IParameterParser {
    SquareParameters squareParameters();

    RectangleParameters rectangleParameters();

    CircleParameters circleParameters();

    void parse(double... parameters);
}
