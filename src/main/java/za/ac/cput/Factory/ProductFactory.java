package za.ac.cput.Factory;

import za.ac.cput.Entity.Product;
import za.ac.cput.helper.Helper;

public class ProductFactory {

    public static Product createProduct(String id, String productName, int quantity, double price, double totalPrice) {

        //Validation (ID and Product Name cannot be empty)
        if(Helper.isEmpty(id)
                || Helper.isEmpty(productName)){
            return null;
        }

        //return and build Object
        return new Product.ProductBuilder()
                .setID(id)
                .setProductName(productName)
                .setQuantity(quantity)
                .setPrice(price)
                .setTotalPrice(totalPrice)
                .build();

    }
}
