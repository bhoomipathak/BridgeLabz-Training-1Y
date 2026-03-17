package com.gla.constructors.Level1;

class CarRental{
    String customerName;
    String carModel;
    int rentalDays;
    double rate=1000;
    CarRental(String c,String m,int d){
        customerName=c;
        carModel=m;
        rentalDays=d;
    }
    double totalCost(){
        return rentalDays*rate;
    }
    void display(){
        System.out.println(customerName+" "+carModel+" "+totalCost());
    }
    public static void main(String args[]){
        CarRental c=new CarRental("Anubhav","SUV",3);
        c.display();
    }
}
