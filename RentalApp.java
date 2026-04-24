
class Vehicle {
    int vehicleId;
    String type;
    double rentPerDay;
    static String companyName = "Zoom Rentals";

    Vehicle(int id, String type, double rent) {
        this.vehicleId = id;
        this.type = type;
        this.rentPerDay = rent;
    }

    double calculateRent(int days) {
        return rentPerDay * days;
    }
}

// Car Class
class Car extends Vehicle {

    Car(int id, double rent) {
        super(id, "Car", rent);
    }

    @Override
    double calculateRent(int days) {
        return rentPerDay * days + 500; // extra fixed charge
    }
}

// Bike Class
class Bike extends Vehicle {

    Bike(int id, double rent) {
        super(id, "Bike", rent);
    }

    @Override
    double calculateRent(int days) {
        return rentPerDay * days;
    }
}

// Main Class
public class RentalApp {
    public static void main(String[] args) {

        Vehicle v1 = new Car(1, 1000);
        Vehicle v2 = new Bike(2, 300);

        System.out.println("Company: " + Vehicle.companyName);

        System.out.println("Car Rent: " + v1.calculateRent(3));
        System.out.println("Bike Rent: " + v2.calculateRent(3));
    }
}