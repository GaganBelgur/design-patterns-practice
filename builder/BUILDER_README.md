# Builder Pattern 🏗️

A creational design pattern that allows you to construct complex objects step by step. It separates the construction of an object from its representation, so the same construction process can create different representations.

---

## 📌 What is the Builder Pattern?

The Builder Pattern provides a way to construct complex objects without having to manage multiple constructors or long parameter lists. Instead of passing all parameters at once, you build the object step by step using a fluent interface.

**Key Principle:** Separate object construction from its representation.

---

## 🤔 When to Use It?

- **Complex Objects:** Objects have many fields, especially optional ones
- **Avoid Telescoping Constructors:** Multiple constructors with different parameter combinations are messy
- **Fluent API:** You want readable, step-by-step object creation
- **Immutability:** You want the final object to be immutable and thread-safe
- **Optional Parameters:** Some fields are optional while others are required

---

## ✅ Why Use the Builder Pattern?

| Benefit | Description |
|---------|-------------|
| **Readability** | Clear, self-documenting code for complex objects |
| **Flexibility** | Handle optional parameters without multiple constructors |
| **Validation** | Apply logic and constraints during construction |
| **Immutability** | Final object is immutable and safe for concurrent use |
| **Maintainability** | Easy to add new fields without breaking existing code |

---

## 📖 How It Works

### Step-by-Step Implementation

#### Step 1: Define the Main Class (Immutable)
```kotlin
class Profile private constructor(builder: ProfileBuilder) {
    val name: String = builder.name
    val phone: String = builder.phone
    val email: String = builder.email
    val birthDay: String = builder.birthDay
    
    override fun toString(): String {
        return "Profile(name='$name', phone='$phone', email='$email', birthDay='$birthDay')"
    }
}
```
**Key Points:**
- Constructor is `private` to prevent direct instantiation
- All fields are `val` (immutable) in Kotlin
- Only accepts the Builder instance

---

#### Step 2: Define the Inner Builder Class
```kotlin
class ProfileBuilder {
    var name: String = ""
        private set
    var phone: String = ""
        private set
    var email: String = ""
        private set
    var birthDay: String = ""
        private set
    
    // Setter methods that return 'this' for method chaining
    fun setName(name: String): ProfileBuilder {
        this.name = name
        return this
    }
    
    fun setPhone(phone: String) = apply {
        this.phone = phone
    }
    
    fun setEmail(email: String) = apply {
        this.email = email
    }
    
    fun setBirthday(birthDay: String) = apply {
        this.birthDay = birthDay
    }
    
    fun build() = Profile(this)
}
```
**Key Points:**
- Builder class has all the same fields as the main class
- Variables are `private set` to enforce controlled modification
- Setter methods return `this` or use `apply { }` for method chaining
- `build()` method creates and returns the final immutable object

---

#### Step 3: Use the Builder
**Kotlin:**
```kotlin
val profile = Profile.ProfileBuilder()
    .setName("John Doe")
    .setPhone("123-456-7890")
    .setEmail("john@example.com")
    .setBirthday("1990-01-15")
    .build()

println(profile)
// Output: Profile(name='John Doe', phone='123-456-7890', email='john@example.com', birthDay='1990-01-15')
```

**Java:**
```java
ProfileJava profile = new ProfileJava.ProfileBuilder("John Doe", "123-456-7890")
    .setEmail("john@example.com")
    .setBirthDate("1990-01-15")
    .build();

System.out.println(profile);
// Output: Profile [name = John Doe, phone = 123-456-7890, email = john@example.com, birthDate = 1990-01-15]
```

---

## 🔄 Implementation Details

### Kotlin Implementation (`Profile.kt`)
```kotlin
class Profile private constructor(builder: ProfileBuilder) {
    val name: String = builder.name
    val phone: String = builder.phone
    val email: String = builder.email
    val birthDay: String = builder.birthDay

    class ProfileBuilder {
        var name: String = ""
            private set
        var phone: String = ""
            private set
        var email: String = ""
            private set
        var birthDay: String = ""
            private set

        fun setName(name: String): ProfileBuilder {
            this.name = name
            return this
        }

        fun setPhone(phone: String) = apply {
            this.phone = phone
        }

        fun setEmail(email: String) = apply {
            this.email = email
        }

        fun setBirthday(birthDay: String) = apply {
            this.birthDay = birthDay
        }

        fun build() = Profile(this)
    }

    override fun toString(): String {
        return "Profile(name='$name', phone='$phone', email='$email', birthDay='$birthDay')"
    }
}
```

**Key Kotlin Features:**
- `private set` restricts external modification of builder properties
- `apply { }` scoping function for cleaner chaining
- Method chaining with `return this`

---

### Java Implementation (`ProfileJava.java`)
```java
public class ProfileJava {
    private final String name;
    private final String phone;
    private final String birthDate;
    private final String email;

    private ProfileJava(ProfileBuilder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.birthDate = builder.birthDate;
        this.email = builder.email;
    }

    public static class ProfileBuilder {
        private final String name;
        private final String phone;
        private String birthDate;
        private String email;

        public ProfileBuilder(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public ProfileBuilder setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public ProfileBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public ProfileJava build() {
            return new ProfileJava(this);
        }
    }

    @Override
    public String toString() {
        return "Profile [name = " + name + ", phone = " + phone + ", email = " + email + ", birthDate = " + birthDate + "]";
    }
}
```

