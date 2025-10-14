package elc;

import blc.Customer;

public class CustomerDemo {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setCustomerData(101, "Raj", 80000);
        c1.getCustomerDetails();
    }
}