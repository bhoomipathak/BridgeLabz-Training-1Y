package com.gla.Inheritance.HybridInheritance.RestaurantManagementSystem;
class Waiter extends Person implements Worker {
    public void performDuties() {
        System.out.println("Serving");
    }
}
