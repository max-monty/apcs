# String Processing Methods Worksheet

Build utility classes with string-processing methods. Each part adds functionality that depends on previous parts.

---

## Level 1: StringTools

You will build a class called `StringTools` that contains several related string-processing methods. A separate `Driver` class will test your methods.

---

### Part A — Last Character

In `StringTools.java`, write:

```java
public static char lastChar(String s)
```

Return the last character of the string.

**Requirement:** Must use `length()`.

---

### Part B — Username Builder

Add to `StringTools.java`:

```java
public static String makeUsername(String first, String last)
```

Return a username formed by:
- The first 3 characters of `first`
- The last 3 characters of `last`
- All lowercase

**Requirements:**
- Must use `substring()`
- Must use `length()`
- Must call `lastChar()` at least once somewhere in your logic

---

### Part C — Word Search

Add:

```java
public static boolean containsWord(String sentence, String word)
```

Return `true` if `word` appears anywhere inside `sentence`.

**Requirement:** Use `indexOf()`.

---

### Part D — Middle Word Extractor

Add:

```java
public static String middleWord(String s)
```

Assume the sentence contains exactly three words separated by spaces.

Return the middle word only.

**Requirements:**
- Must use `indexOf()`
- Must use `substring()`
- Must use `length()` to avoid index errors

---

### Part E — Username Comparator

Add:

```java
public static String earlierUsername(String first1, String last1,
                                     String first2, String last2)
```

This method should:
1. Generate two usernames using `makeUsername(...)`
2. If the usernames are equal, return `"equal"`
3. Otherwise, return whichever username comes first alphabetically

**Requirements:**
- Must call `makeUsername()`
- Must use `equals()`
- Must use `compareTo()`

---

### Driver Program

Create a `Driver.java` that:

1. Asks the user for:
   - First name and last name for Person A
   - First name and last name for Person B
   - A sentence with three words
   - A search word

2. Prints:
   - Each person's username
   - Which username comes first (or "equal")
   - The middle word of the sentence
   - Whether the sentence contains the search word

---

## Level 2: AccountTools

Build on your string skills with more complex processing using loops.

---

### Part A — Normalize Spacing (Loops)

In `AccountTools.java`, write:

```java
public static String collapseSpaces(String s)
```

Return a version of `s` where:
- Leading and trailing spaces are removed
- Any run of multiple spaces inside the string becomes exactly one space

**Examples:**
- `"  Molly   Anne   McGuigan  "` → `"Molly Anne McGuigan"`
- `"Java    is   fun"` → `"Java is fun"`

**Constraints:** Do not use `trim()` or `replaceAll()`. Use loops, `substring()`, `length()`, `indexOf()` as needed.

---

### Part B — Proper Case Name (Loops + Conditionals)

Add:

```java
public static String properCaseName(String fullName)
```

Assume `fullName` is three words: "first middle last" (but may have messy spacing and random capitalization).

Return the name in this exact format:
- First letter of each word uppercase
- Remaining letters lowercase
- Words separated by one space

**You must call `collapseSpaces()` first.**

**Example:**
- Input: `"  mOLLy   aNNe   mcGUIGAN  "`
- Output: `"Molly Anne Mcguigan"`

**Note:** You may use `Character.toUpperCase()` and `Character.toLowerCase()`.

---

### Part C — Keyword Match as a Whole Word (Loops)

Add:

```java
public static boolean containsWholeWord(String comment, String keyword)
```

Return `true` if `keyword` appears in `comment` as a **whole word**, meaning it is:
- At the start of the string OR preceded by a space, **AND**
- At the end of the string OR followed by a space

**Examples:**
- Comment: `"needs bus pass"`, keyword: `"bus"` → `true`
- Comment: `"reimburse buspass"`, keyword: `"bus"` → `false`
- Comment: `"bus"`, keyword: `"bus"` → `true`

**Hint:** You can call `indexOf` with a second parameter: `indexOf(keyword, startIndex)`

---

### Part D — Count Records with Duplicate Usernames (Nested Loops)

Add:

```java
public static int countDuplicateUsernames(String[] firstNames, String[] lastNames)
```

`firstNames[i]` and `lastNames[i]` belong to the same student.

Return the number of students who have a username that appears more than once.

**Important:** If three students share the same username, you should count all three.

**Example:**
- Usernames: `["abcxyz", "abcxyz", "pqrstu"]` → return `2`
- Usernames: `["same00", "same00", "same00"]` → return `3`

**Constraints:**
- Must use nested loops
- Must call `makeUsername()`
- Must use `equals()`
