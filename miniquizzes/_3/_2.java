package miniquizzes._3;

public class _2 {
    public static void main(String[] args) {

        // Use this class for the questions below:

        // public class Account {
        //     private String owner;
        //     private int balance;
        //
        //     public Account(String o, int b) { owner = o; balance = b; }
        //     public int getBalance() { return balance; }
        //     public void deposit(int amount) { balance += amount; }
        //     public void transferTo(Account other, int amount) {
        //         balance -= amount;
        //         other.balance += amount;
        //     }
        //     public String toString() { return owner + ": $" + balance; }
        // }

        // PART 1: What does this code print?
        // Account a = new Account("Alice", 100);
        // Account b = new Account("Bob", 50);
        // a.transferTo(b, 30);
        // System.out.println(a);
        // System.out.println(b);

        // PART 2: What does this code print?
        // Account x = new Account("X", 200);
        // Account y = x;
        // y.deposit(50);
        // System.out.println(x.getBalance());

        // PART 3: What does this code print?
        // Account m = new Account("M", 100);
        // Account n = new Account("N", 200);
        // Account bigger = (m.getBalance() > n.getBalance()) ? m : n;
        // bigger.deposit(500);
        // System.out.println(n);

        // PART 4: True or false?
        // In the transferTo method, the line other.balance += amount compiles
        // even though balance is private. Why or why not?
    }
}
