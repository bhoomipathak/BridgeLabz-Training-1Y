package com.gla.encapsulation.LibraryManagementSystem;
public class Main{
    public static void processItem(LibraryItem item) {
        item.getItemDetails();
        System.out.println("Loan Days: " + item.getLoanDuration());
        Reservable r = (Reservable) item;
        r.reserveItem("Anubhav");
        System.out.println("Available: " + r.checkAvailability());
        System.out.println("---------------------");
    }
    public static void main(String[] args) {
        LibraryItem i1 = new Book(1, "Java", "James");
        LibraryItem i2 = new Magazine(2, "TechMag", "Editor");
        LibraryItem i3 = new DVD(3, "Movie", "Director");
        processItem(i1);
        processItem(i2);
        processItem(i3);
    }
}
