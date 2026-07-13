# Singleton Design Pattern

**Category:** Creational Design Pattern\
**Difficulty:** ⭐☆☆☆☆ (Beginner)\
**Used In:** Android, Spring Boot, Backend Services, Desktop
Applications

------------------------------------------------------------------------

# 📖 Overview

The **Singleton Pattern** is a **Creational Design Pattern** that
ensures a class has **only one instance** throughout the application's
lifecycle while providing a global point of access to that instance.

Instead of creating multiple objects, the application reuses the same
instance whenever it is required.

------------------------------------------------------------------------

# 🎯 Problem Statement

Consider an application where multiple components need access to a
shared resource such as:

-   Database Connection
-   Logger
-   Configuration Manager
-   Cache
-   Thread Pool

If every component creates its own object, it can lead to:

-   Increased memory usage
-   Resource duplication
-   Inconsistent application state
-   Difficult synchronization

The Singleton Pattern solves this by allowing only one object to exist.

------------------------------------------------------------------------

# 💡 Why Singleton?

Imagine a banking application.

Without Singleton:

``` text
Transaction 1 → Logger A
Transaction 2 → Logger B
Transaction 3 → Logger C
```

Each logger maintains its own state.

With Singleton:

``` text
Transaction 1 ─┐
Transaction 2 ─┼──► Logger
Transaction 3 ─┘
```

Only one logger instance exists and is shared.

------------------------------------------------------------------------

# 🏗️ UML Diagram

``` mermaid
classDiagram

class Singleton {
    - instance : Singleton
    - Singleton()
    + getInstance() Singleton
    + showMessage()
}

Singleton --> Singleton : returns same instance
```

------------------------------------------------------------------------

# 📦 Class Responsibilities

## Singleton

-   Prevents object creation using a private constructor.
-   Maintains the single instance.
-   Returns the same instance whenever requested.

## Client

-   Requests the Singleton instance.
-   Never creates the object directly.

------------------------------------------------------------------------

# 🔄 Execution Flow

``` text
Application Starts
        │
        ▼
Client requests Singleton
        │
        ▼
Is instance already created?
       │
 ┌─────┴─────┐
 │           │
 No         Yes
 │           │
 ▼           ▼
Create      Return Existing
Instance     Instance
 │
 ▼
Return Object
```

------------------------------------------------------------------------

# 💻 Implementation Explanation

In this implementation:

-   The constructor is marked as **private**, preventing direct object
    creation.
-   A static instance is maintained internally.
-   The first request creates the object.
-   Every subsequent request returns the same instance.

Example:

``` kotlin
val instance1 = Singleton.getInstance()
val instance2 = Singleton.getInstance()

println(instance1 === instance2)
```

Output:

``` text
true
```

Both variables reference the exact same object.

------------------------------------------------------------------------

# 🌍 Real-world Examples

-   Application Logger
-   Database Connection Pool
-   Configuration Manager
-   Cache Manager
-   Printer Spooler
-   Runtime Environment

------------------------------------------------------------------------

# 📱 Android Examples

### Retrofit Client

``` kotlin
object RetrofitClient {
    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .build()
}
```

### Room Database

A single Room database instance is maintained across the application.

### Repository

A Repository instance is commonly shared among multiple ViewModels.

### Hilt / Dagger

``` kotlin
@Singleton
class UserRepository
```

The Dependency Injection framework creates only one instance.

------------------------------------------------------------------------

# ✅ Advantages

-   Only one object exists.
-   Saves memory.
-   Easy global access.
-   Prevents inconsistent state.
-   Suitable for shared resources.
-   Supports lazy initialization.
-   Can be made thread-safe.

------------------------------------------------------------------------

# ❌ Disadvantages

-   Introduces global state.
-   Harder to unit test.
-   Can violate the Single Responsibility Principle if overused.
-   Hidden dependencies.
-   Difficult to mock.

------------------------------------------------------------------------

# 🚫 When NOT to use

Avoid Singleton when:

-   Each request requires a separate object.
-   Multiple independent instances are needed.
-   Testing requires isolated objects.
-   Dependency Injection already manages object lifecycle.

------------------------------------------------------------------------

# 🎤 Interview Questions

### 1. Why is the constructor private?

To prevent external classes from creating new objects.

### 2. How do you make Singleton thread-safe?

-   synchronized
-   Double Checked Locking
-   Kotlin `object`
-   Lazy initialization

### 3. Why is Kotlin `object` considered a Singleton?

The Kotlin compiler guarantees:

-   Single instance
-   Lazy initialization
-   Thread safety

### 4. Is Singleton always recommended?

No. Modern applications usually prefer Dependency Injection frameworks
like Hilt or Dagger to manage object lifecycles. Singleton should be
used only for genuinely shared resources.

------------------------------------------------------------------------

# 🔍 Why this implementation?

This implementation uses a **private constructor** and a **static
accessor** to demonstrate the core concept of the Singleton pattern in a
language-agnostic way.

Although Kotlin provides the `object` keyword, implementing Singleton
manually helps developers understand:

-   How instance creation is controlled.
-   Why the constructor must be private.
-   How lazy initialization works.
-   How thread safety can be introduced.

Once the concept is understood, Kotlin's `object` declaration becomes
much easier to appreciate.

------------------------------------------------------------------------

# 📖 Key Takeaways

-   Singleton is a **Creational Design Pattern**.
-   Ensures only one instance exists.
-   Provides global access to that instance.
-   Prevents unnecessary object creation.
-   Best suited for shared resources like loggers, caches, repositories,
    and configuration managers.
