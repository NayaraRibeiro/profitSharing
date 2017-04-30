package Input;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class InputValidation {

    public double retrieveValidDouble(Scanner inputScanner, Method method) throws InvocationTargetException, IllegalAccessException {
        double doubleValue = -1;
        if (inputScanner.hasNextDouble()) {
            doubleValue = inputScanner.nextDouble();
        } else {
            System.out.println("Valor inválido!");
            method.invoke(new Input());
        }
        return doubleValue;
    }

    public Integer retrieveValidInteger(Scanner inputScanner, Method method) throws InvocationTargetException, IllegalAccessException {
        Integer integerValid = 0;
        if (inputScanner.hasNextInt()) {
            integerValid = inputScanner.nextInt();
        } else {
            System.out.println("Valor inválido!");
            method.invoke(new Input());
        }
        return integerValid;
    }
}
