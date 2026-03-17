package com.gla.constructors.Level1;

class BookLibrary{
    String title;
    String author;
    double price;
    boolean available=true;
    BookLibrary(String t,String a,double p){
        title=t;
        author=a;
        price=p;
    }
    void borrow(){
        if(available){
            available=false;
            System.out.println("Book Borrowed");
        }
        else
            System.out.println("Not Available");
    }
    void display(){
        System.out.println(title+" "+author+" "+available);
    }
    public static void main(String args[]){
        BookLibrary b=new BookLibrary("Java","James",500);
        b.display();
        b.borrow();
        b.display();
    }
}