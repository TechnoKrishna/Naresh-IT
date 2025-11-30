class Bird {
    public void fly() {
        System.out.println("Bird can fly");
    }
}

class Fish {
    public void swim() {
        System.out.println("Fish can swim");
    }
}

public class InstanceOfDemo3 {
    public static void main(String[] args) {
        Fish fish = new Fish();

        // if (fish instanceof Bird) { // ❌ Error: No IS-A relation
        // }
    }
}