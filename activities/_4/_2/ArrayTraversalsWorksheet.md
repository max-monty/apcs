# Array Traversals Worksheet

Practice traversing arrays using indexed for loops, enhanced for loops, and while loops.

---

## Level 1 🌱 — Indexed For Loop

### 1) Print All

In `PrintAll.java`:

Write a method:
```java
public static void printAll(int[] arr)
```

Use an **indexed for loop** to print every element on one line, separated by spaces.

Test with: `{5, 12, 3, 8, 1}` → `5 12 3 8 1`

---

### 2) Print with Indices

In `PrintIndices.java`:

Write a method:
```java
public static void printWithIndices(String[] arr)
```

Use an indexed for loop to print each element with its index:
```
[0] Alice
[1] Bob
[2] Charlie
```

---

## Level 2 🌿 — Enhanced For Loop

### 3) Sum Array

In `SumArray.java`:

Write a method:
```java
public static int sum(int[] arr)
```

Use an **enhanced for loop** to calculate and return the sum of all elements.

Test with: `{3, 7, 2, 9}` → 21

---

### 4) Contains String

In `ContainsString.java`:

Write a method:
```java
public static boolean contains(String[] arr, String target)
```

Use an enhanced for loop to check if `target` exists in the array. Use `.equals()` to compare Strings (review from Unit 1).

Test: `contains({"apple", "banana", "cherry"}, "banana")` → `true`
Test: `contains({"apple", "banana", "cherry"}, "grape")` → `false`

---

### 5) Total Length

In `TotalLength.java`:

Write a method:
```java
public static int totalLength(String[] words)
```

Use an enhanced for loop to return the total number of characters across all strings. Use `.length()` on each String (review from Unit 1).

Test: `totalLength({"hi", "bye", "ok"})` → 7

---

## Level 3 🌳 — Traversal Variations

### 6) Print Backwards

In `PrintBackwards.java`:

Write a method:
```java
public static void printBackwards(int[] arr)
```

Use an **indexed for loop starting from the last index** to print elements in reverse order.

Test with: `{1, 2, 3, 4, 5}` → `5 4 3 2 1`

**Think:** Can you do this with an enhanced for loop? Why or why not?

---

### 7) Every Other

In `EveryOther.java`:

Write a method:
```java
public static void printEveryOther(String[] arr)
```

Print only elements at even indices (0, 2, 4, ...).

Test with: `{"a", "b", "c", "d", "e"}` → `a c e`

**Think:** Why is an indexed for loop required here?

---

### 8) While Loop Search

In `WhileSearch.java`:

Write a method:
```java
public static int findFirst(int[] arr, int target)
```

Use a **while loop** to find the index of the first occurrence of `target`. Return -1 if not found. **Stop early** once found — this is an ideal case for a while loop.

Test: `findFirst({3, 7, 2, 9, 2}, 2)` → `2`
Test: `findFirst({3, 7, 2, 9}, 5)` → `-1`

---

## Level 4 🌲 — Object Array Traversals

### 9) Player Array

Using the `Player` class from Unit 3 (or create a simplified version with `String name`, `int score`, `int health`, a constructor, getters, and `toString()`):

In `PlayerArrayDemo.java`:

1. Create an array of 4 `Player` objects:
```java
Player[] team = {
    new Player("Alice", 50, 100),
    new Player("Bob", 75, 80),
    new Player("Charlie", 30, 60),
    new Player("Diana", 90, 95)
};
```

2. Use an **enhanced for loop** to print each player (calls `toString()` automatically)
3. Use an **enhanced for loop** to call `heal(10)` on each player
4. Print all players again to verify their health increased

**Key insight:** Enhanced for loops CAN modify objects by calling methods on them — the loop variable holds a **reference** to the object, not a copy of the object itself.

---

### 10) Name Processor

In `NameProcessor.java`:

Write two methods that take a `String[]` of names:

```java
public static int countLongNames(String[] names, int minLength)
```
Use an enhanced for loop. Return how many names have length >= `minLength`.
(Review: `.length()` from Unit 1, counting pattern from Unit 2)

```java
public static String[] toUpperAll(String[] names)
```
Use an **indexed for loop**. Create and return a **new** `String[]` where every name is uppercased.
(Review: `.toUpperCase()` from Unit 1)

**Think:** Why must `toUpperAll` use an indexed for loop instead of an enhanced for loop?
(Hint: assigning a new value to the enhanced for variable does NOT change the array.)

---

## Level 5 🌴 — Challenge

### 11) Parallel Array Report

In `ParallelReport.java`:

1. Use a `Scanner` to ask for the number of students (review from Unit 1)
2. Create parallel arrays: `String[] names` and `double[] grades`
3. Fill both arrays from user input
4. Write and call these methods, choosing the most appropriate loop type for each:

```java
public static void printRoster(String[] names, double[] grades)
```
Print each student name and grade.

```java
public static void printFailing(String[] names, double[] grades)
```
Print only students with grade < 60 (review: **if statement** from Unit 2).

```java
public static void printReversed(String[] names, double[] grades)
```
Print the roster in reverse order.

```java
public static int countAbove(double[] grades, double threshold)
```
Return how many grades are above the threshold.

**Hint:** For methods that need both parallel arrays, you need an **indexed for loop** so you can access the same index in both arrays simultaneously.
