import java.util.Arrays;

class Dog {
    private String name;

    public Dog(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + "]";
    }
}

public class ArrayDemo3 {
    public static void main(String[] args) {
        Dog dogs[] = new Dog[]{new Dog("A"), new Dog("B"), new Dog("C")};
        System.out.println(Arrays.toString(dogs));
    }
}
