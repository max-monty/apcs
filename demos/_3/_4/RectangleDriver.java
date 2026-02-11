package demos._3._4;

public class RectangleDriver {
    public static void main(String[] args) {

        // --- "this" in constructor (parameter shadowing) ---
        Rectangle r1 = new Rectangle(5.0, 3.0);
        Rectangle r2 = new Rectangle(4.0, 6.0);

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);

        // --- "this" in resize (shadowing again) ---
        r1.resize(10.0, 2.0);
        System.out.println("\nAfter resize, r1: " + r1);

        // --- "this" implicit in isBiggerThan ---
        System.out.println("\nr1 bigger than r2? " + r1.isBiggerThan(r2));
        System.out.println("r2 bigger than r1? " + r2.isBiggerThan(r1));

        // --- Passing "this" as an argument ---
        System.out.println("\n=== Comparison ===");
        r1.printComparison(r2);

        // --- Local variable scope ---
        System.out.println("\n=== Multiples of r1 width ===");
        r1.printMultiples();
    }
}
