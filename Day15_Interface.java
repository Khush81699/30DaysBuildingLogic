// Interface
interface Payment {

    void makePayment(double amount);

    void refund(double amount);
}

// Implementing class
class CreditCardPayment implements Payment {

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made using Credit Card.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of $" + amount + " processed to Credit Card.");
    }
}

// Another implementing class
class UpiPayment implements Payment {

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made using UPI.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of $" + amount + " processed to UPI.");
    }
}

public class Day15_Interface {

    public static void main(String[] args) {

        Payment payment1 = new CreditCardPayment();
        payment1.makePayment(1500);
        payment1.refund(500);

        System.out.println("----------------------");

        Payment payment2 = new UpiPayment();
        payment2.makePayment(2000);
        payment2.refund(700);
    }
}