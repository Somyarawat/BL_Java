interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed);
    }
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println(model + " is charging...");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @SuppressWarnings("override")
    public void refuel() {
        System.out.println(model + " is refueling...");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(180, "Tesla");
        PetrolVehicle pv = new PetrolVehicle(160, "Honda");

        ev.display();
        ev.charge();

        pv.display();
        pv.refuel();
    }
}