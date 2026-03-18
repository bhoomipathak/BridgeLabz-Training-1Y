package com.gla.interfaces.DefaultMethodsInterfaces.PaymentGateIntegration;

public class PaymentGatewayIntegrationDemo {
    public static void main(String[] args) {
        PaymentProcessor payment = new Razorpay();
        payment.processPayment(1000);
        payment.refund(500);
    }
}