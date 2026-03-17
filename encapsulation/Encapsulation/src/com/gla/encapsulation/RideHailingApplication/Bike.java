package com.gla.encapsulation.RideHailingApplication;
public class Bike extends Vehicle implements GPS {
    private String location;
    public Bike(int id, String driver, double rate) {
        super(id, driver, rate);
    }
    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance * 0.9; // cheaper
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
