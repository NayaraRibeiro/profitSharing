package Input;
import company.Company;
import employee.Analistic;
import employee.Manager;
import employee.Trainee;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;


public class InputTest {

    private Input input;

    @Test
    public void shouldCreateAnalisticEmployeeRoleInformation() throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Company company = new Company(100000, 10);
        input = new Input(2, "Analistic");

        input.createEmployeeRoleInformation(company);

        assertThat(input.getEmployee(), instanceOf(Analistic.class));
    }

    @Test
    public void shouldCreateTraineeEmployeeRoleInformation() throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Company company = new Company(100000, 10);
        input = new Input(2, "Trainee");

        input.createEmployeeRoleInformation(company);

        assertThat(input.getEmployee(), instanceOf(Trainee.class));
    }

    @Test
    public void shouldCreateManagerEmployeeRoleInformation() throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Company company = new Company(100000, 10);
        input = new Input(2, "Manager");

        input.createEmployeeRoleInformation(company);

        assertThat(input.getEmployee(), instanceOf(Manager.class));
    }
}