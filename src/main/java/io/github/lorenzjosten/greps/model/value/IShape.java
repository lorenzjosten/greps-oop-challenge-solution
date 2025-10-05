package io.github.lorenzjosten.greps.model.value;

public sealed interface IShape permits Circle, Square, Rectangle {

    double area();

    double perimeter();
}
