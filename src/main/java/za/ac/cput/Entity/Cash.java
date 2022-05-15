package za.ac.cput.Entity;

public class Cash {

    private Double cashAmount, change;

    public Cash(Double cashAmount, Double change) {
        this.cashAmount = cashAmount;
        this.change = change;
    }

    public Double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(Double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    @Override
    public String toString() {
        return "Cash{" +
                "cashAmount=" + cashAmount +
                ", change=" + change +
                '}';
    }
}
