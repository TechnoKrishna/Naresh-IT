class Doll {
    private String name;
    private double height;

    public Doll(String name, double height) {
        this.name = name;
        this.height = height;
    }

    // Copy constructor
    public Doll(Doll doll) {
        this.name = doll.name;
        this.height = doll.height;
    }

    @Override
    public String toString() {
        return "Doll [name=" + name + ", height=" + height + "]";
    }
}

public class CopyConstructorDemo2 {
    public static void main(String[] args) {
        Doll d1 = new Doll("Pari", 2.5);
        Doll d2 = new Doll(d1);

        System.out.println(d1);
        System.out.println(d2);
    }
}