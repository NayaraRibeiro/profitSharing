package Input;

import org.apache.commons.lang.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class InputValidation {

    private final String TRAINEE = "Trainee";
    private final String ANALYST = "Analyst";
    private final String MANAGER = "Manager";
    private static final String INVALID_VALUE = "Valor inválido!";

    double retrieveValidDouble(Scanner inputScanner, Method method) throws InvocationTargetException, IllegalAccessException {
        double doubleValue = -1;
        if (inputScanner.hasNextDouble()) {
            doubleValue = inputScanner.nextDouble();
        } else {
            System.out.println(INVALID_VALUE);
            method.invoke(new InputCompany());
        }
        return doubleValue;
    }

    Integer retrieveValidInteger(Scanner inputScanner, Method method) throws InvocationTargetException, IllegalAccessException {
        Integer integerValid = 0;
        if (inputScanner.hasNextInt()) {
            integerValid = inputScanner.nextInt();
        } else {
            System.out.println(INVALID_VALUE);
            method.invoke(new InputCompany());
        }
        return integerValid;
    }

    Integer retrieveValidAnnualPerformance(Scanner inputScanner, Method readAnnualPerformance) throws InvocationTargetException, IllegalAccessException {
        Integer validAnnualPerformance = 0;
        if (inputScanner.hasNextInt()) {
            validAnnualPerformance = inputScanner.nextInt();
            verifyValidAnnualPerformance(validAnnualPerformance, readAnnualPerformance);
        } else {
            System.out.println(INVALID_VALUE);
            readAnnualPerformance.invoke(new InputEmployee());
        }
        return validAnnualPerformance;
    }

    String retrieveValidRole(Scanner inputScanner, Method readRoleMethod) throws InvocationTargetException, IllegalAccessException {
        String validRole = "";
        if (inputScanner.hasNext()) {
            validRole = inputScanner.next();
            validRole = StringUtils.capitalize(StringUtils.lowerCase(validRole));
            verifyValidRole(validRole, readRoleMethod);
        } else {
            System.out.println(INVALID_VALUE);
            readRoleMethod.invoke(new InputCompany());
        }
        return validRole;
    }

    private void verifyValidAnnualPerformance(Integer validAnnualPerformance, Method readAnnualPerformance) throws InvocationTargetException, IllegalAccessException {
        if (isNotValidAnnualPerformance(validAnnualPerformance)) {
            readAnnualPerformance.invoke(new InputEmployee());
        }
    }

    private void verifyValidRole(String validRole, Method readRoleMethod) throws InvocationTargetException, IllegalAccessException {
        if (isNotValidRole(validRole)) {
            readRoleMethod.invoke(new InputEmployee());
        }
    }

    private boolean isNotValidAnnualPerformance(Integer validAnnualPerformance) {
        return !(validAnnualPerformance >= 1 && validAnnualPerformance <= 5);
    }

    private boolean isNotValidRole(String validRole) {
        return !(TRAINEE.equals(validRole) || ANALYST.equals(validRole) || MANAGER.equals(validRole));
    }
}
