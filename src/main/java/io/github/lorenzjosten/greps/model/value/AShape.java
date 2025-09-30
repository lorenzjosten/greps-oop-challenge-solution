package io.github.lorenzjosten.greps.model.value;

public abstract class AShape {

    AShape(double... parameters) {
        parse(parameters);
    }

    public abstract double area();

    public abstract double perimeter();

    protected abstract void parse(double... parameters);
}
