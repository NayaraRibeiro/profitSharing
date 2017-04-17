package employee;

import company.Company;

public class Analistic extends Employee implements IEmployee{

    public Analistic(Integer annualWorkerPerformance, Company company) {
        super(annualWorkerPerformance, 2, company);
    }
}
