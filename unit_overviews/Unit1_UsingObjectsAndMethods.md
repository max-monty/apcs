# Unit 1: Using Objects and Methods

**AP Exam Weighting: 15-25%** | AP Topics: 1.1-1.15

---

## Conceptual Overview

Unit 1 introduces the building blocks of Java programs: variables, data types, expressions, and methods. Students learn to store data in variables, perform calculations, get user input with `Scanner`, use pre-built library methods (`Math`, `String`), and create and use custom classes. This unit establishes the core vocabulary and mechanics that every later unit builds upon.

---

## Key Terms

| Term | Definition |
|------|-----------|
| **Variable** | A named container that stores a value of a specific type |
| **Data type** | The kind of value a variable holds (`int`, `double`, `boolean`, `String`) |
| **Primitive type** | A basic data type stored directly in memory (`int`, `double`, `boolean`, `char`) |
| **Reference type** | A type that stores a reference (address) to an object (`String`, arrays, custom classes) |
| **Expression** | A combination of values, variables, and operators that evaluates to a result |
| **Casting** | Converting a value from one type to another (e.g., `(double) 5` or `(int) 3.7`) |
| **Concatenation** | Joining strings together with the `+` operator |
| **Escape sequence** | Special characters in strings: `\"`, `\\`, `\n` |
| **Method** | A reusable block of code that performs a specific task |
| **Parameter** | An input value passed to a method |
| **Return type** | The type of value a method gives back (`int`, `String`, `void`, etc.) |
| **Constructor** | A special method that creates and initializes a new object |
| **Instance variable** | A variable that belongs to a specific object |
| **Accessor (getter)** | A method that returns the value of an instance variable |
| **Mutator (setter)** | A method that changes the value of an instance variable |
| **API** | Application Program Interface — a set of pre-built classes and methods |
| **Overloading** | Multiple methods with the same name but different parameter lists |
| **`null`** | A special value meaning "no object" for reference variables |
| **Overflow** | When a value exceeds the maximum for its type (e.g., `Integer.MAX_VALUE + 1`) |

---

## Syntax Reference

### Variable Declaration and Initialization

```java
int age = 17;                    // integer
double gpa = 3.85;               // decimal
boolean enrolled = true;          // true or false
char grade = 'A';                 // single character
String name = "Alice";            // text (reference type)
```

### Arithmetic Operators

| Operator | Meaning | Example | Result |
|----------|---------|---------|--------|
| `+` | Addition | `7 + 3` | `10` |
| `-` | Subtraction | `7 - 3` | `4` |
| `*` | Multiplication | `7 * 3` | `21` |
| `/` | Division | `7 / 3` | `2` (integer division!) |
| `%` | Modulus (remainder) | `7 % 3` | `1` |

### Compound Assignment Operators

```java
x += 5;   // same as x = x + 5
x -= 5;   // same as x = x - 5
x *= 5;   // same as x = x * 5
x /= 5;   // same as x = x / 5
x %= 5;   // same as x = x % 5
x++;       // same as x = x + 1
x--;       // same as x = x - 1
```

### Casting

```java
int a = 5, b = 2;
double result = (double) a / b;  // 2.5 — cast BEFORE dividing
int truncated = (int) 3.99;     // 3 — truncates, does not round
```

### Scanner (User Input)

```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
String name = input.nextLine();     // reads a full line
int age = input.nextInt();          // reads an integer
double gpa = input.nextDouble();    // reads a decimal
input.nextLine();                   // CONSUME leftover newline after nextInt/nextDouble
```

### String Methods

| Method | Returns | Description |
|--------|---------|-------------|
| `s.length()` | `int` | Number of characters |
| `s.charAt(i)` | `char` | Character at index `i` |
| `s.substring(i)` | `String` | From index `i` to end |
| `s.substring(i, j)` | `String` | From index `i` to `j-1` |
| `s.indexOf(str)` | `int` | First occurrence of `str` (-1 if not found) |
| `s.toUpperCase()` | `String` | All uppercase copy |
| `s.toLowerCase()` | `String` | All lowercase copy |
| `s.contains(str)` | `boolean` | Whether `str` appears in `s` |
| `s.replace(old, new)` | `String` | Replace all occurrences |
| `s.equals(other)` | `boolean` | Content equality (NOT `==`) |
| `s.compareTo(other)` | `int` | Negative if before, 0 if equal, positive if after |

### Math Class

| Method | Returns | Description |
|--------|---------|-------------|
| `Math.abs(x)` | `int`/`double` | Absolute value |
| `Math.pow(base, exp)` | `double` | base raised to exp |
| `Math.sqrt(x)` | `double` | Square root |
| `Math.random()` | `double` | Random value in [0.0, 1.0) |
| `Math.max(a, b)` | `int`/`double` | Larger of two values |
| `Math.min(a, b)` | `int`/`double` | Smaller of two values |
| `Math.PI` | `double` | The constant pi (3.14159...) |

### Random Number Formula

```java
// Random int from min to max (inclusive):
int rand = (int)(Math.random() * (max - min + 1)) + min;
```

### Escape Sequences

| Sequence | Output |
|----------|--------|
| `\"` | Double quote |
| `\\` | Backslash |
| `\n` | New line |

### Class Structure

```java
public class ClassName {
    // Instance variables
    private int value;
    private String name;

    // Constructor
    public ClassName(int v, String n) {
        value = v;
        name = n;
    }

    // Accessor
    public int getValue() {
        return value;
    }

    // Mutator
    public void setValue(int v) {
        value = v;
    }

    // toString
    public String toString() {
        return name + ": " + value;
    }
}
```

---

## Common Pitfalls

1. **Integer division**: `5 / 2` gives `2`, not `2.5`. Cast first: `(double) 5 / 2`
2. **String comparison**: Use `.equals()`, never `==` for String content
3. **Scanner newline trap**: After `nextInt()` or `nextDouble()`, call `nextLine()` to consume the leftover newline before reading another line
4. **`.length` vs `.length()`**: Arrays use `.length` (no parentheses), Strings use `.length()` (method)
5. **Overflow**: `Integer.MAX_VALUE + 1` wraps to `Integer.MIN_VALUE`
6. **String immutability**: String methods return a NEW string; they don't modify the original
7. **Substring bounds**: `substring(i, j)` goes from `i` to `j-1`, not `j`

---

## AP Exam Tips

- Know the difference between `print()` and `println()`
- Be comfortable tracing expressions with mixed types (int + double promotes to double)
- Understand that `String` is a reference type even though it looks like a primitive
- The `Math.random()` formula for generating random integers in a range is heavily tested
- Know default values: `int` = 0, `double` = 0.0, `boolean` = false, reference = `null`
