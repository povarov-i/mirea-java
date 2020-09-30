import java.util.ArrayList;
import java.util.Collections;

public class Company {
    public ArrayList<Employee> employees = new ArrayList<Employee>();
    public double income;

    public void hire(Employee employee) {
        employees.add(employee);
        employee.strPosition = employee.position.getJobTitle();
        employee.salary = employee.position.calcSalary(employee.salary);
        employee.position.setIncome(getIncome());
    }

    public void hireAll(ArrayList<Employee> hiringList) {
        employees.addAll(hiringList);
        for (Employee employee : employees) {
            employee.strPosition = employee.position.getJobTitle();
            employee.salary = employee.position.calcSalary(employee.salary);
            employee.position.setIncome(getIncome());
        }
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public ArrayList<Employee> getTopSalaryStaff(int count) {
        ArrayList<Employee> employeesList = employees;
        int length = employeesList.size();
        for(int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (employeesList.get(j).position.calcSalary(employeesList.get(j).salary) < employeesList.get(j + 1).position.calcSalary(employeesList.get(j + 1).salary))
                    Collections.swap(employeesList, j, j + 1);
            }
        }
        count = employeesList.size() - count;
        for(int i = 0; i < count; i++) employeesList.remove(employeesList.get(employeesList.size() - 1));
        return employeesList;
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count) {
        ArrayList<Employee> employeesList = employees;
        int length = employeesList.size();
        for(int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (employeesList.get(j).position.calcSalary(employeesList.get(j).salary) > employeesList.get(j + 1).position.calcSalary(employeesList.get(j + 1).salary))
                    Collections.swap(employeesList, j, j + 1);
            }
        }
        count = employeesList.size() - count;
        for(int i = 0; i < count; i++) employeesList.remove(employeesList.get(employeesList.size() - 1));
        return employeesList;
    }

    public ArrayList<String> listPrint(ArrayList<Employee> employees) {
        ArrayList<String> strList = new ArrayList<String>();
        for(Employee employee : employees) {
            strList.add(employee.toString());
        }
        return strList;
    }
}
