# String Algorithms Worksheet

Processing strings character by character using loops.

---

## Level 1: Basic String Traversal

### 1) Count Character

In `CountChar.java`:

Write a method:
```java
public static int countChar(String s, char target)
```

Return how many times `target` appears in `s`.

Test: `countChar("banana", 'a')` → 3

---

### 2) Reverse String

In `ReverseString.java`:

Write a method:
```java
public static String reverse(String s)
```

Return the string reversed.

Test: `reverse("hello")` → "olleh"

---

### 3) Count Vowels

In `CountVowels.java`:

Write a method:
```java
public static int countVowels(String s)
```

Return the number of vowels (a, e, i, o, u - case insensitive).

---

## Level 2: String Building

### 4) Remove Spaces

In `RemoveSpaces.java`:

Write a method:
```java
public static String removeSpaces(String s)
```

Return the string with all spaces removed.

---

### 5) Only Letters

In `OnlyLetters.java`:

Write a method:
```java
public static String onlyLetters(String s)
```

Return a string containing only the letters from the original.

Test: `onlyLetters("H3ll0 W0rld!")` → "HllWrld"

---

### 6) Alternate Case

In `AlternateCase.java`:

Write a method:
```java
public static String alternateCase(String s)
```

Return string with alternating uppercase/lowercase starting with upper.

Test: `alternateCase("hello")` → "HeLlO"

---

## Level 3: String Analysis

### 7) Is Palindrome

In `IsPalindrome.java`:

Write a method:
```java
public static boolean isPalindrome(String s)
```

Return true if the string reads the same forwards and backwards.

Test: `isPalindrome("racecar")` → true

---

### 8) First Duplicate Char

In `FirstDuplicate.java`:

Write a method:
```java
public static char firstDuplicate(String s)
```

Return the first character that appears more than once. Return '\0' if none.

Test: `firstDuplicate("abcadef")` → 'a'

---

## Level 4: Challenge

### 9) Word Count

In `WordCount.java`:

Write a method:
```java
public static int wordCount(String s)
```

Return the number of words (separated by spaces). Handle multiple spaces.

Test: `wordCount("Hello   world")` → 2

---

### 10) Pig Latin

In `PigLatin.java`:

Write a method:
```java
public static String pigLatin(String word)
```

Convert a single word to pig latin:
- If starts with vowel: add "yay" to end
- If starts with consonant: move first letter to end, add "ay"

Test: `pigLatin("hello")` → "ellohay"
Test: `pigLatin("apple")` → "appleyay"
