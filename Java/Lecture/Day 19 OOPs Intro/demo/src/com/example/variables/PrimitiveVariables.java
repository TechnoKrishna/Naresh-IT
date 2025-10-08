package com.example.variables;

class Test
{
    static int a = 100; //Class Variable OR Static Field

    int b= 200;  //Instance variable OR non-static Field

    public void accept(int c)   //Parameter Variable
    {
        int d = 400;  //Local variable

        System.out.println("Class Variable : "+a);
        System.out.println("Instance Variable : "+b);
        System.out.println("Parameter Variable : "+c);
        System.out.println("Local Variable : "+d);
    }
}

public class PrimitiveVariables
{
    public static void main(String[] args)
    {
        Test t1 = new Test();
        t1.accept(300);
    }
}
