package com.gla.encapsulation.OnlineFoodDeliverySystem;
public class Main{
    public static void processOrder(FoodItem item) {
        item.getItemDetails();
        double total = item.calculateTotalPrice();
        double discount = ((Discountable) item).applyDiscount();
        System.out.println("Total Price: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + (total - discount));
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Paneer", 200, 2);
        FoodItem f2 = new NonVegItem("Chicken", 300, 2);
        processOrder(f1);
        processOrder(f2);
    }
}
