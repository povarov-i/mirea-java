public class Employee {
    public String firstName;
    public String lastName;
    public EmployeePosition position;
    public String strPosition;
    public double salary;

    public Employee(String firstName, String lastName, EmployeePosition position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return firstName + " " + lastName + ". Position: " + position.getJobTitle() + ". Salary: " + position.calcSalary(salary) + "." + "\n";
    }
}
