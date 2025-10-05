package io.github.lorenzjosten.greps.io;

import io.github.lorenzjosten.greps.io.parser.IParameterParser;
import io.github.lorenzjosten.greps.io.validation.IValidator;
import io.github.lorenzjosten.greps.model.value.shape.parameter.IShapeParameters;
import io.github.lorenzjosten.greps.model.value.io.Input;

public class InputProcessorImpl implements IInputProcessor {
    private final IParameterParser parser;
    private final IValidator validator;

    public InputProcessorImpl(IParameterParser parser, IValidator validator) {
        this.parser = parser;
        this.validator = validator;
    }

    @Override
    public IShapeParameters process(Input input) {
        validator.validate(input);

        return parser.parse(input);
    }
}
