import java.util.Scanner;

/**
 * Answer Key: Level 2, Problem 4 - Driver
 * Demonstrates: calling static methods from another class
 */
public class NumberDriver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        // Call static methods from NumberUtils class
        int doubled = NumberUtils.doubleIt(n);
        boolean even = NumberUtils.isEven(n);

        System.out.println("Doubled: " + doubled);
        System.out.println("Is even: " + even);

        input.close();
    }
}
