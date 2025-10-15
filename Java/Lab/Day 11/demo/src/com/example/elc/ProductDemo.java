package com.example.elc;

import com.example.blc.Product;

import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {

        Product product = new Product();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product ID : ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Product Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Product Price : ");
        double price = Double.parseDouble(sc.nextLine());

        product.setProductDetails(id, name, price);

        System.out.println("===== PRODUCT DETAILS =====");
        System.out.println(product);
        product.calculateDiscount();

        sc.close();

    }
}
