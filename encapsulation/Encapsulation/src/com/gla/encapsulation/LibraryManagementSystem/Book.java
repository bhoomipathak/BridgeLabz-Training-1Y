package com.gla.encapsulation.LibraryManagementSystem;
public class Book extends LibraryItem implements Reservable {
    private String reservedBy;
    public Book(int id, String title, String author) {
        super(id, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 14;
    }
    @Override
    public void reserveItem(String user) {
        if (available) {
            reservedBy = user;
            available = false;
            System.out.println("Book reserved by " + user);
        } else {
            System.out.println("Not available");
        }
    }
    @Override
    public boolean checkAvailability() {
        return available;
    }
}
