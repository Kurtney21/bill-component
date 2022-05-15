package za.ac.cput.Entity;

public class Order {
    private String tableId, custName;
    private int qty;
    private double price;

    public Order(String tableId, String custName, int qty, double price) {
        this.tableId = tableId;
        this.custName = custName;
        this.qty = qty;
        this.price = price;
    }

    public String getTableId() {
        return tableId;
    }

    public String getCustName() {
        return custName;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "tableId='" + tableId + '\'' +
                ", custName='" + custName + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
