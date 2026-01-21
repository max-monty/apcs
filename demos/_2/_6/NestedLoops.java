package demos._2._6;

public class NestedLoops {
    public static void main(String[] args) {

        // Basic nested loop: rows and columns
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Triangle pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        // Compare all pairs in an array
        int[] nums = {3, 1, 4, 1, 5};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("Match at " + i + " and " + j);
                }
            }
        }
    }
}
