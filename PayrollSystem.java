import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayrollSystem {
    private List<Employee> employees;
    private Scanner scanner;

    public PayrollSystem() {
        this.employees = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        Employee employee = new Employee(employeeId, name, basicSalary);
        employees.add(employee);
    }

    public void processPayroll() {
        for (Employee employee : employees) {
            Salary salary = new Salary(employee);
            salary.calculateGrossSalary();
            salary.calculateDeductions();
            salary.calculateNetSalary();

            // Display salary slip
            salary.displaySalarySlip();

            // Calculate and display income tax
            double incomeTax = TaxCalculator.calculateIncomeTax(salary.getNetSalary());
            System.out.println("Income Tax: " + incomeTax);
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();

        // Prompt the user to enter employee details
        System.out.println("Enter Employee Details:");
        payrollSystem.addEmployee();

        // Process payroll
        payrollSystem.processPayroll();
    }
}
