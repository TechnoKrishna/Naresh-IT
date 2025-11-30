class Alpha {
}

class Beta extends Alpha {
}

class Vehicle {
    public Alpha run() {
        System.out.println("Generic Vehicle is Running");
        return null;
    }
}

class Car extends Vehicle {
    @Override
    public Beta run() {
        System.out.println("Car Vehicle is Running");
        return null;
    }
}

public class CoVariantDemo1 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.run();
    }
}