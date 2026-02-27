# Array Algorithms Worksheet

Build a `Student` gradebook system that applies standard array algorithms to custom objects.

---

## Level 1 🌱 — Student Class Setup

### 1) Student Class

In `Student.java`, create a class with:

- Private instance variables: `String name`, `int grade`
- A parameterized constructor that takes both values
- Accessors: `getName()`, `getGrade()`
- A mutator: `void setGrade(int g)` — only sets if `g` is between 0 and 100
- `toString()` that returns something like: `Alice: 92`

(Review: class creation, constructors, accessors, mutators from Unit 3)

---

### 2) Build a Roster

In `GradebookDriver.java`:

1. Create a `Student[]` array with 5 students using an initializer list:
```java
Student[] roster = {
    new Student("Alice", 92),
    new Student("Bob", 78),
    new Student("Charlie", 55),
    new Student("Diana", 88),
    new Student("Ethan", 64)
};
```
2. Use an enhanced for loop to print each student

---

## Level 2 🌿 — Search and Find Algorithms

### 3) Find Top Student

In `GradebookDriver.java`, add a method:

```java
public static Student findTopStudent(Student[] roster)
```

Return the `Student` with the highest grade. Use the **find-max pattern** — initialize with the first element and compare using `getGrade()`.

Test: Should return `Alice: 92`

---

### 4) Find Student by Name

Add a method:
```java
public static Student findByName(Student[] roster, String name)
```

Return the `Student` whose name matches (use `.equals()` — review from Unit 1). Return `null` if not found.

Test: `findByName(roster, "Charlie")` → `Charlie: 55`
Test: `findByName(roster, "Zara")` → `null`

---

### 5) Count Passing

Add a method:
```java
public static int countPassing(Student[] roster)
```

Return how many students have a grade of 60 or above. Use the **count pattern** with an enhanced for loop.

---

## Level 3 🌳 — Aggregate Algorithms

### 6) Class Average

Add a method:
```java
public static double classAverage(Student[] roster)
```

Return the average grade of all students. Remember to **cast** the sum to `double` before dividing (review from Unit 1).

---

### 7) All Passing?

Add a method:
```java
public static boolean allPassing(Student[] roster)
```

Return `true` if ALL students have a grade of 60 or above. Use the **check-all pattern**: start with `true`, set to `false` if any student fails the condition.

---

### 8) Honor Roll

Add a method:
```java
public static String[] honorRoll(Student[] roster)
```

Return a new `String[]` containing the **names** of all students with grades 90 or above.

**Hint:** First count how many qualify (to determine the size of the new array), then create and fill it in a second pass.

---

## Level 4 🌲 — Transformation Algorithms

### 9) Curve Grades

Add a method:
```java
public static void curveGrades(Student[] roster, int points)
```

Add `points` to every student's grade using `setGrade()`. Make sure no grade exceeds 100 — use `Math.min()` or an **if statement** (review from Unit 2).

Print the roster before and after curving to verify.

---

### 10) Sort by Grade

Add a method:
```java
public static void sortByGrade(Student[] roster)
```

Sort the array from **highest to lowest** grade using a nested loop. For each pair that is out of order, swap them using a `Student temp` variable.

(Review: nested loops from Unit 2)

```java
// Selection sort pattern:
for (int i = 0; i < roster.length - 1; i++) {
    for (int j = i + 1; j < roster.length; j++) {
        if (roster[j].getGrade() > roster[i].getGrade()) {
            // swap roster[i] and roster[j]
        }
    }
}
```

Print the sorted roster.

---

## Level 5 🌴 — Full System Challenge

### 11) Interactive Gradebook

Expand `GradebookDriver.java` into a menu-driven program:

1. Use a `Scanner` to ask how many students to enroll
2. Create a `Student[]` of that size and fill names and grades from user input
3. Display a menu inside a **while loop** (review from Unit 2):
```
--- Gradebook Menu ---
1. Print all students
2. Find top student
3. Find student by name
4. Class average
5. Count passing
6. Curve grades
7. Print honor roll
8. Sort by grade
9. Quit
Choose:
```
4. Use **if/else** or a chain of conditions to call the appropriate method
5. Keep looping until the user chooses quit

This combines: Scanner input (Unit 1), while loops and if/else (Unit 2), custom classes and object references (Unit 3), and array algorithms (Unit 4).
