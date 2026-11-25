# Design Patterns in Java

## 1. What are Design Patterns?

Design patterns are reusable solutions to commonly occurring software design problems.

They provide standard approaches to designing flexible, maintainable, and reusable software.

## 2. Types of Design Patterns

### A. Creational Design Patterns

These patterns deal with object creation.

1. **Singleton Pattern:** Ensures that a class has only one instance.
2. **Factory Pattern:** Creates objects without exposing the object-creation logic.
3. **Builder Pattern:** Constructs complex objects step by step.

### B. Structural Design Patterns

These patterns deal with the organization and relationships between classes and objects.

1. **Adapter Pattern:** Allows incompatible interfaces to work together.
2. **Decorator Pattern:** Adds new functionality to an object without changing its original structure.
3. **Facade Pattern:** Provides a simplified interface to a complex subsystem.

### C. Behavioral Design Patterns

These patterns deal with communication and responsibility between objects.

1. **Observer Pattern:** Notifies dependent objects when an object's state changes.
2. **Strategy Pattern:** Allows different algorithms to be selected at runtime.
3. **Template Method Pattern:** Defines the steps of an algorithm while allowing subclasses to customize certain steps.

## 3. Simple Java Example: Singleton Pattern

```java
class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Database Connected");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 =
            DatabaseConnection.getInstance();

        DatabaseConnection db2 =
            DatabaseConnection.getInstance();

        System.out.println(db1 == db2);
    }
}
```

**Output:**
```text
Database Connected
true
```

Both variables refer to the same object.

*Note: This is a basic lazy Singleton example. It is not thread-safe.*

## 4. Why are Design Patterns Important?

- Encourage reusable solutions.
- Improve code maintainability.
- Reduce repeated design effort.
- Improve communication among developers.
- Make software easier to extend.

## 5. Learning Goal

Understand when and how to apply design patterns in real-world Java applications.
