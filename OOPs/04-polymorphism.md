# 4. Polymorphism

## Definition
Polymorphism means that the same operation or parent-type reference can produce different behavior depending on the types and implementations involved.

Java commonly demonstrates two forms:

## A. Compile-time polymorphism (method overloading)
Methods share a name but have different parameter lists. The compiler selects the matching overload.

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

Changing only the return type is not sufficient to overload a method.

## B. Runtime polymorphism (method overriding)
A subclass provides its own implementation of an inherited instance method. The implementation is selected at runtime based on the actual object type.

```java
class Notification {
    void send() {
        System.out.println("Sending a generic notification");
    }
}

class EmailNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending an email");
    }
}

class SmsNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending an SMS");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Notification notification = new EmailNotification();
        notification.send(); // Sending an email

        notification = new SmsNotification();
        notification.send(); // Sending an SMS
    }
}
```

## Overloading vs overriding

| Feature | Overloading | Overriding |
|---|---|---|
| Parameters | Must differ | Same signature (subject to Java rules) |
| Relationship | Can occur in one class | Requires inheritance/subtyping |
| Selection | Compile time | Runtime for instance methods |
| Return type | May differ if parameter list differs, subject to compatibility | Same or covariant return type |
| Purpose | Convenient variations | Specialized subtype behavior |

## Important notes
- Static methods are hidden, not overridden.
- Private methods are not inherited and therefore are not overridden.
- `final` methods cannot be overridden.
- Fields are not polymorphic; field access is determined by the reference's declared type.
- Use `@Override` so the compiler can catch signature mistakes.
