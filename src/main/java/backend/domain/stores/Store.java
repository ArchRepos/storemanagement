package backend.domain.stores;

import backend.domain.products.Product;
import backend.domain.users.User;
import backend.interfaces.ProductControls;
import backend.interfaces.UserControls;

import java.util.ArrayList;

public class Store implements ProductControls, UserControls {

    private ArrayList<Product> products = new ArrayList<Product>();
    private ArrayList<User> users = new ArrayList<User>();

    public Store(){
    }


    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }

    public void updateProduct(Product updatedProduct) {
        // find product by productNumber
        // update its fields
        // save it
        Product oldProduct = getProduct(updatedProduct.getProductNumber());
        products.remove(oldProduct);
        products.add(updatedProduct);

    }

    public void sellProduct(Product product) {

    }

    public ArrayList<Product> listProducts() {
        return products;
    }

    public ArrayList<Product> listProducts(String type) {
        return null;
    }

    public Product getProduct(String productNumber) {
        Product p = null;
        for (Product product: products) {
            if (product.getProductNumber().equals(productNumber))
                p = product;
        }
        return p;
    }

    public void register(User user) {

    }

    public boolean login(String username, String password) {
        return false;
    }
}
