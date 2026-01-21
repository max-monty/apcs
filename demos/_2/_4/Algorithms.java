package demos._2._4;

public class Algorithms {
    public static void main(String[] args) {

        int[] nums = {4, 7, 2, 9, 1, 5};

        // Find maximum
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Find minimum
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        // Sum and average
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        double avg = (double) sum / nums.length;

        // Check if ANY are even (at least one)
        boolean hasEven = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                hasEven = true;
            }
        }

        // Check if ALL are positive
        boolean allPositive = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                allPositive = false;
            }
        }
    }
}
