/**
 * Answer Key: Level 2, Problem 4
 * Demonstrates: static utility methods in a separate class
 */
public class NumberUtils {

    /**
     * Doubles the given integer.
     * @param n the number to double
     * @return 2 * n
     */
    public static int doubleIt(int n) {
        return 2 * n;
    }

    /**
     * Checks if a number is even.
     * @param n the number to check
     * @return true if n is even, false if odd
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
