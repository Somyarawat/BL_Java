class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType);
    }
}

class Car extends Vehicle {
    int seats;

    Car(int maxSpeed, String fuelType, int seats) {
        super(maxSpeed, fuelType);
        this.seats = seats;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seats);
    }
}

class Truck extends Vehicle {
    int load;

    Truck(int maxSpeed, String fuelType, int load) {
        super(maxSpeed, fuelType);
        this.load = load;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load: " + load);
    }
}

class Motorcycle extends Vehicle {
    boolean hasHelmet;

    Motorcycle(int maxSpeed, String fuelType, boolean hasHelmet) {
        super(maxSpeed, fuelType);
        this.hasHelmet = hasHelmet;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Helmet: " + hasHelmet);
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle[] v = {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 1000),
            new Motorcycle(150, "Petrol", true)
        };

        for (Vehicle obj : v) {
            obj.displayInfo();
            System.out.println();
        }
    }
}