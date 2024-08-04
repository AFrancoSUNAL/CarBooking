package com.mycompany.carbooking.model;

import TemporalDB.Reserves;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andres Felipe Franco
 */
public class Client {
    
    // Properties
    private final int id;
    private final String name;
    private final String clientCode;
    private final String address;
    private final String phoneNumber;
    private final ArrayList<Reserve> reserves = new ArrayList<>();

    // Constructor
    public Client(int id, String name, String clientCode, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.clientCode = clientCode;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    // Methods
    
    public void bookCar(int id, String startDay, String endDay, Agency agency, ArrayList<Car> cars){
        // Create a new car reservation
        
        Reserve reserve = new Reserve(id, startDay, endDay, agency);
        System.out.println("Total cost: " + reserve.calcTotal(cars));
        System.out.println("Do you want continue? y/n: ");
        Scanner read = new Scanner(System.in);
        
        if(!"y".equals(read.next())){
            System.out.println("Canceled.");
            return;
        }
        
        for(Car car : cars){
            
            if(!car.isAvailable()) {
                System.out.println("Sorry, the car " + car.getId() + " is not available.");
                return;
            }
            
            if(car.getFuelPorcentage() < 25f){
                System.out.println("This car requieres a fuel recharge");
                if(!car.reload()) {
                    return;
                }
            }
            
            car.setAvailable(false);
            reserve.addCars(car);
        }
        
        Reserves.reserves.add(reserve);
        this.reserves.add(reserve);
        System.out.println("Reserve added.");
    }
    
    public String endorseClient(Client client) {
        return "Method not available";
    }
    
    public void getInfo() {
        System.out.println("=== Client info ==="
                + "Name: %s"
                + "Code: %s"
                + "Address: %s"
                + "Phone: %s".formatted(name, clientCode, address, phoneNumber));
    }
    
    // Get Methods    
    public ArrayList<Reserve> getReserves() {
        return reserves;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClientCode() {
        return clientCode;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    
    
}
