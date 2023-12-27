package main.java.entities.users;

import main.java.entities.items.Product;

import java.util.HashMap;

public class Client extends User {
    private HashMap<Product, Integer> cart;

    public boolean addToCart(int productID) {
        return false;
    }

    public boolean removeFromCart(int productID) {
        return false;
    }

    public boolean makeAPurchase() {
        return false;
    }


}
