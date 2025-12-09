class Accept<T> // Type Parameter
{
    private T data;

    public Accept(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}

public class TypeParameterDemo {
    public static void main(String[] args) {

        Accept<Integer> intType = new Accept<>(12);
        System.out.println("Integer Type is: " + intType.getData());

        Accept<Double> doubleType = new Accept<>(12.90);
        System.out.println("Double Type is: " + doubleType.getData());

        Accept<Character> charType = new Accept<>('A');
        System.out.println("Character Type is: " + charType.getData());

        Accept<Student> studType = new Accept<>(new Student(111, "Scott"));
        System.out.println("Student Type is: " + studType.getData());
    }
}

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}