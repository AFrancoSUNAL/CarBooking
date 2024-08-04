package com.mycompany.carbooking.model;

import java.util.ArrayList;

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
        this.totalPrice = calcTotal();
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
    
    private float calcTotal() {
        float totalCarCost = 0f;
        for(Car car : cars) {
            totalCarCost += car.getBookPrice();
        }        
        return agency.getPriceService() + totalCarCost;
    }
    
    public void deliverCar(Car car) {
        for(Car element : cars) {
            if(element.equals(car)) { 
                car.setAvailable(true);
                return;
            }
        }
    }
    
    public float getTotalPrice(ArrayList<Car> cars) {
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
    
    
}
