package com.gla.Inheritance.AssistedProblems.VehicleAndTransportSystem;
class Car extends Vehicle {
    int seatCapacity;
    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType + " " + seatCapacity);
    }
}
