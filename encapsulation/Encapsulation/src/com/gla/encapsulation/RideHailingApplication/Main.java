package com.gla.encapsulation.RideHailingApplication;
public class Main {
    public static void processRide(Vehicle v, double distance) {
        v.getVehicleDetails();
        double fare = v.calculateFare(distance);
        System.out.println("Fare: " + fare);
        GPS g = (GPS) v;
        g.updateLocation("City Center");
        System.out.println("Location: " + g.getCurrentLocation());
        System.out.println("----------------------");
    }
    public static void main(String[] args) {
        Vehicle v1 = new Car(1, "Anubhav", 15);
        Vehicle v2 = new Bike(2, "Rahul", 10);
        Vehicle v3 = new Auto(3, "Amit", 12);
        processRide(v1, 10);
        processRide(v2, 10);
        processRide(v3, 10);
    }
}
