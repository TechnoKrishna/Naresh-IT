class Super {
    public Super(String str) {
        super();
        System.out.println("Institute Name is: " + str);
    }
}

class Sub extends Super {
    public Sub(String name) {
        super(name);
    }
}

public class ConstructorChainingDemo3 {
    public static void main(String[] args) {
        Sub s1 = new Sub("NIT");
    }
}
