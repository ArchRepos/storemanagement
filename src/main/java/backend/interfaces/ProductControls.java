package backend.interfaces;

import backend.domain.products.Product;

import java.util.ArrayList;

public interface ProductControls {
    public void addProduct(Product product);
    public void deleteProduct(Product product);
    public void updateProduct(Product product);
    public void sellProduct(Product product);
    public ArrayList<Product> listProducts();
    public ArrayList<Product> listProducts(String type);
    public Product getProduct(String productNumber) throws Exception;
}
