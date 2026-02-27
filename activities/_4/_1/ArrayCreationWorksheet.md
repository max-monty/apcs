# Array Creation and Access Worksheet

---

## Level 1 🌱 — Your First Arrays

### 1) Favorite Numbers

In `FavoriteNumbers.java`:

1. Create an `int[]` using an initializer list with 5 of your favorite numbers
2. Print each element on its own line using its index (e.g., `nums[0]`, `nums[1]`, etc.)
3. Print the length of the array using `.length`

**Note:** `.length` is an attribute, not a method — no parentheses! (Unlike `.length()` for Strings.)

---

### 2) Day Planner

In `DayPlanner.java`:

1. Create a `String[]` with the 7 days of the week
2. Use a **for loop** (review from Unit 2) to print each day with its index:

```
0: Monday
1: Tuesday
...
6: Sunday
```

---

## Level 2 🌿 — Creating Arrays with `new`

### 3) Default Values Explorer

In `DefaultValues.java`:

Create arrays of each type using `new` (size 3 each) and print the first element of each to discover the default values:

- `int[]`
- `double[]`
- `boolean[]`
- `String[]`

Expected output:
```
int default: 0
double default: 0.0
boolean default: false
String default: null
```

---

### 4) User Scores

In `UserScores.java`:

1. Ask the user how many scores they want to enter (use `Scanner` — review from Unit 1)
2. Create an `int[]` of that size using `new`
3. Use a for loop to ask for each score and store it in the array
4. After all scores are entered, use another for loop to print them all

Example:
```
How many scores? 3
Enter score 1: 85
Enter score 2: 92
Enter score 3: 78
Your scores: 85 92 78
```

---

## Level 3 🌳 — Accessing and Modifying

### 5) Swap Ends

In `SwapEnds.java`:

1. Create an `int[]` with values `{10, 20, 30, 40, 50}`
2. Print the array
3. Swap the first and last elements using a **temp variable**
4. Print the array again

Expected:
```
Before: 10 20 30 40 50
After:  50 20 30 40 10
```

---

### 6) String Array Processing

In `StringProcessing.java`:

1. Create a `String[]` with 5 names
2. Using a for loop, print each name along with:
   - Its length (use `.length()` — review from Unit 1)
   - The first character (use `.substring(0, 1)`)
   - The name in uppercase (use `.toUpperCase()`)

Example:
```
Alice -> length: 5, first: A, upper: ALICE
Bob -> length: 3, first: B, upper: BOB
```

---

### 7) Fill Pattern

In `FillPattern.java`:

1. Create an `int[]` of size 10 using `new`
2. Use a for loop to fill it with the first 10 perfect squares: `{1, 4, 9, 16, 25, 36, 49, 64, 81, 100}`
3. Print the array

**Hint:** The square at index `i` is `(i + 1) * (i + 1)`.

---

## Level 4 🌲 — Array References

### 8) Reference vs Copy

In `ReferenceCopy.java`:

1. Create an `int[]` called `original` with values `{10, 20, 30}`
2. Create a second variable: `int[] alias = original;`
3. Modify `alias[0] = 99;`
4. Print `original[0]` — what happens and why?
5. Now make a **true copy**: create a new array of the same length, use a for loop to copy each element
6. Modify the copy and verify the original is unchanged

---

### 9) Temperature Converter

In `TempConverter.java`:

1. Use a `Scanner` to ask the user for 5 temperatures in Fahrenheit and store them in a `double[]`
2. Create a second `double[]` and fill it with the converted Celsius values
   - Formula: `C = (F - 32) * 5.0 / 9` (review: expressions and casting from Unit 1)
3. Print both arrays side by side:

```
   F     |    C
 98.6    |  37.0
 32.0    |   0.0
212.0    | 100.0
```

---

## Level 5 🌴 — Challenge

### 10) Grade Report with Parallel Arrays

In `GradeReport.java`:

1. Ask the user how many students there are (`Scanner`)
2. Create two **parallel arrays**: `String[] names` and `int[] grades`
3. Fill both arrays from user input
4. Print a formatted report that includes:
   - Each student's name and grade
   - Whether they are passing (grade >= 60) — use an **if/else** (review from Unit 2)
   - The class average — use **casting** to get a `double` result (review from Unit 1)
   - The name of the student with the highest grade — use the **find-max** pattern (review from Unit 2)

Example:
```
--- Grade Report ---
Alice: 92 (Passing)
Bob: 55 (Failing)
Charlie: 78 (Passing)

Class average: 75.0
Top student: Alice
```
