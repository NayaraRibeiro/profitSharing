import company.Company;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class CompanyTest {

    private Company company;

    @Test
    public void shouldHasProfitSharingWhenProfitMarginEqualGoalOfProfitSharing() {

        Integer profitMargin = 100000;
        Integer workerQuantity = 10;
        company = new Company(profitMargin, workerQuantity);

        assertEquals(true, company.hasProfitSharing());
    }

    @Test
    public void shouldHasProfitSharingWhenProfitMarginIsBiggerThanGoalOfProfitSharing() {

        Integer profitMargin = 200000;
        Integer workerQuantity = 10;
        company = new Company(profitMargin, workerQuantity);

        assertEquals(true, company.hasProfitSharing());
    }

    @Test
    public void shouldNotHasProfitSharingWhenProfitMarginIsSmallerThanGoalOfProfitSharing() {

        Integer profitMargin = 99000;
        Integer workerQuantity = 10;
        company = new Company(profitMargin, workerQuantity);

        assertEquals(false, company.hasProfitSharing());
    }

    @Test
    public void shouldCalculatePartialProfitMargin() {
        Integer profitMargin = 100000;
        Integer workerQuantity = 10;
        company = new Company(profitMargin, workerQuantity);

        Double partialProfitMargin = company.calculatePartialProfitMargin();

        assertThat(partialProfitMargin, is((double) 4000));
    }
}
