import Input.Input;
import company.Company;
import employee.Employee;

import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String [] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Input input = new Input();
        input.readCompanyInformation();

        Company company = new Company(input.getProfitMargin(), input.getEmployeeQuantity());

        if (company.hasProfitSharing()){
            input.readEmployeeInformation();
            Employee employee = input.createEmployeeRoleInformation(company);
            employee.showProfitSharingBenefit();
        } else {
            System.out.println("Não haverá participação dos lucros.");
        }
    }
}
