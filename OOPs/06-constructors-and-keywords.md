# 6. Constructors and Important Java Keywords 

## Constructors
A constructor initializes a new object. It has the same name as the class and no return type.

### No-argument constructor

```java
class Book {
    String title;

    Book() {
        title = "Untitled";
    }
}
```

### Parameterized constructor

```java
class Book {
    private final String title;

    Book(String title) {
        this.title = title;
    }
}
```

### Constructor overloading
A class can define multiple constructors with different parameter lists. Constructor chaining uses `this(...)` to call another constructor in the same class. The call must be the first constructor statement.

If no constructor is declared, the compiler supplies a default no-argument constructor. Once any constructor is declared, that automatic constructor is not supplied.

## `this`
Refers to the current object. Common uses include distinguishing fields from parameters (`this.name = name`) and chaining constructors (`this(...)`).

## `static`
A static member belongs to the class rather than to each instance. Static methods cannot directly access instance members because they have no current object (`this`).

## `final`
- final variable: can be assigned once.
- final method: cannot be overridden.
- final class: cannot be subclassed.

A final reference cannot point to a different object, but the referenced object's mutable state may still change.

## Access modifiers

| Modifier | Same class | Same package | Subclass in another package | Other packages |
|---|---:|---:|---:|---:|
| `private` | Yes | No | No (not directly) | No |
| package-private (no keyword) | Yes | Yes | No | No |
| `protected` | Yes | Yes | Yes, subject to protected-access rules | No |
| `public` | Yes | Yes | Yes | Yes |

## `==` vs `equals()`
For object references, `==` checks whether two references point to the same object. `equals()` checks logical equality when the class implements it appropriately. For strings, use `equals()` to compare content.
