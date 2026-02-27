# AP Computer Science A — Java Quick Reference

This reference includes everything from the official AP CSA Java Quick Reference sheet provided during the exam, plus additional helpful information.

---

## Primitive Data Types

| Type | Size | Range | Default | Example |
|------|------|-------|---------|---------|
| `int` | 32 bits | -2,147,483,648 to 2,147,483,647 | `0` | `int x = 42;` |
| `double` | 64 bits | ~15 decimal digits of precision | `0.0` | `double y = 3.14;` |
| `boolean` | — | `true` or `false` | `false` | `boolean b = true;` |

> **Note:** `char` and `String` are also used but `char` is not on the AP subset as a standalone type. `String` is a reference type, not primitive.

---

## Arithmetic Operators

| Operator | Operation | int Example | Result | double Example | Result |
|----------|-----------|-------------|--------|----------------|--------|
| `+` | Addition | `7 + 3` | `10` | `7.0 + 3.0` | `10.0` |
| `-` | Subtraction | `7 - 3` | `4` | `7.0 - 3.0` | `4.0` |
| `*` | Multiplication | `7 * 3` | `21` | `7.0 * 3.0` | `21.0` |
| `/` | Division | `7 / 3` | **`2`** | `7.0 / 3.0` | `2.333...` |
| `%` | Remainder | `7 % 3` | `1` | `7.0 % 3.0` | `1.0` |

> **Integer division truncates** — it drops the decimal, it does NOT round.

## Compound Assignment Operators

| Operator | Equivalent |
|----------|-----------|
| `x += n` | `x = x + n` |
| `x -= n` | `x = x - n` |
| `x *= n` | `x = x * n` |
| `x /= n` | `x = x / n` |
| `x %= n` | `x = x % n` |
| `x++` | `x = x + 1` |
| `x--` | `x = x - 1` |

---

## Relational Operators

| Operator | Meaning |
|----------|---------|
| `==` | Equal to |
| `!=` | Not equal to |
| `<` | Less than |
| `>` | Greater than |
| `<=` | Less than or equal to |
| `>=` | Greater than or equal to |

---

## Logical Operators

| Operator | Meaning | Short-Circuit Behavior |
|----------|---------|----------------------|
| `&&` | AND | Stops if left is `false` |
| `\|\|` | OR | Stops if left is `true` |
| `!` | NOT | — |

### De Morgan's Laws

```
!(a && b)  ≡  !a || !b
!(a || b)  ≡  !a && !b
```

---

## Operator Precedence (High to Low)

| Priority | Operators |
|----------|-----------|
| 1 | `!` (NOT), `(type)` casting, unary `-` |
| 2 | `*`, `/`, `%` |
| 3 | `+`, `-` |
| 4 | `<`, `>`, `<=`, `>=` |
| 5 | `==`, `!=` |
| 6 | `&&` |
| 7 | `\|\|` |
| 8 | `=`, `+=`, `-=`, etc. |

---

## Casting

```java
// Widening (automatic): int → double
double d = 5;           // 5.0

// Narrowing (manual): double → int (truncates)
int n = (int) 3.99;     // 3

// Forcing double division
int a = 7, b = 2;
double result = (double) a / b;  // 3.5
```

---

## String Class

Strings are **immutable** — methods return a new String; the original is unchanged.

| Method | Return Type | Description |
|--------|-----------|-------------|
| `int length()` | `int` | Number of characters in the string |
| `String substring(int from, int to)` | `String` | Characters from index `from` to `to - 1` |
| `String substring(int from)` | `String` | Characters from index `from` to end |
| `int indexOf(String str)` | `int` | Index of first occurrence of `str`; `-1` if not found |
| `int compareTo(String other)` | `int` | Negative if `this` < `other`, zero if equal, positive if `this` > `other` |
| `boolean equals(String other)` | `boolean` | `true` if strings have identical content |

### Additional Useful String Methods (not on Quick Reference, but usable)

