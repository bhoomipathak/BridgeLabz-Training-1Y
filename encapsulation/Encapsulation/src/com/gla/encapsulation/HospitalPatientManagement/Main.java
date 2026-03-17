package com.gla.encapsulation.HospitalPatientManagement;
public class Main{
    public static void processPatient(Patient p) {
        p.getPatientDetails();
        System.out.println("Bill: " + p.calculateBill());
        MedicalRecord m = (MedicalRecord) p;
        m.addRecord("General Checkup");
        m.viewRecords();
        System.out.println("---------------------");
    }
    public static void main(String[] args) {
        Patient p1 = new InPatient(1, "Anubhav", 20, 3);
        Patient p2 = new OutPatient(2, "Rahul", 22);
        processPatient(p1);
        processPatient(p2);
    }
}
