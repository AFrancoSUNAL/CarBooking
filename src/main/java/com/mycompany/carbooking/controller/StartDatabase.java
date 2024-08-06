package com.mycompany.carbooking.controller;

import TemporalDB.Agencies;
import TemporalDB.Cars;
import TemporalDB.Clients;
import TemporalDB.Garages;
import TemporalDB.Reserves;
import com.mycompany.carbooking.model.Agency;
import com.mycompany.carbooking.model.Car;
import com.mycompany.carbooking.model.Client;
import com.mycompany.carbooking.model.Garage;
import com.mycompany.carbooking.model.Reserve;
import java.util.HashMap;

/**
 *
 * @author Andres Felipe Franco
 */
public class StartDatabase {
        
    private static boolean isLoaded = false;
    
    public StartDatabase() {
        if(!isLoaded) {
            startDB();
        }
        isLoaded = true;
    }
    
    private static void startDB() {
        Cars.cars.add(new Car("ASJ-051", "Red", "Toyota Corolla", "Toyota", 120.4f));
        Cars.cars.add(new Car("IJE-877", "Blue", "Honda Civic", "Honda", 200.0f));
        Cars.cars.add(new Car("WRJ-998", "Black", "Ford Mustang", "Ford", 280.5f));
        Cars.cars.add(new Car("DVN-569", "White", "Chevrolet Silverado", "Chevrolet", 150.9f));
        Cars.cars.add(new Car("IEI-514", "Gray", "Tesla Model 3", "Tesla", 305.5f));
        Cars.cars.add(new Car("APS-588", "Dark Green", "Mercedez Benz", "Mercedez", 300.8f));
        
        HashMap<String, Car> carListGarage1 = new HashMap<>();
        carListGarage1.put(Cars.cars.get(0).getId(), Cars.cars.get(0));
        carListGarage1.put(Cars.cars.get(1).getId(), Cars.cars.get(1));
        carListGarage1.put(Cars.cars.get(2).getId(), Cars.cars.get(2));
        
        HashMap<String, Car> carListGarage2 = new HashMap<>();
        carListGarage2.put(Cars.cars.get(3).getId(), Cars.cars.get(3));
        carListGarage2.put(Cars.cars.get(4).getId(), Cars.cars.get(4));
        carListGarage2.put(Cars.cars.get(5).getId(), Cars.cars.get(5));
        
        Garages.garages.add(new Garage(1, "Block A", carListGarage1));
        Garages.garages.add(new Garage(2, "Block B", carListGarage2));
        
        Agencies.agencies.add(new Agency(1, "Agency A", "Addres 1", 49.9f));
        Agencies.agencies.add(new Agency(2, "Agency B", "Addres 2", 29.9f));
        Agencies.agencies.add(new Agency(3, "Agency C", "Addres 3", 89.9f));
        Agencies.agencies.add(new Agency(4, "Agency D", "Addres 4", 39.9f));
        Agencies.agencies.add(new Agency(5, "Agency E", "Addres 5", 79.9f));
        
        Reserves.reserves.add(new Reserve(1, "04/08/2024", "05/08/2024", Agencies.agencies.get(0)));
        Reserves.reserves.add(new Reserve(2, "20/09/2024", "30/09/2024", Agencies.agencies.get(4)));
        Reserves.reserves.get(0).addCars(Cars.cars.get(0));
        Reserves.reserves.get(0).addCars(Cars.cars.get(1));
        Reserves.reserves.get(0).addCars(Cars.cars.get(2));
        Reserves.reserves.get(1).addCars(Cars.cars.get(3));
        Reserves.reserves.get(1).addCars(Cars.cars.get(4));
        Reserves.reserves.get(1).addCars(Cars.cars.get(5));
        
        Clients.clients.add(new Client(1, "Andres", "AS156", "Address 1", "3115060287"));
        Clients.clients.add(new Client(2, "Sofia", "SF585", "Address 2", "3121881865"));
    }
}
