package activities._2._3;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        // YOUR CODE HERE
        // Check if n is prime
        // A number is prime if no integer from 2 to n-1 divides it evenly

        input.close();
    }
}
