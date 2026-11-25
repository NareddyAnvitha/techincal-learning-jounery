# 4. Open-Closed Principle (OCP)

## Definition
Software entities should be open for extension but closed for modification. In practice, stable code should allow new behavior to be added with limited changes to existing, tested logic.

## Violation
A checkout method with a growing `if/else` chain for every payment type must be edited whenever a new method is introduced.

## Improved Java example

```java
interface PaymentMethod {
    void pay(double amount);
}

class UpiPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("UPI payment: " + amount);
    }
}

class CardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Card payment: " + amount);
    }
}

class Checkout {
    void completePayment(PaymentMethod method, double amount) {
        method.pay(amount);
    }
}

public class OcpDemo {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        checkout.completePayment(new UpiPayment(), 750);
        checkout.completePayment(new CardPayment(), 1200);
    }
}
```

To add another payment method, create another implementation of `PaymentMethod`; `Checkout` does not need a new conditional branch.

## Benefits
- New behavior can be added with less risk to existing code.
- Implementations can be tested independently.
- Callers depend on a stable contract.

## Trade-off
An abstraction has a cost. Do not create an interface for every class in anticipation of imaginary future changes. Introduce extension points where variation is real or reasonably expected.
