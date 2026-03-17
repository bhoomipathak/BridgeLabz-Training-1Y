package com.gla.constructors.InstanceVsVariableAndMethod;

class Product {
    // Instance variables
    String productName;
    double price;
    // Class variable
    static int totalProducts=0;
    Product(String name,double p){
        productName=name;
        price=p;
        totalProducts++;
    }
    // Instance method
    void displayProductDetails(){
        System.out.println(productName+" "+price);
    }
    // Class method
    static void displayTotalProducts(){
        System.out.println("Total Products: "+totalProducts);
    }
    public static void main(String args[]){
        Product p1=new Product("Pen",20);
        Product p2=new Product("Book",100);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}