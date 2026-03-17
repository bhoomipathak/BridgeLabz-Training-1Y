package com.gla.encapsulation.ECommercePlatform;
public abstract class Product {
    private int productId;
    private String name;
    protected double price;
    public Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }
    public int getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public abstract double calculateDiscount();
}
