# Boolean Expressions & Compound Logic Worksheet

Practice with boolean expressions, compound boolean operators, and De Morgan's Law.

---

## Level 1: Boolean Basics

### 1) Grade Checker

In `GradeChecker.java`, write a program that:

1. Asks the user for a numeric grade (0-100)
2. Prints whether the grade is passing (>= 60)
3. Prints whether the grade is an A (>= 90)

Use boolean variables to store the results before printing.

```java
boolean isPassing = // your expression here
boolean isA = // your expression here
```

---

### 2) Number Comparisons

In the same file or a new `NumberCompare.java`:

1. Ask the user for two integers
2. Print the results of these comparisons:
   - Are they equal?
   - Is the first greater than the second?
   - Is the first less than or equal to the second?

---

## Level 2: Compound Boolean Expressions

### 3) Age Range Validator

In `AgeValidator.java`, write a program that:

1. Asks for a person's age
2. Using compound boolean expressions, determine and print:
   - Is the person a teenager? (13-19 inclusive)
   - Is the person a young adult? (18-25 inclusive)
   - Can the person vote AND rent a car? (18+ AND 25+)

**Requirements:**
- Use `&&` (AND) operator
- Use `||` (OR) operator where appropriate

---

### 4) Login Validator

In `LoginValidator.java`:

1. Create two String variables for a stored username and password
2. Ask the user to enter a username and password
3. Print whether the login is successful (both must match)
4. Print whether at least one field is correct

**Requirements:**
- Use `.equals()` for String comparison
- Use compound boolean expressions

---

## Level 3: De Morgan's Law & Equivalence

### 5) De Morgan's Practice

In `DeMorgans.java`, for each of these expressions, write the equivalent using De Morgan's Law:

```java
// Original expressions - write the equivalent
boolean a = true, b = false;
int x = 5, y = 10;

// 1. !(a && b)  is equivalent to: _______________
// 2. !(a || b)  is equivalent to: _______________
// 3. !(x > 3 && y < 15)  is equivalent to: _______________
// 4. !(x == 5 || y != 10)  is equivalent to: _______________
```

Write code that proves each pair is equivalent by printing both and showing they match.

---

### 6) Boolean Expression Simplifier

In `BooleanSimplifier.java`:

Given these conditions for a theme park ride:
- `height` - person's height in inches
- `age` - person's age
- `hasParent` - whether a parent is accompanying them

The ride requirements are:
- Must be at least 48 inches tall, OR
- Must be at least 42 inches AND have a parent, OR
- Must be at least 12 years old AND have a parent

Write a single compound boolean expression `canRide` that captures all these rules.

Then write the negation `cannotRide` using De Morgan's Law (don't just use `!canRide`).

---

## Level 4: Challenge

### 7) Leap Year Calculator

In `LeapYear.java`:

A year is a leap year if:
- It is divisible by 4 AND
- It is NOT divisible by 100, OR it IS divisible by 400

1. Ask the user for a year
2. Using a single compound boolean expression, determine if it's a leap year
3. Print the result

**Hint:** Use `%` (modulo) to check divisibility.

---

### 8) Triangle Validator

In `TriangleValidator.java`:

1. Ask the user for three side lengths
2. Determine if they can form a valid triangle (sum of any two sides must be greater than the third)
3. If valid, determine if it's:
   - Equilateral (all sides equal)
   - Isosceles (exactly two sides equal)
   - Scalene (no sides equal)

Use compound boolean expressions for each check.
