package com.gla.jbbc;
import java.util.*;

class Product {
    int pid;
    String pname;
    int qty;

    Product(int pid, String pname, int qty) {
        this.pid = pid;
        this.pname = pname;
        this.qty = qty;
    }
}

public class InventoryTracker {

    static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {

        // CREATE (Insert 3 products)
        products.add(new Product(1, "Pen", 20));
        products.add(new Product(2, "Notebook", 5));
        products.add(new Product(3, "Pencil", 8));

        // READ (qty < 10 → low stock)
        System.out.println("Low Stock Products (qty < 10):");
        for (Product p : products) {
            if (p.qty < 10) {
                System.out.println(p.pid + " " + p.pname + " " + p.qty);
            }
        }

        // UPDATE (add stock)
        int updatePid = 2;   // jis product ka stock update karna hai
        int addedQty = 10;   // kitna stock add karna hai

        for (Product p : products) {
            if (p.pid == updatePid) {
                p.qty += addedQty;
                System.out.println("Updated Quantity of " + p.pname + ": " + p.qty);
            }
        }

        // DELETE (discontinued product)
        int deletePid = 3;
        products.removeIf(p -> p.pid == deletePid);

        // Final List
        System.out.println("\nFinal Product List:");
        for (Product p : products) {
            System.out.println(p.pid + " " + p.pname + " " + p.qty);
        }
    }
}

