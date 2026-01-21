/**
 * Answer Key: Formatting & Calculations Worksheet
 * AP Computer Science A
 */
public class FormattingCalculationsKey {

    public static void main(String[] args) {
        
        System.out.println("=== Problem 1: Formatting & Calculations Challenge ===\n");
        problem1();
        
        System.out.println("\n=== Problem 2A: Score Normalization ===\n");
        problem2A();
    }

    /**
     * Problem 1: Formatting & Calculations Challenge
     * Demonstrates: escape sequences, string concatenation, 
     * arithmetic with mixed types, and loop-based string repetition
     */
    public static void problem1() {
        // Required variables
        String course = "AP CSA";
        int total = 3;
        int s1 = 84, s2 = 87, s3 = 88;

        // Compute average as a double (cast to avoid integer division)
        double average = (s1 + s2 + s3) / 3.0;

        // Print header
        System.out.println("Report for " + course);

        // CHALLENGE: Print dashed line using a loop
        String dashes = "";
        for (int i = 0; i < 17; i++) {
            dashes += "-";
        }
        System.out.println(dashes);

        // Print remaining lines using escape sequences
        System.out.println("Total: " + total + " students");
        System.out.println("Average Score: " + average);
        System.out.println("Path: C:\\Users\\John 1\\grades.txt");  // \\ for backslash
        System.out.println("\"Passing\": true");                     // \" for quotes
    }

    /**
     * Problem 2A: Score Normalization
     * Demonstrates: mixed-type expressions, casting, and 
     * rounding to one decimal place without Math.round
     */
    public static void problem2A() {
        int raw = 257;
        int max = 300;

        // Calculate percentage as a double
        double percentage = (double) raw / max * 100;

        // Round to one decimal place without Math.round:
        // Multiply by 10, truncate with (int), divide by 10.0
        percentage = (int) (percentage * 10) / 10.0;

        System.out.println("Normalized: " + percentage + "%");
    }
}
