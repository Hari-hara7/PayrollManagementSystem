class Salary {
    private Employee employee;
    private double grossSalary;
    private double deductions;
    private double netSalary;

    public Salary(Employee employee) {
        this.employee = employee;
    }

    public void calculateGrossSalary() {
        // Simple calculation, you may need to adjust based on your requirements
        grossSalary = employee.getBasicSalary() * 1.2; // Assume a 20% bonus
    }

    public void calculateDeductions() {
        // Simple calculation, you may need to adjust based on your requirements
        deductions = grossSalary * 0.1; // Assume 10% deductions201
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
        System.out.println("Basic Salary: " + employee.getBasicSalary());
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Deductions: " + deductions);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("----------------------------");
    }
}
