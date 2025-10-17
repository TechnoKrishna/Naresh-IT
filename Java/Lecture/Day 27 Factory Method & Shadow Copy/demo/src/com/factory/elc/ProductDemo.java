package com.factory.elc;

import com.factory.blc.Product;

import java.util.Scanner;

public class ProductDemo {

    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the product Id: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter the product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter the product Price: ");
            double price = Double.parseDouble(sc.nextLine());

            Product p1 = Product.getProductObject(id, name, price);
            System.out.println(p1);

            System.out.print("Do you want to continue [yes/no]: ");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}
