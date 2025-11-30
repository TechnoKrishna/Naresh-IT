class Vehicle {
    public int tankCapacity() {
        return 80;
    }

    public void printTankCapacity() {
        System.out.println(this.tankCapacity());
    }
}

class Car extends Vehicle {
    @Override
    public int tankCapacity() {
        return 40;
    }

    public void printTankCapacity() // If this is commented, output is 40
    {
        System.out.println(super.tankCapacity());
    }
}

public class IQ {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.printTankCapacity();
    }
}