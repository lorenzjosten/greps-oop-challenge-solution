# Greps OOP challenge solution 

This project features a solution to the Greps OOP refactoring challenge that uses core principles of OOP.

The ShapeMath class and Shape enumeration were given by the challenge and served as a starting point.

## Design choices

The model features an interface IShape that enforces implementation of methods for area and perimeter in the inheriting classes. This approach allows for extension of additional functionality. 

The complexity of validating input and constructing objects from it is lifted out of the ShapeMath class. IParameterParser and IShapeBuilder implementations take responsibility for that. 

## Caveats

Unit tests are not covering every line of code. 

## Execution

To run tests execute: 

```bash
./gradlew test
```

To run the main application execute: 

```bash
./gradlew run
```
