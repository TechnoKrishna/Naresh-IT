import java.util.Scanner;

class Shape {
    protected double x;

    public Shape(double x) {
        super();
        this.x = x;
        System.out.println("x value is: " + x);
    }
}

class Circle extends Shape {
    final double PI = 3.14;

    public Circle(double radius) {
        super(radius);
    }

    public void getAreaOfCircle() {
        double area = PI * x * x;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    protected int length, breadth;

    public Rectangle(int length, int breadth) {
        super(length);
        this.breadth = breadth;
    }

    public void getAreaOfRectangle() {
        double area = super.x * this.breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double radius = Double.parseDouble(sc.nextLine());

        Circle circle = new Circle(radius);
        circle.getAreaOfCircle();

        System.out.println("..................");

        Rectangle rr = new Rectangle(10, 5);
        rr.getAreaOfRectangle();
    }
}
