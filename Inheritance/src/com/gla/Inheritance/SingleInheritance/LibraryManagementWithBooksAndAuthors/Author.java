package com.gla.Inheritance.SingleInheritance.LibraryManagementWithBooks;
class Author extends Book {
    String name;
    String bio;
    void displayInfo() {
        System.out.println(title + " " + publicationYear + " " + name + " " + bio);
    }
}
