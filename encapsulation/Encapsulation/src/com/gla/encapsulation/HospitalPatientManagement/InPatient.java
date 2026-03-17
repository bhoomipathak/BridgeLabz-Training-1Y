package com.gla.encapsulation.HospitalPatientManagement;
public class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private String diagnosis;
    public InPatient(int id, String name, int age, int days) {
        super(id, name, age);
        this.daysAdmitted = days;
    }
    @Override
    public double calculateBill() {
        return daysAdmitted * 2000;
    }
    @Override
    public void addRecord(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + diagnosis);
    }
}
