# If Statements & Nested Conditionals Worksheet

---

## Level 1: Basic If-Else

### 1) Letter Grade

In `LetterGrade.java`:

1. Ask the user for a numeric grade (0-100)
2. Print the letter grade:
   - 90+ → A
   - 80-89 → B
   - 70-79 → C
   - 60-69 → D
   - Below 60 → F

---

### 2) Number Sign

In `NumberSign.java`:

1. Ask for an integer
2. Print whether it is positive, negative, or zero

---

## Level 2: Nested If Statements

### 3) Movie Ticket Price

In `MovieTicket.java`:

Ticket prices depend on age AND time of day:
- Under 12: $8
- 12-64: $12 (but $9 for matinee before 5pm)
- 65+: $10

1. Ask for age and hour (0-23)
2. Use nested if statements to determine and print the price

---

### 4) Login System

In `LoginSystem.java`:

1. Store a correct username and password as variables
2. Ask user to enter username and password
3. Using nested ifs:
   - If username is wrong → "Username not found"
   - If username right but password wrong → "Incorrect password"
   - If both correct → "Welcome!"

---

## Level 3: Refactoring Nested to Compound

### 5) Shipping Calculator

In `ShippingCalc.java`:

Free shipping if:
- Order is $50+ AND customer is a member, OR
- Order is $100+ (regardless of membership)

1. Ask for order total and whether they're a member (y/n)
2. First write it with nested ifs
3. Then refactor to a single if with compound boolean

---

### 6) Amusement Park Ride

In `RideCheck.java`:

A rider can go on the ride if:
- Height is at least 48 inches, OR
- Height is at least 42 inches AND accompanied by adult

1. Ask for height and whether accompanied (y/n)
2. Write using nested if statements
3. Rewrite using a single compound boolean expression

---

## Level 4: Challenge

### 7) BMI Calculator

In `BMICalculator.java`:

1. Ask for weight (lbs) and height (inches)
2. Calculate BMI: `(weight / (height * height)) * 703`
3. Print the category:
   - Below 18.5 → Underweight
   - 18.5-24.9 → Normal
   - 25-29.9 → Overweight
   - 30+ → Obese

---

### 8) Rock Paper Scissors

In `RPS.java`:

1. Ask player for their choice (rock/paper/scissors)
2. Generate computer choice using `Math.random()`
3. Determine and print the winner using nested ifs
