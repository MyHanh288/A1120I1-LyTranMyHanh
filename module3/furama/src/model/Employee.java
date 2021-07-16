package model;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String employeeBir;
    private int empIdNum;
    private int empTelNum;
    private String empEmail;
    private int salary;
    private Diploma diploma;
    private Regency regency;
    private Department department;

    public Employee(int employeeId, String employeeName, String employeeBir, int empIdNum, int empTelNum, String empEmail, int salary, Diploma diploma, Regency regency, Department department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBir = employeeBir;
        this.empIdNum = empIdNum;
        this.empTelNum = empTelNum;
        this.empEmail = empEmail;
        this.salary = salary;
        this.diploma = diploma;
        this.regency = regency;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBir() {
        return employeeBir;
    }

    public void setEmployeeBir(String employeeBir) {
        this.employeeBir = employeeBir;
    }

    public int getEmpIdNum() {
        return empIdNum;
    }

    public void setEmpIdNum(int empIdNum) {
        this.empIdNum = empIdNum;
    }

    public int getEmpTelNum() {
        return empTelNum;
    }

    public void setEmpTelNum(int empTelNum) {
        this.empTelNum = empTelNum;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Diploma getDiploma() {
        return diploma;
    }

    public void setDiploma(Diploma diploma) {
        this.diploma = diploma;
    }

    public Regency getRegency() {
        return regency;
    }

    public void setRegency(Regency regency) {
        this.regency = regency;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
