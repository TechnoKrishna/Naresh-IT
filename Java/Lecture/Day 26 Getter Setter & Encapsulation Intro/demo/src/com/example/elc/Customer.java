package com.example.elc;

public class Customer {

    private double customerBill;  // non-static field

    // Parameterized constructor
    public Customer(double customerBill) {
        this.customerBill = customerBill;
    }

    // Setter — used to modify data
    public void setCustomerBill(double customerBill) {
        this.customerBill = customerBill;
    }

    // Getter — used to read data
    public double getCustomerBill() {
        return this.customerBill;
    }

    // toString() — used to print object details
    @Override
    public String toString() {
        return "Customer [customerBill=" + customerBill + "]";
    }

    // Main method for testing
    public static void main(String[] args) {

        // Create object using parameterized constructor
        Customer c1 = new Customer(1000);
        System.out.println(c1);  // prints: Customer [customerBill=1000.0]

        // Modify data using setter
        c1.setCustomerBill(1500);

        // Read data using getter
        System.out.println("Updated Bill: " + c1.getCustomerBill());
    }
}