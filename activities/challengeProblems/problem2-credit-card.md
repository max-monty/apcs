# Problem 2: Credit Card Validator + Card Type Detector

## Overview

Credit card numbers look random, but they follow strict mathematical rules designed to
catch typos and transcription errors. In this problem you will implement **Luhn's
algorithm** to validate a credit card number, then identify which card network issued it
based on its length and starting digits — all without ever converting the number to a
numeric type.

---

## Background: Luhn's Algorithm

Luhn's algorithm works on the string of digits from **right to left**:

1. Starting from the **second-to-last** digit and moving left, **double every other
   digit**.
2. If doubling a digit produces a value ≥ 10, **subtract 9** from it (equivalently,
   add the two resulting digits together: 18 → 1 + 8 = 9).
3. Sum all the digits (both the doubled/adjusted ones and the untouched ones).
4. If the total is divisible by 10, the number is valid.

---

## Card Type Rules

If the number passes Luhn's check, classify it:

| Type       | Length      | Starting digits |
|------------|-------------|-----------------|
| AMEX       | 15 digits   | `34` or `37`    |
| MASTERCARD | 16 digits   | `51`–`55`       |
| VISA       | 13 or 16 digits | `4`         |
| VALID      | anything else valid | —         |

If the number fails Luhn's check: output `INVALID`.

---

## Requirements

1. Read the card number as a `String` (use `Scanner.next()`).
2. **Reject immediately** (output `INVALID`) if the input contains any non-digit
   character, including spaces, hyphens, or letters.
3. Implement a `boolean isValid(String number)` method that runs Luhn's algorithm.
4. Implement a `String cardType(String number)` method that returns `"AMEX"`,
   `"MASTERCARD"`, `"VISA"`, or `"VALID"`. This method may assume the number has
   already been validated.
5. A `boolean allDigits(String s)` helper method to check for non-digit characters.
6. Output exactly one word on its own line.

---

## Sample Inputs and Outputs

### Sample 1 — Valid VISA
**Input:** `4003600000000014`
**Output:** `VISA`

### Sample 2 — Valid AMEX
**Input:** `378282246310005`
**Output:** `AMEX`

### Sample 3 — Valid MASTERCARD
**Input:** `5105105105105100`
**Output:** `MASTERCARD`

### Sample 4 — Invalid number (bad checksum)
**Input:** `1234567890123456`
**Output:** `INVALID`

### Sample 5 — Contains non-digit characters
**Input:** `4003-6000-0000-0014`
**Output:** `INVALID`

### Sample 6 — Valid but unknown type
**Input:** `6011111111111117`  *(Discover card — not in our type list)*
**Output:** `VALID`

### Sample 7 — All zeros (edge case)
**Input:** `0000000000000000`
**Output:** `INVALID`

---

## Edge Cases to Handle

- **Empty string** → `INVALID`
- **Single digit** `"0"` → does it pass Luhn? (`0 % 10 == 0` → yes, but only 1 digit,
  so it's `VALID` by type rules — interesting! Think about whether you want to handle
  this.)
- **Exactly 13 digits starting with 4** → `VISA`
- **16 digits starting with 50** → passes Luhn? If so, `VALID` (not MASTERCARD, which
  requires 51–55).

---

## Extension Challenges

- Accept card numbers with **spaces or hyphens** as formatting (e.g.,
  `4003 6000 0000 0014`) by stripping those characters first before validation.
- Print a **formatted receipt**: mask all but the last four digits
  (`**** **** **** 0014`).
- Support **Discover** (16 digits, starts with `6011`) and **UnionPay** (16–19 digits,
  starts with `62`) in your type detector.
