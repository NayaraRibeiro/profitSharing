package employee;

import company.Company;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TraineeTest {
    private Trainee trainee;

    @Test
    public void shouldCalculateProfitSharingBenefit(){
        trainee = new Trainee(3, new Company(100000, 10));

        Double profitSharingBenefit = trainee.calculateProfitSharingBenefit();
        assertThat(profitSharingBenefit, is((double) 12000));
    }
}