package com.gla.encapsulation.ECommercePlatform;
public class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }
    @Override
    public double calculateDiscount() {
        return price * 0.05; // 5% discount
    }
}
