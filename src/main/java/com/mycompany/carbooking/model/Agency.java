package com.mycompany.carbooking.model;

/**
 *
 * @author Andres Felipe Franco
 */
public class Agency {
    
    private int id;
    private String agencyName;
    private String address;
    private float priceService;

    public Agency(int id, String agencyName, String address, float priceService) {
        this.id = id;
        this.agencyName = agencyName;
        this.address = address;
        this.priceService = priceService;
    }
    
    public void getInfo() {
        System.out.println("=== Agency ==="
                + "Name: %s"
                + "Address: %s"
                + "Price service: %s".formatted(agencyName, address, priceService));
    }
    
    public float getPriceService() {
        return priceService;
    }
    
    public String getName() {
        return agencyName;
    }
}
