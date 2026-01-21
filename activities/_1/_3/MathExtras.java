/**
 * Answer Key: Level 3, Problem 6
 * Demonstrates: public method using private helper method
 */
public class MathExtras {

    /**
     * Finds the largest of three integers.
     * Uses private helper method max2.
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return the largest of a, b, c
     */
    public static int max3(int a, int b, int c) {
        // First find max of a and b, then compare with c
        int maxAB = max2(a, b);
        return max2(maxAB, c);
    }

    /**
     * Private helper - finds the larger of two integers.
     * @param x first integer
     * @param y second integer
     * @return the larger of x and y
     */
    private static int max2(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
        // Alternative one-liner: return (x > y) ? x : y;
    }
}
