import java.util.Arrays;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "ID : " + id + ", NAME : " + name + ", SALARY : " + salary;
    }

}

public class Ex1 {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Doja Cat", 15000);
        Employee e2 = new Employee(102, "Travis Scott", 35000);
        Employee e3 = new Employee(103, "Kendrick Lamar", 27000);

        Employee arr[] = new Employee[3];

        arr[0] = e1;
        arr[1] = e2;
        arr[2] = e3;

        // Approach 1 : printing array using normal for loop

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Approach 2 : printing array using for-each loop

        for (Employee emp : arr) {
            System.out.println(emp);
        }

        // Approach 3 : printing array using Arrays.toString() method

        System.out.println(Arrays.toString(arr));

    }

}
