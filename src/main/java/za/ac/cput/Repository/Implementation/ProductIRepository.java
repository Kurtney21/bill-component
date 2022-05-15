package za.ac.cput.Repository.Implementation;

import za.ac.cput.Entity.Product;
import za.ac.cput.Repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductIRepository implements ProductRepository {
    public ArrayList<Product> order;
    public static ProductIRepository productRepository;

    private ProductIRepository() {
        this.order = new ArrayList<>();
    }

    public static ProductIRepository getRepository(){
        if(productRepository == (null)){
            productRepository = new ProductIRepository();
        }
        return productRepository;
    }

    @Override
    public Product create(Product product) {
        boolean success = order.add(product);
        if(!success){
            return null;
        }
        return product;
    }

    @Override
    public Product update(Product product) {
        Product oldProduct = read(product.getId());
        if(oldProduct != null){
            order.remove(oldProduct);
            order.add(product);
            return product;
        }
        return null;
    }

    @Override
    public Product read(String id) {
        return order.stream()
                .filter(n -> n.getId()== id)
                .findAny()
                .orElse(null);
    }

    @Override
    public boolean delete(String id) {
        Product product = read(id);
            if(product == null){
                return false;
            } else {
                order.remove(product);
            }
            return true;
    }

    @Override
    public ArrayList<Product> getProducts() {
        return order;
    }
}
