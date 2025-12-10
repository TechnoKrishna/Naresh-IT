@FunctionalInterface
interface Drawable {
    void draw(); // Single Abstract Method
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        Drawable d1 = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Draw method is overridden");
            }
        };

        d1.draw();
    }
}
