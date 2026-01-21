import java.util.Scanner;

/**
 * Answer Key: Level 2, Problem 5 - Driver
 * Demonstrates: reading single character, calling methods from another class
 */
public class CharDriver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char c = input.nextLine().charAt(0);

        // Call static method from CharTools class
        boolean vowel = CharTools.isVowel(c);

        System.out.println("'" + c + "' is a vowel: " + vowel);

        input.close();
    }
}
