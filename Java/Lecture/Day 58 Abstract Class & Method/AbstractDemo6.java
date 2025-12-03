// 6. Using Abstract Methods as Business Rules

abstract class Animal {
    public abstract void checkup();
}

class Lion extends Animal {
    @Override
    public void checkup() {
        System.out.println("Lion is going for checkup");
    }
}

class Bird extends Animal {
    @Override
    public void checkup() {
        System.out.println("Bird is going for checkup");
    }
}

class Dog extends Animal {
    @Override
    public void checkup() {
        System.out.println("Dog is going for checkup");
    }
}

class Monkey extends Animal {
    @Override
    public void checkup() {
        System.out.println("Monkey is going for checkup");
    }
}

class Tiger extends Animal {
    @Override
    public void checkup() {
        System.out.println("Tiger is going for checkup");
    }
}

public class AbstractDemo6 {
    public static void main(String[] args) {
        Lion lions[] = {new Lion(), new Lion(), new Lion()};
        Bird birds[] = {new Bird(), new Bird()};
        Dog dogs[] = {new Dog(), new Dog(), new Dog()};
        Monkey monkey = new Monkey();
        Tiger tiger = new Tiger();

        AnimalCheckupHospital(monkey, tiger);
        AnimalCheckupHospital(lions);
        AnimalCheckupHospital(dogs);
        AnimalCheckupHospital(birds);
    }

    public static void AnimalCheckupHospital(Animal... animals) {
        for (Animal animal : animals) {
            animal.checkup();
        }
    }
}

// Note:
// Using varargs, you can pass individual objects or arrays.