package com.gla.Inheritance.MultilevelInheritance.OnlineRetailOrderManagement;
class Main {
    public static void main(String[] args) {
        Order o = new Order();
        ShippedOrder s = new ShippedOrder();
        DeliveredOrder d = new DeliveredOrder();
        System.out.println(o.getOrderStatus());
        System.out.println(s.getOrderStatus());
        System.out.println(d.getOrderStatus());
    }
}
