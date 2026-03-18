package com.gla.Inheritance.MultilevelInheritance.OnlineRetailOrderManagement;
class ShippedOrder extends Order {
    String trackingNumber;
    String getOrderStatus() {
        return "Shipped";
    }
}
