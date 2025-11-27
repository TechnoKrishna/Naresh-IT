class Hetro {
    public void acceptHetro(Object... x) {
        for (Object y : x) {
            System.out.println(y);
        }
    }
}

public class VarArgsDemo2 {
    public static void main(String... args) {
        new Hetro().acceptHetro(
                1, 2.3, 'A', false, "NIT",
                new StringBuilder("Java"));
    }
}
