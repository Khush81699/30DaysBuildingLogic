// Abstract class
abstract class Vehicle {

    String brand;

    // Constructor
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method (no body)
    abstract void startEngine();

    // Normal method
    void displayBrand() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

// Child class
class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    // Implementing abstract method
    void startEngine() {
        System.out.println("Car engine started with key ignition.");
    }
}

public class Day14_Abstraction {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");

        car1.displayBrand();
        car1.startEngine();
    }
}