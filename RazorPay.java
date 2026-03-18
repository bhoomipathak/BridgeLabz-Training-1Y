package com.gla.interfaces.DefaultMethodsInterfaces.PaymentGateIntegration;

public class Razorpay implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " processed via Razorpay.");
    }
}
