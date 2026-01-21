import java.util.Scanner;

/**
 * Answer Key: Level 3, Problem 6 - Driver
 * Demonstrates: calling public static method (which uses private helper internally)
 */
public class CalcDriver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        System.out.print("Enter third integer: ");
        int c = input.nextInt();

        // Call public static method from MathExtras
        // Note: We cannot call MathExtras.max2() here because it's private!
        int largest = MathExtras.max3(a, b, c);

        System.out.println("The largest of " + a + ", " + b + ", " + c + " is: " + largest);

        input.close();
    }
}
