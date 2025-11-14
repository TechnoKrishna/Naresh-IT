class Foo {
}

public class PlatformClassLoader {
    public static void main(String[] args) {
        System.out.println("Super class for Application class loader is :");
        System.out.println(Foo.class.getClassLoader().getParent());
    }
}