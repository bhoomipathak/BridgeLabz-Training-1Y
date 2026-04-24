
class Order {
    int orderId;
    double baseAmount;
    static double deliveryCharge = 40;

    Order(int id, double amt) {
        orderId = id;
        baseAmount = amt;
    }

    double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}

class RegularOrder extends Order {
    RegularOrder(int id, double amt) {
        super(id, amt);
    }

    double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}

class PremiumOrder extends Order {
    PremiumOrder(int id, double amt) {
        super(id, amt);
    }

    double calculateBill() {
        return (baseAmount - baseAmount * 0.2) + deliveryCharge;
    }
}