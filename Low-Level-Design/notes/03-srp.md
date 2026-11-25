# 3. Single Responsibility Principle (SRP)

## Definition
A class should have one responsibility, or more precisely, one cohesive reason to change. The principle is about grouping behavior that changes for the same reason—not forcing every method into a separate class.

## Violation example
Imagine an `Invoice` class that calculates totals, prints invoices, and saves them to a database. Pricing rules, print formatting, and database storage change for different reasons.

## Improved design

```java
class Invoice {
    private final double amount;

    Invoice(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
        this.amount = amount;
    }

    double total() {
        return amount;
    }
}

class InvoicePrinter {
    void print(Invoice invoice) {
        System.out.println("Invoice total: " + invoice.total());
    }
}

interface InvoiceRepository {
    void save(Invoice invoice);
}
```

The invoice models invoice data and calculation. Printing and persistence have separate collaborators.

## Benefits
- Changes are more localized.
- Classes are easier to understand and test.
- Reuse becomes more practical.
- Fewer unrelated reasons to edit the same class.

## Interview example
A `UserService` that validates users, sends emails, generates reports, and writes SQL directly likely has too many responsibilities. Separate cohesive responsibilities while keeping orchestration in the service.

## Caution
Do not split every method into its own class. A class should represent a meaningful, cohesive responsibility.
