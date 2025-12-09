abstract class Vehicle {
    public abstract void run();
}

public class AnonymousInnerClassDemo2 {
    public static void main(String[] args) {

        // Anonymous inner class - Car
        Vehicle car = new Vehicle() {
            @Override
            public void run() {
                System.out.println("Car is running");
            }
        };
        car.run();

        // Anonymous inner class - Bike
        Vehicle bike = new Vehicle() {
            @Override
            public void run() {
                System.out.println("Bike is running");
            }
        };
        bike.run();

        // Anonymous inner class without reference
        new Vehicle() {
            @Override
            public void run() {
                System.out.println("Bus is running");
            }
        }.run();
    }
}
