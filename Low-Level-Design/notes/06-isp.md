# 6. Interface Segregation Principle (ISP)

## Definition
Clients should not be forced to depend on methods they do not use. Prefer several focused interfaces over one large interface that combines unrelated capabilities.

## Violation
A single `Machine` interface with `print()`, `scan()`, and `fax()` forces a basic printer to implement scanning and faxing methods it cannot support.

## Improved Java example

```java
interface Printer {
    void print(String document);
}

interface Scanner {
    void scan(String document);
}

class BasicPrinter implements Printer {
    public void print(String document) {
        System.out.println("Printing: " + document);
    }
}

class MultiFunctionPrinter implements Printer, Scanner {
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }
}
```

## Benefits
- Implementations only support relevant operations.
- Smaller interfaces are easier to understand.
- Changes to unrelated capabilities affect fewer clients.

## Caution
Do not create dozens of tiny interfaces without a meaningful client boundary. Group methods that belong together from the perspective of their users.
