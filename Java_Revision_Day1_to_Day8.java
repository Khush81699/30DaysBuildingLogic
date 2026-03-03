public class Java_Revision_Day1_to_Day8 {

    // Method 1: Even or Odd
    static void checkEvenOdd(int n) {
        if (n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
    }

    // Method 2: Largest of two numbers
    static void largest(int a, int b) {
        if (a > b)
            System.out.println("Largest is: " + a);
        else if (b > a)
            System.out.println("Largest is: " + b);
        else
            System.out.println("Both numbers are equal");
    }

    public static void main(String[] args) {

        // 1️⃣ Arithmetic
        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // 2️⃣ Increment / Decrement
        int x = 5;
        System.out.println("Post Increment: " + (x++));
        System.out.println("After Post Increment: " + x);
        System.out.println("Pre Increment: " + (++x));

        // 3️⃣ Logical Operators
        System.out.println("Logical AND: " + (a > 5 && b < 5));
        System.out.println("Logical OR: " + (a < 5 || b < 5));
        System.out.println("Logical NOT: " + !(a > b));

        // 4️⃣ If-Else (Pass/Fail)
        int marks = 75;
        if (marks >= 40)
            System.out.println("Pass");
        else
            System.out.println("Fail");

        // 5️⃣ Nested If (Positive + Even/Odd)
        int num = -8;

        if (num >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        checkEvenOdd(num);

        // 6️⃣ Largest Number
        largest(25, 30);

        // 7️⃣ Switch Case
        int choice = 2;

        switch (choice) {
            case 1:
                System.out.println("Choice 1 Selected");
                break;
            case 2:
                System.out.println("Choice 2 Selected");
                break;
            case 3:
                System.out.println("Choice 3 Selected");
                break;
            default:
                System.out.println("Invalid Choice");
        }

        // 8️⃣ Boolean Logic Test
        boolean result = (10 > 5) && (3 < 1);
        System.out.println("Boolean Result: " + result);
    }
}