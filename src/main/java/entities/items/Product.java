package main.java.entities.items;

import java.math.BigDecimal;

public class Product {
    private Integer _id;
    private boolean requiresPrescription;
    private String name;
    private String description;
    private BigDecimal price;

    public boolean providePrescriptionCode() {
        return false;
    }
}
