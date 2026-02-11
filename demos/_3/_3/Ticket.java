package demos._3._3;

public class Ticket {

    // --- Static variables (shared across all instances) ---
    private static int nextId = 1;
    private static int totalSold = 0;

    // --- Static constant ---
    public static final double TAX_RATE = 0.08;

    // --- Instance variables (unique to each object) ---
    private int id;
    private String event;
    private double price;

    public Ticket(String e, double p) {
        event = e;
        price = p;
        id = nextId;
        nextId++;
        totalSold++;
    }

    // --- Static methods (called on the class, not an instance) ---
    public static int getTotalSold() {
        return totalSold;
    }

    public static double calculateTax(double price) {
        return price * TAX_RATE;
    }

    // --- Instance methods ---
    public double getFinalPrice() {
        return price + (price * TAX_RATE);
    }

    public int getId() {
        return id;
    }

    public String getEvent() {
        return event;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Ticket #" + id + ": " + event + " ($" + price + ")";
    }
}
