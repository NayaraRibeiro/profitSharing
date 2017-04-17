package employee;

import company.Company;

public class Trainee extends Employee implements IEmployee {

    public Trainee(Integer annualWorkerPerformance, Company company) {
        super(annualWorkerPerformance, 1, company);
    }
}
