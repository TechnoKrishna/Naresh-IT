package com.example.blc;

public class Product
{
    private int id;
    private String name;
    private double price;

    public void setProductDetails(int id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void calculateDiscount()
    {
        double Discount;
        double FinalPrice;

        if(price > 5000)
        {
            Discount = price * 0.15;
        }
        else if(price <= 5000 && price >= 1000)
        {
            Discount = price * 0.10;
        }
        else {
            Discount = price * 0.05;
        }

        FinalPrice = price - Discount;

        System.out.println("Discount is: " + Discount);
        System.out.println("Final Price is: " + FinalPrice);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
