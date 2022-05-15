package za.ac.cput.Entity;

public class Product {
    private String id, productName;
    private int quantity;
    private double price;
    private double totalPrice;



    public Product(ProductBuilder productBuilder){
        this.id = productBuilder.id;
        this.productName = productBuilder.productName;
        this.quantity = productBuilder.quantity;
        this.price = productBuilder.price;
        this.totalPrice = productBuilder.totalPrice;
    }

    public static class ProductBuilder{
        private String id, productName;
        private int quantity;
        private double price;
        private double totalPrice;

        public ProductBuilder setID(String id){
            this.id = id;
            return this;
        }

        public ProductBuilder setProductName(String productName){
            this.productName = productName;
            return this;
        }

        public ProductBuilder setQuantity(int quantity){
            this.quantity = quantity;
            return this;
        }

        public ProductBuilder setPrice(double price){
            this.price = price;
            return this;
        }

        public ProductBuilder setTotalPrice(double totalPrice){
            this.totalPrice = totalPrice;
            return this;
        }

        public ProductBuilder copy(Product c){
            this.id = c.id;
            this.productName = c.productName;
            this.quantity = c.quantity;
            this.price = c.price;
            this.totalPrice = c.totalPrice;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }




}
