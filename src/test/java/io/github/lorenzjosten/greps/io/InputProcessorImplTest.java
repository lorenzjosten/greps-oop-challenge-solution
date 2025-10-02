package io.github.lorenzjosten.greps.io;

import io.github.lorenzjosten.greps.io.parser.IParameterParser;
import io.github.lorenzjosten.greps.io.validation.IValidator;
import io.github.lorenzjosten.greps.model.value.IShapeParameters;
import io.github.lorenzjosten.greps.model.value.Input;
import io.github.lorenzjosten.greps.model.value.SquareParameters;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.github.lorenzjosten.greps.model.value.Shape.SQUARE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class InputProcessorImplTest {
    private final IValidator validator = mock();
    private final IParameterParser parser = mock();
    private final IInputProcessor processor = new InputProcessorImpl(parser, validator);

    @Test
    @DisplayName("Should process input")
    public void shouldProcessInput() {
        IShapeParameters params = mock();

        when(parser.parse(any(Input.class))).thenReturn(params);
        doNothing().when(validator).validate(any(Input.class));

        assertEquals(params, processor.process(SQUARE, 1));

        verify(validator, atLeastOnce()).validate(any(Input.class));
        verify(parser, atLeastOnce()).parse(any(Input.class));
    }
}
