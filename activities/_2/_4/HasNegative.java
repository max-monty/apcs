package activities._2._4;

public class HasNegative {

    public static boolean hasNegative(int[] arr) {
        // YOUR CODE HERE
        // Return true if ANY element is negative
        return false;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, -3, 4};
        int[] test2 = {1, 2, 3, 4};

        System.out.println(hasNegative(test1)); // true
        System.out.println(hasNegative(test2)); // false
    }
}
