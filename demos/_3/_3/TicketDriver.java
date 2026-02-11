package demos._3._3;

public class TicketDriver {
    public static void main(String[] args) {

        // --- Creating tickets (each gets a unique auto-incrementing ID) ---
        Ticket t1 = new Ticket("Concert", 50.0);
        Ticket t2 = new Ticket("Movie", 12.0);
        Ticket t3 = new Ticket("Sports Game", 75.0);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        // --- Static variable: shared counter ---
        System.out.println("\nTotal tickets sold: " + Ticket.getTotalSold());

        // --- Static method: called on the class name ---
        double tax = Ticket.calculateTax(50.0);
        System.out.println("Tax on $50: $" + tax);

        // --- Static constant ---
        System.out.println("Tax rate: " + Ticket.TAX_RATE);

        // --- Instance method using static constant ---
        System.out.println("\nFinal price of t1: $" + t1.getFinalPrice());
        System.out.println("Final price of t3: $" + t3.getFinalPrice());

        // --- You can also call static methods on an instance (but shouldn't) ---
        // t1.getTotalSold() works but is misleading
        // Always prefer: Ticket.getTotalSold()
    }
}
