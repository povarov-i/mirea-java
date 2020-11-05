import java.util.ArrayList;

public class Company {
    public ArrayList<Employee> employees = new ArrayList<Employee>();
    public double companyIncome;

    public double getCompanyIncome() {
        return companyIncome;
    }

    public void setCompanyIncome(double companyIncome) {
        this.companyIncome = companyIncome;
    }

    public void hire(Employee employee) {
        employee.setFinalSalary(employee.position.calcSalary(employee.baseSalary));
        employees.add(employee);
    }

    public void hireAll(ArrayList<Employee> newEmployees) {
        employees.addAll(newEmployees);
        for (Employee employee : newEmployees) {
            employee.setFinalSalary(employee.position.calcSalary(employee.baseSalary));
        }
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public ArrayList<Employee> getTopStaff(int n) {
        ArrayList<Employee> topStaff = employees;
        int length = topStaff.size();
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (topStaff.get(j).getFinalSalary() < topStaff.get(j + 1).getFinalSalary()) {
                    Employee temp = topStaff.get(j);
                    topStaff.set(j, topStaff.get(j + 1));
                    topStaff.set(j + 1, temp);
                }
            }
        }
        ArrayList<Employee> sortedTopStaff = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sortedTopStaff.add(topStaff.get(i));
        }
        return sortedTopStaff;
    }

    public ArrayList<Employee> getLowestStaff(int n) {
        ArrayList<Employee> lowestStaff = employees;
        int length = lowestStaff.size();
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (lowestStaff.get(j).getFinalSalary() > lowestStaff.get(j + 1).getFinalSalary()) {
                    Employee temp = lowestStaff.get(j);
                    lowestStaff.set(j, lowestStaff.get(j + 1));
                    lowestStaff.set(j + 1, temp);
                }
            }
        }
        ArrayList<Employee> sortedLowestStaff = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sortedLowestStaff.add(lowestStaff.get(i));
        }
        return sortedLowestStaff;
    }

    public void printList(ArrayList<Employee> employees) {
        ArrayList<String> strList = new ArrayList<>();
        for (Employee employee : employees) {
            strList.add(employee.toString());
        }
        for (String str : strList) {
            System.out.println(str);
        }
    }
}
