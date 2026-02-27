# Unit 3: Class Creation

**AP Exam Weighting: 10-18%** | AP Topics: 3.1-3.9

---

## Conceptual Overview

Unit 3 shifts from *using* objects to *designing* them. Students learn to write their own classes from scratch — defining instance variables, constructors, and methods. Key object-oriented concepts include encapsulation (keeping data private), object references (how variables point to objects in memory), aliasing (multiple variables referencing the same object), static class members, and scope rules. This unit teaches students to think like software designers.

---

## Key Terms

| Term | Definition |
|------|-----------|
| **Class** | A blueprint for creating objects; defines attributes (data) and behaviors (methods) |
| **Object** | A specific instance of a class, created with `new` |
| **Instance variable** | A variable declared in a class that each object has its own copy of |
| **Constructor** | A special method (same name as class) that initializes a new object |
| **Default constructor** | A no-argument constructor (either written or auto-provided by Java) |
| **Overloaded constructor** | Multiple constructors with different parameter lists |
| **Accessor method** | A method that returns instance data without modifying it (getter) |
| **Mutator method** | A method that changes instance data (setter) |
| **Void method** | A method that performs an action but returns nothing |
| **Non-void method** | A method that returns a value |
| **`this` keyword** | Refers to the current object inside an instance method or constructor |
| **Encapsulation** | Keeping instance variables `private` and providing public methods to access them |
| **Object reference** | A variable that stores the memory address of an object, not the object itself |
| **Aliasing** | When two variables point to the same object |
| **`null`** | A reference that points to no object |
| **Static variable** | A variable shared by ALL instances of a class (belongs to the class itself) |
| **Static method** | A method that belongs to the class, not to any individual object |
| **`final`** | A modifier that prevents a variable from being changed after assignment |
| **Scope** | The region of code where a variable is accessible |
| **Shadowing** | When a local variable or parameter has the same name as an instance variable |

---

## Syntax Reference

### Class Anatomy

```java
public class ClassName {

    // --- Instance variables (private) ---
    private String name;
    private int value;

    // --- Static variable (shared by all instances) ---
    private static int count = 0;

    // --- Constructors ---
    public ClassName(String name, int value) {
        this.name = name;      // this.name = instance variable, name = parameter
        this.value = value;
        count++;
    }

    public ClassName() {       // default (no-arg) constructor
        this.name = "Unknown";
        this.value = 0;
        count++;
    }

    // --- Accessor methods (getters) ---
    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    // --- Mutator methods (setters) ---
    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int v) {
        if (v >= 0) {          // validation
            value = v;
        }
    }

    // --- Void instance method ---
    public void increase(int amount) {
        if (amount > 0) {
            value += amount;
        }
    }

    // --- Non-void instance method ---
    public boolean isGreaterThan(ClassName other) {
        return this.value > other.value;
    }

    // --- Static method ---
    public static int getCount() {
        return count;
    }

    // --- toString ---
    public String toString() {
        return name + ": " + value;
    }
}
```

### Creating and Using Objects

```java
ClassName obj1 = new ClassName("Alice", 10);
ClassName obj2 = new ClassName();          // uses default constructor
System.out.println(obj1);                  // calls toString() automatically
System.out.println(obj1.getName());        // calls accessor
obj1.setValue(20);                          // calls mutator
```

### Object References and Aliasing

```java
ClassName a = new ClassName("X", 5);
ClassName b = a;          // b and a point to the SAME object (alias)
b.setValue(99);
System.out.println(a);   // X: 99 — a changed too!

ClassName c = new ClassName("Y", 5);
// c and a are separate objects even if they have the same values
```

### Passing Objects to Methods

```java
// The method receives a COPY of the reference, not a copy of the object
public void transferTo(ClassName other, int amount) {
    if (this.value >= amount) {
        this.value -= amount;
        other.value += amount;  // modifies the ORIGINAL object
    }
}
```

### Static vs Instance

| | Instance | Static |
|---|---|---|
| **Belongs to** | A specific object | The class itself |
| **Access** | `obj.method()` | `ClassName.method()` |
| **Can access** | Instance + static members | Only static members |
| **Keyword** | (none) | `static` |
| **Example** | `getName()` | `getCount()` |

### Scope Rules

```java
public class Example {
    private int x;            // instance scope — accessible in all methods

    public void method(int x) {
        // x here refers to the PARAMETER (shadows instance variable)
        // use this.x to access the instance variable
        this.x = x;

        int y = 10;           // local scope — only accessible inside this method
    }

    public void other() {
        // x is accessible here (instance variable)
        // y is NOT accessible here (local to method above)
    }
}
```

---

## Design Patterns

### Validation in Setters

```java
public void setGrade(int g) {
    if (g >= 0 && g <= 100) {
        grade = g;
    }
}
```

### Auto-Incrementing ID

```java
private static int nextId = 1;
private int id;

public MyClass() {
    id = nextId;
    nextId++;
}
```

### Instance Counter

```java
private static int totalCreated = 0;

public MyClass() {
    totalCreated++;
}

public static int getTotalCreated() {
    return totalCreated;
}
```

### Factory Method

```java
public static MyClass createDefault() {
    return new MyClass("Guest", 0);
}
```

---

## Common Pitfalls

1. **Forgetting `this`**: When a parameter name matches an instance variable, use `this.name = name;`
2. **Aliasing confusion**: `b = a` does NOT copy the object — both variables point to the same one
3. **Using `this` in static methods**: Static methods have no `this` — they don't belong to an object
4. **Missing validation**: Setters should check that values are valid before assigning
5. **Returning mutable references**: If a getter returns a reference to a mutable object, the caller can modify your private data
6. **`null` pointer**: Calling a method on a `null` reference causes `NullPointerException`
7. **Forgetting `new`**: `ClassName obj;` declares a variable but doesn't create an object — it's `null`
8. **Confusing `==` and `.equals()`**: For objects, `==` checks if two references point to the same object, not if they have equal values

---

## AP Exam Tips

- The **Class Design** free-response question requires writing a complete class with constructors, methods, and instance variables
- Know when to use `void` vs non-void methods, and when to use `static` vs instance
- Understand that Java passes object references by value — the method gets a copy of the reference, so it CAN modify the object but CANNOT make the original variable point elsewhere
- Practice tracing code with multiple references to the same object (aliasing)
- `toString()` is called automatically when an object is used in a `String` context (e.g., `println()`)
- Static variables persist across all objects and are shared — changing one affects all
