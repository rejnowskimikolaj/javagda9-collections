package solutions.ex1;

public enum TaxRate {

    VAT8(0.08),
    VAT23(0.23),
    VAT5(0.05),
    NO_VAT(0);

    private double rateValue;

    TaxRate(double rateValue) {
        this.rateValue = rateValue;
    }

    public double getRateValue() {
        return rateValue;
    }
}
