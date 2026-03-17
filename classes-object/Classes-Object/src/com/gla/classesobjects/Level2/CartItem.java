package com.gla.classesobjects.Level2;

class CartItem{
    String itemName;
    double price;
    int quantity;
    CartItem(String n,double p){
        itemName=n;
        price=p;
    }
    void add(int q){
        quantity+=q;
    }
    void remove(int q){
        if(quantity>=q)
            quantity-=q;
    }
    void totalCost(){
        System.out.println("Total Cost: "+(price*quantity));
    }
    public static void main(String args[]){
        CartItem c=new CartItem("Shoes",1500);
        c.add(2);
        c.remove(1);
        c.totalCost();
    }
}