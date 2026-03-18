package com.gla.Inheritance.MultilevelInheritance.OnlineRetailOrderManagement;
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    String getOrderStatus() {
        return "Delivered";
    }
}
