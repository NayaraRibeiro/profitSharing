package Input;

import company.Company;
import employee.Analistic;
import employee.Employee;
import employee.Manager;
import employee.Trainee;

public class Input {

    private Integer profitMargin;
    private Integer workerQuantity;
    private String role;
    private Integer annualEmployeePerformance;
    private Employee employee;
    private Company company;

    public void readCompanyInformation() {
        readProfitMargin();
        readWorkerQuantity();
        company = new Company(profitMargin, workerQuantity);
    }

    public void readProfitMargin() {
        this.profitMargin = 100000;
    }

    public void readWorkerQuantity() {
        this.workerQuantity = 10;
    }

    public void readEmployeeInformation() {
        readRole();
        readAnnualEmployeePerformance();
    }

    public void createEmployeeRoleInformation() {

        if (getRole().equals("Trainee")) {
            employee = new Trainee(annualEmployeePerformance, getCompany());
        }
        if (getRole().equals("Analista")){
            employee = new Analistic(annualEmployeePerformance, getCompany());
        }
        if (getRole().equals("Gerente")){
            employee = new Manager(annualEmployeePerformance, getCompany());
        }
    }

    private void readRole() {
        this.role = "Trainee";
    }

    public void readAnnualEmployeePerformance() {
        this.annualEmployeePerformance = 3;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public Integer getWorkerQuantity() {
        return workerQuantity;
    }

    public Integer getProfitMargin() {
        return profitMargin;
    }

    public Integer getAnnualEmployeePerformance() {
        return annualEmployeePerformance;
    }

    public Company getCompany() {
        return company;
    }

    public Employee getEmployee() {
        return employee;
    }
}
