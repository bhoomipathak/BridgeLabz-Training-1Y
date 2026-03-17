package com.gla.encapsulation.VehicleRentalSystem;
public class Bike extends Vehicle implements Insurable {
    public Bike(String number, double rate) {
        super(number, "Bike", rate);
    }
    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
    @Override
    public double calculateInsurance() {
        return 200;
    }
    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: 200";
    }
}
