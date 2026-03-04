public class Day9_ConstructorExample {

    String name;
    int age;

    // Constructor
    Day9_ConstructorExample(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display details
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {

        // Creating objects using constructor
        Day9_ConstructorExample student1 = new Day9_ConstructorExample("Khushboo", 21);
        Day9_ConstructorExample student2 = new Day9_ConstructorExample("Rahul", 23);

        student1.display();
        System.out.println("-----------");
        student2.display();
    }
}