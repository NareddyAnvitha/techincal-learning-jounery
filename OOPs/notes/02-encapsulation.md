# 2. Encapsulation

## Definition 
Encapsulation bundles data and the methods that operate on it inside a class, while controlling how callers access or modify that data.

In Java, it is commonly implemented using:
- `private` fields
- public or package-private methods that enforce valid operations
- constructors that establish valid initial state

## Why is it useful?
1. Prevents callers from putting an object into an invalid state.
2. Keeps validation rules in one place.
3. Allows internal implementation to change without changing callers.
4. Makes the class's public API explicit.

## Example: Bank account

```java
class BankAccount {
    private double balance;

    public BankAccount(double openingBalance) {
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative");
        }
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println(account.getBalance()); // 1300.0
    }
}
```

The caller cannot execute `account.balance = -500` because `balance` is private. All changes must follow the class's rules.

## Getter and setter: use thoughtfully
A getter reads a value. A setter changes it. Do not create setters for every field automatically: if a value should not change after construction, omit its setter. Prefer meaningful operations such as `deposit()` over a generic `setBalance()`.

## Common interview question
**Is encapsulation the same as data hiding?**

Not exactly. Data hiding is restricting direct access to implementation details. Encapsulation is the broader practice of bundling state and behavior and providing a controlled interface. Data hiding is one technique used to achieve encapsulation.
