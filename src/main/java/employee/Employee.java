package employee;

import java.lang.reflect.InvocationTargetException;

public class Employee {

    private final String role;
    private final Double partialProfitMargin;
    private final Integer annualEmployeePerformance;
    private EmployeeRole employeeRole;

    public Employee(String role, Integer annualEmployeePerformance, Double partialProfitMargin) {
        this.annualEmployeePerformance = annualEmployeePerformance;
        this.role = role;
        this.partialProfitMargin = partialProfitMargin;
    }

    public Double showProfitSharingBenefit() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Double benefit = calculateProfitSharingBenefit();
        System.out.print("PL " + benefit);
        return benefit;
    }

    private Double calculateProfitSharingBenefit() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Double profitSharingBenefit = annualEmployeePerformance * getGradeByRole() * partialProfitMargin;
        return profitSharingBenefit;
    }

    private Integer getGradeByRole() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        employeeRole = new EmployeeRole(role);
        IEmployeeRole iEmployeeRole = employeeRole.getInstance();
        return iEmployeeRole.getGrade();
    }
}