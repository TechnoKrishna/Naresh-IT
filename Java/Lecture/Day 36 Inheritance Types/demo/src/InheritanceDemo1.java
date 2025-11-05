class Vehicle {
    protected int numberOfEngine = 1;

    public void startVehicle() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    protected String engineType = "Battery";

    public void carInfo() {
        System.out.println("Number of engine is: " + numberOfEngine);
        System.out.println("Engine Type is: " + engineType);
    }
}

public class InheritanceDemo1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.startVehicle();
        car.carInfo();
    }
}
