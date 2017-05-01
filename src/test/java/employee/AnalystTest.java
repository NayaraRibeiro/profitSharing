package employee;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AnalystTest {

    private Analyst analyst;

    @Test
    public void shouldGetGrade(){
        analyst = new Analyst("Analyst");
        assertThat(analyst.getGrade(), is(2));
    }

    @Test
    public void shouldNotGetGrade(){
        analyst = new Analyst("Analysta");
        assertThat(analyst.getGrade(), is(0));
    }
}