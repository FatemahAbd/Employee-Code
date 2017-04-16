public class EmployeeTester {

    public static void main(String[] args) {
        Employee fatemah= new Employee("Hacker,fatemah!",50000);
        System.out.println("Employee Name is " + fatemah.getName());
        System.out.println("Employee Salary is " + fatemah.getSalary());
        fatemah.raiseSalary(10);
        System.out.println("Salary after insert" + fatemah.getSalary());

    }
}
