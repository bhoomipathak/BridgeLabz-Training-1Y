package com.gla.encapsulation.VehicleRentalSystem;
public class Truck extends Vehicle implements Insurable {
    public Truck(String number, double rate) {
        super(number, "Truck", rate);
    }
    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.5; // heavy vehicle surcharge
    }
    @Override
    public double calculateInsurance() {
        return 1000;
    }
    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: 1000";
    }
}
