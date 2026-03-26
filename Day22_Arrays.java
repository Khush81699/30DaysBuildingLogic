public class Day22_Arrays {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array Elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("----------------");

        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of elements: " + sum);

        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum element: " + max);

        System.out.println("----------------");

        System.out.println("Reversed Array:");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}