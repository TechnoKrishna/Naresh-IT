package com.example.blc;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width,double height){

        if(width < 0 || height < 0)
        {
            System.out.println("Invalid arguments");
            System.exit(0);
        }
        this.width=width;
        this.height=height;
    }

    public double getArea()
    {
        return width*height;
    }

    public double getPerimeter()
    {
        return 2*width+2*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