| Method | Return Type | Description |
|--------|-----------|-------------|
| `char charAt(int index)` | `char` | Character at the given index |
| `String toUpperCase()` | `String` | Uppercase copy |
| `String toLowerCase()` | `String` | Lowercase copy |
| `boolean contains(String str)` | `boolean` | Whether this string contains `str` |
| `String replace(String old, String new)` | `String` | Replace all occurrences |
| `boolean endsWith(String suffix)` | `boolean` | Whether this string ends with `suffix` |
| `String trim()` | `String` | Copy with leading/trailing whitespace removed |

### String Comparison

```java
str1.equals(str2)       // content equality — USE THIS
str1 == str2            // reference equality — DON'T use for content
str1.compareTo(str2)    // lexicographic: negative, zero, or positive
```

---

## Math Class

All methods are `static` — call with `Math.methodName()`.

| Method | Return Type | Description |
|--------|-----------|-------------|
| `static int abs(int x)` | `int` | Absolute value of `x` |
| `static double abs(double x)` | `double` | Absolute value of `x` |
| `static double pow(double base, double exp)` | `double` | `base` raised to `exp` |
| `static double sqrt(double x)` | `double` | Square root of `x` |
| `static double random()` | `double` | Random value in [0.0, 1.0) |

### Additional Useful Math Methods

| Method | Return Type | Description |
|--------|-----------|-------------|
| `static int max(int a, int b)` | `int` | Larger of `a` and `b` |
| `static int min(int a, int b)` | `int` | Smaller of `a` and `b` |
| `static double max(double a, double b)` | `double` | Larger of `a` and `b` |
| `static double min(double a, double b)` | `double` | Smaller of `a` and `b` |

### Constants

| Constant | Value |
|----------|-------|
| `Math.PI` | 3.141592653589793 |
| `Integer.MAX_VALUE` | 2,147,483,647 |
| `Integer.MIN_VALUE` | -2,147,483,648 |

### Random Number Formula

```java
// Random int from min to max (inclusive):
int rand = (int)(Math.random() * (max - min + 1)) + min;

// Examples:
int dice = (int)(Math.random() * 6) + 1;       // 1 to 6
int coin = (int)(Math.random() * 2);            // 0 or 1
int percent = (int)(Math.random() * 101);       // 0 to 100
```

---

## Integer Class

| Method | Return Type | Description |
|--------|-----------|-------------|
| `Integer(int value)` | — | Constructs an `Integer` object |
| `static int parseInt(String s)` | `int` | Converts `"123"` to `123` |
| `int intValue()` | `int` | Returns the `int` value |

### Autoboxing / Unboxing

```java
Integer obj = 5;         // autoboxing: int → Integer
int val = obj;            // unboxing: Integer → int
```

---

## Double Class

| Method | Return Type | Description |
|--------|-----------|-------------|
| `Double(double value)` | — | Constructs a `Double` object |
| `static double parseDouble(String s)` | `double` | Converts `"3.14"` to `3.14` |
| `double doubleValue()` | `double` | Returns the `double` value |

---

## ArrayList Class

`import java.util.ArrayList;`

ArrayList is a **resizable** list of objects (cannot hold primitives directly — use wrapper classes).

| Method | Return Type | Description |
|--------|-----------|-------------|
| `int size()` | `int` | Number of elements |
| `boolean add(E obj)` | `boolean` | Appends `obj` to the end |
| `void add(int index, E obj)` | `void` | Inserts `obj` at `index`, shifts others right |
| `E get(int index)` | `E` | Returns element at `index` |
| `E set(int index, E obj)` | `E` | Replaces element at `index`, returns old element |
| `E remove(int index)` | `E` | Removes element at `index`, shifts others left, returns removed |

### ArrayList Declaration

```java
ArrayList<Integer> nums = new ArrayList<Integer>();
ArrayList<String> names = new ArrayList<String>();
ArrayList<Student> roster = new ArrayList<Student>();
```

### ArrayList vs Array

| Feature | Array | ArrayList |
|---------|-------|-----------|
| Size | Fixed at creation | Grows and shrinks dynamically |
| Syntax | `arr[i]` | `list.get(i)` |
| Length | `arr.length` | `list.size()` |
| Types | Primitives and objects | Objects only (use `Integer`, `Double`) |
| Add/Remove | Not supported | `add()`, `remove()` |

