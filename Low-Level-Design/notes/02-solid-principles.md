# 2. SOLID Principles

SOLID is a set of five object-oriented design principles that help make software easier to understand, extend, and maintain.

| Letter | Principle | Short meaning |
|---|---|---|
| S | Single Responsibility | A class should have one focused reason to change |
| O | Open-Closed | Extend behavior without repeatedly modifying stable code |
| L | Liskov Substitution | Subtypes should safely substitute for their base types |
| I | Interface Segregation | Prefer focused interfaces over large, forced contracts |
| D | Dependency Inversion | High-level policy should depend on abstractions |

## Why SOLID?
SOLID helps reduce tight coupling and makes changes more localized. It is guidance, not a checklist that must be applied mechanically. A tiny program may not need extra interfaces or layers.

## A practical way to apply SOLID
1. Identify what changes and why.
2. Keep responsibilities cohesive.
3. Define small contracts around required behavior.
4. Depend on abstractions at important boundaries.
5. Ensure implementations honor the promises of their interfaces.
6. Add complexity only when it solves a real change or testing problem.

Read each principle's dedicated file for a Java example and common violation.
