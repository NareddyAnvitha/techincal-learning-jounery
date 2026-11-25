# 7. Dependency Inversion Principle (DIP)

## Definition
High-level policy should not depend directly on low-level implementation details. Both should depend on abstractions. Abstractions should not depend on details; details should implement abstractions.

## Example
An order service should express the policy “send a notification” rather than directly constructing a specific email provider.

```java
interface NotificationSender {
    void send(String recipient, String message);
}

class EmailNotificationSender implements NotificationSender {
    public void send(String recipient, String message) {
        System.out.println("Email to " + recipient + ": " + message);
    }
}

class OrderService {
    private final NotificationSender notificationSender;

    OrderService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    void placeOrder(String customerEmail) {
        // Order placement logic would be performed here.
        notificationSender.send(customerEmail, "Your order was placed.");
    }
}

public class DipDemo {
    public static void main(String[] args) {
        NotificationSender sender = new EmailNotificationSender();
        OrderService service = new OrderService(sender);
        service.placeOrder("customer@example.com");
    }
}
```

`OrderService` receives its dependency from outside (constructor injection). It does not create the concrete email sender itself.

## Benefits
- Easier unit testing with a fake implementation.
- Implementations can be replaced.
- High-level business logic is less coupled to infrastructure.

## DIP vs Dependency Injection
- **DIP** is a design principle about the direction of dependencies.
- **Dependency Injection (DI)** is a technique for supplying an object's dependencies.
- A DI framework is optional; constructor injection can be done with plain Java.
