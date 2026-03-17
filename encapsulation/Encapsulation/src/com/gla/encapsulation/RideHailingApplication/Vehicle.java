package com.gla.encapsulation.RideHailingApplication;
public abstract class Vehicle{
    private int vehicleId;
    private String driverName;
    protected double ratePerKm;
    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    public int getVehicleId() {
        return vehicleId;
    }
    public String getDriverName() {
        return driverName;
    }
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
    }
    public abstract double calculateFare(double distance);
}
