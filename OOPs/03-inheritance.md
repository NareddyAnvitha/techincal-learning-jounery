# 3. Inheritance

## Definition
Inheritance allows a class (subclass/child) to derive accessible fields and methods from another class (superclass/parent). In Java, a class uses `extends`.

It represents an **is-a** relationship: a `Dog` is an `Animal`.

## Example

```java
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // inherited method
        dog.bark();
    }
}
```

## Common forms

| Form | Meaning | Java support |
|---|---|---|
| Single | One child extends one parent | Yes |
| Multilevel | A class extends a class that extends another | Yes |
| Hierarchical | Multiple children extend one parent | Yes |
| Multiple class inheritance | One class extends multiple classes | No |
| Hybrid | Combination of inheritance forms | Achievable with interfaces, not multiple class inheritance |

### Multilevel example

```java
class LivingThing {
    void grow() { System.out.println("Growing"); }
}
class Animal extends LivingThing {
    void move() { System.out.println("Moving"); }
}
class Bird extends Animal {
    void fly() { System.out.println("Flying"); }
}
```

## `super` keyword
`super` refers to the immediate parent-class portion of the current object. It can:
- call a parent constructor using `super(...)`;
- call an overridden parent method using `super.method()`;
- access an accessible parent field using `super.field`.

A call to `super(...)` must be the first statement in a constructor. If omitted, Java inserts a no-argument `super()` when possible.

## Advantages
- Reuses common behavior.
- Supports specialization and runtime polymorphism.
- Can express genuine subtype relationships.

## Risks
- Child classes can become tightly coupled to parent implementation.
- Deep hierarchies are difficult to understand.
- Inheritance can expose behavior that does not make sense for a subtype.

## Prefer composition when appropriate
Use inheritance for a genuine substitutable **is-a** relationship. Use composition for **has-a** relationships or when behavior should be assembled flexibly. For example, a `Car` has an `Engine`; a car should generally contain an engine object rather than extend `Engine`.
