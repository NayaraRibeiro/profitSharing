package Input;

import Input.exception.EmployeeException;

import java.util.Scanner;

class InputEmployee {

    private static final String ENTER_THE_EMPLOYEE_ROLE = "Digite o cargo do funcionário que deseja consultar (Trainee, Analyst e Manager):";
    private static final String ENTER_THE_EMPLOYEE_ANNUAL = "Digite a performance anual do funcionário (entre 1 e 5): ";

    private String employeeRole;
    private Integer annualPerformance;
    private InputValidation inputValidation;

    InputEmployee() {
        inputValidation = new InputValidation();
    }

    public void readEmployeeInformation() throws EmployeeException {
            readRole();
            readAnnualPerformance();
    }

    public String getRole() {
        return employeeRole;
    }

    public Integer getAnnualPerformance() {
        return annualPerformance;
    }

    private void readRole() throws EmployeeException {
        Scanner inputUserEmployeeRole = new Scanner(System.in);
        System.out.println(ENTER_THE_EMPLOYEE_ROLE);
        this.employeeRole = inputValidation.retrieveValidRole(inputUserEmployeeRole);
    }

    private void readAnnualPerformance() throws EmployeeException {
        Scanner inputAnnualPerformance = new Scanner(System.in);
        System.out.println(ENTER_THE_EMPLOYEE_ANNUAL);
        this.annualPerformance = inputValidation.retrieveValidAnnualPerformance(inputAnnualPerformance);
    }
}
