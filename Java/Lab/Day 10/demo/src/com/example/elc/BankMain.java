package com.example.elc;

import com.example.blc.Bank;

import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {

        Bank bank = new Bank();

        Scanner sc = new Scanner(System.in);

        double Amount;

        System.out.println("==== Welcome to ICICI Bank ====");
        System.out.println("Enter Customer Name : ");
        String name = sc.nextLine();
        System.out.println("Customer Account Number : ");
        int accountNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Opening Balance : ");
        double openingBalance = Double.parseDouble(sc.nextLine());

        System.out.println("Customer account created successfully!");
        bank.setCustomerDetails(name, accountNumber, openingBalance);

        while (true) {

            System.out.println("==== MENU ====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Customer Details");
            System.out.println("5. Exit");
            System.out.println("Enter your choice : ");
            int choice = Integer.parseInt(sc.nextLine());

            if(choice == 1)
            {
                System.out.println("Enter Deposit Amount : ");
                Amount = Double.parseDouble(sc.nextLine());
                bank.deposit(Amount);
                System.out.println("deposit of Amount " + Amount + " successfully!");
            }
            else if (choice == 2)
            {
                System.out.println("Enter Withdrawal Amount : ");
                Amount = Double.parseDouble(sc.nextLine());
                bank.withdraw(Amount);
                System.out.println("withdraw of Amount " + Amount + " debited successfully!");
            }
            else if (choice == 3)
            {
                System.out.println("Current Balance : " + bank.getCurrentBalance());
            }
            else if (choice == 4)
            {
                System.out.println(bank.displayDetails());
            }
            else if (choice == 5)
            {
                System.out.println("Thank you for using our Bank!");
                System.exit(0);
            }
            else
            {
                System.out.println("Invalid choice.");
            }
        }
    }
}
