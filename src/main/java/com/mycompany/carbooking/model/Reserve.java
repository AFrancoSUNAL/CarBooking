package com.mycompany.carbooking.model;

import java.util.ArrayList;

/**
 *
 * @author Andres Felipe Franco
 */
public class Reserve {
    
    private int id;
    private String startDate;
    private String endDate;
    private Agency agency;
    private ArrayList<Car> cars = new ArrayList<>();
    private float totalPrice;
    private boolean isFinished;

    public Reserve(int id, String startDate, String endDate, Agency agency) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.agency = agency;
        this.totalPrice = calcTotal();
        this.isFinished = false;
    }
    
    public void addCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
    
    private float calcTotal() {
        float totalCarCost = 0f;
        for(Car car : cars) {
            totalCarCost += car.getBookPrice();
        }        
        return agency.getPriceService() + totalCarCost;
    }
    
    public void deliverCar(Car car) {
        for(Car element : cars){
            if(car.getId().equals(element.getId())) {
                
            }
        }
    }
    
    public void close() {
        
    }
    
    public float getTotalPrice() {
        return totalPrice;
    }
    
    public void getInfo() {
        System.out.println(("=== Reserve ===\n"
                + "Id: %s \n"
                + "Start date: %s \n"
                + "End date: %s \n"
                + "Agency: %s \n"
                + "Total price: %s \n"
                + "Finished: %s").formatted(id, startDate, endDate, agency.getName(), totalPrice, isFinished));
    }
}
