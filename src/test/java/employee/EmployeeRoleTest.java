package employee;

import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.*;

public class EmployeeRoleTest {

    private EmployeeRole employeeRole;

    @Test
    public void shouldGetInstanceOfTrainee() throws ClassNotFoundException {
        employeeRole = new EmployeeRole("Trainee");
        assertThat(employeeRole.getInstance(), instanceOf(Trainee.class));
    }

    @Test
    public void shouldGetInstanceOfAnalyst() throws ClassNotFoundException {
        employeeRole = new EmployeeRole("Analyst");
        assertThat(employeeRole.getInstance(), instanceOf(Analyst.class));
    }

    @Test
    public void shouldGetInstanceOfManager() throws ClassNotFoundException {
        employeeRole = new EmployeeRole("Manager");
        assertThat(employeeRole.getInstance(), instanceOf(Manager.class));
    }

    @Test(expected = ClassNotFoundException.class)
    public void shouldReturnExceptionWhenRoleIsUnknown() throws ClassNotFoundException {
        employeeRole = new EmployeeRole("Gestor");
        assertThat(employeeRole.getInstance(), instanceOf(Trainee.class));
    }
}