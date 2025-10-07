package com.example.elc;

import java.util.Scanner;

import com.example.blc.Square;

public class FindSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the Square: ");
        int num = Integer.parseInt(sc.nextLine());

        System.out.println("Area of Square is: " + Square.getAreaOfSquare(num));
        sc.close();
    }
}