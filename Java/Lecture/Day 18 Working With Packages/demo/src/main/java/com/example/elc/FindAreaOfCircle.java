package com.example.elc;

import java.util.Scanner;

import com.example.blc.Circle;

public class FindAreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = Double.parseDouble(sc.nextLine());

        String areaOfCircle = Circle.getAreaOfCircle(radius);
        System.out.println("Area of circle without format: " + areaOfCircle);

        double area = Double.parseDouble(areaOfCircle);
        System.out.printf("Area is %.2f", area);

        sc.close();
    }
}