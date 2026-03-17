package com.gla.encapsulation.RideHailingApplication;
public class Auto extends Vehicle implements GPS {
    private String location;
    public Auto(int id, String driver, double rate) {
        super(id, driver, rate);
    }
    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance * 1.1; // surcharge
    }
    @Override
    public String getCurrentLocation() {
        return location;
    }
    @Override
    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

