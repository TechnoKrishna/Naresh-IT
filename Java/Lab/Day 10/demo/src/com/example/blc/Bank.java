package com.example.blc;

public class Bank {

    private String CustomerName;
    private int accountNumber;
    private double currentBalance;
    public static String bankName;
    public static String bankAddress;
    public static String bankIFSCCode;

    public void setCustomerDetails(String Name, int Number, double Balance){
        CustomerName = Name;
        accountNumber = Number;
        currentBalance = Balance;

        if(currentBalance <= 0)
        {
            System.exit(0);
        }
    }

    public void withdraw(double Amount){
        if(currentBalance < Amount)
        {
            System.out.println("Insufficient Balance");
            System.exit(0);
        }
        else {
        currentBalance -= Amount;
        }
    }

    public void deposit(double Amount){
        if(Amount <= 0)
        {
            System.out.println("Invalid Amount");
            System.exit(0);
        }
        else {
        currentBalance += Amount;
        }
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public String displayDetails()
    {
        return "Bank{" +
                "CustomerName='" + CustomerName + '\'' +
                ", accountNumber=" + accountNumber +
                ", currentBalance=" + currentBalance +
                '}';
    }
}
