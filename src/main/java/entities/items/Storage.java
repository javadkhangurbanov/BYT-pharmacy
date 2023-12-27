package main.java.entities.items;

import main.java.entities.shipment.Address;

import java.util.HashMap;

public class Storage {
    private Integer _id;
    private Address address;
    private HashMap<Product, Integer> products;
}
