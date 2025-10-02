package io.github.lorenzjosten.greps.io;

import io.github.lorenzjosten.greps.io.parser.IParameterParser;
import io.github.lorenzjosten.greps.io.validation.IValidator;
import io.github.lorenzjosten.greps.model.value.IShapeParameters;
import io.github.lorenzjosten.greps.model.value.Input;
import io.github.lorenzjosten.greps.model.value.Shape;

public class InputProcessorImpl implements IInputProcessor {
    private final IParameterParser parser;
    private final IValidator validator;

    public InputProcessorImpl(IParameterParser parser, IValidator validator) {
        this.parser = parser;
        this.validator = validator;
    }

    @Override
    public IShapeParameters process(Shape shape, double... parameters) {
        Input input = new Input(shape, parameters);

        validator.validate(input);

        return parser.parse(input);
    }
}
