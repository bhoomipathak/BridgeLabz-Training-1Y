package com.gla.interfaces.DefiningAndImplementingInterfaces.DigitalPaymentInterfaces;


public class PaymentMain {
    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();
        System.out.println("---- Processing Payments ----");
        upi.pay(500);
        card.pay(1200);
        wallet.pay(300);
    }
}