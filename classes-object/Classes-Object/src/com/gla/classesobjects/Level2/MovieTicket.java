package com.gla.classesobjects.Level2;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    MovieTicket(String name){
        movieName=name;
    }
    void bookTicket(int seat,double cost){
        seatNumber=seat;
        price=cost;
    }
    void display(){
        System.out.println("Movie: "+movieName);
        System.out.println("Seat: "+seatNumber);
        System.out.println("Price: "+price);
    }
    public static void main(String args[]){
        MovieTicket t=new MovieTicket("Interstellar");
        t.bookTicket(12,250);
        t.display();
    }
}
