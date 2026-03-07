class Calculator {

    // Method Overloading: same method name with different parameters

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Day12_Polymorphism {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int result1 = calc.add(10, 20);
        int result2 = calc.add(5, 10, 15);
        double result3 = calc.add(4.5, 3.2);

        System.out.println("Addition of two numbers: " + result1);
        System.out.println("Addition of three numbers: " + result2);
        System.out.println("Addition of double values: " + result3);
    }
}