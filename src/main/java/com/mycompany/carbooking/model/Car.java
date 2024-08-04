package com.mycompany.carbooking.model;

import java.util.Scanner;

/**
 *
 * @author Andres Felipe Franco
 */
public class Car {
    
    // Properties
    private final String id;
    private final String color;
    private final String model;
    private final String brand;
    private final float bookPrice;
    private float fuelPorcentage;
    private boolean available;
    
    // Constructor
    public Car(String id, String color, String model, String brand, float bookPrice) {
        this.id = id;
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.bookPrice = bookPrice;
        this.fuelPorcentage = 100f;
        this.available = true;
    }
    
    // Methods    
    public boolean reload() {
        System.out.println("Do you want to readoad? y/n: ");
        Scanner read = new Scanner(System.in);
        if("n".equals(read.next())){
            return false;
        }
        fuelPorcentage = 100f;
        System.out.println("Tank reloaded");
        return true;
    }
    
    public void setFuelPorcentage(float porcentage){
        this.fuelPorcentage = porcentage;
    }
    
    public void setAvailable(boolean value){
        this.available = value;
    }
    
    public void getInfo() {
        System.out.println(("""
                            === Car ===
                            Model: %s
                            Brand: %s
                            Color: %s
                            Id: %s
                            Price: %s
                            Available: %s""").formatted(model, brand, color, id, bookPrice, available));
    }
    
    // Get Methods
    public String getId() {
        return id;
    }
    
    public float getBookPrice() {
        return bookPrice;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public float getFuelPorcentage() {
        return fuelPorcentage;
    }

    public boolean isAvailable() {
        return available;
    }
    
    
    
}
