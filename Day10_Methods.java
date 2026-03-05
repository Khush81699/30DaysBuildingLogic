public class Day10_Methods {

    // Method with parameters and return value
    static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // Method with parameter but no return
    static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java learning.");
    }

    // Method with no parameter and no return
    static void showMessage() {
        System.out.println("Learning Java Methods is fun!");
    }

    public static void main(String[] args) {

        // Calling method without parameters
        showMessage();

        // Calling method with parameter
        greetUser("Khushboo");

        // Calling method with return value
        int result = addNumbers(10, 20);
        System.out.println("Sum of numbers: " + result);
    }
}