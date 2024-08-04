package com.mycompany.carbooking.model;

import java.util.HashMap;

/**
 *
 * @author Andres Felipe Franco
 */
public class Garage {
    private int id;
    private String block;
    private HashMap<String, Car> carList;

    public Garage(int id, String block, HashMap<String, Car> car) {
        this.id = id;
        this.block = block;
        this.carList = car;
       
    }
    
    public boolean isEmpty() {
        return carList.isEmpty();
    }
    
    public void getInfo() {
        System.out.println("=== Garage ==="
                + "Block: %s"
                + "Car: %s".formatted(block, carList.values()));
    }
}
