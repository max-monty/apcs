import java.util.Scanner;

/**
 * Answer Key: Scanner & Methods Practice Worksheet
 * AP Computer Science A
 */
public class ScannerMethodsKey {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====== LEVEL 1 ======\n");

        System.out.println("\n--- Problem 1b: Name Analysis ---\n");
        problem1b(input);

        System.out.println("\n--- Problem 2: Shopping Calculator ---\n");
        problem2(input);

        System.out.println("\n--- Problem 3: Student Status ---\n");
        problem3(input);

        System.out.println("\n====== LEVEL 2 ======\n");

        System.out.println("--- Problem 4: Sentence Analyzer ---\n");
        problem4(input);

        System.out.println("\n--- Problem 5: Password Checker ---\n");
        problem5(input);

        System.out.println("\n--- Problem 6: Geometry Calculator ---\n");
        problem6(input);

        System.out.println("\n====== LEVEL 3 ======\n");

        System.out.println("--- Problem 8: Math Operations ---\n");
        problem8(input);

        System.out.println("\n====== LEVEL 4 ======\n");

        System.out.println("--- Problem 9: Full Receipt ---\n");
        problem9(input);

        input.close();
    }

    
    /**
     * Problem 1b: Name Analysis
     * Demonstrates: nextLine(), length(), toUpperCase(), charAt()
     */
    public static void problem1b(Scanner input) {
        System.out.print("Enter your full name: ");
        String name = input.nextLine();

        int numChars = name.length();
        String allCaps = name.toUpperCase();
        char firstLetter = name.charAt(0);

        System.out.println("Number of characters: " + numChars);
        System.out.println("Name in ALL CAPS: " + allCaps);
        System.out.println("First letter: " + firstLetter);
    }

    /**
     * Problem 2: Shopping Calculator
     * Demonstrates: nextDouble(), Math.round(), manual rounding
     */
    public static void problem2(Scanner input) {
        System.out.print("Enter price of item 1: $");
        double price1 = input.nextDouble();
        System.out.print("Enter price of item 2: $");
        double price2 = input.nextDouble();
        System.out.print("Enter price of item 3: $");
        double price3 = input.nextDouble();

        double subtotal = price1 + price2 + price3;
        double taxRate = 0.0625;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;

        System.out.println("\n--- Method 1: Using Math.round() ---");
        double totalRounded1 = Math.round(total * 100) / 100.0;
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax (6.25%): $" + Math.round(tax * 100) / 100.0);
        System.out.println("Total: $" + totalRounded1);

        System.out.println("\n--- Method 2: Without Math.round() ---");
        // Multiply by 100, cast to int (truncates), divide by 100.0
        double totalRounded2 = (int) (total * 100 + 0.5) / 100.0;
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax (6.25%): $" + (int) (tax * 100 + 0.5) / 100.0);
        System.out.println("Total: $" + totalRounded2);

        input.nextLine(); // Clear buffer
    }

    /**
     * Problem 3: Student Status
     * Demonstrates: nextBoolean(), nextInt(), string concatenation
     */
    public static void problem3(Scanner input) {
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = input.nextBoolean();

        System.out.print("How many classes are you taking? ");
        int numClasses = input.nextInt();

        if (isStudent) {
            System.out.println("You are a student taking " + numClasses + " classes.");
        } else {
            System.out.println("You are not a student, but you're taking " + numClasses + " classes.");
        }

        input.nextLine(); // Clear buffer
    }

    /**
     * Problem 4: Sentence Analyzer
     * Demonstrates: nextLine(), endsWith(), charAt(), length()
     */
    public static void problem4(Scanner input) {
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        boolean isQuestion = sentence.endsWith("?");
        int middleIndex = sentence.length() / 2;
        char middleChar = sentence.charAt(middleIndex);

        System.out.println("Is it a question? " + isQuestion);
        System.out.println("Middle character: '" + middleChar + "' (at index " + middleIndex + ")");
    }

    /**
     * Problem 5: Password Checker
     * Demonstrates: contains(), replace(), toUpperCase(), charAt()
     */
    public static void problem5(Scanner input) {
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        int length = password.length();
        boolean hasExclamation = password.contains("!");
        
        // Check if first character is uppercase
        char firstChar = password.charAt(0);
        boolean startsWithCapital = (firstChar >= 'A' && firstChar <= 'Z');
        // Alternative: Character.isUpperCase(password.charAt(0))

        String noSpaces = password.replace(" ", "_");

        System.out.println("Length: " + length);
        System.out.println("Contains '!': " + hasExclamation);
        System.out.println("Starts with capital: " + startsWithCapital);
        System.out.println("With underscores: " + noSpaces);
    }

    /**
     * Problem 6: Geometry Calculator
     * Demonstrates: Math.pow(), Math.PI, Math.round()
     */
    public static void problem6(Scanner input) {
        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = input.nextDouble();

        double circleArea = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.println("\n-- Circle Results --");
        System.out.println("Area: " + Math.round(circleArea * 100) / 100.0);
        System.out.println("Circumference: " + Math.round(circumference * 100) / 100.0);

        // Rectangle
        System.out.print("\nEnter width of rectangle: ");
        double width = input.nextDouble();
        System.out.print("Enter height of rectangle: ");
        double height = input.nextDouble();

        double rectArea = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("\n-- Rectangle Results --");
        System.out.println("Area: " + Math.round(rectArea * 100) / 100.0);
        System.out.println("Perimeter: " + Math.round(perimeter * 100) / 100.0);

        input.nextLine(); // Clear buffer
    }

    /**
     * Problem 8: Math Operations
     * Demonstrates: Math.pow(), Math.max(), Math.sqrt(), Math.random()
     */
    public static void problem8(Scanner input) {
        System.out.print("Enter first number (a): ");
        double a = input.nextDouble();
        System.out.print("Enter second number (b): ");
        double b = input.nextDouble();

        // a^b
        double power = Math.pow(a, b);
        System.out.println("\na^b = " + power);

        // Larger value
        double larger = Math.max(a, b);
        System.out.println("Larger value: " + larger);

        // √(a² + b²) - Pythagorean theorem / hypotenuse
        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("√(a² + b²) = " + hypotenuse);

        // Random integer between them
        double min = Math.min(a, b);
        double max = Math.max(a, b);
        int randomInt = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Random integer between " + (int) min + " and " + (int) max + ": " + randomInt);

        input.nextLine(); // Clear buffer
    }

    /**
     * Problem 9: Full Receipt Builder
     * Demonstrates: loops with Scanner, nextLine()/nextInt()/nextDouble(),
     * equalsIgnoreCase(), formatted output
     */
    public static void problem9(Scanner input) {
        // Customer name
        System.out.print("Enter customer name: ");
        String customerName = input.nextLine();

        // Number of items
        System.out.print("How many items? ");
        int numItems = input.nextInt();
        input.nextLine(); // Clear buffer after nextInt()

        // Arrays to store items
        String[] itemNames = new String[numItems];
        double[] itemPrices = new double[numItems];

        // Read each item
        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter name of item " + (i + 1) + ": ");
            itemNames[i] = input.nextLine();
            System.out.print("Enter price of item " + (i + 1) + ": $");
            itemPrices[i] = input.nextDouble();
            input.nextLine(); // Clear buffer
        }

        // Calculate subtotal
        double subtotal = 0;
        for (int i = 0; i < numItems; i++) {
            subtotal += itemPrices[i];
        }

        // Tax and tip
        double taxRate = 0.0625;
        double tipRate = 0.18;
        double tax = subtotal * taxRate;
        double tip = subtotal * tipRate;

        // Coupon
        System.out.print("\nEnter coupon code (or press Enter to skip): ");
        String coupon = input.nextLine();
        double discount = 0;

        if (coupon.equalsIgnoreCase("SAVE10")) {
            discount = subtotal * 0.10;
            System.out.println("Coupon applied! 10% off.");
        } else if (!coupon.isEmpty()) {
            System.out.println("Invalid coupon code.");
        }

        double total = subtotal + tax + tip - discount;

        // Print formatted receipt
        System.out.println("\n========================================");
        System.out.println("              RECEIPT");
        System.out.println("========================================");
        System.out.println("Customer: " + customerName);
        System.out.println("----------------------------------------");

        for (int i = 0; i < numItems; i++) {
            System.out.printf("%-20s $%7.2f%n", itemNames[i], itemPrices[i]);
        }

        System.out.println("----------------------------------------");
        System.out.printf("%-20s $%7.2f%n", "Subtotal:", subtotal);
        System.out.printf("%-20s $%7.2f%n", "Tax (6.25%):", tax);
        System.out.printf("%-20s $%7.2f%n", "Tip (18%):", tip);

        if (discount > 0) {
            System.out.printf("%-20s -$%6.2f%n", "Discount (SAVE10):", discount);
        }

        System.out.println("========================================");
        System.out.printf("%-20s $%7.2f%n", "TOTAL:", total);
        System.out.println("========================================");
        System.out.println("\n        Thank you for shopping!");
    }
}
