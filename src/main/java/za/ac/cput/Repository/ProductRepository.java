package za.ac.cput.Repository;

import za.ac.cput.Entity.Product;

import java.util.ArrayList;

public interface ProductRepository extends IRepository<Product, String> {
    public ArrayList<Product> getProducts();
}
