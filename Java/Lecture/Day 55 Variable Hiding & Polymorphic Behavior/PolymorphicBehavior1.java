class Animal {
    public void sleep() {
        System.out.println("Generic Animal is sleeping");
    }
}

class Dog extends Animal {
    public void sleep() {
        System.out.println("Dog Animal is sleeping");
    }
}

class Lion extends Animal {
    public void sleep() {
        System.out.println("Lion Animal is sleeping");
    }
}

public class PolymorphicBehavior1 {
    public static void main(String[] args) {
        Animal a1;

        a1 = new Dog();
        executeAnimal(a1);

        System.out.println(".......");

        a1 = new Lion();
        executeAnimal(a1);
    }

    public static void executeAnimal(Animal animal) {
        animal.sleep();
    }
}