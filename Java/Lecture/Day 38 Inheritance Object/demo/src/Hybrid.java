class Vehicle
{
    private int wheels;

    Vehicle(int wheels)
    {
        super();
        this.wheels = wheels;
        System.out.println("Vehicle Constructor : " + this.wheels);
    }
}

class Car extends Vehicle
{
    Car(int wheels)
    {
        super(wheels);
        System.out.println("Car Constructor");
    }
}

class BatteryCar extends Car
{
    BatteryCar(int wheels)
    {
        super(wheels);
        System.out.println("Battery Car Constructor");
    }
}

class PetrolCar extends Car
{
    PetrolCar(int wheels)
    {
        super(wheels);
        System.out.println("Petrol Car Constructor");
    }
}


public class Hybrid {
    public static void main(String[] args) {

        BatteryCar batteryCar = new BatteryCar(4);
        PetrolCar petrolCar = new PetrolCar(4);

    }
}
