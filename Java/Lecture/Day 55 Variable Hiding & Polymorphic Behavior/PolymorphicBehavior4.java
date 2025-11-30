class Payment {
    public double makePayment(double amount) {
        return 0.0;
    }
}

class CreditCard extends Payment {
    @Override
    public double makePayment(double amount) {
        return amount;
    }

    public void offer() {
        System.out.println("Pay via Credit Card and get GOA holiday package");
    }
}

class DebitCard extends Payment {
    @Override
    public double makePayment(double amount) {
        return amount;
    }
}

class UPI extends Payment {
    @Override
    public double makePayment(double amount) {
        return amount;
    }

    public void offer() {
        System.out.println("Pay via UPI and get ₹1000 cashback");
    }
}

public class PolymorphicBehavior4 {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCard();
        paymentGateway(p);

        System.out.println("............");

        p = new DebitCard();
        paymentGateway(p);

        System.out.println("............");

        p = new UPI();
        paymentGateway(p);
    }

    public static void paymentGateway(Payment payment) {
        if (payment instanceof CreditCard card) {
            double amount = card.makePayment(25000);
            System.out.println("Paying " + amount + " via Credit Card");
            card.offer();
        } else if (payment instanceof DebitCard card) {
            double amount = card.makePayment(12000);
            System.out.println("Paying " + amount + " via Debit Card");
        } else if (payment instanceof UPI upi) {
            double amount = upi.makePayment(30000);
            System.out.println("Paying " + amount + " via UPI");
            upi.offer();
        }
    }
}