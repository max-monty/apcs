/**
 * Answer Key: Level 2, Problem 5
 * Demonstrates: public/private static methods, helper methods
 */
public class CharTools {

    /**
     * Checks if a character is a vowel (a, e, i, o, u).
     * Case-insensitive - uses private helper to lowercase first.
     * @param c the character to check
     * @return true if c is a vowel, false otherwise
     */
    public static boolean isVowel(char c) {
        char lowered = lower(c);  // Call private helper
        return lowered == 'a' || 
               lowered == 'e' || 
               lowered == 'i' || 
               lowered == 'o' || 
               lowered == 'u';
    }

    /**
     * Private helper method - converts character to lowercase.
     * @param c the character to convert
     * @return lowercase version of c
     */
    private static char lower(char c) {
        return Character.toLowerCase(c);
    }
}
