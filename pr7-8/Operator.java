public class Operator implements EmployeePosition{
    public double baseSalary;
    public double totalIncome;
    public Operator(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getJobTitle() {
        return "Operator";
    }
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }
    public void setIncome(double income) {
        this.totalIncome = income;
    }
}

