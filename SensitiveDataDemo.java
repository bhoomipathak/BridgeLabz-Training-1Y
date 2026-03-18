package com.gla.interfaces.MarkerInterfaces.SensitiveDataTagging;

public class SensitiveDataDemo {
    public static void main(String[] args) {
        Object obj = new UserAccount();
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypt this data before processing.");
        } else {
            System.out.println("No encryption required.");
        }
    }
}