package com.gla.Inheritance.HybridInheritance.VehicleManagementSystemWithInsurance;
class PetrolVehicle extends Vehicle implements Refuelable {
    public void refuel() {
        System.out.println("Refueling");
    }
}
