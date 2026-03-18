package com.gla.Inheritance.HybridInheritance.RestaurantManagementSystem;
class Chef extends Person implements Worker {
    public void performDuties() {
        System.out.println("Cooking");
    }
}
