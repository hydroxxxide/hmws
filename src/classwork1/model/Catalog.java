package classwork1.model;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Catalog(List<Product> products) {
        this.products = products;
    }

    public void saveProduct(Product product){
        this.products.add(product);
    }

    public void removeProduct(Product product){
        this.products.remove(product);
    }
}
