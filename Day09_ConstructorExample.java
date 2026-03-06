public class Day9_ConstructorExample {

    String name;
    int age;

    // Default Constructor
    Day9_ConstructorExample() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    Day9_ConstructorExample(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display details
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        // Object using default constructor
        Day9_ConstructorExample student1 = new Day9_ConstructorExample();
        student1.display();

        // Objects using parameterized constructor
        Day9_ConstructorExample student2 = new Day9_ConstructorExample("Khushboo", 21);
        Day9_ConstructorExample student3 = new Day9_ConstructorExample("Rahul", 23);

        student2.display();
        student3.display();
    }
}