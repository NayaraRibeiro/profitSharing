package Input;

import Input.exception.CompanyException;
import Input.exception.EmployeeException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(MockitoJUnitRunner.class)
public class InputValidationTest {

    private InputValidation inputValidation;

    @Before
    public void setUp(){
        inputValidation = new InputValidation();
    }

    @Test
    public void shouldTestCorrectProfitMarginValid() throws CompanyException {

        InputStream inputStream = new ByteArrayInputStream("100000".getBytes());
        Scanner inputScaner = new Scanner(inputStream);

        assertThat(inputValidation.retrieveValidDouble(inputScaner), is((double)100000));
    }

    @Test(expected = CompanyException.class)
    public void shouldTestIncorrectProfitMarginValid() throws CompanyException {

        InputStream inputStream = new ByteArrayInputStream("valorQualquer".getBytes());
        Scanner inputScaner = new Scanner(inputStream);

        inputValidation.retrieveValidDouble(inputScaner);
    }

    @Test
    public void shouldTestCorrectEmployeeQuantityValid() throws CompanyException {

        InputStream inputStream = new ByteArrayInputStream("10".getBytes());
        Scanner inputScaner = new Scanner(inputStream);

        assertThat(inputValidation.retrieveValidInteger(inputScaner), is(10));
    }

    @Test(expected = CompanyException.class)
    public void shouldTestIncorrectEmployeeQuantityValid() throws CompanyException {

        InputStream inputStream = new ByteArrayInputStream("lalalala".getBytes());
        Scanner inputScaner = new Scanner(inputStream);

        inputValidation.retrieveValidInteger(inputScaner);
    }

    @Test
    public void shouldTestCorrectRoleValid() throws EmployeeException {

        InputStream inputStream = new ByteArrayInputStream("Trainee".getBytes());
        Scanner inputScaner = new Scanner(inputStream);

        assertThat(inputValidation.retrieveValidRole(inputScaner), is("Trainee"));
    }

    @Test
    public void shouldTestCorrectRoleUpperCaseValid() throws EmployeeException {

        InputStream inputStream = new ByteArrayInputStream("MANAGER".getBytes());
        Scanner inputScaner = new Scanner(inputStream);

        assertThat(inputValidation.retrieveValidRole(inputScaner), is("Manager"));
    }

    @Test(expected = EmployeeException.class)
    public void shouldTestInvalidRoleValid() throws EmployeeException {

        InputStream inputStream = new ByteArrayInputStream("Analista".getBytes());
        Scanner inputScaner = new Scanner(inputStream);

        inputValidation.retrieveValidRole(inputScaner);
    }

    @Test(expected = EmployeeException.class)
    public void shouldTestIncorrectRoleValid() throws EmployeeException {

        InputStream inputStream = new ByteArrayInputStream("#".getBytes());
        Scanner inputScaner = new Scanner(inputStream);

        inputValidation.retrieveValidRole(inputScaner);
    }

    @Test
    public void shouldTestCorrectAnnualValidPerformance() throws EmployeeException {

        InputStream inputStream = new ByteArrayInputStream("3".getBytes());
        Scanner inputScaner = new Scanner(inputStream);

        assertThat(inputValidation.retrieveValidAnnualPerformance(inputScaner), is(3));
    }

    @Test(expected = EmployeeException.class)
    public void shouldTestInvalidAnnualValidPerformance() throws EmployeeException {

        InputStream inputStream = new ByteArrayInputStream("6".getBytes());
        Scanner inputScaner = new Scanner(inputStream);

        inputValidation.retrieveValidAnnualPerformance(inputScaner);
    }

    @Test(expected = EmployeeException.class)
    public void shouldTestIncorrectAnnualValidPerformance() throws EmployeeException {

        InputStream inputStream = new ByteArrayInputStream("lalalala".getBytes());
        Scanner inputScaner = new Scanner(inputStream);

        inputValidation.retrieveValidAnnualPerformance(inputScaner);
    }
}
