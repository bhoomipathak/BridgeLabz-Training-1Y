package com.gla.interfaces.DefiningAndImplementingInterfaces.MultiVehicleRentalSystem;

public class RentalMain {
    public static void main(String[] args) {
        Rentable car = new Car();
        Rentable bike = new Bike();
        Rentable bus = new Bus();
        System.out.println("---- Renting Vehicles ----");
        car.rent();
        bike.rent();
        bus.rent();
        System.out.println("---- Returning Vehicles ----");
        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
