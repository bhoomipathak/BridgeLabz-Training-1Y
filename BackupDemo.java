package com.gla.interfaces.MarkerInterfaces.DataSerializationForBackup;

public class BackupDemo {
    public static void main(String[] args) {
        Object obj = new CustomerData();
        if (obj instanceof BackupEligible) {
            System.out.println("Data will be included in backup.");
        } else {
            System.out.println("Data not eligible for backup.");
        }
    }
}