
class Calculator {

    // Same method name with two integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // Same method name with three integer parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Same method name with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10, 20, 30));
        System.out.println(calc.add(5.5, 4.5));
    }
}
