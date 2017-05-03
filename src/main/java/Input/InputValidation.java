package Input;

import Input.exception.CompanyException;
import Input.exception.EmployeeException;
import org.apache.commons.lang.StringUtils;

import java.util.Scanner;

class InputValidation {

    private final String TRAINEE = "Trainee";
    private final String ANALYST = "Analyst";
    private final String MANAGER = "Manager";
    private static final String INVALID_VALUE = "Valor inválido!";

    public double retrieveValidDouble(Scanner inputScanner) throws CompanyException {
        double doubleValue;
        if (inputScanner.hasNextDouble()) {
            doubleValue = inputScanner.nextDouble();
        } else {
            throw new CompanyException(INVALID_VALUE);
        }
        return doubleValue;
    }

    public Integer retrieveValidInteger(Scanner inputScanner) throws CompanyException {
        Integer integerValid;
        if (inputScanner.hasNextInt()) {
            integerValid = inputScanner.nextInt();
        } else {
            throw new CompanyException(INVALID_VALUE);
        }
        return integerValid;
    }

    public Integer retrieveValidAnnualPerformance(Scanner inputScanner) throws EmployeeException {
        Integer validAnnualPerformance;
        if (inputScanner.hasNextInt()) {
            validAnnualPerformance = inputScanner.nextInt();
            verifyValidAnnualPerformance(validAnnualPerformance);
        } else {
            throw new EmployeeException(INVALID_VALUE);
        }
        return validAnnualPerformance;
    }

    public String retrieveValidRole(Scanner inputScanner) throws EmployeeException {
        String validRole = "";
        if (inputScanner.hasNext()) {
            validRole = inputScanner.next();
            validRole = StringUtils.capitalize(StringUtils.lowerCase(validRole));
            verifyValidRole(validRole);
        }
        return validRole;
    }

    private void verifyValidAnnualPerformance(Integer validAnnualPerformance) throws EmployeeException {
        if (isNotValidAnnualPerformance(validAnnualPerformance)) {
            throw new EmployeeException(INVALID_VALUE);
        }
    }

    private void verifyValidRole(String validRole) throws EmployeeException {
        if (isNotValidRole(validRole)) {
            throw new EmployeeException(INVALID_VALUE);
        }
    }

    private boolean isNotValidAnnualPerformance(Integer validAnnualPerformance) {
        return !(validAnnualPerformance >= 1 && validAnnualPerformance <= 5);
    }

    private boolean isNotValidRole(String validRole) {
        return !(TRAINEE.equals(validRole) || ANALYST.equals(validRole) || MANAGER.equals(validRole));
    }
}
