import Input.Input;
import employee.Employee;

public class App {

    public static void main(String [] args){
        Input input = new Input();
        input.readCompanyInformation();
        input.readEmployeeInformation();

        input.createEmployeeRoleInformation();
        Employee employee = input.getEmployee();

        employee.showProfitSharingBenefit();
    }
}
