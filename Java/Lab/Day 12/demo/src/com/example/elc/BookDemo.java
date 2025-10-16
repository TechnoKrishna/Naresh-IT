package com.example.elc;

import com.example.blc.Book;

import java.util.Scanner;

public class BookDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book Title : ");
        String title = sc.nextLine();
        System.out.println("Enter Book Author : ");
        String author = sc.nextLine();
        System.out.println("Enter Book Price : ");
        double price = Double.parseDouble(sc.nextLine());

        Book book = new Book(title, author, price);





    }
}
