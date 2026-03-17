package com.gla.encapsulation.ECommercePlatform;
public class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }
    @Override
    public double calculateDiscount() {
        return price * 0.10; // 10% discount
    }
    @Override
    public double calculateTax() {
        return price * 0.18; // 18% GST
    }
    @Override
    public String getTaxDetails() {
        return "Electronics GST: 18%";
    }
}
