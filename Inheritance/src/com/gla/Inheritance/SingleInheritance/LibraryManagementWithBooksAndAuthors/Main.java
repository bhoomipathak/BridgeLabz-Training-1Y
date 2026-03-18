package com.gla.Inheritance.SingleInheritance.LibraryManagementWithBooks;
class Main {
    public static void main(String[] args) {
        Author a = new Author();
        a.title="Java";
        a.publicationYear=2020;
        a.name="James";
        a.bio="Programmer";
        a.displayInfo();
    }
}
