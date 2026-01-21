import java.util.Scanner;

/**
 * Answer Key: Level 2 - AccountTools Driver
 * Tests all AccountTools methods
 */
public class AccountToolsDriver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== AccountTools Driver =====\n");

        // =========================================================
        // PART A: collapseSpaces
        // =========================================================
        System.out.println("--- Part A: collapseSpaces() ---\n");

        System.out.print("Enter a string with messy spacing: ");
        String messyString = input.nextLine();

        String collapsed = AccountTools.collapseSpaces(messyString);
        System.out.println("Original: \"" + messyString + "\"");
        System.out.println("Collapsed: \"" + collapsed + "\"");

        // Additional test cases
        System.out.println("\nMore test cases:");
        System.out.println("\"  Molly   Anne   McGuigan  \" → \"" + 
                           AccountTools.collapseSpaces("  Molly   Anne   McGuigan  ") + "\"");
        System.out.println("\"Java    is   fun\" → \"" + 
                           AccountTools.collapseSpaces("Java    is   fun") + "\"");
        System.out.println("\"   leading\" → \"" + 
                           AccountTools.collapseSpaces("   leading") + "\"");
        System.out.println("\"trailing   \" → \"" + 
                           AccountTools.collapseSpaces("trailing   ") + "\"");
        System.out.println("\"no extra spaces\" → \"" + 
                           AccountTools.collapseSpaces("no extra spaces") + "\"");

        // =========================================================
        // PART B: properCaseName
        // =========================================================
        System.out.println("\n--- Part B: properCaseName() ---\n");

        System.out.print("Enter a messy full name (first middle last): ");
        String messyName = input.nextLine();

        String properName = AccountTools.properCaseName(messyName);
        System.out.println("Original: \"" + messyName + "\"");
        System.out.println("Proper case: \"" + properName + "\"");

        // Additional test cases
        System.out.println("\nMore test cases:");
        System.out.println("\"  mOLLy   aNNe   mcGUIGAN  \" → \"" + 
                           AccountTools.properCaseName("  mOLLy   aNNe   mcGUIGAN  ") + "\"");
        System.out.println("\"JOHN PAUL JONES\" → \"" + 
                           AccountTools.properCaseName("JOHN PAUL JONES") + "\"");
        System.out.println("\"mary jane watson\" → \"" + 
                           AccountTools.properCaseName("mary jane watson") + "\"");
        System.out.println("\"  aBc   DeF   gHi  \" → \"" + 
                           AccountTools.properCaseName("  aBc   DeF   gHi  ") + "\"");

        // =========================================================
        // PART C: containsWholeWord
        // =========================================================
        System.out.println("\n--- Part C: containsWholeWord() ---\n");

        System.out.print("Enter a comment/sentence: ");
        String comment = input.nextLine();
        System.out.print("Enter a keyword to search for: ");
        String keyword = input.nextLine();

        boolean isWholeWord = AccountTools.containsWholeWord(comment, keyword);
        System.out.println("Comment: \"" + comment + "\"");
        System.out.println("Keyword: \"" + keyword + "\"");
        System.out.println("Contains as whole word: " + isWholeWord);

        // Additional test cases
        System.out.println("\nMore test cases:");
        System.out.println("\"needs bus pass\", \"bus\" → " + 
                           AccountTools.containsWholeWord("needs bus pass", "bus"));
        System.out.println("\"reimburse buspass\", \"bus\" → " + 
                           AccountTools.containsWholeWord("reimburse buspass", "bus"));
        System.out.println("\"bus\", \"bus\" → " + 
                           AccountTools.containsWholeWord("bus", "bus"));
        System.out.println("\"busboy\", \"bus\" → " + 
                           AccountTools.containsWholeWord("busboy", "bus"));
        System.out.println("\"the bus\", \"bus\" → " + 
                           AccountTools.containsWholeWord("the bus", "bus"));
        System.out.println("\"bus stop\", \"bus\" → " + 
                           AccountTools.containsWholeWord("bus stop", "bus"));
        System.out.println("\"airbus flies\", \"bus\" → " + 
                           AccountTools.containsWholeWord("airbus flies", "bus"));

        // =========================================================
        // PART D: countDuplicateUsernames
        // =========================================================
        System.out.println("\n--- Part D: countDuplicateUsernames() ---\n");

        // Test case 1: Two duplicates
        String[] firstNames1 = {"Abcdef", "Abcdef", "Pqrstu"};
        String[] lastNames1 = {"Xyzabc", "Xyzabc", "Vwxyz1"};

        System.out.println("Test 1: [\"Abcdef\", \"Abcdef\", \"Pqrstu\"] / [\"Xyzabc\", \"Xyzabc\", \"Vwxyz1\"]");
        System.out.print("Usernames: ");
        for (int i = 0; i < firstNames1.length; i++) {
            System.out.print(StringTools.makeUsername(firstNames1[i], lastNames1[i]));
            if (i < firstNames1.length - 1) System.out.print(", ");
        }
        System.out.println();
        System.out.println("Duplicate count: " + AccountTools.countDuplicateUsernames(firstNames1, lastNames1));
        System.out.println("Expected: 2");

        // Test case 2: Three duplicates (all same)
        String[] firstNames2 = {"Samuel", "Samuel", "Samuel"};
        String[] lastNames2 = {"Anders", "Anders", "Anders"};

        System.out.println("\nTest 2: Three identical names");
        System.out.print("Usernames: ");
        for (int i = 0; i < firstNames2.length; i++) {
            System.out.print(StringTools.makeUsername(firstNames2[i], lastNames2[i]));
            if (i < firstNames2.length - 1) System.out.print(", ");
        }
        System.out.println();
        System.out.println("Duplicate count: " + AccountTools.countDuplicateUsernames(firstNames2, lastNames2));
        System.out.println("Expected: 3");

        // Test case 3: No duplicates
        String[] firstNames3 = {"Amy", "Bob", "Cat"};
        String[] lastNames3 = {"Adams", "Brown", "Clark"};

        System.out.println("\nTest 3: No duplicates");
        System.out.print("Usernames: ");
        for (int i = 0; i < firstNames3.length; i++) {
            System.out.print(StringTools.makeUsername(firstNames3[i], lastNames3[i]));
            if (i < firstNames3.length - 1) System.out.print(", ");
        }
        System.out.println();
        System.out.println("Duplicate count: " + AccountTools.countDuplicateUsernames(firstNames3, lastNames3));
        System.out.println("Expected: 0");

        // Test case 4: Two pairs of duplicates
        String[] firstNames4 = {"Amy", "Amy", "Bob", "Bob"};
        String[] lastNames4 = {"Adams", "Adams", "Brown", "Brown"};

        System.out.println("\nTest 4: Two pairs of duplicates");
        System.out.print("Usernames: ");
        for (int i = 0; i < firstNames4.length; i++) {
            System.out.print(StringTools.makeUsername(firstNames4[i], lastNames4[i]));
            if (i < firstNames4.length - 1) System.out.print(", ");
        }
        System.out.println();
        System.out.println("Duplicate count: " + AccountTools.countDuplicateUsernames(firstNames4, lastNames4));
        System.out.println("Expected: 4");

        input.close();

        System.out.println("\n===== ALL TESTS COMPLETE =====");
    }
}
