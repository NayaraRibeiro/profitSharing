package employee;

import company.Company;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnalisticTest {

    private Analistic analistic;

    @Test
    public void shouldCalculateProfitSharingBenefit(){
        analistic = new Analistic(3, new Company(100000, 10));

        Double profitSharingBenefit = analistic.calculateProfitSharingBenefit();
        assertThat(profitSharingBenefit, is((double) 24000));
    }

}