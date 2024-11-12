package Practical;

abstract class Vehicle {
    // Abstract method (to be implemented by subclasses)
    public abstract void startEngine();

    // Concrete method
    public void stopEngine() {
        System.out.println("The engine is stopped.");
    }

    // Concrete method
    public abstract void honk();
}
// Concrete class Car
class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine starts with a key.");
    }

    @Override
    public void honk() {
        System.out.println("Car Honking!");
    }
}

// Concrete class Motorcycle
class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine starts with a button.");
    }

    @Override
    public void honk() {
        System.out.println("Bike Honking!");
    }
}
public class list4 {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        // Calling methods
        car.startEngine();       // Output: Car engine starts with a key.
        car.honk();              // Output: Car Honking!
        car.stopEngine();        // Output: The engine is stopped.

        motorcycle.startEngine(); // Output: Motorcycle engine starts with a button.
        motorcycle.honk();        // Output: Bike Honking!
        motorcycle.stopEngine();  // Output: The engine is stopped.

        
        }
    } // End of class Exp5
