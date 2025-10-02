package io.github.lorenzjosten.greps.io.validation;

import io.github.lorenzjosten.greps.model.value.Shape;

public interface IValidator {

    void validate(Shape type, double... parameters);
}
