/**
 * Answer Key: Custom Class Design Worksheet
 * Example implementation using a Robot class
 * 
 * This class demonstrates all levels (1-6) of the worksheet.
 */
public class Robot {

    // =====================================================
    // LEVEL 1: Instance Variables
    // =====================================================
    private String name;
    private int energy;  // 0-100 scale

    // =====================================================
    // LEVEL 1: Default Constructor
    // =====================================================
    /**
     * Default constructor - creates a robot with a random ID
     * and random starting energy.
     */
    public Robot() {
        // Random ID number between 100-999
        int id = (int) (Math.random() * 900) + 100;
        this.name = "Robot-" + id;
        
        // Random energy between 50-100
        this.energy = (int) (Math.random() * 51) + 50;
    }

    // =====================================================
    // LEVEL 4: Overloaded Constructor
    // =====================================================
    /**
     * Parameterized constructor - creates a robot with specified values.
     * @param name the robot's name
     * @param energy the starting energy (will be clamped to 0-100)
     */
    public Robot(String name, int energy) {
        this.name = name;
        // Enforce energy bounds
        if (energy < 0) {
            this.energy = 0;
        } else if (energy > 100) {
            this.energy = 100;
        } else {
            this.energy = energy;
        }
    }

    // =====================================================
    // LEVEL 1: toString()
    // =====================================================
    /**
     * Returns a readable string representation of the robot.
     */
    public String toString() {
        return name + " [Energy: " + energy + "/100]";
    }

    // =====================================================
    // LEVEL 2: Getters
    // =====================================================
    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    // =====================================================
    // LEVEL 2: Setters (with validation)
    // =====================================================
    /**
     * Sets the robot's name. Rejects empty strings.
     * @param name the new name (must not be empty)
     */
    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        }
        // If empty, keep the old name (invalid input ignored)
    }

    /**
     * Sets the robot's energy. Clamps to valid range 0-100.
     * @param energy the new energy level
     */
    public void setEnergy(int energy) {
        if (energy < 0) {
            this.energy = 0;
        } else if (energy > 100) {
            this.energy = 100;
        } else {
            this.energy = energy;
        }
    }

    // =====================================================
    // LEVEL 3: Behavior Methods
    // =====================================================
    /**
     * Robot does work, consuming energy.
     * Energy decreases by 10 (minimum 0).
     */
    public void work() {
        energy -= 10;
        if (energy < 0) {
            energy = 0;
        }
    }

    /**
     * Robot recharges, gaining energy.
     * Energy increases by 25 (maximum 100).
     */
    public void recharge() {
        energy += 25;
        if (energy > 100) {
            energy = 100;
        }
    }

    // =====================================================
    // LEVEL 4: Overloaded Methods
    // =====================================================
    /**
     * Overloaded work method - work for a specific amount.
     * @param amount the energy to consume
     */
    public void work(int amount) {
        energy -= amount;
        if (energy < 0) {
            energy = 0;
        }
    }

    /**
     * Overloaded recharge method - recharge by a specific amount.
     * @param amount the energy to gain
     */
    public void recharge(int amount) {
        energy += amount;
        if (energy > 100) {
            energy = 100;
        }
    }

    // =====================================================
    // LEVEL 5: Interaction Method
    // =====================================================
    /**
     * This robot transfers energy to another robot.
     * Takes 20 energy from this robot and gives it to other.
     * @param other the robot to receive energy
     */
    public void transferEnergy(Robot other) {
        // Only transfer if this robot has enough energy
        if (this.energy >= 20) {
            this.energy -= 20;
            other.recharge(20);
        }
    }

    /**
     * Alternative interaction: this robot copies the other's name style.
     * Appends "-Jr" if energy is lower than the other robot.
     * @param other the robot to compare with
     */
    public void interact(Robot other) {
        if (this.energy < other.energy) {
            this.name = other.name + "-Jr";
        }
    }
}
