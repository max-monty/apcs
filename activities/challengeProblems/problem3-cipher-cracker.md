# Problem 3: Substitution Cipher Cracker (Frequency + Constraints)

## Overview

A **monoalphabetic substitution cipher** replaces every letter in a message with a
different letter using a fixed, consistent mapping. For example, every `A` might become
`Q`, every `B` might become `X`, and so on. Given only the ciphertext, your program will
attempt to recover the original message using **letter frequency analysis** — a classical
cryptanalysis technique.

This is a genuine puzzle: there's no single correct answer, and you'll need to reason
about how to design your program so it improves its own guesses.

---

## Background

### English Letter Frequency Order

In ordinary English text, letters appear with roughly this frequency (most → least common):

```
E  T  A  O  I  N  S  H  R  D  L  C  U  M  W  F  G  Y  P  B  V  K  J  X  Q  Z
```

The approach: count how often each letter appears in the ciphertext, rank them from most
to least frequent, then map the most common ciphertext letter → `E`, the next → `T`, and
so on.

This gives a **starting guess** — but English isn't perfectly regular, so you'll also
implement a **hill-climbing** refinement step.

---

## What You Are Given

Your program will receive:

1. **Ciphertext** — a single line of text (read with `Scanner.nextLine()`). Punctuation,
   spaces, and capitalization are **preserved** in output; only letters are substituted.

2. **A hint dictionary** (hard-code this array in your program):

```java
String[] DICTIONARY = {
        "the", "and", "to", "of", "a", "in", "is", "it", "you", "that",
        "he", "was", "for", "on", "are", "as", "with", "his", "they", "at",
        "be", "this", "from", "or", "one", "have", "an", "by", "but", "not",
        "had", "her", "she", "all", "there", "been", "when", "who", "will",
        "would", "said", "each", "which", "do", "their", "what", "so", "up",
        "old", "man", "told", "him", "about", "going", "place", "them",
        "were", "first", "if",
        "i", "my", "me", "we", "us", "our", "no", "yes", "did", "has",
        "can", "may", "its", "how", "than", "then", "now", "out", "just",
        "also", "into", "could", "come", "made", "after", "back", "only",
        "new", "some", "time", "very", "your", "way", "any", "more",
        "other", "like", "over", "such", "here", "take", "most", "too",
        "well", "where", "much", "down", "should", "still", "get", "own",
        "even", "make", "good", "give", "people", "before", "two", "work",
        "long", "day", "see", "look", "think", "know", "many", "great",
        "while", "right", "same", "through", "say", "last", "might",
        "never", "every", "between", "under", "must", "another",
        "am", "if", "go", "off", "put", "let", "set", "few", "end",
        "got", "yet", "why", "men", "run", "too", "big", "far", "tell",
        "keep", "help", "hand", "away", "left", "life", "home", "need",
        "head", "went", "came", "find", "want", "use",
        "found", "called", "used", "being", "again", "began", "took",
        "asked", "three", "house", "world", "part", "small", "those",
        "thing", "though", "without", "nothing", "upon", "whole",
        "enough", "almost", "however", "once", "side", "both",
        "next", "always", "point", "turn", "until", "number",
        "young", "eyes", "against", "night", "left", "above",
        "name", "little", "year", "face", "done", "seen"
    };
```

---

## Requirements

### Data Representation

Represent your cipher mapping as a `char[]` of length 26, where index `i` holds the
**plaintext letter** that ciphertext letter `i` maps to.

```java
char[] mapping = new char[26];
// mapping[0] = 'e' means ciphertext 'A'/'a' decodes to 'E'/'e'
```

Also maintain a `boolean[] used` of length 26 to track which plaintext letters have
already been assigned (no two ciphertext letters may decode to the same plaintext letter).

### Required Methods

```java
// Count how many times each letter (0=A ... 25=Z) appears in the text
int[] letterFrequency(String text)

// Apply the current mapping to ciphertext; preserve case, spaces, punctuation
String applyMapping(String ciphertext, char[] mapping)

// Count how many words in the decoded text appear in DICTIONARY
int scoreCandidate(String plaintext)

// Swap the plaintext assignments of two ciphertext letters in the mapping
void swapMapping(char[] mapping, int i, int j)
```

