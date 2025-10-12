package com.example.blc;

public class Customer {

    private double balance = 10000; // Data hiding

    public void deposit(double amount) {
        // Validation
        if (amount <= 0) {
            System.err.println("Invalid amount");
            System.exit(0); // Stop the program
        }
        balance = balance + amount;
        System.out.println("Balance after deposit: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.err.println("Insufficient Balance");
            System.exit(0);
        }
        balance = balance - amount;
        System.out.println("Balance after withdraw: " + balance);
    }

    public double checkBalance() {
        return balance;
    }
}
