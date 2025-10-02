package io.github.lorenzjosten.greps.io;

import io.github.lorenzjosten.greps.io.parser.IParameterParser;
import io.github.lorenzjosten.greps.io.parser.ParameterParserImpl;
import io.github.lorenzjosten.greps.io.validation.IValidator;
import io.github.lorenzjosten.greps.io.validation.ValidatorImpl;
import io.github.lorenzjosten.greps.model.value.IShapeParameters;
import io.github.lorenzjosten.greps.model.value.Shape;

public class InputProcessorImpl implements IInputProcessor {
    private final IParameterParser parser = new ParameterParserImpl();
    private final IValidator validator = new ValidatorImpl();

    @Override
    public IShapeParameters process(Shape shape, double... args) {
        return null;
    }
}
