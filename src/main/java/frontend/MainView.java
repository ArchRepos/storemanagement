package frontend;

import backend.domain.products.Clothes;
import backend.domain.products.Groceries;
import backend.domain.products.Product;
import backend.domain.stores.Store;
import backend.domain.users.AdminUser;
import backend.domain.users.BuyerUser;
import backend.domain.users.User;

public class MainView {

    public static void main(String[] args){
        User adminUser = new AdminUser("user1", "qwerty", "User1 User1","user1@mystore.com");
        User buyerUser = new BuyerUser("user2", "qwerty", "User2 User2","user2@mystore.com");
        System.out.println(adminUser);
        System.out.println(buyerUser);

        Store someStore = new Store();

        Groceries rice = new Groceries("0001", "rice", 0.10, 0.20, 0.10, 20.0);
        Clothes shirts = new Clothes("0002", "Shirts", 25.0, 35.0, "L", "Banana");
        Clothes hat = new Clothes("0003", "Hat", 15.0, 45.0, "M", "Papaya");

        System.out.println("I am adding products!");
        someStore.addProduct(rice);
        someStore.addProduct(shirts);
        someStore.addProduct(hat);
        
        System.out.println("I am searchin for product  0001");
       // System.out.println(someStore.getProduct("0001"));

        System.out.println("List of products!");
        System.out.println(someStore.listProducts());

        System.out.println("Updating product 0002");
        Product shirtsNew = new Clothes("0004", "Shirts", 30.0, 35.0, "S", "Banana");
        someStore.updateProduct(shirtsNew);

        System.out.println("List of products!");
        System.out.println(someStore.listProducts());


    }
}
