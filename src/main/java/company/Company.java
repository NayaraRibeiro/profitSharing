package company;

public class Company {
    public static final int MULTIPLIER_INDEX = 10000;
    public static final double FOURTY_PERCENT_INDEX = 0.4;
    private Integer goalOfProfitSharing;
    private double profitMargin;
    private Integer workerQuantity;

    public Company(double profitMargin, Integer workerQuantity) {
        this.profitMargin = profitMargin;
        this.workerQuantity = workerQuantity;
        this.goalOfProfitSharing = MULTIPLIER_INDEX * workerQuantity;
    }

    public boolean hasProfitSharing() {
        if (profitMargin >= goalOfProfitSharing){
            return true;
        }
        return false;
    }

    public Double calculatePartialProfitMargin() {
        return (profitMargin * FOURTY_PERCENT_INDEX)/workerQuantity;
    }
}