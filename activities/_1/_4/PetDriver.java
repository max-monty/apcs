/**
 * Answer Key: Custom Class Design Worksheet - Pet Driver
 * ALTERNATIVE EXAMPLE demonstrating all levels with Pet class
 */
public class PetDriver {

    public static void main(String[] args) {

        // =====================================================
        // LEVEL 1: Define the Object
        // =====================================================
        System.out.println("========== LEVEL 1: Define the Object ==========\n");

        Pet p1 = new Pet();
        Pet p2 = new Pet();

        System.out.println("Pet 1: " + p1);
        System.out.println("Pet 2: " + p2);

        System.out.println("\n✓ Checkpoint: Two readable, different objects printed.\n");

        // =====================================================
        // LEVEL 2: Getters & Setters
        // =====================================================
        System.out.println("========== LEVEL 2: Getters & Setters ==========\n");

        Pet myPet = new Pet("Whiskers", 50);
        System.out.println("Created: " + myPet);
        System.out.println("getName(): " + myPet.getName());
        System.out.println("getHappiness(): " + myPet.getHappiness());

        // Valid setter
        myPet.setName("Fluffy");
        System.out.println("\nAfter setName('Fluffy'): " + myPet);

        // Invalid setters
        myPet.setName("");
        System.out.println("After setName('') - empty: " + myPet + " (unchanged!)");

        myPet.setHappiness(200);
        System.out.println("After setHappiness(200): " + myPet + " (clamped to 100!)");

        myPet.setHappiness(-50);
        System.out.println("After setHappiness(-50): " + myPet + " (clamped to 0!)");

        System.out.println("\n✓ Checkpoint: Invalid values do not break the object.\n");

        // =====================================================
        // LEVEL 3: Behavior Methods
        // =====================================================
        System.out.println("========== LEVEL 3: Behavior Methods ==========\n");

        Pet activePet = new Pet("Sparky", 50);
        System.out.println("Starting: " + activePet);

        activePet.play();
        System.out.println("After play(): " + activePet);

        activePet.feed();
        System.out.println("After feed(): " + activePet);

        activePet.neglect();
        System.out.println("After neglect(): " + activePet);

        activePet.neglect();
        System.out.println("After neglect(): " + activePet);

        System.out.println("\n✓ Checkpoint: State changes predictably.\n");

        // =====================================================
        // LEVEL 4: Overloading
        // =====================================================
        System.out.println("========== LEVEL 4: Overloading ==========\n");

        // Different constructors
        Pet randomPet = new Pet();                     // Default
        Pet namedPet = new Pet("Rocky", 70);           // Parameterized

        System.out.println("Default constructor: " + randomPet);
        System.out.println("Parameterized constructor: " + namedPet);

        // Overloaded methods
        Pet testPet = new Pet("TestPet", 30);
        System.out.println("\nStarting: " + testPet);

        testPet.play();           // play() - adds 15
        System.out.println("After play(): " + testPet);

        testPet.play(20);         // play(int) - adds 20/2 = 10
        System.out.println("After play(20 minutes): " + testPet);

        testPet.feed();           // feed() - adds 5
        System.out.println("After feed(): " + testPet);

        testPet.feed(3);          // feed(int) - adds 3*5 = 15
        System.out.println("After feed(3 treats): " + testPet);

        System.out.println("\n✓ Checkpoint: Java chooses correct version each time.\n");

        // =====================================================
        // LEVEL 5: Interaction
        // =====================================================
        System.out.println("========== LEVEL 5: Interaction ==========\n");

        Pet happyPet = new Pet("Sunny", 80);
        Pet sadPet = new Pet("Gloomy", 30);

        System.out.println("Before playWith:");
        System.out.println("  " + happyPet);
        System.out.println("  " + sadPet);

        sadPet.playWith(happyPet);

        System.out.println("\nAfter sadPet.playWith(happyPet):");
        System.out.println("  " + happyPet);
        System.out.println("  " + sadPet + " (got extra boost!)");

        // Test interact()
        System.out.println("\n--- Testing interact() ---");
        Pet teacher = new Pet("Professor", 90);
        Pet student = new Pet("Newbie", 40);

        System.out.println("Before interact:");
        System.out.println("  Teacher: " + teacher);
        System.out.println("  Student: " + student);

        student.interact(teacher);

        System.out.println("\nAfter student.interact(teacher):");
        System.out.println("  Teacher: " + teacher);
        System.out.println("  Student: " + student + " (learned from happy teacher!)");

        System.out.println("\n✓ Checkpoint: Objects affect each other.\n");

        // =====================================================
        // LEVEL 6: Small System
        // =====================================================
        System.out.println("========== LEVEL 6: Small System ==========\n");

        // Create array of pets
        Pet[] shelter = new Pet[6];
        for (int i = 0; i < shelter.length; i++) {
            shelter[i] = new Pet();
        }

        // Print all pets
        System.out.println("Pet Shelter:");
        for (int i = 0; i < shelter.length; i++) {
            System.out.println("  [" + i + "] " + shelter[i]);
        }

        // Aggregates
        System.out.println("\n--- Aggregates ---");

        // Max happiness
        int maxHappy = shelter[0].getHappiness();
        for (int i = 1; i < shelter.length; i++) {
            if (shelter[i].getHappiness() > maxHappy) {
                maxHappy = shelter[i].getHappiness();
            }
        }
        System.out.println("Happiest pet: " + maxHappy);

        // Min happiness
        int minHappy = shelter[0].getHappiness();
        for (int i = 1; i < shelter.length; i++) {
            if (shelter[i].getHappiness() < minHappy) {
                minHappy = shelter[i].getHappiness();
            }
        }
        System.out.println("Saddest pet: " + minHappy);

        // Average
        int total = 0;
        for (int i = 0; i < shelter.length; i++) {
            total += shelter[i].getHappiness();
        }
        double avg = (double) total / shelter.length;
        System.out.println("Average happiness: " + avg);

        // Count happy pets (happiness >= 60)
        int happyCount = 0;
        for (int i = 0; i < shelter.length; i++) {
            if (shelter[i].getHappiness() >= 60) {
                happyCount++;
            }
        }
        System.out.println("Happy pets (60+): " + happyCount + " out of " + shelter.length);

        System.out.println("\n✓ Checkpoint: Class works as part of a system.\n");

        System.out.println("========== ALL LEVELS COMPLETE ==========");
    }
}
