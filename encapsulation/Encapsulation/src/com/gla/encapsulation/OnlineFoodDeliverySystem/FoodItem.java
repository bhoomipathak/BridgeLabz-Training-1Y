package com.gla.encapsulation.OnlineFoodDeliverySystem;
public abstract class FoodItem {
    private String itemName;
    protected double price;
    protected int quantity;
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() {
        return itemName;
    }
    public abstract double calculateTotalPrice();
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
    }
}
