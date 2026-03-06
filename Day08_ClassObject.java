public class Day8_ClassObject {

    // Instance variables (attributes)
    String name;
    int age;

    // Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        // Creating object
        Day8_ClassObject student1 = new Day8_ClassObject();

        // Assigning values
        student1.name = "Devdairyy";
        student1.age = 22;

        // Calling method
        student1.display();
    }
}