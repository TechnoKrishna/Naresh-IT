class Animal {
    public void sleep() {
        System.out.println("Generic Animal is sleeping");
    }
}

class Dog extends Animal {
    public void sleep() {
        System.out.println("Dog Animal is sleeping");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Lion extends Animal {
    public void sleep() {
        System.out.println("Lion Animal is sleeping");
    }

    public void roar() {
        System.out.println("Lion is roaring");
    }
}

public class PolymorphicBehavior2 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        executeAnimal(a1);
    }

    public static void executeAnimal(Animal animal) {
        Dog dog = (Dog) animal; // Downcasting
        dog.sleep();
        dog.bark();
    }
}