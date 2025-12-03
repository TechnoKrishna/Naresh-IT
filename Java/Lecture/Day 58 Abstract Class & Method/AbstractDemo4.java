// 4. Parameterized Constructor in Abstract Class

abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract void run();
}

class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Bike is Running");
    }

    public String getBikeName() {
        return this.name;
    }
}

public class AbstractDemo4 {
    public static void main(String[] args) {
        Vehicle vehicle = new Bike("KTM");
        Bike bike = (Bike) vehicle;
        System.out.print(bike.getBikeName());
        vehicle.run();
    }
}
