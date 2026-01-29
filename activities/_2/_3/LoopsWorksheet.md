# While Loops & For Loops Worksheet

---

## Level 1: Basic Loops

### 1) Countdown

In `Countdown.java`:

Use a for loop to print a countdown from 10 to 1, then print "Liftoff!"

---

### 2) Sum of N

In `SumN.java`:

1. Ask the user for a positive integer n
2. Use a loop to calculate and print the sum of 1 + 2 + ... + n

---

### 3) Times Table

In `TimesTable.java`:

1. Ask the user for a number
2. Print its times table from 1-10

Example for input 7:
```
7 x 1 = 7
7 x 2 = 14
...
7 x 10 = 70
```

---

## Level 2: While vs For

### 4) Guess the Number

In `GuessNumber.java`:

1. Generate a random number 1-100
2. Ask the user to guess until they get it
3. Give hints "Too high" or "Too low"
4. Count and print how many guesses it took

**Use a while loop** (you don't know how many guesses it will take)

---

### 5) Factorial

In `Factorial.java`:

1. Ask for a positive integer n
2. Calculate n! (n factorial = n × (n-1) × ... × 2 × 1)
3. Print the result

Example: 5! = 120

---

### 6) Powers of 2

In `PowersOfTwo.java`:

1. Ask the user for a limit
2. Print all powers of 2 that are less than or equal to the limit

Example for limit 100:
```
1 2 4 8 16 32 64
```

---

## Level 3: Loop Patterns

### 7) FizzBuzz

In `FizzBuzz.java`:

Print numbers 1-100, but:
- If divisible by 3, print "Fizz"
- If divisible by 5, print "Buzz"
- If divisible by both, print "FizzBuzz"

---

### 8) Input Validation

In `ValidInput.java`:

1. Ask the user for a number between 1 and 10
2. If they enter something outside that range, keep asking
3. Use a while loop to validate input
4. Once valid, print "Thank you!"

---

### 9) Password Creator

In `PasswordCreator.java`:

1. Ask the user to create a password
2. The password must meet ALL of these requirements:
   - At least 8 characters long
   - Contains at least one digit (0-9)
3. If the password doesn't meet the requirements, tell them what's missing and ask again
4. Keep looping until they enter a valid password
5. Print "Password accepted!" when done

**Use a while loop** (you don't know how many attempts it will take)

**Hint:** Use `.length()` to check length. To check for a digit, loop through each character and use `Character.isDigit(char)`.

---

### 10) Running Total

In `RunningTotal.java`:

1. Continuously ask the user for numbers to add to a running total
2. After each number, print the current total
3. If the user enters 0, stop the loop and print the final total
4. The loop runs indefinitely until the user chooses to stop

Example:
```
Enter a number (0 to quit): 5
Total: 5
Enter a number (0 to quit): 12
Total: 17
Enter a number (0 to quit): 3
Total: 20
Enter a number (0 to quit): 0
Final total: 20
```

**Use a while loop** (the user decides when to stop)

---

## Level 4: Challenge

### 11) Prime Checker

In `PrimeChecker.java`:

1. Ask for a positive integer
2. Determine if it's prime (only divisible by 1 and itself)
3. Print the result

**Hint:** A number n is prime if no integer from 2 to n-1 divides it evenly.

---

### 12) Number Pyramid

In `Pyramid.java`:

Ask for a height n, then print a number pyramid:

For n = 5:
```
1
12
123
1234
12345
```
