# Object References Worksheet

Build a `Wallet` and `Store` system that demonstrates passing and returning object references.

---

## Level 1 🌱 — Wallet Basics

### 1) Wallet Class

In `Wallet.java`, create a class with:

- Private instance variables: `String owner`, `double balance`
- A parameterized constructor that takes both values
- A default constructor that sets owner to `"Anonymous"` and balance to `0.0`
- Accessors: `getOwner()`, `getBalance()`
- `toString()` that returns something like: `Alice: $150.00`

---

## Level 2 🌿 — Wallet Operations

### 2) Deposit

Add a void method `void deposit(double amount)` that adds to the balance (only if amount is positive).

### 3) Withdraw

Add a method `boolean withdraw(double amount)` that:
- Subtracts `amount` from balance if there are sufficient funds
- Returns `true` if the withdrawal succeeded, `false` otherwise

Test both methods in a `main` method.

---

## Level 3 🌳 — Object References as Parameters

### 4) Transfer

Add a method `void transferTo(Wallet other, double amount)` that:
- Withdraws `amount` from this wallet
- Deposits `amount` into `other`
- Only transfers if this wallet has enough funds

Notice how calling `transferTo` modifies **both** wallet objects.

Test:
```java
Wallet w1 = new Wallet("Alice", 200.0);
Wallet w2 = new Wallet("Bob", 50.0);
w1.transferTo(w2, 75.0);
System.out.println(w1); // Alice: $125.00
System.out.println(w2); // Bob: $125.00
```

---

## Level 4 🌲 — Store Class

### 5) Store

In `Store.java`, create a class with:

- Private instance variables: `String name`, `double revenue`
- A constructor and `toString()`
- A method `boolean makeSale(Wallet customer, double price)` that:
  - Attempts to withdraw `price` from the customer's wallet
  - If successful, adds `price` to the store's `revenue` and returns `true`
  - If the customer can't afford it, returns `false`

Test:
```java
Wallet w = new Wallet("Alice", 100.0);
Store s = new Store("BookShop", 0.0);
System.out.println(s.makeSale(w, 25.0)); // true
System.out.println(w);  // Alice: $75.00
System.out.println(s.makeSale(w, 200.0)); // false
```

---

## Level 5 🌴 — Shopping Simulation

### 6) ShoppingDriver

In `ShoppingDriver.java`, write a program that:

1. Use a `Scanner` to ask the user for a starting balance, then store 3 wallets in a `Wallet[]` array (use the user's input for one of the balances) and 2 stores in a `Store[]` array
2. Uses a **for loop** to print each wallet's starting balance
3. Simulates several transactions (some that succeed, some that fail)
4. After all transactions, use a **for loop** to print each wallet's final balance and each store's total revenue
5. Use the **find-max algorithm** (from Unit 2) to loop through the wallet array and find which wallet has the highest remaining balance
6. Use the **find-min algorithm** to find which wallet has the lowest remaining balance

**Hint:** To find the richest wallet, loop through the array, compare balances using `getBalance()`, and keep track of the index (or reference) of the wallet with the highest value — just like finding the max in an `int[]`.
