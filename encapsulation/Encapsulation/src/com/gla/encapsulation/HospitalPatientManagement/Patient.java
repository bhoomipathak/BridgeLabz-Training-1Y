package com.gla.encapsulation.HospitalPatientManagement;
public abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }
    public int getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }
    public void getPatientDetails() {
        System.out.println("ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public abstract double calculateBill();
}
