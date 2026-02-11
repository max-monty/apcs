package demos._3._1;

public class Car {

    // --- Private instance variables (encapsulation) ---
    private String make;
    private int year;
    private double mileage;

    // --- Default constructor ---
    public Car() {
        make = "Unknown";
        year = 2024;
        mileage = 0.0;
    }

    // --- Parameterized constructor ---
    public Car(String m, int y, double mi) {
        make = m;
        year = y;
        mileage = mi;
    }

    // --- Accessors (getters) ---
    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public double getMileage() {
        return mileage;
    }

    // --- Mutators (setters with validation) ---
    public void setMake(String m) {
        make = m;
    }

    public void setYear(int y) {
        if (y >= 1886 && y <= 2025) {
            year = y;
        }
    }

    public void setMileage(double mi) {
        if (mi >= 0) {
            mileage = mi;
        }
    }

    // --- Void method: modifies state, returns nothing ---
    public void drive(double miles) {
        if (miles > 0) {
            mileage += miles;
        }
    }

    // --- Non-void method: computes and returns a value ---
    public int getAge() {
        return 2025 - year;
    }

    // --- toString: string representation of the object ---
    public String toString() {
        return year + " " + make + " (" + mileage + " miles)";
    }
}
