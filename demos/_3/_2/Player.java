package demos._3._2;

public class Player {

    private String name;
    private int score;
    private int health;

    public Player(String n, int s, int h) {
        name = n;
        score = s;
        health = h;
    }

    // --- Basic mutator ---
    public void heal(int amount) {
        if (amount > 0) {
            health += amount;
        }
    }

    // --- Modifying a passed object (object reference as parameter) ---
    public void transferScoreTo(Player other) {
        other.score += this.score;
        score = 0;
    }

    // --- Returning an object reference ---
    public Player getStronger(Player other) {
        if (health >= other.health) {
            return this;
        } else {
            return other;
        }
    }

    // --- Accessing private data of same-type parameter ---
    public boolean hasSameScore(Player other) {
        return score == other.score;
    }

    // --- Accessors ---
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getHealth() {
        return health;
    }

    public String toString() {
        return name + " [score: " + score + ", health: " + health + "]";
    }
}
