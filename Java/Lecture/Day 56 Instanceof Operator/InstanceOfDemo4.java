class Vehicle {
    public void run() {
        System.out.println("Vehicle is running");
    }
}

class BMW extends Vehicle {
}

class Audi extends Vehicle {
}

class Naxon extends Vehicle {
}

public class InstanceOfDemo4 {
    public static void main(String[] args) {
        Audi a = new Audi();
        acceptCarType(a);
    }

    public static void acceptCarType(Vehicle v) {
        if (v instanceof BMW) {
            System.out.println("BMW Car");
        } else {
            System.out.println("AUDI Car");
        }
    }
}