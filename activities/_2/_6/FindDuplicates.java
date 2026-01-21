package activities._2._6;

public class FindDuplicates {

    public static void printDuplicates(int[] arr) {
        // YOUR CODE HERE
        // Use nested loops to compare all pairs
        // Print indices where values match
    }

    public static void main(String[] args) {
        int[] test = {3, 1, 4, 1, 5, 1};
        printDuplicates(test);
        // Should print:
        // Duplicate at index 1 and 3
        // Duplicate at index 1 and 5
        // Duplicate at index 3 and 5
    }
}
