public class Day3_Operators {

    public static void main(String[] args) {

        // Step 1: Declare variables
        int a = 15;
        int b = 4;

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        System.out.println("------------ Arithmetic Operators ------------");

        // Arithmetic Operators
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        System.out.println("------------ Increment & Decrement ------------");

        // Increment
        a++;
        System.out.println("After increment a++: " + a);

        // Decrement
        b--;
        System.out.println("After decrement b--: " + b);

        System.out.println("------------ Comparison Operators ------------");

        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a not equal to b? " + (a != b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));
        System.out.println("Is a greater than or equal to b? " + (a >= b));
        System.out.println("Is a less than or equal to b? " + (a <= b));

        System.out.println("------------ Logical Operators ------------");

        System.out.println("Logical AND (a > 5 && b < 10): " + (a > 5 && b < 10));
        System.out.println("Logical OR (a < 5 || b < 10): " + (a < 5 || b < 10));
        System.out.println("Logical NOT !(a > b): " + !(a > b));

        System.out.println("------------ Day 3 Completed ------------");
    }
}