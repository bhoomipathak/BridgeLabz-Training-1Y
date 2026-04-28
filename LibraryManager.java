package com.gla.jbbc;
import java.util.*;

class Book {
    int id;
    String title;
    String author;
    String status; // "Available" or "Issued"

    Book(int id, String title, String author, String status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = status;
    }
}

public class LibraryManager {

    static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {

        // CREATE (Insert books)
        books.add(new Book(1, "Java Basics", "James Gosling", "Available"));
        books.add(new Book(2, "Data Structures", "Mark Allen", "Available"));
        books.add(new Book(3, "Operating System", "Galvin", "Issued"));

        // READ (Show all available books)
        System.out.println("Available Books:");
        for (Book b : books) {
            if (b.status.equalsIgnoreCase("Available")) {
                System.out.println(b.id + " | " + b.title + " | " + b.author);
            }
        }

        // UPDATE (Mark a book as Issued by id)
        int issueId = 2;
        for (Book b : books) {
            if (b.id == issueId) {
                b.status = "Issued";
                System.out.println("Book Issued: " + b.title);
            }
        }

        // DELETE (Remove lost/damaged book)
        int deleteId = 3;
        books.removeIf(b -> b.id == deleteId);

        // Final List
        System.out.println("\nFinal Book List:");
        for (Book b : books) {
            System.out.println(b.id + " | " + b.title + " | " + b.author + " | " + b.status);
        }
    }
}

