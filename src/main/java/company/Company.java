package company;

public class Company {
    private Integer goalOfProfitSharing;
    private Integer profitMargin;
    private Integer workerQuantity;

    public Company(Integer profitMargin, Integer workerQuantity) {
        this.profitMargin = profitMargin;
        this.workerQuantity = workerQuantity;
        this.goalOfProfitSharing = 10000 * workerQuantity;
    }

    public boolean hasProfitSharing() {
        if (profitMargin >= goalOfProfitSharing){
            return true;
        }
        return false;
    }

    public Double calculatePartialProfitMargin() {
        Double partialProfitMargin = (profitMargin * 0.4)/workerQuantity;
        return partialProfitMargin;
    }
}