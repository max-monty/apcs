package demos._4._2;

public class ArrayTraversals {
    public static void main(String[] args) {

        int[] nums = {3, 7, 2, 9, 1, 5};

        // === INDEXED FOR LOOP (standard traversal) ===
        System.out.println("Indexed for loop:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // === ENHANCED FOR LOOP (for-each) ===
        System.out.println("Enhanced for loop:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        // === WHILE LOOP TRAVERSAL ===
        System.out.println("While loop:");
        int i = 0;
        while (i < nums.length) {
            System.out.print(nums[i] + " ");
            i++;
        }
        System.out.println();

        // === BACKWARDS TRAVERSAL (requires indexed loop) ===
        System.out.println("Backwards:");
        for (int j = nums.length - 1; j >= 0; j--) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();

        // === EVERY OTHER ELEMENT (requires indexed loop) ===
        System.out.println("Every other:");
        for (int k = 0; k < nums.length; k += 2) {
            System.out.print(nums[k] + " ");
        }
        System.out.println();

        // === ENHANCED FOR LOOP CANNOT MODIFY THE ARRAY ===
        int[] values = {1, 2, 3};
        for (int v : values) {
            v = v * 10;  // modifies the COPY, not the array!
        }
        System.out.println("After enhanced for 'modification': " + values[0]); // still 1

        // === BUT ENHANCED FOR CAN MODIFY OBJECTS VIA METHODS ===
        String[] words = {"hello", "world"};
        // Can call methods on the reference — the reference itself isn't changing
        for (String w : words) {
            System.out.print(w.toUpperCase() + " ");
        }
        System.out.println();

        // === WHEN TO USE WHICH LOOP ===
        // Enhanced for:  reading all elements, order doesn't matter, no index needed
        // Indexed for:   need the index, need to modify elements, backwards/skip
        // While:         early exit (search), unknown number of iterations
    }
}
