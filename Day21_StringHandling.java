public class Day21_StringHandling {

    public static void main(String[] args) {

        String str = "Java Programming";

        System.out.println("Original String: " + str);

        System.out.println("Length: " + str.length());

        System.out.println("Uppercase: " + str.toUpperCase());

        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.println("Substring (0-4): " + str.substring(0, 4));

        System.out.println("Contains 'Java': " + str.contains("Java"));

        System.out.println("Replace 'Java' with 'Core Java': " + str.replace("Java", "Core Java"));

        System.out.println("----------------");

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");

        System.out.println("After Append: " + sb);

        sb.insert(5, ",");

        System.out.println("After Insert: " + sb);

        sb.delete(5, 6);

        System.out.println("After Delete: " + sb);

        sb.reverse();

        System.out.println("After Reverse: " + sb);
    }
}