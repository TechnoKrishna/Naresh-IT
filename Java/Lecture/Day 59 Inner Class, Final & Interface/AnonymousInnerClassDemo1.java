class Super { // Super.class
    public void show() {
        System.out.println("Super class show method");
    }
}

public class AnonymousInnerClassDemo1 { // AnonymousInnerClassDemo1.class
    public static void main(String[] args) {

        // Anonymous inner class
        Super sub = new Super() { // AnonymousInnerClassDemo1$1.class
            @Override
            public void show() {
                System.out.println("Anonymous inner class show method");
            }
        };

        sub.show();
    }
}