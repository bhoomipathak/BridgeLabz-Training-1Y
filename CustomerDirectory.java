package com.gla.jbbc;
import java.util.*;

class Customer {
    int id;
    String name;
    String phone;

    Customer(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
}

public class CustomerDirectory {

    static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {

        // CREATE (Add customers)
        customers.add(new Customer(1, "Rahul Sharma", "9876543210"));
        customers.add(new Customer(2, "Amit Kumar", "9123456780"));
        customers.add(new Customer(3, "Neha Singh", "9988776655"));

        // READ (Search by name - LIKE behavior)
        String searchName = "Rah"; // partial search
        System.out.println("Search Results:");
        for (Customer c : customers) {
            if (c.name.toLowerCase().contains(searchName.toLowerCase())) {
                System.out.println(c.id + " | " + c.name + " | " + c.phone);
            }
        }

        // UPDATE (Change phone number)
        int updateId = 2;
        String newPhone = "9000000000";

        for (Customer c : customers) {
            if (c.id == updateId) {
                c.phone = newPhone;
                System.out.println("Updated Phone for " + c.name + ": " + c.phone);
            }
        }

        // DELETE (Remove customer)
        int deleteId = 3;
        customers.removeIf(c -> c.id == deleteId);

        // Final List
        System.out.println("\nFinal Customer List:");
        for (Customer c : customers) {
            System.out.println(c.id + " | " + c.name + " | " + c.phone);
        }
    }
}

