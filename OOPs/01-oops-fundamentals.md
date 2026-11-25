# 1. OOPS Fundamentals

## What is OOPS?
Object-Oriented Programming (OOPS) organizes a program into objects. An object has:
- **State:** data represented by fields (for example, a bank account's balance).
- **Behavior:** operations represented by methods (for example, deposit or withdraw).
- **Identity:** a distinct object reference, even when two objects contain equal data.

## Class and object
A **class** is a blueprint defining the fields and methods its objects can have. An **object** is a runtime instance of that class.

```java
class Car {
    String model;
    void start() {
        System.out.println(model + " started");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();       // create an object
        car.model = "City";
        car.start();
    }
}
```

`new Car()` creates an object. `car` is a reference variable that refers to it.

## Fields, methods, and access
- Instance fields belong to each object.
- Static fields belong to the class and are shared.
- Instance methods can use the current object's state.
- Static methods are called using the class name and cannot directly access instance fields.

## Why use OOPS?
- Models domain concepts naturally.
- Separates responsibilities into manageable units.
- Supports reuse and extension.
- Makes large codebases easier to test and maintain when responsibilities are designed well.

## Important distinction
OOPS does not automatically make software maintainable. Poorly designed classes, excessive inheritance, and tightly coupled objects can make a system harder to change. Good design requires cohesion, clear responsibilities, and controlled dependencies.

## Real-world mapping
A `BankAccount` object may hold an account number and balance. Its methods may deposit, withdraw, and report the balance. The class defines the rules; each account object holds its own state.