### Algorithm Steps

1. **Frequency analysis:** Call `letterFrequency` on the ciphertext. Sort the 26 letters
   by frequency (highest first). Map the most frequent ciphertext letter to `'e'`, the
   next to `'t'`, and so on through `ETAOINSHRDLCUMWFGYPBVKJXQZ`.

2. **Decode and score:** Call `applyMapping` and `scoreCandidate` on the initial guess.
   Store this as your `bestScore` and `bestPlaintext`.

3. **Hill-climb (at least 5000 iterations):** In a loop:
   - Pick two random ciphertext letter indices `i` and `j`.
   - Swap their plaintext assignments using `swapMapping`.
   - Decode the ciphertext and score it.
   - If the new score is **better**, keep the swap. Otherwise, undo it.

4. **Output:**
   - Print the final mapping table (see format below).
   - Print the best-guess plaintext.

### Output Format

```
Mapping:
A -> k
B -> m
C -> j
...
Z -> d

Decoded:
<best guess plaintext here>
```

Preserve the original ciphertext's capitalization: if the original ciphertext character
was uppercase, the decoded character should be uppercase; if lowercase, lowercase.

---

## Sample Input and Output

### Sample Input
```
ekt xsz bqo yqpz ekqe kt ixvsz oxe kqht mtto ektrt pg ykt kqz oxe exsz kpb qmxve ekt xot ikx iqy fxpof ex mt ipek qss xg ektb grxb ekpy nsqjt qoz ektd itrt oxe yqpz ex kqht mtto ekt gprye.
```

### Sample Output (approximate — yours may vary)
```
Mapping:
A -> k
B -> m
...
Z -> d

Decoded:
"the old man said that he would not have been there if she had not told him about the one who was going to be with all of them from this place and they were not said to have been the first."
```

*(Because hill-climbing is randomized, your exact output may differ slightly, but the
dictionary word count should be high.)*

---

## Puzzle Twist: Constraints

Your mapping must always satisfy:

1. **Consistency:** One ciphertext letter always maps to the same plaintext letter.
   (This is automatic if you use the `mapping[]` array correctly.)
2. **Injectivity:** No two ciphertext letters map to the same plaintext letter.
   (Enforce this via the `used[]` array and the `swapMapping` method — a swap
   cannot produce duplicates.)

If your initial frequency mapping accidentally assigns the same plaintext letter twice
(possible if two ciphertext letters share the same count), you must resolve the conflict
before proceeding.

---

## Suggested Development Order

1. Write `letterFrequency` and print the top 5 letters of a test string to verify.
2. Write `applyMapping` — this is critical to get right before anything else.
3. Write `scoreCandidate` — how many dictionary words appear in the decoded string?
   Use `String.contains()` or split into words and check each.
4. Build the initial frequency mapping and manually check `applyMapping` output.
5. Add the hill-climbing loop and watch the score go up.

---

## Edge Cases to Handle

- **Short ciphertext** (< 26 unique letters) — some letters may never appear.
  Assign the remaining plaintext letters to unused ciphertext letters arbitrarily.
- **Punctuation and spaces** — `applyMapping` must leave non-letters unchanged.
- **Case preservation** — `'A'` and `'a'` are the same ciphertext letter; decode both
  and adjust case in the output.
- **All-caps ciphertext** — still works, just decode and re-apply case rules.

---

## Scoring Rubric Hint

A `scoreCandidate` value of **8+** (out of the 47 dictionary words) on a typical
English paragraph is a good target. The hill-climbing should consistently push you
above the naive frequency mapping.

---

## Extension Challenges

- **Simulated annealing:** Instead of only accepting improvements, occasionally accept
  worse swaps early in the search (with decreasing probability over time). This helps
  escape local optima.
- **Digraph frequency:** English has predictable two-letter patterns (`TH`, `HE`, `IN`,
  `ER`). Use digraph counts as an additional signal to refine the mapping.
- **Interactive mode:** After decoding, let the user manually override a mapping entry
  (`"Set X -> r"`) and re-score, then continue hill-climbing from the new state.
