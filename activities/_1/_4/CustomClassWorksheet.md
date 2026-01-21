# Design Your Own Class Worksheet

## Prompt

You will design your own class that represents something small, stateful, and interactive.

- A creature, object, or system with 2–3 pieces of state
- It can change over time
- It can be printed in a readable way

### Inspiration (pick one or invent your own)

- A creature (robot, pet)
- A gadget (battery, sensor, timer)
- A game object (player, item, card)
- A simulation item (particle, cell)

### Constraints

Your class **must** include:

- 2 private instance variables
- At least one constructor
- At least two instance methods
- A custom `toString()`
- A working `main` method for testing in a separate driver class

---

## 🌱 LEVEL 1 — Define the Object

1. Create a new class with two instance variables
2. Write a default constructor (no parameters) that:
   - Maybe assign a reasonable random value to one of the fields
3. Write a `toString()` that clearly shows the object's state
4. In main:
   - Create two instances
   - Print them

**Checkpoint:** Running the program prints two readable, different objects.

---

## 🌿 LEVEL 2 — Control Access (Getters & Setters)

1. Add getters for both instance variables
2. Add setters that:
   - Enforce rules (ranges, limits, or conditions you choose)
3. In main:
   - Call the setters with both valid and invalid values
   - Print before and after

**Checkpoint:** Invalid values do not break your object.

---

## 🌳 LEVEL 3 — Behavior (Instance Methods)

1. Add two instance methods that change the state
   - Example patterns:
     - increase / decrease
     - move / adjust
     - charge / drain
     - grow / shrink
2. At least one method must:
   - Use the current instance variables
   - Update them using math or String manipulation
3. In main:
   - Call your methods multiple times
   - Print after each call

**Checkpoint:** State changes in a predictable way.

---

## 🌲 LEVEL 4 — Overloading

1. Overload constructor (same name, different parameters)
2. Overload one method
   - Same method name, different parameter list
3. In main:
   - Create objects using both constructors
   - Call both versions of the method

**Checkpoint:** Java chooses the correct version each time.

---

## 🌴 LEVEL 5 — Interaction

1. Add a method that takes another object of the same class:
   ```java
   public void interact(YourClass other)
   ```
2. The method must:
   - Read from `other`
   - Change `this` object's state
3. In main:
   - Create two objects
   - Call interact
   - Print before and after

**Checkpoint:** Objects affect each other.

---

## 🌵 LEVEL 6 — Small System

In main only:

1. Create an array of 5–10 of your objects
2. Loop through and print them
3. Compute one aggregate:
   - Max, min, or average of one field
   - Count that meets a condition

**Checkpoint:** Your class works as part of a system.
