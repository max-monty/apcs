package demos._4._3;

public class ArrayAlgorithms {
    public static void main(String[] args) {

        int[] nums = {4, 7, 2, 9, 1, 5};

        // === FIND MAXIMUM ===
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Max: " + max); // 9

        // === FIND MINIMUM ===
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("Min: " + min); // 1

        // === SUM AND AVERAGE ===
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double avg = (double) sum / nums.length;
        System.out.println("Sum: " + sum + ", Average: " + avg);

        // === COUNT MATCHES ===
        int evenCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even count: " + evenCount);

        // === CHECK IF ANY (at least one) ===
        boolean hasNegative = false;
        for (int num : nums) {
            if (num < 0) {
                hasNegative = true;
            }
        }
        System.out.println("Has negative: " + hasNegative);

        // === CHECK IF ALL ===
        boolean allPositive = true;
        for (int num : nums) {
            if (num <= 0) {
                allPositive = false;
            }
        }
        System.out.println("All positive: " + allPositive);

        // === LINEAR SEARCH (return index) ===
        int target = 9;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("Index of " + target + ": " + index); // 3

        // === REVERSE AN ARRAY IN-PLACE ===
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.print("Reversed: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // 5 4 3 2 1

        // === SHIFT ELEMENTS LEFT ===
        int[] shifted = {10, 20, 30, 40, 50};
        int first = shifted[0];
        for (int i = 0; i < shifted.length - 1; i++) {
            shifted[i] = shifted[i + 1];
        }
        shifted[shifted.length - 1] = first;
        // Result: {20, 30, 40, 50, 10}

        // === BUILD A NEW FILTERED ARRAY ===
        // Step 1: count how many match
        int count = 0;
        for (int num : nums) {
            if (num > 3) {
                count++;
            }
        }
        // Step 2: create and fill
        int[] filtered = new int[count];
        int idx = 0;
        for (int num : nums) {
            if (num > 3) {
                filtered[idx] = num;
                idx++;
            }
        }
        System.out.print("Filtered (>3): ");
        for (int num : filtered) {
            System.out.print(num + " ");
        }
        System.out.println(); // 4 7 9 5
    }
}
