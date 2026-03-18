package com.gla.interfaces.DefiningAndImplementingInterfaces.MultiVehicleRentalSystem;

public class Bus implements Rentable {
    @Override
    public void rent() {
        System.out.println("Bus has been rented.");
    }
    @Override
    public void returnVehicle() {
        System.out.println("Bus has been returned.");
    }
}