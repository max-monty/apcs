import java.util.Scanner;

/**
 * Answer Key: Level 1 (Problems 1, 2, 3)
 * Demonstrates: static methods, String methods, Math class
 */
public class Utilities {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Problem 1: Starts With Capital ---
        System.out.println("=== Problem 1: Starts With Capital ===");
        System.out.print("Enter a sentence: ");
        String sentence1 = input.nextLine();

        boolean startsUpper = startsWithCapital(sentence1);
        System.out.println("Starts with capital letter: " + startsUpper);

        // --- Problem 2: Circle Area ---
        System.out.println("\n=== Problem 2: Circle Area ===");
        System.out.print("Enter a radius: ");
        double radius = input.nextDouble();
        input.nextLine(); // Clear buffer

        double area = circleArea(radius);
        double areaRounded = round2(area);
        System.out.println("Area (rounded to 2 decimals): " + areaRounded);

        // --- Problem 3: Shout and Count Spaces ---
        System.out.println("\n=== Problem 3: Shout & Count Spaces ===");
        System.out.print("Enter a sentence: ");
        String sentence3 = input.nextLine();

        String shouted = shout(sentence3);
        int spaces = countSpaces(sentence3);

        System.out.println("Shouted: " + shouted);
        System.out.println("Number of spaces: " + spaces);

        input.close();
    }

    // =====================
    // PROBLEM 1 METHOD
    // =====================

    /**
     * Checks if a string starts with a capital letter (A-Z).
     * @param s the string to check
     * @return true if s starts with uppercase letter, false otherwise
     */
    public static boolean startsWithCapital(String s) {
        if (s.length() == 0) {
            return false;
        }
        char first = s.charAt(0);
        return first >= 'A' && first <= 'Z';
        // Alternative: return Character.isUpperCase(s.charAt(0));
    }

    // =====================
    // PROBLEM 2 METHODS
    // =====================

    /**
     * Calculates the area of a circle.
     * @param r the radius
     * @return the area (π * r²)
     */
    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    /**
     * Rounds a double to 2 decimal places.
     * @param x the value to round
     * @return x rounded to 2 decimals
     */
    public static double round2(double x) {
        return Math.round(x * 100) / 100.0;
    }

    // =====================
    // PROBLEM 3 METHODS
    // =====================

    /**
     * Converts string to uppercase and adds "!" at the end.
     * @param s the string to shout
     * @return the shouted string
     */
    public static String shout(String s) {
        return s.toUpperCase() + "!";
    }

    /**
     * Counts the number of spaces in a string.
     * @param s the string to analyze
     * @return the count of space characters
     */
    public static int countSpaces(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
