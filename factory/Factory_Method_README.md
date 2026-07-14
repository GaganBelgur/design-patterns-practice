# Factory Method Design Pattern

**Category:** Creational Design Pattern\
**Difficulty:** ⭐⭐☆☆☆ (Beginner--Intermediate)\
**Used In:** Android, Spring Boot, Payment Systems, Notification
Services

------------------------------------------------------------------------

# 📖 Overview

The **Factory Method Pattern** is a **Creational Design Pattern** that
defines an interface for creating objects while allowing subclasses or
concrete factories to decide which object to instantiate.

Instead of creating objects using `new` directly, clients delegate
object creation to a factory.

------------------------------------------------------------------------

# 🎯 Problem Statement

Suppose an application supports multiple notification types:

-   Email
-   SMS
-   Push Notification

If the client creates these objects directly using `if-else` or `when`,
the code becomes tightly coupled and difficult to extend.

The Factory Method Pattern moves object creation into a dedicated
factory, keeping the client independent of concrete implementations.

------------------------------------------------------------------------

# 💡 Why Factory Method?

Without Factory Method:

``` text
Client
  ├── EmailNotification()
  ├── SMSNotification()
  └── PushNotification()
```

Whenever a new notification type is added, the client must change.

With Factory Method:

``` text
Client
    │
    ▼
NotificationFactory
    │
 ┌──┴───────────────┐
 ▼                  ▼
Email          SMS / Push
```

The client depends only on the factory and abstraction.

------------------------------------------------------------------------

# 🏗️ UML Diagram

``` mermaid
classDiagram

class Product {
    <<interface>>
    +execute()
}

class ConcreteProductA
class ConcreteProductB

Product <|.. ConcreteProductA
Product <|.. ConcreteProductB

class Factory {
    +createProduct() Product
}

Factory --> Product
```

------------------------------------------------------------------------

# 📦 Class Responsibilities

## Product

Defines the common behavior for all products.

## Concrete Products

Provide specific implementations.

## Factory

Creates and returns the appropriate product.

## Client

Requests a product from the factory without knowing its concrete type.

------------------------------------------------------------------------

# 🔄 Execution Flow

``` text
Client
   │
   ▼
Factory
   │
Choose Product
   │
   ▼
Create Object
   │
   ▼
Return Product
   │
   ▼
Client uses Product
```

------------------------------------------------------------------------

# 💻 Implementation Explanation

In your implementation, the client requests an object from the factory
rather than instantiating the concrete class directly.

The factory determines which implementation to return, keeping the
client loosely coupled and making it easy to introduce new product types
without modifying existing client code.

------------------------------------------------------------------------

# 🌍 Real-world Examples

-   Notification systems
-   Payment gateway selection
-   Vehicle creation
-   Document parsers
-   Database drivers

------------------------------------------------------------------------

# 📱 Android Examples

-   `ViewModelProvider.Factory`
-   `FragmentFactory`
-   `WorkerFactory` in WorkManager
-   Retrofit `CallAdapter.Factory`

These APIs create different implementations while exposing a common
abstraction.

------------------------------------------------------------------------

# ✅ Advantages

-   Loose coupling
-   Easier to extend
-   Supports Open/Closed Principle
-   Centralized object creation
-   Simplifies client code

------------------------------------------------------------------------

# ❌ Disadvantages

-   More classes
-   Slightly higher complexity
-   Overkill for very small projects

------------------------------------------------------------------------

# 🚫 When NOT to use

Avoid Factory Method when:

-   Only one implementation will ever exist.
-   Object creation is trivial.
-   A simple constructor is sufficient.

------------------------------------------------------------------------

# 🎤 Interview Questions

### What problem does Factory Method solve?

It decouples object creation from object usage.

### How is it different from Abstract Factory?

Factory Method creates **one product**, whereas Abstract Factory creates
**a family of related products**.

### Which SOLID principle does it support?

Open/Closed Principle and Dependency Inversion Principle.

------------------------------------------------------------------------

# 🔍 Why this implementation?

Your implementation demonstrates how the client relies only on
abstractions while the factory encapsulates object creation. This makes
adding new implementations straightforward without changing client
logic.

------------------------------------------------------------------------

# 📖 Key Takeaways

-   Factory Method is a **Creational Design Pattern**.
-   Encapsulates object creation.
-   Reduces coupling between client and concrete classes.
-   Makes applications easier to extend and maintain.
