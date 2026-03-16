// Custom Exception Class
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class Day17_CustomException {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to register.");
        }
        else {
            System.out.println("Registration successful.");
        }
    }

    public static void main(String[] args) {

        try {
            int age = 16;
            checkAge(age);
        }

        catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }

        finally {
            System.out.println("Program execution finished.");
        }
    }
}