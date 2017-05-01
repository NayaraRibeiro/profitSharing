package employee;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ManagerTest {

    private Manager manager;

    @Test
    public void shouldGetGrade() {
        manager = new Manager("Manager");
        assertThat(manager.getGrade(), is(3));
    }

    @Test
    public void shouldNotGetGrade() {
        manager = new Manager("Analysta");
        assertThat(manager.getGrade(), is(0));
    }

}