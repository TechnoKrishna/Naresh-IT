public class StaticTest {
    public static void main(String[] args) {
        System.out.println("Static main running...");
        main();
    }

    // non-static main
    public static void main() {
        System.out.println("Hello Everyone!!!");
    }
}