**Key Java Features:**
- `private final` fields for immutability
- Constructor is `private` to prevent direct instantiation
- Static inner class pattern
- Mandatory parameters in builder constructor
- Optional parameters as setter methods

---

## 🎯 Parameter Classification

| Parameter | How to Handle | Example |
|-----------|---------------|---------|
| **Mandatory** | Include in Builder constructor | `name`, `phone` (Java) |
| **Optional** | Setter methods with chaining | `email`, `birthDate` |
| **Defaults** | Initialize with default values | `"" or null` |

---

## 💡 Usage Patterns

### Pattern 1: All Optional Parameters
```kotlin
val profile = Profile.ProfileBuilder()
    .setName("Alice")
    .setPhone("555-1234")
    .build()
```

### Pattern 2: Method Chaining with `apply`
```kotlin
val profile = Profile.ProfileBuilder().apply {
    setName("Bob")
    setPhone("555-5678")
    setEmail("bob@example.com")
}.build()
```

### Pattern 3: Reusing Builder
```kotlin
val baseBuilder = Profile.ProfileBuilder()
    .setName("Charlie")
    .setPhone("555-9999")

val profile1 = baseBuilder.setEmail("charlie@example.com").build()
val profile2 = baseBuilder.setEmail("charlie2@example.com").build()
```

---

## 🔒 Immutability & Thread Safety

The Builder Pattern ensures:

1. **Immutable Objects:** Once built, the Profile object cannot be changed
   ```kotlin
   profile.name = "newName"  // ❌ Compile Error
   ```

2. **Thread-Safe:** Multiple threads can safely use the same Profile object
   ```kotlin
   // Safe for concurrent use - no synchronization needed
   executorService.submit(() -> println(profile))
   ```

3. **Safe Construction:** Builder can be modified without affecting the final object
   ```kotlin
   val builder = Profile.ProfileBuilder()
   val profile1 = builder.setName("A").build()
   val profile2 = builder.setName("B").build()  // Different profiles
   ```

---

## 🚀 Real-World Examples

### Example 1: Kotlin with Fluent Interface
```kotlin
fun main() {
    val profile = Profile.ProfileBuilder()
        .setName("John Doe")
        .setPhone("+1-234-567-8900")
        .setEmail("john.doe@example.com")
        .setBirthday("1985-06-15")
        .build()
    
    println(profile)
}
```

### Example 2: Java with Mandatory + Optional
```java
public class Main {
    public static void main(String[] args) {
        ProfileJava profile = new ProfileJava.ProfileBuilder("John Doe", "123-456-7890")
            .setEmail("john@example.com")
            .setBirthDate("1990-01-15")
            .build();
        
        System.out.println(profile);
    }
}
```

---

## 📊 Comparison: Traditional Constructor vs Builder

| Aspect | Traditional Constructor | Builder Pattern |
|--------|-------------------------|-----------------|
| **Code Readability** | `new Profile("John", "123", "john@email.com", "1990-01-15")` - unclear | `builder.setName("John").setPhone("123")...` - clear |
| **Optional Parameters** | Multiple constructors (telescoping) | Single setter method |
| **Maintainability** | Difficult to add new fields | Easy to extend |
| **Immutability** | May be compromised | Guaranteed |
| **Validation** | Constructor only | Constructor + setters |

---

## ⚠️ Potential Pitfalls

1. **Over-Engineering:** Don't use Builder for simple objects with only 2-3 fields
2. **Thread Safety of Builder:** Builder itself is not thread-safe; don't share one across threads
3. **Null Handling:** Decide how to handle null values (validation or default)
4. **Complexity:** Builder adds extra code; ensure it's justified

---

## 🔍 When NOT to Use Builder

- Simple objects with few immutable fields
- Objects with no optional parameters
- Performance-critical code where object creation overhead matters
- Builders that are rarely reused

---

## 📚 Key Takeaways

| Point | Details |
|-------|---------|
| **Mandatory Parameters** | Include in Builder constructor (Java approach) or initialize with defaults (Kotlin) |
| **Optional Parameters** | Use setter methods that return `this` for method chaining |
| **Immutable Objects** | Make final object fields immutable (`final` in Java, `val` in Kotlin) |
| **Private Constructor** | Main class constructor must be private |
| **Thread-Safe** | Final object is thread-safe; builder should not be shared across threads |
| **Method Chaining** | Each setter returns the builder instance for fluent interface |

---

## 🌐 Related Patterns

- **Abstract Factory:** Similar concept but focuses on family of objects
- **Factory Method:** Simpler alternative for creating objects
- **Prototype:** Another creational pattern for object creation

---

## 📖 Design Pattern Principles Applied

✅ **Open/Closed Principle:** Easy to extend with new fields  
✅ **Single Responsibility:** Builder handles construction logic  
✅ **Dependency Inversion:** Client depends on clean interface, not internal representation  

---

## 🎓 Interview Tips

1. **When to use?** Complex objects with many optional fields
2. **Advantage?** Readable, maintainable, immutable, thread-safe
3. **Disadvantage?** Extra boilerplate code for simple objects
4. **vs Factory?** Factory creates whole families; Builder constructs step-by-step
5. **Real example?** StringBuilder in Java, UI component builders in Android

---

## 📝 Summary

The Builder Pattern is ideal for creating complex, immutable objects with optional parameters. It replaces unwieldy constructors with a fluent, readable API while maintaining immutability and thread-safety. Use it when your objects have multiple optional fields or when you want to separate construction logic from the object itself.
