public class Employee {
    public String firstName;
    public String lastName;
    EmployeePosition position;
    public double baseSalary;
    public double finalSalary;

    public Employee(String firstName, String lastName, EmployeePosition position, double baseSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    public void setFinalSalary(double finalSalary) {
        this.finalSalary = finalSalary;
    }

    public double getFinalSalary() {
        return finalSalary;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ". Position: " + position.getJobTitle() + ". Salary: " + Math.round(finalSalary) + ".";
    }
}
