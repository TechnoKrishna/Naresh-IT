// 5. Overriding Abstract Methods Across Multiple Levels

abstract class Alpha {
    public abstract void show();

    public abstract void demo();
}

abstract class Beta extends Alpha {
    @Override
    public void show() {
        System.out.println("Show method is overridden in Beta class");
    }
}

class Gamma extends Beta {
    @Override
    public void demo() {
        System.out.println("Demo method is overridden in Gamma class");
    }
}

public class AbstractDemo5 {
    public static void main(String[] args) {
        Gamma g = new Gamma();
        g.show();
        g.demo();
    }
}