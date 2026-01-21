/**
 * Answer Key: Custom Class Design Worksheet
 * ALTERNATIVE EXAMPLE using a Pet class
 * 
 * This provides students with a second model implementation.
 */
public class Pet {

    // =====================================================
    // LEVEL 1: Instance Variables
    // =====================================================
    private String name;
    private int happiness;  // 0-100 scale

    // =====================================================
    // LEVEL 1: Default Constructor
    // =====================================================
    /**
     * Default constructor - creates a pet with a random name
     * and random starting happiness.
     */
    public Pet() {
        // Random pet names
        String[] names = {"Buddy", "Luna", "Max", "Bella", "Charlie", "Daisy"};
        int index = (int) (Math.random() * names.length);
        this.name = names[index];
        
        // Random happiness between 40-80
        this.happiness = (int) (Math.random() * 41) + 40;
    }

    // =====================================================
    // LEVEL 4: Overloaded Constructor
    // =====================================================
    /**
     * Parameterized constructor.
     * @param name the pet's name
     * @param happiness starting happiness (clamped to 0-100)
     */
    public Pet(String name, int happiness) {
        this.name = name;
        if (happiness < 0) {
            this.happiness = 0;
        } else if (happiness > 100) {
            this.happiness = 100;
        } else {
            this.happiness = happiness;
        }
    }

    // =====================================================
    // LEVEL 1: toString()
    // =====================================================
    public String toString() {
        String mood;
        if (happiness >= 80) {
            mood = "ecstatic";
        } else if (happiness >= 60) {
            mood = "happy";
        } else if (happiness >= 40) {
            mood = "content";
        } else if (happiness >= 20) {
            mood = "sad";
        } else {
            mood = "miserable";
        }
        return name + " the pet [Happiness: " + happiness + " - " + mood + "]";
    }

    // =====================================================
    // LEVEL 2: Getters
    // =====================================================
    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    // =====================================================
    // LEVEL 2: Setters (with validation)
    // =====================================================
    public void setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
        }
    }

    public void setHappiness(int happiness) {
        if (happiness < 0) {
            this.happiness = 0;
        } else if (happiness > 100) {
            this.happiness = 100;
        } else {
            this.happiness = happiness;
        }
    }

    // =====================================================
    // LEVEL 3: Behavior Methods
    // =====================================================
    /**
     * Pet plays, increasing happiness by 15.
     */
    public void play() {
        happiness += 15;
        if (happiness > 100) {
            happiness = 100;
        }
    }

    /**
     * Pet gets neglected, decreasing happiness by 10.
     */
    public void neglect() {
        happiness -= 10;
        if (happiness < 0) {
            happiness = 0;
        }
    }

    /**
     * Pet eats a treat, happiness increases by 5.
     */
    public void feed() {
        happiness += 5;
        if (happiness > 100) {
            happiness = 100;
        }
    }

    // =====================================================
    // LEVEL 4: Overloaded Methods
    // =====================================================
    /**
     * Play for a specific duration (more time = more happiness).
     * @param minutes play time in minutes
     */
    public void play(int minutes) {
        happiness += minutes / 2;  // 2 minutes = 1 happiness
        if (happiness > 100) {
            happiness = 100;
        }
    }

    /**
     * Feed multiple treats.
     * @param numTreats number of treats to give
     */
    public void feed(int numTreats) {
        happiness += numTreats * 5;
        if (happiness > 100) {
            happiness = 100;
        }
    }

    // =====================================================
    // LEVEL 5: Interaction Method
    // =====================================================
    /**
     * This pet plays with another pet.
     * Both pets gain happiness, but the lonelier pet gains more.
     * @param other the pet to play with
     */
    public void playWith(Pet other) {
        // Both pets get happier
        int myBoost = 10;
        int theirBoost = 10;

        // Lonelier pet gets extra happiness
        if (this.happiness < other.happiness) {
            myBoost += 5;
        } else if (other.happiness < this.happiness) {
            theirBoost += 5;
        }

        this.happiness += myBoost;
        other.happiness += theirBoost;

        // Cap at 100
        if (this.happiness > 100) this.happiness = 100;
        if (other.happiness > 100) other.happiness = 100;
    }

    /**
     * This pet learns a trick from another pet.
     * Gets a happiness boost based on the teacher's happiness.
     * @param other the pet to learn from
     */
    public void interact(Pet other) {
        // Learn from a happy pet = bigger boost
        int boost = other.happiness / 10;
        this.happiness += boost;
        if (this.happiness > 100) {
            this.happiness = 100;
        }
    }
}
