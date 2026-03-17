package com.gla.encapsulation.VehicleRentalSystem;
public class Main {
    public static void process(Vehicle v, int days) {
        double rent = v.calculateRentalCost(days);
        double insurance = ((Insurable) v).calculateInsurance();
        v.displayDetails();
        System.out.println("Rental Cost: " + rent);
        System.out.println("Insurance: " + insurance);
        System.out.println("-------------------");
    }
    public static void main(String[] args) {
        Vehicle v1 = new Car("UP53A2703", 1500);
        Vehicle v2 = new Bike("UP53B8008", 500);
        Vehicle v3 = new Truck("UP53T0069", 3000);
        process(v1, 3);
        process(v2, 3);
        process(v3, 3);
    }
}
