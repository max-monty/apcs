import java.util.Scanner;

/**
 * Answer Key: Level 1 - StringTools Driver
 * Tests all StringTools methods
 */
public class StringToolsDriver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== StringTools Driver =====\n");

        // --- Get Person A's name ---
        System.out.print("Enter Person A's first name: ");
        String firstA = input.nextLine();
        System.out.print("Enter Person A's last name: ");
        String lastA = input.nextLine();

        // --- Get Person B's name ---
        System.out.print("Enter Person B's first name: ");
        String firstB = input.nextLine();
        System.out.print("Enter Person B's last name: ");
        String lastB = input.nextLine();

        // --- Get sentence and search word ---
        System.out.print("Enter a sentence with exactly three words: ");
        String sentence = input.nextLine();
        System.out.print("Enter a word to search for: ");
        String searchWord = input.nextLine();

        // ===== RESULTS =====
        System.out.println("\n===== RESULTS =====\n");

        // --- Part A: lastChar demonstration ---
        System.out.println("--- Part A: lastChar() ---");
        System.out.println("Last char of \"" + firstA + "\": '" + StringTools.lastChar(firstA) + "'");

        // --- Part B: Generate usernames ---
        System.out.println("\n--- Part B: makeUsername() ---");
        String usernameA = StringTools.makeUsername(firstA, lastA);
        String usernameB = StringTools.makeUsername(firstB, lastB);
        System.out.println("Person A's username: " + usernameA);
        System.out.println("Person B's username: " + usernameB);

        // --- Part C: Word search ---
        System.out.println("\n--- Part C: containsWord() ---");
        boolean found = StringTools.containsWord(sentence, searchWord);
        System.out.println("Does \"" + sentence + "\" contain \"" + searchWord + "\"? " + found);

        // --- Part D: Middle word ---
        System.out.println("\n--- Part D: middleWord() ---");
        String middle = StringTools.middleWord(sentence);
        System.out.println("Middle word of \"" + sentence + "\": \"" + middle + "\"");

        // --- Part E: Username comparison ---
        System.out.println("\n--- Part E: earlierUsername() ---");
        String earlier = StringTools.earlierUsername(firstA, lastA, firstB, lastB);
        if (earlier.equals("equal")) {
            System.out.println("The usernames are equal!");
        } else {
            System.out.println("Username that comes first alphabetically: " + earlier);
        }

        input.close();

        // ===== ADDITIONAL TEST CASES =====
        System.out.println("\n===== ADDITIONAL TEST CASES =====\n");

        // Test lastChar
        System.out.println("lastChar(\"Hello\"): '" + StringTools.lastChar("Hello") + "'");
        System.out.println("lastChar(\"X\"): '" + StringTools.lastChar("X") + "'");

        // Test makeUsername
        System.out.println("\nmakeUsername(\"Molly\", \"McGuigan\"): " + 
                           StringTools.makeUsername("Molly", "McGuigan"));
        System.out.println("makeUsername(\"JOHN\", \"SMITH\"): " + 
                           StringTools.makeUsername("JOHN", "SMITH"));

        // Test containsWord
        System.out.println("\ncontainsWord(\"hello world\", \"wor\"): " + 
                           StringTools.containsWord("hello world", "wor"));
        System.out.println("containsWord(\"hello world\", \"xyz\"): " + 
                           StringTools.containsWord("hello world", "xyz"));

        // Test middleWord
        System.out.println("\nmiddleWord(\"one two three\"): \"" + 
                           StringTools.middleWord("one two three") + "\"");
        System.out.println("middleWord(\"the quick fox\"): \"" + 
                           StringTools.middleWord("the quick fox") + "\"");

        // Test earlierUsername
        System.out.println("\nearlierUsername(\"Amy\", \"Adams\", \"Bob\", \"Brown\"): " + 
                           StringTools.earlierUsername("Amy", "Adams", "Bob", "Brown"));
        System.out.println("earlierUsername(\"Amy\", \"Adams\", \"Amy\", \"Adams\"): " + 
                           StringTools.earlierUsername("Amy", "Adams", "Amy", "Adams"));
    }
}
