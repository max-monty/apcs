package activities._2._2;

import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rock, paper, or scissors: ");
        String player = input.nextLine().toLowerCase();

        // Generate computer choice
        int rand = (int) (Math.random() * 3);
        String computer;
        if (rand == 0) {
            computer = "rock";
        } else if (rand == 1) {
            computer = "paper";
        } else {
            computer = "scissors";
        }

        System.out.println("Computer chose: " + computer);

        // YOUR CODE HERE
        // Use nested ifs to determine winner
        // Remember: rock beats scissors, scissors beats paper, paper beats rock

        input.close();
    }
}
