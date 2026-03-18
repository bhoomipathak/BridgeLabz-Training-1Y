package com.gla.interfaces.DefiningAndImplementingInterfaces.MultiVehicleRentalSystem;

public class Bike implements Rentable{
    @Override
    public void rent() {
        System.out.println("Bike has been rented.");
    }
    @Override
    public void returnVehicle() {
        System.out.println("Bike has been returned.");
    }
}