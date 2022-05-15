package za.ac.cput.Entity;

public class Customer {

    private String custName;
    private int tableNum;

    public Customer(String custName, int tableNum) {
        this.custName = custName;
        this.tableNum = tableNum;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getTableNum() {
        return tableNum;
    }

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custName='" + custName + '\'' +
                ", tableNum=" + tableNum +
                '}';
    }
}
