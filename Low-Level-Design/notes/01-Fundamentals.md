# LLD Fundamentals

## 1. What is Low-Level Design?

Low-Level Design (LLD) describes the detailed internal design of a software system. It explains how the system's components are organized and how they interact with each other.

It focuses on classes, objects, methods, interfaces, and relationships.

## 2. LLD vs HLD

| High-Level Design (HLD) | Low-Level Design (LLD) |
|---|---|
| Describes overall system architecture | Describes internal component design |
| Focuses on major modules | Focuses on classes and methods |
| Explains what components are needed | Explains how components work |
| Includes architecture diagrams | Includes class and sequence diagrams |

## 3. Important Building Blocks

- **Class:** A blueprint used to create objects.
- **Object:** An instance of a class.
- **Method:** A function defined inside a class.
- **Attribute:** A variable that represents an object's data.
- **Interface:** Defines a contract that implementing classes must follow.
- **Relationship:** Describes how classes are connected.

## 4. Example in Java

```java
class Car {
    String brand;

    void start() {
        System.out.println(brand + " is starting");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.start();
    }
}
```

**Explanation:**
- `Car` is a class.
- `car` is an object.
- `brand` is an attribute.
- `start()` is a method.

## 5. Important LLD Concepts

1. Abstraction
2. Encapsulation
3. Inheritance
4. Polymorphism
5. Composition
6. Aggregation
7. Association
8. Coupling and cohesion

## 6. What is Coupling?

Coupling refers to the level of dependency between different classes or modules.

- **Tight coupling:** Classes depend heavily on each other.
- **Loose coupling:** Classes have fewer dependencies and are easier to modify independently.

Good software design generally aims for loose coupling.

## 7. What is Cohesion?

Cohesion describes how closely related the responsibilities of a class or module are.

- **High cohesion:** A class focuses on one clear responsibility.
- **Low cohesion:** A class handles unrelated responsibilities.

Good software design aims for high cohesion.

## 8. Key Takeaway

LLD helps developers convert requirements into practical code structures using classes, objects, interfaces, relationships, and design principles.
