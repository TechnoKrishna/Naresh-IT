package com.example.elc;

import com.example.blc.Customer;

public class BankApp {

    public static void main(String[] args) {
        Customer raj = new Customer();

        System.out.println("Current Balance is: " + raj.checkBalance());
        raj.deposit(1000);
        System.out.println("Current Balance is: " + raj.checkBalance());
        raj.withdraw(5000);
        System.out.println("Current Balance is: " + raj.checkBalance());
    }
}
