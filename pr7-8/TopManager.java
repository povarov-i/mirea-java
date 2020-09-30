public class TopManager implements EmployeePosition{
    private double totalIncome;
    public double baseSalary;

    public TopManager(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public String getJobTitle() {
        return "Top Manager";
    }

    public void setIncome(double income) {
        this.totalIncome = income;
    }

    public double calcSalary(double baseSalary) {
        if (totalIncome > 10000000) return (baseSalary * 1.5) + baseSalary;
        else return baseSalary;
    }
}
