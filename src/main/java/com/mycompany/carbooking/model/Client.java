package com.mycompany.carbooking.model;

import TemporalDB.Reserves;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andres Felipe Franco
 */
public class Client {
    
    private int id;
    private String name;
    private String clientCode;
    private String address;
    private String phoneNumber;
    private ArrayList<Reserve> reserves = new ArrayList<>();

    public Client(int id, String name, String clientCode, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.clientCode = clientCode;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public String endorseClient(Client client) {
        return "Method not available";
    }
    
    public void bookCar(int id, String startDay, String endDay, Agency agency, ArrayList<Car> cars){
        Reserve reserve = new Reserve(id, startDay, endDay, agency);
        System.out.println("Total cost: " + reserve.getTotalPrice());
        System.out.println("Do you want continue? y/n: ");
        Scanner read = new Scanner(System.in);
        if("y".equals(read.next())) {
            reserve.addCars(cars);
            Reserves.reserves.add(reserve);
            this.reserves.add(reserve);
            System.out.println("Reserve added.");
        }else{
            System.out.println("Canceled.");
        }
    }
    
    public void getInfo() {
        System.out.println("=== Client info ==="
                + "Name: %s"
                + "Code: %s"
                + "Address: %s"
                + "Phone: %s".formatted(name, clientCode, address, phoneNumber));
    }
    
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
