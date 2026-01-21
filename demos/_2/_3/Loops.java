package demos._2._3;

public class Loops {
    public static void main(String[] args) {

        // While loop: use when you don't know how many times
        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num++;
        }

        // For loop: use when you know how many times
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Counting by 2s
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        // Counting backwards
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Sum accumulator pattern
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum 1-100: " + sum);
    }
}
