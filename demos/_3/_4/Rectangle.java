package demos._3._4;

public class Rectangle {

    private double width;
    private double height;

    // --- Constructor: parameter names shadow instance variables ---
    // Must use "this" to refer to the instance variable
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // --- Shadowing in a method: "this" required ---
    public void resize(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    // --- "this" is implicit in instance method calls ---
    public boolean isBiggerThan(Rectangle other) {
        // this.getArea() is the same as just getArea()
        return this.getArea() > other.getArea();
    }

    // --- Passing "this" as an argument ---
    public void printComparison(Rectangle other) {
        System.out.println("This rectangle: " + this);
        System.out.println("Other rectangle: " + other);

        if (other.isBiggerThan(this)) {
            System.out.println("The other rectangle is bigger.");
        } else if (this.isBiggerThan(other)) {
            System.out.println("This rectangle is bigger.");
        } else {
            System.out.println("They are the same size.");
        }
    }

    // --- Local variable scope example ---
    public void printMultiples() {
        // "i" only exists inside this for loop
        for (int i = 1; i <= 3; i++) {
            double scaled = width * i; // "scaled" only exists inside the loop body
            System.out.println(i + "x width = " + scaled);
        }
        // Can't use "i" or "scaled" here — they're out of scope
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String toString() {
        return "Rectangle(" + width + " x " + height + ")";
    }
}
