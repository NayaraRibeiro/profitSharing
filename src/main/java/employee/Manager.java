package employee;

import company.Company;

public class Manager extends Employee implements IEmployee{

    public Manager(Integer annualWorkerPerformance, Company company) {
        super(annualWorkerPerformance, 3, company);
    }
}
