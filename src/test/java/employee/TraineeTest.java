package employee;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TraineeTest {

    private Trainee trainee;

    @Test
    public void shouldGetGrade(){
        trainee = new Trainee("Trainee");
        assertThat(trainee.getGrade(), is(1));
    }

    @Test
    public void shouldNotGetGrade(){
        trainee = new Trainee("Analysta");
        assertThat(trainee.getGrade(), is(0));
    }

}