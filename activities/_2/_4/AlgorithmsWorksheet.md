# Selection & Iteration Algorithms Worksheet

Standard algorithms using loops and conditionals.

---

## Level 1: Basic Algorithms

### 1) Find Maximum

In `FindMax.java`:

Write a method:
```java
public static int findMax(int[] arr)
```

Return the largest value in the array.

Test with: `{3, 7, 2, 9, 4}` → should return 9

---

### 2) Find Minimum

In `FindMin.java`:

Write a method:
```java
public static int findMin(int[] arr)
```

Return the smallest value in the array.

---

### 3) Calculate Average

In `Average.java`:

Write a method:
```java
public static double average(int[] arr)
```

Return the average of all values.

---

## Level 2: Conditional Algorithms

### 4) Count Matches

In `CountMatches.java`:

Write a method:
```java
public static int countEvens(int[] arr)
```

Return how many even numbers are in the array.

---

### 5) Has Negative

In `HasNegative.java`:

Write a method:
```java
public static boolean hasNegative(int[] arr)
```

Return true if ANY element is negative.

---

### 6) All Passing

In `AllPassing.java`:

Write a method:
```java
public static boolean allPassing(int[] grades)
```

Return true if ALL grades are 60 or above.

---

## Level 3: Combined Algorithms

### 7) Average of Positives

In `AvgPositives.java`:

Write a method:
```java
public static double avgPositives(int[] arr)
```

Return the average of only the positive numbers. Return 0 if no positives exist.

---

### 8) Second Largest

In `SecondLargest.java`:

Write a method:
```java
public static int secondLargest(int[] arr)
```

Return the second largest value. Assume array has at least 2 elements.

**Hint:** Track both the largest and second largest as you iterate.

---

## Level 4: Challenge

### 9) Mode Finder

In `ModeFinder.java`:

Write a method:
```java
public static int findMode(int[] arr)
```

Return the value that appears most frequently. If tie, return any of them.

---

### 10) Longest Streak

In `LongestStreak.java`:

Write a method:
```java
public static int longestStreak(int[] arr)
```

Return the length of the longest consecutive sequence of identical values.

Example: `{1, 2, 2, 2, 3, 3}` → returns 3 (three 2s in a row)
