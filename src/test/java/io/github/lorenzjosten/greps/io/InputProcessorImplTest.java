package io.github.lorenzjosten.greps.io;

import io.github.lorenzjosten.greps.io.parser.IParameterParser;
import io.github.lorenzjosten.greps.io.validation.IValidator;
import io.github.lorenzjosten.greps.model.value.IShapeParameters;
import io.github.lorenzjosten.greps.model.value.Input;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class InputProcessorImplTest {
    private final IValidator validator = mock();
    private final IParameterParser parser = mock();
    private final IInputProcessor processor = new InputProcessorImpl(parser, validator);

    @Test
    @DisplayName("Should process input")
    public void shouldProcessInput() {
        Input input = mock();
        IShapeParameters params = mock();

        when(parser.parse(input)).thenReturn(params);
        doNothing().when(validator).validate(input);

        assertEquals(params, processor.process(input));

        verify(validator, atLeastOnce()).validate(input);
        verify(parser, atLeastOnce()).parse(input);
    }
}
