package com.example.elc;

import com.example.blc.Rectangle;

import java.util.Scanner;

public class RectangleDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the width : ");
        double width = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the height : ");
        double height = Double.parseDouble(sc.nextLine());

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Area is : " + rectangle.getArea());
        System.out.println("Perimeter is : " + rectangle.getPerimeter());

    }

}
