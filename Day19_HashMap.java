import java.util.HashMap;
import java.util.Map;

public class Day19_HashMap {

    public static void main(String[] args) {

        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Khushboo");
        studentMap.put(102, "Rahul");
        studentMap.put(103, "Aman");
        studentMap.put(104, "Riya");

        System.out.println("Student Records:");

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }

        System.out.println("----------------");

        System.out.println("Student with ID 102: " + studentMap.get(102));

        studentMap.put(103, "Arjun");

        studentMap.remove(104);

        System.out.println("----------------");

        System.out.println("Updated Student Records:");

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }

        System.out.println("----------------");

        System.out.println("Total Students: " + studentMap.size());
    }
}