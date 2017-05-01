package Input;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class InputCompany {

    private static final String ENTER_THE_TOTAL_PROFIT_MARGIN_COMPANY = "Digite o valor da margem de lucro total da empresa:";
    private static final String ENTER_THE_COMPANY_EMPLOYEE_QUANTITY = "Digite a quantidade de funcionários da empresa:";
    private static final String READ_PROFIT_MARGIN_NAME_METHOD = "readProfitMargin";
    private static final String READ_EMPLOYEE_QUANTITY_NAME_METHOD = "readEmployeeQuantity";
    private static final String INVALID_INPUT = "Input inválido.";

    private double profitMargin;
    private Integer employeeQuantity;
    private InputValidation inputValidation;

    InputCompany() {
        inputValidation = new InputValidation();
    }

    void readCompanyInformation() {
        try {
            readProfitMargin();
            readEmployeeQuantity();
        } catch (Exception InputMismatchException) {
            System.out.println(INVALID_INPUT);
        }
    }

    double getProfitMargin() {
        return profitMargin;
    }

    Integer getEmployeeQuantity() {
        return employeeQuantity;
    }

    void readProfitMargin() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Scanner inputUserProfitMargin = new Scanner(System.in);
        System.out.println(ENTER_THE_TOTAL_PROFIT_MARGIN_COMPANY);
        this.profitMargin = inputValidation.retrieveValidDouble(inputUserProfitMargin, callingReadProfitMarginMethod());
    }

    void readEmployeeQuantity() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println(ENTER_THE_COMPANY_EMPLOYEE_QUANTITY);
        Scanner inputUserWorkerQuantity = new Scanner(System.in);
        this.employeeQuantity = inputValidation.retrieveValidInteger(inputUserWorkerQuantity, callingReadEmployeeQuantityMethod());
    }

    private Method callingReadProfitMarginMethod() throws NoSuchMethodException {
        return this.getClass().getDeclaredMethod(READ_PROFIT_MARGIN_NAME_METHOD, new Class[0]);
    }

    private Method callingReadEmployeeQuantityMethod() throws NoSuchMethodException {
        return this.getClass().getDeclaredMethod(READ_EMPLOYEE_QUANTITY_NAME_METHOD, new Class[0]);
    }

}
