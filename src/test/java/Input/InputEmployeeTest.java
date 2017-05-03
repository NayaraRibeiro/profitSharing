package Input;

import Input.exception.EmployeeException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class InputEmployeeTest {

    private InputEmployee inputEmployee;

    @Mock
    private InputValidation inputValidation;


    @Before
    public void setUp(){
        inputEmployee = new InputEmployee();
    }

    @Test
    public void shouldTest() throws EmployeeException {

        InputStream inputStreamRole = new ByteArrayInputStream("Trainee".getBytes());
        Scanner roleInput = spy(new Scanner(inputStreamRole));
        when(roleInput.hasNext()).thenReturn(true);

        InputStream inputStreamAnnual = new ByteArrayInputStream("3".getBytes());
        Scanner performanceInput = spy(new Scanner(inputStreamAnnual));
        when(performanceInput.hasNext()).thenReturn(true);

        when(inputValidation.retrieveValidRole(roleInput)).thenReturn("Trainee");
        when(inputValidation.retrieveValidAnnualPerformance(performanceInput)).thenReturn(3);

        inputEmployee.readEmployeeInformation();

        assertThat(inputEmployee.getRole(), is("Trainee"));
        assertThat(inputEmployee.getAnnualPerformance(), is(3));
    }
}