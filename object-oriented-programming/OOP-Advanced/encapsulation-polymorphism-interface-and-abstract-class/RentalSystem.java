interface Insurable {
    double calculateInsurance();
}

abstract class Vehicle {
    @SuppressWarnings("unused")
    String number;
    double rate;

    Vehicle(String number, double rate) {
        this.number = number;
        this.rate = rate;
    }

    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    Car(String num, double rate) { super(num, rate); }

    @SuppressWarnings("override")
    double calculateRentalCost(int days) { return rate * days; }
    @SuppressWarnings("override")
    public double calculateInsurance() { return 500; }
}

class Bike extends Vehicle {
    Bike(String num, double rate) { super(num, rate); }

    @SuppressWarnings("override")
    double calculateRentalCost(int days) { return rate * days; }
}

class Truck extends Vehicle implements Insurable {
    Truck(String num, double rate) { super(num, rate); }

    @SuppressWarnings("override")
    double calculateRentalCost(int days) { return rate * days; }
    @SuppressWarnings("override")
    public double calculateInsurance() { return 1000; }
}

public class RentalSystem {
    public static void main(String[] args) {
        Vehicle[] v = {
            new Car("C1", 1000),
            new Bike("B1", 500),
            new Truck("T1", 2000)
        };

        for (Vehicle ve : v) {
            double cost = ve.calculateRentalCost(3);
            double insurance = (ve instanceof Insurable) ? ((Insurable)ve).calculateInsurance() : 0;

            System.out.println("Total: " + (cost + insurance));
        }
    }
}