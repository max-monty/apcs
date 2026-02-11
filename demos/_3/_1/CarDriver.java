package demos._3._1;

public class CarDriver {
    public static void main(String[] args) {

        // --- Creating objects with different constructors ---
        Car car1 = new Car();
        Car car2 = new Car("Toyota", 2020, 15000.5);

        System.out.println("Default car: " + car1);
        System.out.println("Custom car:  " + car2);

        // --- Using mutators (setters) ---
        car1.setMake("Honda");
        car1.setYear(2018);
        System.out.println("\nAfter setting make and year: " + car1);

        // --- Using a void method ---
        car2.drive(250.0);
        System.out.println("\nAfter driving 250 miles: " + car2);

        // --- Using a non-void method ---
        System.out.println(car2.getMake() + " is " + car2.getAge() + " years old");

        // --- Validation in setters ---
        car1.setMileage(-500); // should be ignored
        System.out.println("\nAfter trying to set negative mileage: " + car1);

        // --- Using accessors (getters) ---
        System.out.println("\ncar2 make: " + car2.getMake());
        System.out.println("car2 year: " + car2.getYear());
        System.out.println("car2 mileage: " + car2.getMileage());
    }
}
