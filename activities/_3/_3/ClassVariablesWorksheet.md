# Class Variables Worksheet

Build a `User` account system using static variables, static methods, and constants.

---

## Level 1 🌱 — User Basics with Static Counter

### 1) User Class

In `User.java`, create a class with:

- Instance variables: `String username`, `boolean isActive`
- A static variable: `static int userCount` initialized to 0
- A constructor that takes a `String username`, sets `isActive` to `true`, and increments `userCount`
- Accessors: `getUsername()`, `getIsActive()`
- `toString()` that returns something like: `User: alice (active)`

Test by creating a few users and printing `userCount`.

---

## Level 2 🌿 — Static Methods and Constants

### 2) Static Accessor

Add a static method `public static int getUserCount()` that returns the current user count.

### 3) Static Constant

Add a constant: `public static final int MAX_USERS = 100;`

Test:
```java
User u1 = new User("alice");
User u2 = new User("bob");
System.out.println("Users: " + User.getUserCount());    // 2
System.out.println("Max: " + User.MAX_USERS);           // 100
```

---

## Level 3 🌳 — Enforcing Limits and Tracking Active Users

### 4) Constructor Guard

Modify the constructor so that if `userCount >= MAX_USERS`, the username is set to `"DENIED"` and `isActive` is set to `false` (the user is not really created, but the object still exists).

### 5) Active Counter

Add a static variable `static int activeCount` that:
- Increments when a user is successfully created
- Add a method `void deactivate()` that sets `isActive` to false and decrements `activeCount`
- Add a static method `public static int getActiveCount()`

---

## Level 4 🌲 — Factory Method

### 6) Guest Factory

Add a static method:
```java
public static User createGuest()
```

This method:
- Generates a guest username like `"guest_1"`, `"guest_2"`, etc. (use a static counter)
- Creates and returns a new `User` with that generated name

Test:
```java
User g1 = User.createGuest(); // guest_1
User g2 = User.createGuest(); // guest_2
System.out.println(g1);
System.out.println(g2);
```

---

## Level 5 🌴 — Registration Simulation

### 7) UserDriver

In `UserDriver.java`, write a program that:

1. Creates 5 named users
2. Creates 3 guest users using `createGuest()`
3. Deactivates 2 users
4. Prints:
   - Total user count
   - Active user count
   - Each user's status
5. **Challenge:** Temporarily set `MAX_USERS` to 5 (change the constant for testing) and try creating more users. Print what happens when the limit is exceeded.
