# 5. Abstraction
 
## Definition
Abstraction exposes the essential operations of a component while hiding the details of how those operations are carried out.

In Java, abstraction is commonly expressed with **interfaces** and **abstract classes**.

## Interface
An interface defines a contract that implementing classes agree to provide. A class can implement multiple interfaces.

```java
interface PaymentMethod {
    void pay(double amount);
}

class UpiPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using card");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        PaymentMethod method = new UpiPayment();
        method.pay(500);
    }
}
```

Interface methods declared without `private`, `static`, or `default` are implicitly `public abstract`. Interfaces can also contain default, static, and private methods.

## Abstract class
An abstract class cannot be instantiated directly. It can contain abstract methods (without a body), implemented methods, fields, and constructors.

```java
abstract class Shape {
    abstract double area();

    void describe() {
        System.out.println("I am a shape");
    }
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
```

## Interface vs abstract class

| Interface | Abstract class |
|---|---|
| Defines a capability/contract | Can share state and common implementation |
| A class can implement multiple interfaces | A class can extend only one class |
| No ordinary instance constructors | Can have constructors |
| Fields are implicitly `public static final` | Can have instance fields with varied access |
| Useful for loosely coupled APIs | Useful for closely related classes sharing state/behavior |

## When should you use which?
- Use an interface when different types need to provide the same capability.
- Use an abstract class when related subclasses share meaningful state or implementation.
- Avoid abstraction for its own sake; keep contracts small and understandable.
