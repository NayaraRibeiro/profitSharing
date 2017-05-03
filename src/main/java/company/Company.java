package company;

public class Company {

    private static final int MULTIPLIER_INDEX = 10000;
    private static final double FOURTY_PERCENT_INDEX = 0.4;

    private final double totalProfitMarginCompany;
    private final Integer workerQuantity;

    public Company(double totalProfitMarginCompany, Integer workerQuantity) {
        this.totalProfitMarginCompany = totalProfitMarginCompany;
        this.workerQuantity = workerQuantity;
    }

    public Double calculateAvailableProfitSharing() {
        if(workerQuantity > 0) {
            return (totalProfitMarginCompany * FOURTY_PERCENT_INDEX) / workerQuantity;
        }
        return (double)0;
    }

    public boolean hasProfitSharing() {
        Integer goalOfProfitSharing = MULTIPLIER_INDEX * workerQuantity;
        if (isTotalProfitMarginCompanyBiggerThan(goalOfProfitSharing)) {
            return true;
        }
        return false;
    }

    private boolean isTotalProfitMarginCompanyBiggerThan(Integer goalOfProfitSharing) {
        return totalProfitMarginCompany >= goalOfProfitSharing;
    }
}