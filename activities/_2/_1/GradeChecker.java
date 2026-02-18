package activities._2._1;

import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for a numeric grade (0-100)
        System.out.print("Enter a grade (0-100): ");

        int grade = input.nextInt();

        boolean isPassing = grade > 60;
        boolean isA = grade > 90;

        if (isA) {
            System.out.println("Got an A");
        } else if (isPassing) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed.");
        }

        // YOUR CODE HERE
        // 1. Read the grade
        // 2. Create boolean variables for isPassing and isA
        // 3. Print the results

        input.close();
    }
}
