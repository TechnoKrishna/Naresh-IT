package com.example.blc;

class BankAccount {
    private double balance = 5000; // private field

    private void showBalance() {   // private method
        System.out.println(balance);
    }

    public void accessBalance() {
        showBalance(); // allowed (same class)
    }
}

public class PrivateAM {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accessBalance(); // ✅ allowed
        // acc.showBalance(); ❌ error (private)
    }
}
