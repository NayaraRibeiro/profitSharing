package Input;

public class Input {

    private InputCompany inputCompany;
    private InputEmployee inputEmployee;

    public Input() {
        inputCompany = new InputCompany();
        inputEmployee = new InputEmployee();
    }

    public void readCompanyInformation() {
        inputCompany.readCompanyInformation();
    }

    public void readEmployeeInformation() {
        inputEmployee.readEmployeeInformation();
    }

    public double getProfitMarginCompany() {
        return inputCompany.getProfitMargin();
    }

    public Integer getCompanyEmployeeQuantity() {
        return inputCompany.getEmployeeQuantity();
    }

    public String getEmployeeRole() {
        return inputEmployee.getRole();
    }

    public Integer getAnnualEmployeePerformance() {
        return inputEmployee.getAnnualPerformance();
    }
}
