package demos._2._1;

public class BooleanExpressions {
    public static void main(String[] args) {

        // Compound booleans: combining conditions
        int age = 16;
        boolean hasPermit = true;

        boolean canDrive = (age >= 16 && hasPermit) || age >= 18;

        // De Morgan's Law: distributing the NOT
        boolean a = true;
        boolean b = false;

        // These are equivalent:
        boolean v1 = !(a && b);
        boolean v2 = !a || !b;

        // These are equivalent:
        boolean v3 = !(a || b);
        boolean v4 = !a && !b;
    }
}
