package activities._2._6;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size (odd number): ");
        int size = input.nextInt();

        // YOUR CODE HERE
        // Print a diamond pattern
        // For size=5:
        //   *
        //  ***
        // *****
        //  ***
        //   *

        // Hint: Think of it as two triangles (top expanding, bottom shrinking)
        // For each row, calculate how many spaces and how many stars

        input.close();
    }
}
