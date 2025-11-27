class Alpha {
    public void accept(int x) {
        System.out.println("Integer type");
    }

    public void accept(long x) {
        System.out.println("Long type");
    }
}

class Beta extends Alpha {
    public void accept(float x) {
        System.out.println("Float type");
    }

    void accept(double x) {
        System.out.println("Double type");
    }
}

public class MOLDemo3 {
    public static void main(String[] args) {
        Beta beta = new Beta();
        beta.accept('A'); // char → int → long → float → double
    }
}
