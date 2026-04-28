package com.gla.jbbc;
import java.util.*;

class Vehicle {
    String regNo;
    String owner;
    String status; // "Pending" or "Completed"

    Vehicle(String regNo, String owner, String status) {
        this.regNo = regNo;
        this.owner = owner;
        this.status = status;
    }
}

public class ServiceCenter {

    static ArrayList<Vehicle> vehicles = new ArrayList<>();

    public static void main(String[] args) {

        // CREATE (Add vehicles)
        vehicles.add(new Vehicle("UP32AB1234", "Rahul", "Pending"));
        vehicles.add(new Vehicle("DL01CD5678", "Amit", "Completed"));
        vehicles.add(new Vehicle("UP65EF9012", "Neha", "Pending"));

        // READ (status = Pending)
        System.out.println("Vehicles with Pending Status:");
        for (Vehicle v : vehicles) {
            if (v.status.equalsIgnoreCase("Pending")) {
                System.out.println(v.regNo + " | " + v.owner + " | " + v.status);
            }
        }

        // UPDATE (mark as Completed)
        String updateReg = "UP32AB1234";
        for (Vehicle v : vehicles) {
            if (v.regNo.equalsIgnoreCase(updateReg)) {
                v.status = "Completed";
                System.out.println("Service Completed for: " + v.regNo);
            }
        }

        // DELETE (vehicle delivered)
        String deleteReg = "DL01CD5678";
        vehicles.removeIf(v -> v.regNo.equalsIgnoreCase(deleteReg));

        // Final List
        System.out.println("\nFinal Vehicle Records:");
        for (Vehicle v : vehicles) {
            System.out.println(v.regNo + " | " + v.owner + " | " + v.status);
        }
    }
}

