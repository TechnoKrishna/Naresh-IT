package blc;

public class Customer {
    private int id;
    private String name;
    private double salary;

    public void setCustomerData(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void getCustomerDetails() {
        System.out.println("Id is: " + this.id);
        System.out.println("Name is: " + this.name);
        System.out.println("Salary is: " + this.salary);
    }
}