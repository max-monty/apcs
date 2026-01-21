/**
 * Answer Key: Level 2 - AccountTools
 * Advanced string processing with loops
 */
public class AccountTools {

    // =========================================================
    // PART A: Collapse Spaces (No trim() or replaceAll())
    // =========================================================
    /**
     * Removes leading/trailing spaces and collapses multiple internal
     * spaces into single spaces.
     * @param s the input string
     * @return the normalized string
     */
    public static String collapseSpaces(String s) {
        String result = "";
        boolean lastWasSpace = true;  // Treat start as "after a space" to skip leading spaces

        // Process each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                // Only add space if the last character wasn't a space
                // This collapses multiple spaces into one
                if (!lastWasSpace) {
                    result += c;
                }
                lastWasSpace = true;
            } else {
                // Non-space character: always add it
                result += c;
                lastWasSpace = false;
            }
        }

        // Remove trailing space if present
        if (result.length() > 0 && result.charAt(result.length() - 1) == ' ') {
            result = result.substring(0, result.length() - 1);
        }

        return result;
    }

    // =========================================================
    // PART B: Proper Case Name
    // =========================================================
    /**
     * Converts a messy name to proper case (first letter uppercase,
     * rest lowercase for each word).
     * @param fullName the input name (may have messy spacing/capitalization)
     * @return the properly formatted name
     */
    public static String properCaseName(String fullName) {
        // First, collapse spaces to normalize the input
        String cleaned = collapseSpaces(fullName);

        String result = "";
        boolean capitalizeNext = true;  // First letter should be capitalized

        // Process each character
        for (int i = 0; i < cleaned.length(); i++) {
            char c = cleaned.charAt(i);

            if (c == ' ') {
                result += c;
                capitalizeNext = true;  // Next letter after space should be capital
            } else {
                if (capitalizeNext) {
                    result += Character.toUpperCase(c);
                    capitalizeNext = false;
                } else {
                    result += Character.toLowerCase(c);
                }
            }
        }

        return result;
    }

    // =========================================================
    // PART C: Contains Whole Word
    // =========================================================
    /**
     * Checks if keyword appears as a complete word in comment
     * (not as part of another word).
     * @param comment the text to search
     * @param keyword the word to find
     * @return true if keyword appears as a whole word
     */
    public static boolean containsWholeWord(String comment, String keyword) {
        int startIndex = 0;

        // Keep searching for keyword occurrences
        while (startIndex <= comment.length() - keyword.length()) {
            // Find next occurrence of keyword
            int foundIndex = comment.indexOf(keyword, startIndex);

            // If not found, we're done
            if (foundIndex == -1) {
                return false;
            }

            // Check if it's at the start OR preceded by a space
            boolean validStart = (foundIndex == 0) || 
                                 (comment.charAt(foundIndex - 1) == ' ');

            // Check if it's at the end OR followed by a space
            int endIndex = foundIndex + keyword.length();
            boolean validEnd = (endIndex == comment.length()) || 
                               (comment.charAt(endIndex) == ' ');

            // If both conditions met, it's a whole word
            if (validStart && validEnd) {
                return true;
            }

            // Move past this occurrence and keep searching
            startIndex = foundIndex + 1;
        }

        return false;
    }

    // =========================================================
    // PART D: Count Duplicate Usernames
    // =========================================================
    /**
     * Counts how many students have a username that appears more than once.
     * If 3 students share a username, all 3 are counted.
     * @param firstNames array of first names
     * @param lastNames array of last names
     * @return count of students with duplicate usernames
     */
    public static int countDuplicateUsernames(String[] firstNames, String[] lastNames) {
        int count = 0;

        // For each student, check if their username appears elsewhere
        for (int i = 0; i < firstNames.length; i++) {
            // Generate username for student i
            String usernameI = StringTools.makeUsername(firstNames[i], lastNames[i]);

            // Check against all other students
            for (int j = 0; j < firstNames.length; j++) {
                // Don't compare with self
                if (i != j) {
                    String usernameJ = StringTools.makeUsername(firstNames[j], lastNames[j]);

                    // If we find a match, this student has a duplicate
                    if (usernameI.equals(usernameJ)) {
                        count++;
                        break;  // Only count student i once, even if multiple matches
                    }
                }
            }
        }

        return count;
    }

    // =========================================================
    // Alternative Part D implementation (builds username array first)
    // =========================================================
    /**
     * Alternative implementation that pre-computes all usernames.
     * Same logic, different organization.
     */
    public static int countDuplicateUsernamesAlt(String[] firstNames, String[] lastNames) {
        int n = firstNames.length;

        // First, generate all usernames
        String[] usernames = new String[n];
        for (int i = 0; i < n; i++) {
            usernames[i] = StringTools.makeUsername(firstNames[i], lastNames[i]);
        }

        // Count students whose username appears more than once
        int count = 0;
        for (int i = 0; i < n; i++) {
            // Count how many times usernames[i] appears
            int occurrences = 0;
            for (int j = 0; j < n; j++) {
                if (usernames[i].equals(usernames[j])) {
                    occurrences++;
                }
            }

            // If it appears more than once, this student has a duplicate
            if (occurrences > 1) {
                count++;
            }
        }

        return count;
    }
}
