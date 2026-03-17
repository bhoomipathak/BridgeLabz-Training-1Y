package com.gla.encapsulation.VehicleRentalSystem;
public class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) {
        super(number, "Car", rate);
    }
    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
    @Override
    public double calculateInsurance() {
        return 500; // fixed insurance
    }
    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: 500";
    }
}
