class Customer {
    private double bill;

    public Customer(double bill) {
        super();
        this.bill = bill;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }
}

public class PassByValueDemo1 {
    public static void main(String[] args) {
        Customer cust = new Customer(12000);
        System.out.println(cust.getBill()); // 12000

        accept(cust);
        System.out.println(cust.getBill()); // 18000
    }

    public static void accept(Customer c1) {
        c1.setBill(18000);
    }
}