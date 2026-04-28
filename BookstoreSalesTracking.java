package com.gla.jbbc;
import java.util.*;

class Sale {
    int id;
    String bookName;
    int quantity;
    double price;

    Sale(int id, String bookName, int quantity, double price) {
        this.id = id;
        this.bookName = bookName;
        this.quantity = quantity;
        this.price = price;
    }
}

public class BookstoreSalesTracking {

    static ArrayList<Sale> sales = new ArrayList<>();

    public static void main(String[] args) {

        // CREATE (Insert sales)
        sales.add(new Sale(1, "Java Basics", 2, 500));
        sales.add(new Sale(2, "Python Guide", 1, 400));
        sales.add(new Sale(3, "DSA Book", 3, 700));

        // READ (quantity > 1)
        System.out.println("Sales with quantity > 1:");
        for (Sale s : sales) {
            if (s.quantity > 1) {
                System.out.println(s.id + " | " + s.bookName + " | Qty: " + s.quantity + " | ₹" + s.price);
            }
        }

        // UPDATE (modify quantity)
        int updateId = 2;
        int newQuantity = 5;

        for (Sale s : sales) {
            if (s.id == updateId) {
                s.quantity = newQuantity;
                System.out.println("Updated Quantity for " + s.bookName + ": " + s.quantity);
            }
        }

        // DELETE (remove incorrect entry)
        int deleteId = 3;
        sales.removeIf(s -> s.id == deleteId);

        // Final List
        System.out.println("\nFinal Sales Records:");
        for (Sale s : sales) {
            System.out.println(s.id + " | " + s.bookName + " | Qty: " + s.quantity + " | ₹" + s.price);
        }
    }
}

