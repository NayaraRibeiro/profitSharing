package Input;

import Input.exception.CompanyException;

import java.util.Scanner;

class InputCompany {

    private static final String ENTER_THE_TOTAL_PROFIT_MARGIN_COMPANY = "Digite o valor da margem de lucro total da empresa:";
    private static final String ENTER_THE_COMPANY_EMPLOYEE_QUANTITY = "Digite a quantidade de funcionários da empresa:";

    private double profitMargin;
    private Integer employeeQuantity;
    private InputValidation inputValidation;

    InputCompany() {
        inputValidation = new InputValidation();
    }

    void readCompanyInformation() throws CompanyException {
            readProfitMargin();
            readEmployeeQuantity();
    }

    double getProfitMargin() {
        return profitMargin;
    }

    Integer getEmployeeQuantity() {
        return employeeQuantity;
    }

    void readProfitMargin() throws CompanyException {
        Scanner inputUserProfitMargin = new Scanner(System.in);
        System.out.println(ENTER_THE_TOTAL_PROFIT_MARGIN_COMPANY);
        this.profitMargin = inputValidation.retrieveValidDouble(inputUserProfitMargin);
    }

    void readEmployeeQuantity() throws CompanyException {
        System.out.println(ENTER_THE_COMPANY_EMPLOYEE_QUANTITY);
        Scanner inputUserWorkerQuantity = new Scanner(System.in);
        this.employeeQuantity = inputValidation.retrieveValidInteger(inputUserWorkerQuantity);
    }
}
