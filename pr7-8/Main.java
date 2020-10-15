
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.setCompanyIncome(Math.random() * (9000000 - 11000000) + 11000000);

        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            employees.add(new Employee("Name", "Surname", new Operator(), Math.random() * (15000 - 25000) + 25000));
        }
        for (int i = 0; i < 80; i++) {
            employees.add(new Employee("Name", "Surname", new Manager(), Math.random() * (30000 - 50000) + 50000));
        }
        for (int i = 0; i < 10; i++) {
            employees.add(new Employee("Name", "Surname", new TopManager(company), Math.random() * (70000 - 100000) + 100000));
        }
        company.hireAll(employees);

        ArrayList<Employee> richestEmployees = company.getTopStaff(15);
        ArrayList<Employee> poorestEmployees = company.getLowestStaff(30);

        System.out.println("15 highest salaries: " + "\n");
        company.printList(richestEmployees);
        System.out.println("30 lowest salaries: " + "\n");
        company.printList(poorestEmployees);

        System.out.println("Firing 50% of staff: " + "\n");
        Collections.shuffle(employees);
        for(int i = 0; i < company.employees.size(); i++) {
            company.fire(employees.get(i));
        }
        richestEmployees = company.getTopStaff(15);
        poorestEmployees = company.getLowestStaff(30);

        System.out.println("15 highest salaries: " + "\n");
        company.printList(richestEmployees);
        System.out.println("30 lowest salaries: " + "\n");
        company.printList(poorestEmployees);
    }
}
