public class Items {

    private String id;
    private String iName;
    private int qty;
    private double price;
    private double totalPrice;

    public Items(String id, String iName, int qty, double price, double totalPrice) {
        this.id = id;
        this.iName = iName;
        this.qty = qty;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public String getiName() {
        return iName;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public static void displayFormat()
    {
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("\nProduct ID \t\tName\t\tQuantity\t\tRate \t\t\t\tTotal Price\n");
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");
    }

    public void display()
    {
        System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n" ,id, iName, qty, price, totalPrice);
    }
}
