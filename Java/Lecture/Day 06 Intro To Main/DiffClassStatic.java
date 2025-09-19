class Welcome {
    public static void main() {
        System.out.println("Hello Batch 40");
    }
}

public class DiffClassStatic {
    public static void main(String[] args) {
        System.out.println("Static main running...");
        Welcome.main();
    }
}