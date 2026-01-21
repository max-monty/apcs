# Static Methods & Multi-File Practice Worksheet

---

## 🌱 LEVEL 1

### 1) Starts With Capital

In a single file `Utilities.java`, write a main plus:

```java
public static boolean startsWithCapital(String s)
```

**Main:**
1. Ask the user for a sentence (`nextLine()`)
2. Output: whether it starts with a capital letter

---

### 2) Circle Area with Rounding

In the same file, add:

```java
public static double circleArea(double r)    // use Math.PI and Math.pow
public static double round2(double x)        // round to 2 decimals
```

**Main:**
1. Ask the user for a radius (`nextDouble()`)
2. Print the area rounded to 2 decimal places using your `round2` method

---

### 3) Shout and Count Spaces

Add two more `public static` methods:

```java
public static String shout(String s)      // uppercase + "!"
public static int countSpaces(String s)   // count spaces in string
```

**Main:** Ask for a sentence and print:
- The shouted version
- The number of spaces *(NOTE: challenge, optional)*

---

## 🌿 LEVEL 2

### 4) Number Utilities (Two Files)

**File 1: `NumberUtils.java`**
```java
public static int doubleIt(int n)      // return 2*n
public static boolean isEven(int n)    // return n % 2 == 0
```

**File 2: `Driver.java`**
- Ask for an int
- Call and output results from `doubleIt(n)` and `isEven(n)` from other file

---

### 5) Character Tools (Two Files)

**File 1: `CharTools.java`**
```java
public static boolean isVowel(char c)
private static char lower(char c)      // return lowercase version (use Character.toLowerCase(c))
```

Make `isVowel` check for: a, e, i, o, u after lowering (call private helper method).

**File 2: `Driver.java`**
- Ask for a single character (via `nextLine().charAt(0)`)
- Print `CharTools.isVowel(c)`

---

## 🌲 LEVEL 3

### 6) Math Extras with Private Helper (Two Files)

**File 1: `MathExtras.java`**
```java
public static int max3(int a, int b, int c)    // largest of the three
private static int max2(int x, int y)          // helper used by max3
```

**File 2: `CalcDriver.java`**
- Ask for three ints
- Print `MathExtras.max3(a, b, c)`