---

## Arrays

### Declaration and Creation

```java
int[] arr = new int[5];               // size 5, all default values
int[] arr = {1, 2, 3, 4, 5};         // initializer list
String[] words = new String[10];      // size 10, all null
```

### Key Properties

| Property | Syntax | Note |
|----------|--------|------|
| Length | `arr.length` | Attribute, NOT a method (no parentheses) |
| First element | `arr[0]` | Zero-indexed |
| Last element | `arr[arr.length - 1]` | |
| Valid indices | `0` to `arr.length - 1` | Out of range → `ArrayIndexOutOfBoundsException` |

### Traversal Patterns

```java
// Indexed for loop
for (int i = 0; i < arr.length; i++) {
    // use arr[i]
}

// Enhanced for loop (read-only)
for (int num : arr) {
    // use num (cannot modify array through this variable)
}

// Backwards
for (int i = arr.length - 1; i >= 0; i--) {
    // use arr[i]
}
```

---

## 2D Arrays

### Declaration and Creation

```java
int[][] grid = new int[3][4];        // 3 rows, 4 columns
int[][] grid = {{1, 2}, {3, 4}, {5, 6}};  // initializer list
```

### Key Properties

| Property | Syntax |
|----------|--------|
| Number of rows | `grid.length` |
| Number of columns | `grid[0].length` |
| Element access | `grid[row][col]` |

### Traversal (Row-Major Order)

```java
for (int row = 0; row < grid.length; row++) {
    for (int col = 0; col < grid[row].length; col++) {
        // use grid[row][col]
    }
}

// Enhanced for loop
for (int[] row : grid) {
    for (int val : row) {
        // use val
    }
}
```

### Column-Major Traversal

```java
for (int col = 0; col < grid[0].length; col++) {
    for (int row = 0; row < grid.length; row++) {
        // use grid[row][col]
    }
}
```

---

## Control Structures

### If / Else If / Else

```java
if (condition) {
    // ...
} else if (condition2) {
    // ...
} else {
    // ...
}
```

### For Loop

```java
for (initialization; condition; update) {
    // body
}
```

### While Loop

```java
while (condition) {
    // body — must update condition!
}
```

### Enhanced For Loop

```java
for (Type element : collection) {
    // body — element is a COPY for primitives
}
```

---

## Class Structure Template

```java
public class ClassName {
    // Instance variables
    private Type varName;

    // Constructor
    public ClassName(Type param) {
        varName = param;
    }

    // Accessor
    public Type getVarName() {
        return varName;
    }

    // Mutator
    public void setVarName(Type val) {
        varName = val;
    }

    // toString
    public String toString() {
        return "...";
    }
}
```

---

## Escape Sequences

| Sequence | Output |
|----------|--------|
| `\\` | Backslash `\` |
| `\"` | Double quote `"` |
| `\n` | New line |
| `\t` | Tab |

---

## Scanner Class (Not on AP Quick Reference, but commonly used)

```java
import java.util.Scanner;
Scanner input = new Scanner(System.in);

String line = input.nextLine();      // full line of text
int n = input.nextInt();             // integer
double d = input.nextDouble();       // decimal
boolean b = input.nextBoolean();     // true or false

// IMPORTANT: After nextInt()/nextDouble(), consume leftover newline:
input.nextLine();
```

---

## Common Algorithm Patterns Summary

| Algorithm | Key Idea | Initialize With |
|-----------|----------|-----------------|
| **Find max** | Track best so far, update if larger | First element |
| **Find min** | Track best so far, update if smaller | First element |
| **Sum** | Add each element to accumulator | `0` |
| **Average** | Sum / count, cast to double | Sum = `0` |
| **Count** | Increment when condition is met | `0` |
| **Any (has)** | Set flag to true if found | `false` |
| **All** | Set flag to false if not found | `true` |
| **Linear search** | Return index when found | `-1` (not found) |
| **Reverse** | Swap from outside in | — |
| **Filter** | Count matches, then fill new array | Count = `0` |
