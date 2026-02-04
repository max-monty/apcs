# Nested Iteration Worksheet

Loops inside loops for patterns and pair comparisons.

---

## Level 1: Basic Patterns

### 1) Rectangle

In `Rectangle.java`:

Ask for rows and columns. Print a rectangle of stars.

For rows=3, cols=5:
```
*****
*****
*****
```

---

### 2) Right Triangle

In `RightTriangle.java`:

Ask for height. Print a right triangle of stars.

For height=5:
```
*
**
***
****
*****
```

---

### 3) Number Grid

In `NumberGrid.java`:

Ask for n. Print an n×n grid of numbers.

For n=4:
```
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
```

---

## Level 2: Advanced Patterns

### 4) Multiplication Table

In `MultTable.java`:

Print a 10×10 multiplication table.

```
1  2  3  4  ...
2  4  6  8  ...
3  6  9  12 ...
...
```

---

### 5) Inverted Triangle

In `InvertedTriangle.java`:

For height=5:
```
*****
****
***
**
*
```

---

### 6) Number Triangle

In `NumberTriangle.java`:

For height=5:
```
1
12
123
1234
12345
```

---

## Level 3: Pair Comparisons

### 7) Find Duplicates

In `FindDuplicates.java`:

Write a method:
```java
public static void printDuplicates(int[] arr)
```

Print all pairs of indices that contain the same value.

For `{3, 1, 4, 1, 5, 1}` print:
```
Duplicate at index 1 and 3
Duplicate at index 1 and 5
Duplicate at index 3 and 5
```

---

### 8) All Pairs Sum

In `AllPairsSum.java`:

Write a method:
```java
public static boolean hasPairWithSum(int[] arr, int target)
```

Return true if any two elements sum to target.

Test: `{1, 4, 5, 7}` with target 9 → true (4+5)

---

## Level 4: Challenge

### 9) Diamond

In `Diamond.java`:

For size=5 (must be odd):
```
  *
 ***
*****
 ***
  *
```

---

### 10) Prime Grid

In `PrimeGrid.java`:

Print a grid where position (r,c) shows "P" if r + c is prime, "." otherwise.

For 5×5:
```
. . P P .
. P P . P
P P . P .
P . P . P
. P . P .
```
