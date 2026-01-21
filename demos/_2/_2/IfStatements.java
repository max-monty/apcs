package demos._2._2;

public class IfStatements {
    public static void main(String[] args) {

        int temperature = 72;

        // Basic if-else chain
        if (temperature >= 90) {
            System.out.println("Hot");
        } else if (temperature >= 70) {
            System.out.println("Nice");
        } else if (temperature >= 50) {
            System.out.println("Cool");
        } else {
            System.out.println("Cold");
        }

        // Nested if: checking multiple conditions
        boolean isWeekend = true;
        boolean isRaining = false;

        if (isWeekend) {
            if (isRaining) {
                System.out.println("Movie day");
            } else {
                System.out.println("Go outside");
            }
        }

        // Same logic with compound boolean
        if (isWeekend && !isRaining) {
            System.out.println("Go outside");
        }
    }
}
