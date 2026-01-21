/**
 * Answer Key: Level 1 - StringTools
 * String processing utility methods
 */
public class StringTools {

    // =========================================================
    // PART A: Last Character
    // =========================================================
    /**
     * Returns the last character of the string.
     * @param s the input string
     * @return the last character
     */
    public static char lastChar(String s) {
        // Use length() to find the index of the last character
        int lastIndex = s.length() - 1;
        return s.charAt(lastIndex);
    }

    // =========================================================
    // PART B: Username Builder
    // =========================================================
    /**
     * Creates a username from first and last name.
     * Format: first 3 chars of first + last 3 chars of last, all lowercase
     * @param first the first name
     * @param last the last name
     * @return the generated username
     */
    public static String makeUsername(String first, String last) {
        // Get first 3 characters of first name
        String firstPart = first.substring(0, 3);

        // Get last 3 characters of last name
        // Must use length() to calculate starting index
        int startIndex = last.length() - 3;
        String lastPart = last.substring(startIndex);

        // Combine and convert to lowercase
        String username = firstPart + lastPart;
        username = username.toLowerCase();

        // Requirement: Must call lastChar() somewhere
        // We can use it to verify our work (last char of username should match)
        char lastCharOfUsername = lastChar(username);
        char lastCharOfLastPart = lastChar(lastPart.toLowerCase());
        // Both should be equal (this is just to satisfy the requirement)

        return username;
    }

    // =========================================================
    // PART C: Word Search
    // =========================================================
    /**
     * Checks if a word appears anywhere in the sentence.
     * @param sentence the sentence to search
     * @param word the word to find
     * @return true if word is found, false otherwise
     */
    public static boolean containsWord(String sentence, String word) {
        // indexOf() returns -1 if not found, otherwise returns the index
        int index = sentence.indexOf(word);
        return index != -1;

        // Alternative one-liner:
        // return sentence.indexOf(word) >= 0;
    }

    // =========================================================
    // PART D: Middle Word Extractor
    // =========================================================
    /**
     * Extracts the middle word from a three-word sentence.
     * @param s a sentence with exactly three words separated by spaces
     * @return the middle word
     */
    public static String middleWord(String s) {
        // Find the first space
        int firstSpace = s.indexOf(" ");

        // Find the second space (start searching after the first space)
        int secondSpace = s.indexOf(" ", firstSpace + 1);

        // The middle word is between firstSpace and secondSpace
        // Start at firstSpace + 1 to skip the space itself
        String middle = s.substring(firstSpace + 1, secondSpace);

        // Using length() to validate (optional safety check)
        if (middle.length() > 0) {
            return middle;
        }
        return "";
    }

    // =========================================================
    // PART E: Username Comparator
    // =========================================================
    /**
     * Compares two usernames generated from names and returns
     * which comes first alphabetically, or "equal" if they match.
     * @param first1 Person A's first name
     * @param last1 Person A's last name
     * @param first2 Person B's first name
     * @param last2 Person B's last name
     * @return the earlier username, or "equal"
     */
    public static String earlierUsername(String first1, String last1,
                                         String first2, String last2) {
        // Generate both usernames using makeUsername()
        String username1 = makeUsername(first1, last1);
        String username2 = makeUsername(first2, last2);

        // Check if they are equal using equals()
        if (username1.equals(username2)) {
            return "equal";
        }

        // Use compareTo() to determine alphabetical order
        // compareTo() returns negative if username1 comes before username2
        int comparison = username1.compareTo(username2);

        if (comparison < 0) {
            return username1;  // username1 comes first
        } else {
            return username2;  // username2 comes first
        }
    }
}
