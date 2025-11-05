class Object {
    public Object() {  // Step 3
    }
}

class Employee1 extends Object {
    Employee1() {
        super();        // Step 2
    }
}

class Developer1 extends Employee {
    Developer1() {
        super();        // Step 1
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Developer1 developer = new Developer1();
    }
}
