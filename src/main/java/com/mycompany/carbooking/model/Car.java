package com.mycompany.carbooking.model;

/**
 *
 * @author Andres Felipe Franco
 */
public class Car {
    
    private String id;
    private String color;
    private String model;
    private String brand;
    private float bookPrice;
    private float fuelPorcentage;
    private boolean available;

    public Car(String id, String color, String model, String brand, float bookPrice) {
        this.id = id;
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.bookPrice = bookPrice;
        this.fuelPorcentage = 100f;
        this.available = true;
    }
    
    public void reload() {
        fuelPorcentage = 100f;
        System.out.println("Tank reloaded");
    }
    
    public void getInfo() {
        System.out.println("=== Car ==="
                + "Model: %s"
                + "Brand: %s"
                + "Color: %s"
                + "Id: %s"
                + "Price: %s"
                + "Available: %s".formatted(model, brand, color, id, bookPrice, available));
    }
    
    public String getId() {
        return id;
    }
    
    public float getBookPrice() {
        return bookPrice;
    }
    
}
