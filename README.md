# Dog-Sitting Camp Management System

Object-Oriented Design (OOD) project implementing SOLID principles, composition, inheritance, encapsulation, and the Command Pattern in Java.

## Features
- **Composition**: A `Camp` strictly contains 3 distinct `PlayArea` instances.
- **Inheritance & Encapsulation**: `Dog` base class with immutable `id` and positive `age` validation, extended by `HerdingDog` and `PamperedDog`.
- **Command Pattern (OCP)**: Extensible staff actions (`FeedCommand`, `TransferCommand`) executed via an invoker method in `Camp`.
