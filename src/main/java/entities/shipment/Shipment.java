package main.java.entities.shipment;

import java.util.Date;

public class Shipment {
    private Integer _id;
    private ShipmentCompany company;

    private boolean shipToAddress;
    private Address address;
    private String ParcelLockerId;

    private Date shipmentDate;
}
