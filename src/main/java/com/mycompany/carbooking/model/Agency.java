package com.mycompany.carbooking.model;

/**
 *
 * @author Andres Felipe Franco
 */
public class Agency {
    
    // Properties
    private final int id;
    private String agencyName;
    private String address;
    private float priceService;

    // Constructor
    public Agency(int id, String agencyName, String address, float priceService) {
        this.id = id;
        this.agencyName = agencyName;
        this.address = address;
        this.priceService = priceService;
    }
    
    // Methods
    public void getInfo() {
        System.out.println(("""
                            === Agency ===
                            Name: %s
                            Address: %s
                            Price service: %s
                            """).formatted(agencyName, address, priceService));
    }
    
    // Get Methods
    public int getId() {
        return id;
    }
    
    public String getAgencyName() {
        return agencyName;
    }
    
    public String getAddress() {
        return address;
    }
    
    public float getPriceService() {
        return priceService;
    }
    
    public void setAgencyName(String name) {
        this.agencyName = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }    
}
