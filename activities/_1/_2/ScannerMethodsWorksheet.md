# Scanner & Methods Practice Worksheet

---

## 🌱 LEVEL 1

### 1) Formatting & Calculations Challenge


### 1b) Name Analysis

Ask the user for their full name using `nextLine()`.

**Compute and Output:**
- Number of characters
- The name in ALL CAPS
- The first letter of the name

**Use:**
- `length()`
- `toUpperCase()`
- `charAt(int)`

---

### 2) Shopping Calculator

Ask for three item prices using `nextDouble()`.

**Compute and Output:**
- Subtotal
- Tax (6.25%)
- Total (rounded to 2 decimals)

**Try to do it two ways:**
1. Using `Math.round()`
2. Not using `Math.round()`

---

### 3) Student Status

Ask the user:
1. "Are you a student? (true/false)"
2. "How many classes are you taking?"

**Output:** A descriptive summary sentence.

**Use:** `nextBoolean()`

---

## 🌿 LEVEL 2

### 4) Sentence Analyzer

Ask the user for a full sentence (via `nextLine()`).

**Compute and Output:**
- Whether it ends with a question mark → `.endsWith("?")`
- The middle character → `.charAt(length/2)`

**Use:**
- `nextLine()`
- `endsWith()`
- `charAt()`

---

### 5) Password Checker

Ask user for a password using `nextLine()`.

**Compute and Print:**
- The length
- Whether it contains the character `"!"` (or a digit — choose your target)
- Whether it starts with a capital letter
- The password with all spaces replaced with underscores

**Use:**
- `nextLine()`
- `contains()`
- `replace()`
- `toUpperCase()`
- `charAt()`

---

### 6) Geometry Calculator

Ask user for:
- Radius of a circle
- Width and height of a rectangle

**Compute and Output:**
- Circle: Area & circumference
- Rectangle: Perimeter & area

**Use:**
- `Math.pow()`
- `Math.PI`
- `nextDouble()`
- Rounding functions

---

## 🌳 LEVEL 3

### 8) Math Operations

Ask user for two doubles.

**Compute and Output:**
- a^b
- The larger value
- √(a² + b²)
- Random integer between them

**Use:**
- `Math.pow()`
- `Math.max()`
- `Math.sqrt()`
- `Math.random()`

---

## 🌲 LEVEL 4

### 9) Build a Full Receipt

Create a complete receipt system:

- Ask for customer name (`nextLine()`)
- Ask how many items (`nextInt()`)
- Read each item name (`nextLine()`) and price (`nextDouble()`)
- Compute subtotal, tax, tip
- Apply a coupon like `"SAVE10"` → `.equalsIgnoreCase()`
- Print a nicely formatted receipt
