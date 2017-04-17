import Input.Input;
import employee.Analistic;
import employee.Manager;
import employee.Trainee;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class InputTest {

    private Input input;

    @Before
    public void setUp() {
        input = new Input();
    }

    @Test
    public void shouldReadProfitMarginFromUser() {

        input.readProfitMargin();
        assertThat(input.getProfitMargin(), is(100000));
    }

    @Test
    public void shouldReadWorkerQuantityFromUser() {

        input.readWorkerQuantity();
        assertThat(input.getWorkerQuantity(), is(10));
    }

    @Test
    public void shouldReadTraineeRoleFromUser() {
        input.readCompanyInformation();
        input.setRole("Trainee");
        input.createEmployeeRoleInformation();
        assertThat(input.getRole(), is("Trainee"));
        assertThat(input.getEmployee(), instanceOf(Trainee.class));
    }

    @Test
    public void shouldReadAnalisticRoleFromUser() {
        input.readCompanyInformation();
        input.setRole("Analista");
        input.createEmployeeRoleInformation();
        input.setRole("Analista");
        assertThat(input.getRole(), is("Analista"));
        assertThat(input.getEmployee(), instanceOf(Analistic.class));
    }

    @Test
    public void shouldReadManagerRoleFromUser() {
        input.readCompanyInformation();
        input.setRole("Gerente");
        input.createEmployeeRoleInformation();
        assertThat(input.getRole(), is("Gerente"));
        assertThat(input.getEmployee(), instanceOf(Manager.class));
    }

    @Test
    public void shouldReadAnnualWorkerPerformance(){

        input.readAnnualEmployeePerformance();
        assertThat(input.getAnnualEmployeePerformance(), is(3));
    }
}

