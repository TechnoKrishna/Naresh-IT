// 1. Overriding of Abstract Method is Compulsory
//WAP to show overriding of abstract method is compulsory in all the sub classes

abstract class Shape
{
public abstract void draw();
}

class Square extends Shape
{
@Override
public void draw()
{
System.out.println("Square is drawing");
}
}

class Rectangle extends Shape
{
@Override
public void draw()
{
System.out.println("Rectangle is drawing");
}
}

public class AbstractDemo1
{
public static void main(String[] args)
{
Shape s;
s = new Square(); s.draw();
s = new Rectangle(); s.draw();
}
}
