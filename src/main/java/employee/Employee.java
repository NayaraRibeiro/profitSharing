package employee;

public class Employee {

    private final String role;
    private final Double availableSharingProfitMarginCompany;
    private final Integer annualEmployeePerformance;
    private EmployeeRole employeeRole;

    public Employee(String role, Integer annualEmployeePerformance, Double availableProfitSharingCompany) {
        this.annualEmployeePerformance = annualEmployeePerformance;
        this.role = role;
        this.availableSharingProfitMarginCompany = availableProfitSharingCompany;
    }

    public Double showProfitSharingBenefit() {
        Double benefit = calculateProfitSharingBenefit();
        System.out.print("PL para " + role + " com performance anual " + annualEmployeePerformance + " é " + benefit);
        return benefit;
    }

    private Double calculateProfitSharingBenefit() {
        Double profitSharingBenefit = annualEmployeePerformance * getGradeByRole() * availableSharingProfitMarginCompany;
        return profitSharingBenefit;
    }

    private Integer getGradeByRole() {
        employeeRole = new EmployeeRole(role);
        IEmployeeRole iEmployeeRole = employeeRole.getInstance();
        return iEmployeeRole.getGrade();
    }
}