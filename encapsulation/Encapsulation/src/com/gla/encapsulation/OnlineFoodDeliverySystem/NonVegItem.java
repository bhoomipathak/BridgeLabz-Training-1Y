package com.gla.encapsulation.OnlineFoodDeliverySystem;
public class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }
    @Override
    public double calculateTotalPrice() {
        double extraCharge = 50; // handling charge
        return (price * quantity) + extraCharge;
    }
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.02; // 2% discount
    }
    @Override
    public String getDiscountDetails() {
        return "Non-Veg Discount: 2%";
    }
}
