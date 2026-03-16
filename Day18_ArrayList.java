import java.util.ArrayList;
import java.util.List;

public class Day18_ArrayList {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("Khushboo");
        students.add("Rahul");
        students.add("Aman");
        students.add("Riya");

        System.out.println("Student List:");
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("----------------");

        System.out.println("Accessing first student: " + students.get(0));

        students.set(2, "Arjun");

        students.remove("Rahul");

        System.out.println("----------------");

        System.out.println("Updated Student List:");
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("----------------");

        System.out.println("Total Students: " + students.size());
    }
}