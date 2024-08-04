package com.mycompany.carbooking.model;

import java.util.HashMap;

/**
 *
 * @author Andres Felipe Franco
 */
public class Garage {
    
    // Properties
    private final int id;
    private final String block;
    private final HashMap<String, Car> carList;

    // Constructor
    public Garage(int id, String block, HashMap<String, Car> car) {
        this.id = id;
        this.block = block;
        this.carList = car;
       
    }
    
    // Methods    
    public boolean isEmpty() {
        return carList.isEmpty();
    }
    
    public void getInfo() {
        System.out.println("=== Garage ==="
                + "Block: %s"
                + "Car: %s".formatted(block, carList.values()));
    }
    
    public Car browseCar(Car car){
        return this.carList.get(car.getId());
    }
    
    // Get Methods
    public int getId() {
        return id;
    }

    public String getBlock() {
        return block;
    }

    public HashMap<String, Car> getCarList() {
        return this.carList;
    }
    
}
