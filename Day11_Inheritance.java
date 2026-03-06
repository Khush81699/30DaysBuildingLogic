class Animal {

    protected String name;
    protected int age;

    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child Class
class Dog extends Animal {

    String breed;

    // Constructor using super
    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " is barking.");
    }

    void displayDetails() {
        System.out.println("Dog Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
    }
}

public class Day11_Inheritance {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Bruno", 3, "Labrador");

        dog1.displayDetails();
        dog1.eat();
        dog1.sleep();
        dog1.bark();
    }
}