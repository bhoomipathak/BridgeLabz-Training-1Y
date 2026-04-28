package com.gla.jbbc;
import java.util.*;

class Patient {
    int id;
    String name;
    String disease;

    Patient(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }
}

public class HospitalManager {

    static ArrayList<Patient> patients = new ArrayList<>();

    public static void main(String[] args) {

        // CREATE (Insert patients)
        patients.add(new Patient(1, "Rahul", "Fever"));
        patients.add(new Patient(2, "Amit", "Diabetes"));
        patients.add(new Patient(3, "Neha", "Fever"));

        // READ (patients with specific disease)
        String searchDisease = "Fever";
        System.out.println("Patients with disease: " + searchDisease);

        for (Patient p : patients) {
            if (p.disease.equalsIgnoreCase(searchDisease)) {
                System.out.println(p.id + " | " + p.name + " | " + p.disease);
            }
        }

        // UPDATE (change disease)
        int updateId = 2;
        String newDisease = "Hypertension";

        for (Patient p : patients) {
            if (p.id == updateId) {
                p.disease = newDisease;
                System.out.println("Updated Disease for " + p.name + ": " + p.disease);
            }
        }

        // DELETE (remove patient after discharge)
        int deleteId = 3;
        patients.removeIf(p -> p.id == deleteId);

        // Final List
        System.out.println("\nFinal Patient Records:");
        for (Patient p : patients) {
            System.out.println(p.id + " | " + p.name + " | " + p.disease);
        }
    }
}

