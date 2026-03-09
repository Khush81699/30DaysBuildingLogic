class Student {

    // Private variables (data hiding)
    private String name;
    private int age;

    // Setter method to set name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to get name
    public String getName() {
        return name;
    }

    // Setter method to set age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    // Getter method to get age
    public int getAge() {
        return age;
    }
}

public class Day13_Encapsulation {

    public static void main(String[] args) {

        Student s1 = new Student();

        // Setting values using setter
        s1.setName("Khushboo");
        s1.setAge(22);

        // Getting values using getter
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());
    }
}