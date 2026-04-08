import java.util.ArrayList;
import java.util.Scanner;

class Student {

    private int id;
    private String name;
    private int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    int getId() {
        return id;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name + " Age: " + age);
    }
}

public class Day30_MiniProject {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                students.add(new Student(id, name, age));
                System.out.println("Student added successfully.");
            }

            else if (choice == 2) {
                for (Student s : students) {
                    s.display();
                }
            }

            else if (choice == 3) {
                System.out.print("Enter ID to search: ");
                int searchId = sc.nextInt();

                boolean found = false;

                for (Student s : students) {
                    if (s.getId() == searchId) {
                        s.display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.");
                }
            }

        } while (choice != 4);

        sc.close();
    }
}