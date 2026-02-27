package demos._4._1;

public class ArrayBasics {
    public static void main(String[] args) {

        // === CREATING ARRAYS WITH INITIALIZER LISTS ===
        int[] nums = {10, 20, 30, 40, 50};
        String[] names = {"Alice", "Bob", "Charlie"};

        // === ACCESSING ELEMENTS (0-indexed) ===
        System.out.println("First element: " + nums[0]);          // 10
        System.out.println("Last element: " + nums[nums.length - 1]); // 50

        // === The length attribute (NOT a method — no parentheses!) ===
        System.out.println("Array length: " + nums.length);       // 5
        System.out.println("String length: " + names[0].length()); // 5  <-- method!

        // === MODIFYING ELEMENTS ===
        nums[2] = 99;
        System.out.println("Modified: " + nums[2]); // 99

        // === CREATING ARRAYS WITH new (default values) ===
        int[] scores = new int[5];
        System.out.println("Default int: " + scores[0]);        // 0

        double[] prices = new double[3];
        System.out.println("Default double: " + prices[0]);     // 0.0

        boolean[] flags = new boolean[2];
        System.out.println("Default boolean: " + flags[0]);     // false

        String[] words = new String[4];
        System.out.println("Default String: " + words[0]);      // null

        // === FILLING AN ARRAY WITH A LOOP ===
        int[] squares = new int[5];
        for (int i = 0; i < squares.length; i++) {
            squares[i] = (i + 1) * (i + 1);
        }
        // squares is now {1, 4, 9, 16, 25}

        // === SWAPPING TWO ELEMENTS ===
        int temp = nums[0];
        nums[0] = nums[4];
        nums[4] = temp;

        // === ARRAY REFERENCES (two variables, one array) ===
        int[] a = {1, 2, 3};
        int[] b = a;         // b points to the SAME array as a
        b[0] = 99;
        System.out.println("a[0] = " + a[0]); // 99 — both changed!

        // === ArrayIndexOutOfBoundsException ===
        // Uncomment to see the error:
        // System.out.println(nums[5]);  // CRASH! Valid indices are 0–4
    }
}
