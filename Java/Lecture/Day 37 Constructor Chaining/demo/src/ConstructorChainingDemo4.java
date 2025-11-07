class Alpha {
    public Alpha() {
        System.out.println("No Argument Constructor of Alpha class..");
    }

    public Alpha(int x) {
        this();
        System.out.println("Parameterized Constructor of Alpha class: " + x);
    }
}

class Beta extends Alpha {
    public Beta() {
        super(10);
        System.out.println("No Argument Constructor of Beta class..");
    }
}

public class ConstructorChainingDemo4 {
    public static void main(String[] args) {
        Beta b = new Beta();
    }
}
