public class Salary {
    private Employee employee;
    private double grossSalary;
    private double deductions;
    private double netSalary;

    public Salary(Employee employee) {
        this.employee = employee;
    }

    public void calculateGrossSalary() {
        // Simple calculation, you may need to adjust based on your requirements
        grossSalary = employee.getBasicSalary() + employee.getAllowances() * 1.2; // Include allowances and assume a 20% bonus
    }

    public void calculateDeductions() {
        // Simple calculation, you may need to adjust based on your requirements
        deductions = grossSalary * 0.1; // Assume 10% deductions
    }

    public void calculateNetSalary() {
        netSalary = grossSalary - deductions;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void displaySalarySlip() {
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Basic Salary: " + employee.getBasicSalary());
        System.out.println("Allowances: " + employee.getAllowances());
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Deductions: " + deductions);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("Has Health Insurance: " + employee.hasHealthInsurance());
        System.out.println("Has Retirement Plan: " + employee.hasRetirementPlan());
        System.out.println("Performance Rating: " + employee.getPerformanceRating());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Phone Number: " + employee.getPhoneNumber());
        System.out.println("Date of Birth: " + employee.getDateOfBirth());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("Gender: " + employee.getGender());
        System.out.println("Hire Date: " + employee.getHireDate());
        System.out.println("----------------------------");
    }
}
