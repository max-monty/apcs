package activities._2._1;

public class DeMorgans {
    public static void main(String[] args) {
        boolean a = true, b = false;
        int x = 5, y = 10;

        // De Morgan's Law:
        // !(a && b) is equivalent to !a || !b
        // !(a || b) is equivalent to !a && !b

        // Example:
        System.out.println("Example:");
        System.out.println("!(a && b) = " + !(a && b));
        System.out.println("!a || !b  = " + (!a || !b));
        System.out.println();

        // YOUR CODE HERE
        // For each pair, print both expressions and verify they are equal

        // 1. !(a || b) and its De Morgan equivalent

        // 2. !(x > 3 && y < 15) and its De Morgan equivalent

        // 3. !(x == 5 || y != 10) and its De Morgan equivalent

    }
}
