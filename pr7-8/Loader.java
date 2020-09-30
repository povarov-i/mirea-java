import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Loader {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Company company = new Company();
        ArrayList<Employee> employees = new ArrayList<Employee>();
        System.out.println("Company Income: ");
        company.setIncome(in.nextDouble());
        for (int i = 0; i < 180; i++)
            employees.add(new Employee("Name", "Surname", new Operator(Math.random() * (25000 - 15000) + 15000)));
        for (int i = 0; i < 80; i++)
            employees.add(new Employee("Name", "Surname", new Manager(Math.random() * (60000 - 45000) + 45000)));
        for (int i = 0; i < 10; i++)
            employees.add(new Employee("Name", "Surname", new TopManager(Math.random() * (100000 - 70000) + 70000)));
        company.hireAll(employees);

        ArrayList<Employee> richestEmployees = company.getTopSalaryStaff(15);
        ArrayList<Employee> poorestEmployees = company.getLowestSalaryStaff(30);

        System.out.println("15 highest salaries: " + "\n");
        System.out.println(company.listPrint(richestEmployees));
        System.out.println("30 lowest salaries: " + "\n");
        System.out.println(company.listPrint(poorestEmployees));

    }
}
