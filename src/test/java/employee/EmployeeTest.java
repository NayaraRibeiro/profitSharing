package employee;

import company.Company;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class EmployeeTest {

    private Employee employee;
    private Company company;

    @Test
    public void shouldCalculateProfitSharingBenefitForTrainee() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        company = new Company(100000, 10);
        employee = new Employee("Trainee", 3, company.calculateAvailableProfitSharing());

        Double profitSharingBenefit = employee.showProfitSharingBenefit();
        assertThat(profitSharingBenefit, is((double) 12000));
    }

    @Test
    public void shouldCalculateProfitSharingBenefitForAnalista() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        company = new Company(100000, 10);
        employee = new Employee("Analyst", 3, company.calculateAvailableProfitSharing());

        Double profitSharingBenefit = employee.showProfitSharingBenefit();
        assertThat(profitSharingBenefit, is((double) 24000));
    }
    @Test
    public void shouldCalculateProfitSharingBenefitForManager() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        company = new Company(100000, 10);
        employee = new Employee("Manager", 3, company.calculateAvailableProfitSharing());

        Double profitSharingBenefit = employee.showProfitSharingBenefit();
        assertThat(profitSharingBenefit, is((double) 36000));
    }

    @Test(expected = ClassNotFoundException.class)
    public void shouldNotCalculateProfitSharingBenefitForAnalista() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        company = new Company(100000, 10);
        employee = new Employee("Analista", 3, company.calculateAvailableProfitSharing());

        employee.showProfitSharingBenefit();
    }
}