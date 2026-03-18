package com.gla.Inheritance.HybridInheritance.RestaurantManagementSystem;
class Main {
    public static void main(String[] args) {
        Chef c = new Chef();
        Waiter w = new Waiter();
        c.performDuties();
        w.performDuties();
    }
}
