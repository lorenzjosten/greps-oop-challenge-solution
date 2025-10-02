package io.github.lorenzjosten.greps.io;

import io.github.lorenzjosten.greps.io.parser.IParameterParser;
import io.github.lorenzjosten.greps.io.validation.IValidator;
import io.github.lorenzjosten.greps.model.value.IShapeParameters;
import io.github.lorenzjosten.greps.model.value.Shape;

public class InputProcessorImpl implements IInputProcessor {
    private final IParameterParser parser;
    private final IValidator validator;

    public InputProcessorImpl(IParameterParser parser, IValidator validator) {
        this.parser = parser;
        this.validator = validator;
    }

    @Override
    public IShapeParameters process(Shape shape, double... args) {
        return null;
    }
}
