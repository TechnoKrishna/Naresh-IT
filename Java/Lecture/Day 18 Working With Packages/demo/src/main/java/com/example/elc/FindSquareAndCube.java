package com.example.elc;

import java.util.Scanner;

import com.example.blc.SquareAndCube;

public class FindSquareAndCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(sc.nextLine());

        System.out.println("The result is: " + SquareAndCube.findSquareAndCube(num));
        sc.close();
    }
}
