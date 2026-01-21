package demos._2._1;

public class Booleans {
    public static void main(String[] args) {
        // === RELATIONAL OPERATORS ===
        int x = 5, y = 10;
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x < y  : " + (x < y)); // true
        System.out.println("x == y : " + (x == y)); // false
        System.out.println("x != y : " + (x != y)); // true

        // === LOGICAL OPERATORS ===
        boolean a = true, b = false;
        System.out.println("\na = " + a + ", b = " + b);
        System.out.println("a && b : " + (a && b)); // false (both must be true)
        System.out.println("a || b : " + (a || b)); // true (at least one true)
        System.out.println("!a     : " + (!a)); // false (opposite)

        // === SHORT-CIRCUIT EVALUATION ===
        // Java stops evaluating as soon as the result is determined
        int n = 0;
        // This is SAFE because of short-circuit:
        if (n != 0 && 10 / n > 2) {
            System.out.println("Won't crash!");
        }
        // If n != 0 is false, Java never evaluates 10/n

        // === DE MORGAN'S LAW ===
        // !(a && b) is equivalent to !a || !b
        // !(a || b) is equivalent to !a && !b
        System.out.println("\n!(a && b) = " + !(a && b));
        System.out.println("!a || !b  = " + (!a || !b));

        // === COMPARING OBJECTS ===
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println("\n== compares REFERENCES (memory addresses)");
        System.out.println("s1 == s2 : " + (s1 == s2)); // true (same literal)
        System.out.println("s1 == s3 : " + (s1 == s3)); // false (different objects)

        System.out.println("\n.equals() compares CONTENT");
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true
    }

}
