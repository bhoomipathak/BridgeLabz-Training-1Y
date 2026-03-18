package com.gla.Inheritance.AssistedProblems.VehicleAndTransportSystem;
class Motorcycle extends Vehicle {
    boolean hasGear;
    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType + " " + hasGear);
    }
}
