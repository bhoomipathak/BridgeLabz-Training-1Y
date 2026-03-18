package com.gla.interfaces.DefaultMethodsInterfaces.PaymentGateIntegration;

public interface PaymentProcessor {
    void processPayment(double amount);
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed.");
    }
}