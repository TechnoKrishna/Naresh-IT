package com.example.blc;

import java.util.Scanner;

public class Product {

    public int productId;
    public String productName;
    public double productPrice;

    public void setProductData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product ID");
        productId = Integer.parseInt(sc.nextLine());

        System.out.println("Enter product name");
        productName = sc.nextLine();

        System.out.println("Enter product price");
        productPrice = Double.parseDouble(sc.nextLine());
    }

    public void getProductId()
    {
        System.out.println(productId + " " + productName + " " + productPrice);
    }


}
