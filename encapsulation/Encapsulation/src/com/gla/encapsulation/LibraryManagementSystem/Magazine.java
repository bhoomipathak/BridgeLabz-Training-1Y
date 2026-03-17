package com.gla.encapsulation.LibraryManagementSystem;
public class Magazine extends LibraryItem implements Reservable {
    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 7;
    }
    @Override
    public void reserveItem(String user) {
        available = false;
        System.out.println("Magazine reserved by " + user);
    }
    @Override
    public boolean checkAvailability() {
        return available;
    }
}
