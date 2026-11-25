# 5. Liskov Substitution Principle (LSP)

## Definition
Objects of a subtype should be usable wherever objects of the base type are expected without breaking the correctness promised by the base type.

A subtype must honor the behavioral contract of its parent—not merely compile.

## Classic design problem
If a `Square` extends a mutable `Rectangle`, setting width and height independently may break the square's equal-side rule or surprise code expecting rectangle behavior.

## Better approach
Model a shared abstraction when the types share a stable contract, or use separate types when their behavior differs.

```java
interface Shape {
    double area();
}

class Rectangle implements Shape {
    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Dimensions cannot be negative");
        }
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}

class Square implements Shape {
    private final double side;

    Square(double side) {
        if (side < 0) throw new IllegalArgumentException("Side cannot be negative");
        this.side = side;
    }

    public double area() {
        return side * side;
    }
}
```

Both types can safely be used where a `Shape` is expected.

## Contract rules to remember
- A subtype should not strengthen preconditions unexpectedly.
- A subtype should not weaken postconditions.
- It should preserve important invariants.
- It should honor documented behavior and error expectations.

## Benefits
Reliable polymorphism, fewer surprising subtype behaviors, and easier testing.
