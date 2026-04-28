package com.gla.jbbc;
import java.util.*;

class MenuItem {
    int id;
    String itemName;
    double price;

    MenuItem(int id, String itemName, double price) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
    }
}

public class RestaurantMenuManager {

    static ArrayList<MenuItem> menu = new ArrayList<>();

    public static void main(String[] args) {

        // CREATE (Add menu items)
        menu.add(new MenuItem(1, "Burger", 120));
        menu.add(new MenuItem(2, "Pizza", 350));
        menu.add(new MenuItem(3, "Tea", 20));

        // READ (price < 200)
        System.out.println("Items priced below ₹200:");
        for (MenuItem m : menu) {
            if (m.price < 200) {
                System.out.println(m.id + " | " + m.itemName + " | ₹" + m.price);
            }
        }

        // UPDATE (change price of item)
        int updateId = 1;
        double newPrice = 150;

        for (MenuItem m : menu) {
            if (m.id == updateId) {
                m.price = newPrice;
                System.out.println("Updated Price of " + m.itemName + ": ₹" + m.price);
            }
        }

        // DELETE (remove discontinued item)
        int deleteId = 2;
        menu.removeIf(m -> m.id == deleteId);

        // Final List
        System.out.println("\nFinal Menu:");
        for (MenuItem m : menu) {
            System.out.println(m.id + " | " + m.itemName + " | ₹" + m.price);
        }
    }
}

