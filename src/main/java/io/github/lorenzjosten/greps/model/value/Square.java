package io.github.lorenzjosten.greps.model.value;

public class Square extends AShape<SquareParameters> {
    public Square(SquareParameters parameters) {
        super(parameters);
    }

    @Override
    public double area() {
        return getLength() * getLength();
    }

    @Override
    public double perimeter() {
        return 4 * getLength();
    }

    public double getLength() {
        return parameters.getLength();
    }
}
