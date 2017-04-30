import Input.Input;
import company.Company;
import employee.Employee;

import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String [] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Input input = new Input();

        input.readCompanyInformation();
        Company company = new Company(input.getProfitMargin(), input.getEmployeeQuantity());

        if (company.hasProfitSharing()){

            input.readEmployeeInformation();
            Employee employee = new Employee(input.getEmployeeRole(), input.getEmployeePerformance(), company.calculatePartialProfitMargin());
            employee.showProfitSharingBenefit();
        } else {
            System.out.println("Não haverá participação dos lucros.");
        }
    }
}
