package com.gla.encapsulation.LibraryManagementSystem;
public class DVD extends LibraryItem implements Reservable {
    public DVD(int id, String title, String author) {
        super(id, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 3;
    }
    @Override
    public void reserveItem(String user) {
        available = false;
        System.out.println("DVD reserved by " + user);
    }
    @Override
    public boolean checkAvailability() {
        return available;
    }
}
