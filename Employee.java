import java.util.Date;

public class Employee {
    private int employeeId;
    private String name;
    private double basicSalary;
    private String department;
    private String position;
    private double allowances;
    private boolean hasHealthInsurance;
    private boolean hasRetirementPlan;
    private int performanceRating;
    private String email;
    private String phoneNumber;
    private Date dateOfBirth;
    private String address;
    private String gender;
    private Date hireDate;

    public Employee(int employeeId, String name, double basicSalary, String department, String position,
                    double allowances, boolean hasHealthInsurance, boolean hasRetirementPlan, int performanceRating,
                    String email, String phoneNumber, Date dateOfBirth, String address, String gender, Date hireDate) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.department = department;
        this.position = position;
        this.allowances = allowances;
        this.hasHealthInsurance = hasHealthInsurance;
        this.hasRetirementPlan = hasRetirementPlan;
        this.performanceRating = performanceRating;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gender = gender;
        this.hireDate = hireDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public double getAllowances() {
        return allowances;
    }

    public boolean hasHealthInsurance() {
        return hasHealthInsurance;
    }

    public boolean hasRetirementPlan() {
        return hasRetirementPlan;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public Date getHireDate() {
        return hireDate;
    }
}
