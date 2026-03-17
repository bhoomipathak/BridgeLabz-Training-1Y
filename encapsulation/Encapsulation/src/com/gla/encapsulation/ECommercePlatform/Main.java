package com.gla.encapsulation.ECommercePlatform;
public class Main {
    public static void finalPrice(Product p) {
        double discount = p.calculateDiscount();
        double tax = 0;
        if (p instanceof Taxable) {
            tax = ((Taxable) p).calculateTax();
        }
        double finalAmount = p.getPrice() + tax - discount;
        System.out.println(p.getName() + " Final Price = " + finalAmount);
    }

    public static void main(String[] args) {
        Product p1 = new Electronics(1, "Laptop", 60000);
        Product p2 = new Clothing(2, "Shirt", 2000);
        Product p3 = new Groceries(3, "Rice", 1000);
        Product[] list = { p1, p2, p3 };
        for (Product p : list)
            finalPrice(p);
    }
}
