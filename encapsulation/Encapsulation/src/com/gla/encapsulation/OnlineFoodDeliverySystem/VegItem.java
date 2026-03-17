package com.gla.encapsulation.OnlineFoodDeliverySystem;
public class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }
    @Override
    public double calculateTotalPrice() {
        return price * quantity;
    }
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }
    @Override
    public String getDiscountDetails() {
        return "Veg Discount: 5%";
    }
}
