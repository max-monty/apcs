# Formatting & Calculations Worksheet

## 1) Formatting & Calculations Challenge

Create a program that produces exactly the following output (matching spacing and line breaks):

```
Report for AP CSA
-----------------
Total: 3 students
Average Score: 86.5
Path: C:\Users\John 1\grades.txt
"Passing": true
```

### Rules/Requirements:
- Store the values in variables:
  - `String course = "AP CSA";`
  - `int total = 3;`
  - `int s1 = 84, s2 = 87, s3 = 88;`
- Compute the average as a `double`
- Use escape sequences (`\"`, `\\`, or `\n`)
- **CHALLENGE:** Print the dashed line with string repetition logic (no hard-coding `"-----------------"`). *(Hint: use a loop)*

---

## 2) Mixed-Type Expression & Overflow Logic

Write a short program that completes all the following:

### A. Score Normalization

Given:
```java
int raw = 257;
int max = 300;
```

- Compute a percentage as a `double` (0–100), rounded to one decimal place **without** using `Math.round`.

Then print:
```
Normalized: 85.7%
```
