
interface Discount {
    double applyDiscount(double price);
}

class FestivalDiscount implements Discount {
    public double applyDiscount(double price) {
        return price * 0.80;
    }
}

class StudentDiscount implements Discount {
    public double applyDiscount(double price) {
        return price * 0.90;
    }
}

class PriceCalculator {
    double calculate(double price, Discount discount) {
        return discount.applyDiscount(price);
    }
}

public class OCPExample {
    public static void main(String[] args) {

        PriceCalculator calculator = new PriceCalculator();

        Discount festival = new FestivalDiscount();
        Discount student = new StudentDiscount();

        System.out.println(
            calculator.calculate(1000, festival)
        );

        System.out.println(
            calculator.calculate(1000, student)
        );
    }
}
