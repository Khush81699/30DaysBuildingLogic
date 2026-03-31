public class Day25_NumberLogic {

    public static void main(String[] args) {

        int num = 153;

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

        System.out.println("----------------");

        int factorial = 1;

        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of 5: " + factorial);

        System.out.println("----------------");

        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}