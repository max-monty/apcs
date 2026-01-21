package activities._2._1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // A year is a leap year if:
        // - It is divisible by 4 AND
        // - It is NOT divisible by 100, OR it IS divisible by 400

        // YOUR CODE HERE
        // Write a single compound boolean expression
        // boolean isLeapYear = ...

        // Print the result

        input.close();
    }
}
