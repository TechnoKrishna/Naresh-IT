package variable_shadow;

class Demo {
    static int a = 100;   // static variable
    int b = 200;          // instance variable

    public void accept(int c) {   // parameter variable
        int d = 400;              // local variable

        System.out.println("Class Variable : " + Demo.a);
        System.out.println("Instance Variable : " + this.b);
        System.out.println("Parameter Variable : " + c);
        System.out.println("Local Variable : " + d);
    }
}

public class MethodLocalSearchAlgo {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.accept(300);
    }
}
