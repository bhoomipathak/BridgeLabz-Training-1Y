package com.gla.encapsulation.LibraryManagementSystem;
public abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    protected boolean available = true;
    public LibraryItem(int id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }
    public int getItemId() {
        return itemId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public abstract int getLoanDuration();
    public void getItemDetails() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
