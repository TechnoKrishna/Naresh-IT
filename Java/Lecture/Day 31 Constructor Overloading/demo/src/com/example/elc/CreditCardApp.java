package com.example.elc;

import com.example.blc.CardOnOffer;
import com.example.blc.CardType;
import com.example.blc.Customer;

import java.util.Scanner;

public class CreditCardApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Customer Credit Points: ");
        int creditPoint = Integer.parseInt(sc.nextLine());

        Customer c1 = new Customer(name, creditPoint);
        CardType offeredCard = CardOnOffer.getOfferedCard(c1);

        System.out.println(offeredCard);
        sc.close();
    }
}