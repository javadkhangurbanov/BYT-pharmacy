package main.java.entities.items;

import java.util.HashMap;

public class Order {
    private Integer _id;
    private HashMap<Product, Integer> items;

    public boolean verifyPrescription() {
        return false;
    }
}
