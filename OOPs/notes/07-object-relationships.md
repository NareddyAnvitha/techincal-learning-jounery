# 7. Object Relationships and Composition

Object-oriented systems use relationships to describe how objects collaborate.

## Association 
A general relationship where one object knows about or uses another. Example: a `Teacher` teaches a `Student`. Either object may exist independently.

## Aggregation
A weak whole-part relationship. The part can exist independently of the whole. Example: a `Department` has `Professor` objects; a professor may continue to exist if the department is reorganized.

## Composition
A strong ownership/lifecycle relationship. The part is conceptually owned by the whole and is not normally shared independently. Example: an `Order` contains `OrderLine` items that belong to that order.

These terms describe design intent; Java does not have special aggregation or composition keywords.

## Example: composition

```java
import java.util.ArrayList;
import java.util.List;

class OrderLine {
    private final String product;
    private final int quantity;

    OrderLine(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return product + " x " + quantity;
    }
}

class Order {
    private final List<OrderLine> lines = new ArrayList<>();

    public void addItem(String product, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }
        lines.add(new OrderLine(product, quantity));
    }

    public void printItems() {
        lines.forEach(System.out::println);
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem("Notebook", 2);
        order.addItem("Pen", 5);
        order.printItems();
    }
}
```

`Order` creates and owns its `OrderLine` objects in this example.

## Composition over inheritance
Prefer composition when a class needs to use another object's capability without claiming to be that type. Composition often makes behavior easier to replace and test.

## Quick comparison

| Relationship | Meaning | Example |
|---|---|---|
| Association | Uses/knows | Doctor — Patient |
| Aggregation | Has-a, independent part | Team — Player |
| Composition | Owns part/lifecycle | House — Room (in a simplified model) |
| Inheritance | Is-a subtype | Dog extends Animal |
