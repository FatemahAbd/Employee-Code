public class Employee {
    //we declare two private variables one of them is string and the other one is double
    private String employeeName;
    private double currentSalary;
    //a constractor has the same name of the class and it has two parameters
    public Employee(String employeeName, double currentSalary) {
        this.employeeName= employeeName;
        this.currentSalary= currentSalary;

    }
    //a method called getName (type: string) and returns the name of the employee
    public String getName() {
        return employeeName;
    }
    //a method called getSalary (type: double) and returns the salary that the employee has
    public double getSalary() {
        return currentSalary;
    }
    //a method called raiseSalary (type: void, thats mean it returns nothing) which has one parameter and it calculate the interest on employee's salary
    public void raiseSalary(double byPercent) {
        currentSalary = currentSalary + currentSalary * byPercent / 100;

    }

}
