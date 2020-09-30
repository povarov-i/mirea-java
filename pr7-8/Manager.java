public class Manager implements EmployeePosition{
public double baseSalary;
public double totalIncome;

    public Manager(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getJobTitle() {
        return "Manager";
    }

    public double calcSalary(double baseSalary) {
        return (((int)(Math.random() * ((140000 - 115000) + 1)) + 115000) * 0.05) + baseSalary;
    }

    public void setIncome(double income) {
        this.totalIncome = income;
    }
}
