package com.gla.interfaces.MarkerInterfaces.CloningPrototypeObjects;

public class CloneDemo {
    public static void main(String[] args) {
        Object obj = new Product();
        if (obj instanceof CloneTag) {
            System.out.println("Object marked as cloneable (simulation).");
        } else {
            System.out.println("Cloning not allowed.");
        }
    }
}
