package demos._3._2;

public class PlayerDriver {
    public static void main(String[] args) {

        Player p1 = new Player("Alice", 50, 100);
        Player p2 = new Player("Bob", 30, 80);

        System.out.println("=== Initial State ===");
        System.out.println(p1);
        System.out.println(p2);

        // --- Aliasing: two variables pointing to the same object ---
        Player p3 = p1;
        p3.heal(20);
        System.out.println("\n=== After p3.heal(20) where p3 = p1 ===");
        System.out.println("p1: " + p1); // p1 also changed!
        System.out.println("p3: " + p3);

        // --- Passing an object reference to a method ---
        System.out.println("\n=== transferScoreTo ===");
        System.out.println("Before: " + p1 + " | " + p2);
        p1.transferScoreTo(p2);
        System.out.println("After p1.transferScoreTo(p2):");
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);

        // --- Returning an object reference ---
        System.out.println("\n=== getStronger ===");
        Player stronger = p1.getStronger(p2);
        System.out.println("Stronger player: " + stronger.getName());

        // --- Accessing private fields of same-type parameter ---
        System.out.println("\n=== hasSameScore ===");
        System.out.println("p1 same score as p2? " + p1.hasSameScore(p2));
    }
}
