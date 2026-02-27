# Unit 2: Selection and Iteration

**AP Exam Weighting: 25-35%** | AP Topics: 2.1-2.12

---

## Conceptual Overview

Unit 2 covers decision-making and repetition — the two control structures that make programs "smart." Students learn to use boolean expressions and conditionals (`if`/`else`) to make choices, and loops (`for`/`while`) to repeat actions. The unit culminates in standard algorithms (find max, find min, sum, average, count, search) and string processing algorithms that combine all these skills. Nested loops are introduced for multi-dimensional patterns.

---

## Key Terms

| Term | Definition |
|------|-----------|
| **Boolean expression** | An expression that evaluates to `true` or `false` |
| **Comparison operator** | Compares two values: `==`, `!=`, `<`, `>`, `<=`, `>=` |
| **Logical operator** | Combines boolean values: `&&` (AND), `\|\|` (OR), `!` (NOT) |
| **Short-circuit evaluation** | `&&` stops if left side is false; `\|\|` stops if left side is true |
| **De Morgan's Law** | Rules for distributing NOT: `!(a && b)` = `!a \|\| !b` and `!(a \|\| b)` = `!a && !b` |
| **Conditional** | An `if`, `else if`, or `else` statement that controls which code runs |
| **Nested conditional** | An `if` statement inside another `if` statement |
| **Iteration** | Repeating a block of code (looping) |
| **For loop** | A loop with initialization, condition, and update in the header |
| **While loop** | A loop that repeats as long as a condition is true |
| **Counter variable** | A variable that tracks how many times a loop has run |
| **Accumulator** | A variable that collects a running total (sum, product, etc.) |
| **Sentinel value** | A special value that signals the end of input (e.g., entering 0 to quit) |
| **Algorithm** | A step-by-step procedure for solving a problem |
| **Linear search** | Checking each element one by one to find a target |
| **Nested loop** | A loop inside another loop — inner loop runs completely for each outer iteration |
| **Infinite loop** | A loop whose condition never becomes false (program hangs) |

---

## Syntax Reference

### Boolean Expressions

```java
// Comparison operators
x == y    // equal to
x != y    // not equal to
x < y     // less than
x > y     // greater than
x <= y    // less than or equal
x >= y    // greater than or equal

// Logical operators
a && b    // AND — both must be true
a || b    // OR — at least one must be true
!a        // NOT — flips true/false
```

### De Morgan's Law

```java
!(a && b)  ≡  !a || !b
!(a || b)  ≡  !a && !b
```

### If / Else If / Else

```java
if (condition1) {
    // runs if condition1 is true
} else if (condition2) {
    // runs if condition1 is false AND condition2 is true
} else {
    // runs if ALL conditions above are false
}
```

### For Loop

```java
for (int i = 0; i < n; i++) {
    // runs n times (i goes 0, 1, 2, ..., n-1)
}
```

### While Loop

```java
while (condition) {
    // runs as long as condition is true
    // must update something to eventually make condition false!
}
```

### When to Use Which Loop

| Use a **for loop** when... | Use a **while loop** when... |
|---|---|
| You know how many times to repeat | You don't know how many times |
| Counting through a range | Waiting for user input |
| Iterating through an array | Input validation |
| Fixed number of repetitions | Sentinel-controlled loops |

---

## Standard Algorithm Patterns

### Find Maximum

```java
int max = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}
```

### Find Minimum

```java
int min = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] < min) {
        min = arr[i];
    }
}
```

### Sum and Average

```java
int sum = 0;
for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
}
double avg = (double) sum / arr.length;  // cast to avoid integer division
```

### Count Matches

```java
int count = 0;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] % 2 == 0) {  // condition varies
        count++;
    }
}
```

### Check if ANY Match (At Least One)

```java
boolean found = false;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] < 0) {
        found = true;
    }
}
```

### Check if ALL Match

```java
boolean allPass = true;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] < 60) {
        allPass = false;
    }
}
```

### String Traversal (Character by Character)

```java
for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
    // process ch
}
```

### Building a New String

```java
String result = "";
for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
    if (Character.isLetter(ch)) {
        result += ch;
    }
}
```

### Nested Loop Pattern (Rectangle)

```java
for (int row = 0; row < rows; row++) {
    for (int col = 0; col < cols; col++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

---

## Common Pitfalls

1. **`=` vs `==`**: `=` is assignment, `==` is comparison — `if (x = 5)` won't compile
2. **Off-by-one errors**: `< n` vs `<= n` — know whether you want n iterations or n+1
3. **Infinite loops**: Forgetting to update the loop variable in a `while` loop
4. **Integer division in averages**: Always cast to `double` before dividing
5. **De Morgan's mistakes**: `!(x > 5 && x < 10)` is `x <= 5 || x >= 10`, NOT `x <= 5 && x >= 10`
6. **Comparing Strings with `==`**: Use `.equals()` for content comparison
7. **Find-max initialization**: Initialize with `arr[0]`, not `0` (what if all values are negative?)
8. **Forgetting `break`**: Without it, a search loop keeps running after finding the answer

---

## AP Exam Tips

- De Morgan's Law is tested frequently — practice converting between equivalent expressions
- Be able to trace through nested loops and predict output (count total iterations: outer * inner)
- The find-max, find-min, sum/average, count, any/all patterns appear on nearly every exam
- Know the difference between `while` and `for` — they can always be rewritten as each other
- String traversal with `.charAt()` and building new strings with concatenation is a core skill
- FizzBuzz-style problems test your ability to combine conditionals with loops
