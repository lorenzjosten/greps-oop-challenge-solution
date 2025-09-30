package io.github.lorenzjosten.greps.model.value;

public abstract class AShape<T extends AShapeParameters> {
    protected final T parameters;

    AShape(T parameters) {
        this.parameters = parameters;
    }

    public abstract double area();

    public abstract double perimeter();
}
