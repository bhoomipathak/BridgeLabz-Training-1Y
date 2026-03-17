package com.gla.constructors.InstanceVsVariableAndMethod;

class Vehicle {
    // Instance variables
    String ownerName;
    String vehicleType;
    // Class variable
    static double registrationFee=2000;
    Vehicle(String o,String v){
        ownerName=o;
        vehicleType=v;
    }
    void displayVehicleDetails(){
        System.out.println(ownerName+" "+vehicleType+" Fee="+registrationFee);
    }
    static void updateRegistrationFee(double newFee){
        registrationFee=newFee;
    }
    public static void main(String args[]){
        Vehicle v1=new Vehicle("Bhavesh","Car");
        v1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(3000);

        v1.displayVehicleDetails();
    }
}
