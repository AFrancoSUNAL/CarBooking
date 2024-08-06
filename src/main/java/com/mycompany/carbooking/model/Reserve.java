package com.mycompany.carbooking.model;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Andres Felipe Franco
 */
public class Reserve {
    
    // Properties
    private final int id;
    private final String startDate;
    private final String endDate;
    private final Agency agency;
    private final ArrayList<Car> cars = new ArrayList<>();
    private float totalPrice;
    private final boolean isFinished;

    // Constructor
    public Reserve(int id, String startDate, String endDate, Agency agency) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.agency = agency;
        this.totalPrice = agency.getPriceService();
        this.isFinished = false;
    }
    
    // Methods  
    public void close() {
        for(Car car : cars) {
            if(!car.isAvailable()) {
                System.out.println("Cannot be closed yet, there are still cars for stored.");
                return;
            }
        }
        System.out.println("Reserve closed successfully");
    }
    
    public void deliverCar(Car car) {
        for(Car element : cars) {
            if(element.equals(car)) { 
                car.setAvailable(true);
                Random random = new Random();
                element.setFuelPorcentage(random.nextFloat(100));
                return;
            }
        }
    }
    
    public float calcTotal(ArrayList<Car> cars) {
        for(Car car : cars) {
            totalPrice += car.getBookPrice();
        }
        return totalPrice;
    }
    
    public void addCars(Car car) {
        this.cars.add(car);
    }
    
    public void getInfo() {
        System.out.println(("""
                            === Reserve ===
                            Id: %s 
                            Start date: %s 
                            End date: %s 
                            Agency: %s 
                            Total price: %s 
                            Finished: %s""").formatted(id, startDate, endDate, agency.getAgencyName(), totalPrice, isFinished));
    }

    // Get Methods
    public int getId() {
        return id;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public Agency getAgency() {
        return agency;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public boolean isIsFinished() {
        return isFinished;
    }

    public float getTotalPrice() {
        return totalPrice;
    }
    
}
