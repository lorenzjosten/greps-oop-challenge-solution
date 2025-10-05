package io.github.lorenzjosten.greps.model.value.shape;

public sealed interface IShape permits Circle, Square, Rectangle {

    double area();

    double perimeter();
}
