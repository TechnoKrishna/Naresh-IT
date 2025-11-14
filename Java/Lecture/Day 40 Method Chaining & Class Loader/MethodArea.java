class Employee {
}

class Student {
}

class Customer {
}

public class MethodArea {
public static void main(String[] args)
{
Class cls = Employee.class;
System.out.println("Fully Qualified Name is: "+cls.getName());

cls = Student.class;
System.out.println("Fully Qualified Name is: "+cls.getName());

cls = Customer.class;
System.out.println("Fully Qualified Name is: "+cls.getName());
}
}