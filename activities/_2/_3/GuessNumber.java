package activities._2._3;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secret = (int) (Math.random() * 100) + 1;
        int guesses = 0;

        // YOUR CODE HERE
        // Use a while loop to let user guess until correct
        // Print "Too high" or "Too low" as hints
        // Track and print the number of guesses

        input.close();
    }
}
