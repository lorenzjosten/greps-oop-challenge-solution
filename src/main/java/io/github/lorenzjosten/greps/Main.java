package io.github.lorenzjosten.greps;

import io.github.lorenzjosten.greps.math.ShapeMath;
import io.github.lorenzjosten.greps.model.value.io.Shape;

public class Main {
    public static void main(String[] args) {
        var squarePerimeter = ShapeMath.perimeter(Shape.SQUARE, 2);
        System.out.println("Perimeter of 2x2 square: " + squarePerimeter);

        var squareArea = ShapeMath.area(Shape.SQUARE, 2);
        System.out.println("Area of 2x2 square: " + squareArea);

        var rectanglePerimeter = ShapeMath.perimeter(Shape.RECTANGLE, 2, 3);
        System.out.println("Perimeter of 2x3 rectangle: " + rectanglePerimeter);

        var rectangleArea = ShapeMath.area(Shape.RECTANGLE, 2, 3);
        System.out.println("Area of 2x3 rectangle: " + rectangleArea);

        var circlePerimeter = ShapeMath.perimeter(Shape.CIRCLE, 2);
        System.out.println("Perimeter of circle with radius 2: " + circlePerimeter);

        var circleArea = ShapeMath.area(Shape.CIRCLE, 2);
        System.out.println("Area of circle with radius 2: " + circleArea);
    }
}
