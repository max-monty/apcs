package activities._2._2;

import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter hour (0-23): ");
        int hour = input.nextInt();

        // YOUR CODE HERE
        // Use nested if statements to determine ticket price
        // Under 12: $8
        // 12-64: $12 (but $9 for matinee before 5pm)
        // 65+: $10

        input.close();
    }
}
