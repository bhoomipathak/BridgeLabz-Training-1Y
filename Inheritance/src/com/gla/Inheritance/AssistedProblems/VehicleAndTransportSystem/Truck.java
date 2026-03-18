package com.gla.Inheritance.AssistedProblems.VehicleAndTransportSystem;
class Truck extends Vehicle {
    int loadCapacity;
    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType + " " + loadCapacity);
    }
}
