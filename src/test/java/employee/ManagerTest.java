package employee;

import company.Company;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ManagerTest {

    private Manager manager;

    @Test
    public void shouldCalculateProfitSharingBenefit(){
        manager = new Manager(3, new Company(100000, 10));

        Double profitSharingBenefit = manager.calculateProfitSharingBenefit();
        assertThat(profitSharingBenefit, is((double) 36000));
    }
}