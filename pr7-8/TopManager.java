public class TopManager implements EmployeePosition{
    private final Company company;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public String getJobTitle() {
        return "Top Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        if(company.getCompanyIncome() > 10000000) {
            return baseSalary + (baseSalary * 1.5);
        } else {
            return baseSalary;
        }
    }
}
