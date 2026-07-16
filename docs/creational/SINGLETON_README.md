# Singleton Design Pattern

**Category:** Creational Design Pattern\
**Difficulty:** ⭐☆☆☆☆ (Beginner)\
**Prerequisites:** Classes & Objects, Constructors, Access Modifiers,
Static Members, OOP Basics\
**Used In:** Android, Spring Boot, Logging, Configuration Management,
Caching

------------------------------------------------------------------------

# 1. 📖 Overview

The **Singleton Pattern** ensures that a class has **only one instance**
throughout the application's lifecycle while providing a **global point
of access** to that instance.

It is commonly used for shared resources that should exist only once,
such as loggers, configuration managers, caches, and database instances.

------------------------------------------------------------------------

# 2. 🎯 Problem Statement

Consider an application where multiple modules need access to the same
logger.

Without Singleton:

-   Authentication creates Logger A
-   Payment creates Logger B
-   Notification creates Logger C

Multiple instances waste memory and may lead to inconsistent application
state.

Singleton guarantees that every module uses the same shared object.

------------------------------------------------------------------------

# 3. 💡 Why this Pattern?

Without Singleton, every consumer creates its own object.

``` text
Authentication → Logger()
Payment        → Logger()
Notification   → Logger()
```

With Singleton:

``` text
Authentication ─┐
Payment ────────┼──► Logger
Notification ───┘
```

Benefits:

-   One shared object
-   Better resource utilization
-   Consistent state
-   Centralized lifecycle management

------------------------------------------------------------------------

# 4. 🏗️ UML Diagram

``` mermaid
classDiagram

class Singleton{
    - instance : Singleton
    - Singleton()
    + getInstance() Singleton
}

class Client

Client --> Singleton : getInstance()
Singleton --> Singleton : returns same instance
```

------------------------------------------------------------------------

# 5. 👥 Participants

  Participant     Responsibility
  --------------- --------------------------------------------
  **Singleton**   Creates and maintains the single instance.
  **Client**      Requests and uses the Singleton instance.

------------------------------------------------------------------------

# 6. 💻 Implementation Walkthrough

In this project:

-   The constructor is declared **private**, preventing external object
    creation.
-   A single instance is stored internally.
-   `getInstance()` creates the object only once.
-   Subsequent calls return the already created instance.

Example:

``` kotlin
val first = Singleton.getInstance()
val second = Singleton.getInstance()

println(first === second)
```

Output:

``` text
true
```

This proves both references point to the same object.

------------------------------------------------------------------------

# 7. 🔄 Execution Flow

``` text
Application Starts
        │
        ▼
Client calls getInstance()
        │
        ▼
Is instance available?
      │
  No  │  Yes
      ▼
Create Instance
      │
      ▼
Return Instance
      │
      ▼
Future requests return the same object
```

------------------------------------------------------------------------

# 8. ✅ Advantages

-   Ensures only one object exists.
-   Reduces memory consumption.
-   Centralized object management.
-   Provides global access.
-   Supports lazy initialization.
-   Can be implemented as thread-safe.

------------------------------------------------------------------------

# 9. ❌ Disadvantages

-   Introduces global state.
-   Harder to unit test.
-   Hidden dependencies.
-   Can become an anti-pattern if overused.
-   Difficult to mock without dependency injection.

------------------------------------------------------------------------

# 10. ✅ When to Use

Use Singleton when:

-   Only one instance should exist.
-   Managing shared resources.
-   Creating application-wide configuration.
-   Implementing logging or caching.
-   Managing database connections.

------------------------------------------------------------------------

# 11. 🚫 When NOT to Use

Avoid Singleton when:

-   Every request requires a new object.
-   Dependency Injection manages object lifecycle.
-   Multiple independent instances are needed.
-   The class contains request-specific state.

------------------------------------------------------------------------

# 12. 🌍 Real World Examples

-   Company CEO
-   Printer Spooler
-   Application Logger
-   Configuration Manager
-   Cache Manager
-   Runtime Environment

------------------------------------------------------------------------

# 13. 📱 Android Examples

Common Android Singleton implementations:

-   `Retrofit` client
-   `Room` database instance
-   `FirebaseAuth.getInstance()`
-   `WorkManager.getInstance()`
-   `@Singleton` dependencies in Hilt/Dagger

------------------------------------------------------------------------

# 14. 🎤 Interview Questions

1.  What problem does the Singleton Pattern solve?
2.  Why is the constructor private?
3.  How do you make a Singleton thread-safe?
4.  What is the difference between Kotlin `object` and a manual
    Singleton?
5.  When should Dependency Injection be preferred over Singleton?

------------------------------------------------------------------------

# 15. 📖 Key Takeaways

-   Singleton is a **Creational Design Pattern**.
-   Guarantees a single object throughout the application's lifecycle.
-   Provides a global access point.
-   Best suited for shared resources.
-   Avoid overusing Singleton; prefer Dependency Injection for managing
    object lifecycles in large applications.
