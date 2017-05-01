package Input;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class InputEmployee {

    private static final String READ_ROLE_NAME_METHOD = "readRole";
    private static final String INVALID_INPUT = "Input inválido.";
    private static final String ENTER_THE_EMPLOYEE_ROLE = "Digite o cargo do funcionário que deseja consultar (Trainee, Analyst e Manager):";
    private static final String ENTER_THE_EMPLOYEE_ANNUAL = "Digite a performance anual do funcionário (entre 1 e 5): ";

    private String employeeRole;
    private Integer annualPerformance;
    private InputValidation inputValidation;

    InputEmployee() {
        inputValidation = new InputValidation();
    }

    void readEmployeeInformation() {
        try {
            readRole();
            readAnnualPerformance();
        } catch (Exception InputMismatchException) {
            System.out.println(INVALID_INPUT);
        }
    }

    String getRole() {
        return employeeRole;
    }

    Integer getAnnualPerformance() {
        return annualPerformance;
    }

    void readRole() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Scanner inputUserEmployeeRole = new Scanner(System.in);
        System.out.println(ENTER_THE_EMPLOYEE_ROLE);
        this.employeeRole = inputValidation.retrieveValidRole(inputUserEmployeeRole, callingReadRoleMethod());
    }

    void readAnnualPerformance() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Scanner inputAnnualPerformance = new Scanner(System.in);
        System.out.println(ENTER_THE_EMPLOYEE_ANNUAL);
        this.annualPerformance = inputValidation.retrieveValidAnnualPerformance(inputAnnualPerformance, callingReadAnnualPerformance());
    }

    private Method callingReadRoleMethod() throws NoSuchMethodException {
        return this.getClass().getDeclaredMethod(READ_ROLE_NAME_METHOD, new Class[0]);
    }

    private Method callingReadAnnualPerformance() throws NoSuchMethodException {
        return this.getClass().getDeclaredMethod("readAnnualPerformance", new Class[0]);
    }

}
