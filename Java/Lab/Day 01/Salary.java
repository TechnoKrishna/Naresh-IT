public class Salary {
    public static void main(String[] args) {
        double basicSalary = Double.parseDouble(args[0]);
        double hra = 0.15 * basicSalary;
        double da = 0.15 * basicSalary;
        double et = 0.10 * basicSalary;
        double grossSalary = basicSalary + hra + da + et;

        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (15%): " + hra);
        System.out.println("Conveyance (15%): " + da);
        System.out.println("Entertainment (10%): " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}
