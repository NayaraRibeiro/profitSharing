import Input.Input;
import company.Company;
import employee.Employee;

public class App {

    public static final String NOT_PROFIT_SHARING = "Não haverá participação dos lucros.";

    public static void main(String [] args) {
        Input input = new Input();

        input.readCompanyInformation();
        Company company = new Company(input.getProfitMarginCompany(), input.getCompanyEmployeeQuantity());

        if (company.hasProfitSharing()){
            input.readEmployeeInformation();
            Double availableProfitSharingCompany =  company.calculateAvailableProfitSharing();
            Employee employee = new Employee(input.getEmployeeRole(), input.getAnnualEmployeePerformance(), availableProfitSharingCompany);
            employee.showProfitSharingBenefit();

        } else {
            System.out.println(NOT_PROFIT_SHARING);
        }
    }
}
