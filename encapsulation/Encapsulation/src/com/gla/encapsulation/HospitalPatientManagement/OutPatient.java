package com.gla.encapsulation.HospitalPatientManagement;
public class OutPatient extends Patient implements MedicalRecord {
    private String diagnosis;
    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }
    @Override
    public double calculateBill() {
        return 500; // consultation fee
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
