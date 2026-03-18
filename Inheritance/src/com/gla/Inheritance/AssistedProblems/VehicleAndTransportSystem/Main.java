package com.gla.Inheritance.AssistedProblems.VehicleAndTransportSystem;
class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.maxSpeed=180; c.fuelType="Petrol"; c.seatCapacity=5;
        Truck t = new Truck();
        t.maxSpeed=120; t.fuelType="Diesel"; t.loadCapacity=10;
        Motorcycle m = new Motorcycle();
        m.maxSpeed=150; m.fuelType="Petrol"; m.hasGear=true;
        Vehicle[] v = {c, t, m};
        for (Vehicle x : v) x.displayInfo();
    }
}
