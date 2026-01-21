/**
 * Answer Key: Custom Class Design Worksheet - Driver
 * Tests all levels of the Robot class
 */
public class RobotDriver {

    public static void main(String[] args) {

        // =====================================================
        // LEVEL 1: Define the Object
        // =====================================================
        System.out.println("========== LEVEL 1: Define the Object ==========\n");

        // Create two instances using default constructor
        Robot r1 = new Robot();
        Robot r2 = new Robot();

        // Print them - should show different random values
        System.out.println("Robot 1: " + r1);
        System.out.println("Robot 2: " + r2);

        System.out.println("\n✓ Checkpoint: Two readable, different objects printed.\n");

        // =====================================================
        // LEVEL 2: Control Access (Getters & Setters)
        // =====================================================
        System.out.println("========== LEVEL 2: Getters & Setters ==========\n");

        Robot r3 = new Robot("TestBot", 75);
        System.out.println("Created: " + r3);

        // Test getters
        System.out.println("getName(): " + r3.getName());
        System.out.println("getEnergy(): " + r3.getEnergy());

        // Test setters with VALID values
        System.out.println("\nSetting name to 'UpdatedBot'...");
        r3.setName("UpdatedBot");
        System.out.println("After valid setName: " + r3);

        System.out.println("\nSetting energy to 50...");
        r3.setEnergy(50);
        System.out.println("After valid setEnergy: " + r3);

        // Test setters with INVALID values
        System.out.println("\nSetting name to '' (empty string)...");
        r3.setName("");
        System.out.println("After invalid setName: " + r3 + " (name unchanged!)");

        System.out.println("\nSetting energy to 999 (out of range)...");
        r3.setEnergy(999);
        System.out.println("After invalid setEnergy: " + r3 + " (clamped to 100!)");

        System.out.println("\nSetting energy to -50 (negative)...");
        r3.setEnergy(-50);
        System.out.println("After invalid setEnergy: " + r3 + " (clamped to 0!)");

        System.out.println("\n✓ Checkpoint: Invalid values do not break the object.\n");

        // =====================================================
        // LEVEL 3: Behavior (Instance Methods)
        // =====================================================
        System.out.println("========== LEVEL 3: Behavior Methods ==========\n");

        Robot worker = new Robot("WorkerBot", 80);
        System.out.println("Starting state: " + worker);

        // Call work() multiple times
        worker.work();
        System.out.println("After work(): " + worker);

        worker.work();
        System.out.println("After work(): " + worker);

        worker.work();
        System.out.println("After work(): " + worker);

        // Call recharge()
        worker.recharge();
        System.out.println("After recharge(): " + worker);

        // Work until depleted
        System.out.println("\nWorking until depleted...");
        for (int i = 0; i < 10; i++) {
            worker.work();
        }
        System.out.println("After excessive work: " + worker + " (floors at 0!)");

        System.out.println("\n✓ Checkpoint: State changes predictably.\n");

        // =====================================================
        // LEVEL 4: Overloading
        // =====================================================
        System.out.println("========== LEVEL 4: Overloading ==========\n");

        // Two different constructors
        Robot defaultBot = new Robot();                    // Default constructor
        Robot customBot = new Robot("CustomBot", 90);      // Parameterized constructor

        System.out.println("Default constructor: " + defaultBot);
        System.out.println("Parameterized constructor: " + customBot);

        // Overloaded methods
        System.out.println("\nTesting overloaded work() methods:");
        Robot testBot = new Robot("OverloadTest", 100);
        System.out.println("Starting: " + testBot);

        testBot.work();       // work() - uses 10 energy
        System.out.println("After work(): " + testBot);

        testBot.work(25);     // work(int) - uses 25 energy
        System.out.println("After work(25): " + testBot);

        System.out.println("\nTesting overloaded recharge() methods:");
        testBot.recharge();      // recharge() - adds 25 energy
        System.out.println("After recharge(): " + testBot);

        testBot.recharge(5);     // recharge(int) - adds 5 energy
        System.out.println("After recharge(5): " + testBot);

        System.out.println("\n✓ Checkpoint: Java chooses correct version each time.\n");

        // =====================================================
        // LEVEL 5: Interaction
        // =====================================================
        System.out.println("========== LEVEL 5: Interaction ==========\n");

        Robot donor = new Robot("DonorBot", 100);
        Robot receiver = new Robot("ReceiverBot", 20);

        System.out.println("Before transfer:");
        System.out.println("  Donor: " + donor);
        System.out.println("  Receiver: " + receiver);

        // Transfer energy from donor to receiver
        donor.transferEnergy(receiver);

        System.out.println("\nAfter donor.transferEnergy(receiver):");
        System.out.println("  Donor: " + donor);
        System.out.println("  Receiver: " + receiver);

        // Test interact() method
        System.out.println("\n--- Testing interact() method ---");
        Robot leader = new Robot("Alpha", 90);
        Robot follower = new Robot("Beta", 30);

        System.out.println("Before interact:");
        System.out.println("  Leader: " + leader);
        System.out.println("  Follower: " + follower);

        follower.interact(leader);

        System.out.println("\nAfter follower.interact(leader):");
        System.out.println("  Leader: " + leader);
        System.out.println("  Follower: " + follower + " (name changed!)");

        System.out.println("\n✓ Checkpoint: Objects affect each other.\n");

        // =====================================================
        // LEVEL 6: Small System
        // =====================================================
        System.out.println("========== LEVEL 6: Small System ==========\n");

        // Create an array of robots
        Robot[] fleet = new Robot[7];
        for (int i = 0; i < fleet.length; i++) {
            fleet[i] = new Robot();
        }

        // Print all robots
        System.out.println("Robot Fleet:");
        for (int i = 0; i < fleet.length; i++) {
            System.out.println("  [" + i + "] " + fleet[i]);
        }

        // Compute aggregates
        System.out.println("\n--- Aggregates ---");

        // Find max energy
        int maxEnergy = fleet[0].getEnergy();
        for (int i = 1; i < fleet.length; i++) {
            if (fleet[i].getEnergy() > maxEnergy) {
                maxEnergy = fleet[i].getEnergy();
            }
        }
        System.out.println("Max energy in fleet: " + maxEnergy);

        // Find min energy
        int minEnergy = fleet[0].getEnergy();
        for (int i = 1; i < fleet.length; i++) {
            if (fleet[i].getEnergy() < minEnergy) {
                minEnergy = fleet[i].getEnergy();
            }
        }
        System.out.println("Min energy in fleet: " + minEnergy);

        // Calculate average energy
        int totalEnergy = 0;
        for (int i = 0; i < fleet.length; i++) {
            totalEnergy += fleet[i].getEnergy();
        }
        double avgEnergy = (double) totalEnergy / fleet.length;
        System.out.println("Average energy: " + avgEnergy);

        // Count robots with energy >= 75
        int highEnergyCount = 0;
        for (int i = 0; i < fleet.length; i++) {
            if (fleet[i].getEnergy() >= 75) {
                highEnergyCount++;
            }
        }
        System.out.println("Robots with 75+ energy: " + highEnergyCount);

        System.out.println("\n✓ Checkpoint: Class works as part of a system.\n");

        System.out.println("========== ALL LEVELS COMPLETE ==========");
    }
}
