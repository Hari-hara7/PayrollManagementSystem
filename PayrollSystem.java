import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Position: ");
        String position = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter Allowances: ");
        double allowances = scanner.nextDouble();
        
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Email Address: ");
        String email = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter Date of Birth (yyyy-MM-dd): ");
        String dobString = scanner.nextLine();
        Date dateOfBirth = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateOfBirth = dateFormat.parse(dobString);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
            return;
        }
        
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        
        System.out.print("Enter Gender (Male/Female/Other): ");
        String gender = scanner.nextLine();
        
        System.out.print("Enter Hire Date (yyyy-MM-dd): ");
        String hireDateString = scanner.nextLine();
        Date hireDate = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            hireDate = dateFormat.parse(hireDateString);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
            return;
        }

        

        Employee employee = new Employee(employeeId, name, basicSalary, department, position, allowances,
                                          email, phoneNumber, dateOfBirth, address, gender, hireDate);
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
           
        }
    }

    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();

        // Prompt the user to enter employee details
        System.out.println("Enter Employee Details:");
        payrollSystem.addEmployee();

        // Display a visual separation
        System.out.println("\n------------------------------------\n");

        // Process payroll
        payrollSystem.processPayroll();

        // Display a visual separation after processing payroll
        System.out.println("\n------------------------------------\n");
    }
}
