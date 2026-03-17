package com.gla.encapsulation.LibraryManagementSystem;
public interface Reservable {
    void reserveItem(String user);
    boolean checkAvailability();
}
