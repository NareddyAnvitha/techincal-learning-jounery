
interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card");
    }
}

class UpiPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}

class PaymentContext {
    private PaymentStrategy strategy;

    PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    void makePayment(double amount) {
        strategy.pay(amount);
    }
}

public class StrategyExample {
    public static void main(String[] args) {

        PaymentContext payment1 =
            new PaymentContext(new CreditCardPayment());

        PaymentContext payment2 =
            new PaymentContext(new UpiPayment());

        payment1.makePayment(1000);
        payment2.makePayment(500);
    }
}
