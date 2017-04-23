package employee;

import company.Company;

public class Employee {

    private Integer grade;
    private Company company;
    private Integer annualWorkerPerformance;

    public Employee(Integer annualWorkerPerformance, Integer grade, Company company) {
        this.annualWorkerPerformance = annualWorkerPerformance;
        this.grade = grade;
        this.company = company;
    }

    public Double calculateProfitSharingBenefit() {
        Double profitSharingBenefit = annualWorkerPerformance * grade *
                company.calculatePartialProfitMargin();
        return profitSharingBenefit;
    }

    public void showProfitSharingBenefit() {
        System.out.print("PL " + calculateProfitSharingBenefit());
    }
}