import java.util.Date;

public class Employee {
    private int employeeId;
    private String name;
    private double basicSalary;
    private String department;
    private String position;
    private double allowances;
    private String email;
    private String phoneNumber;
    private Date dateOfBirth;

    public Employee(int employeeId, String name, double basicSalary, String department, String position, double allowances,
                    String email, String phoneNumber, Date dateOfBirth) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.department = department;
        this.position = position;
        this.allowances = allowances;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
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

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
