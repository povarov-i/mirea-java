import java.util.Random;
public class Manager implements EmployeePosition{
    Random r = new Random();
    private final double companyIncome = Math.random() * (115000 - 140000) + 115000;

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    public double getCompanyIncome() {
        return companyIncome;
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary + (companyIncome * 0.05);
    }
}
