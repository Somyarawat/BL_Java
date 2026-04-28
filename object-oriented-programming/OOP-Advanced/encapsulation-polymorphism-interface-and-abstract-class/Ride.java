interface GPS {
    void getLocation();
}

abstract class Vehicle {
    @SuppressWarnings("unused")
    String driver;
    double rate;

    Vehicle(String d, double r) {
        driver = d; rate = r;
    }

    abstract double fare(double km);
}

class Car extends Vehicle implements GPS {
    Car(String d, double r) { super(d,r); }

    @SuppressWarnings("override")
    double fare(double km) { return km * rate; }
    @SuppressWarnings("override")
    public void getLocation() { System.out.println("Car location"); }
}

class Bike extends Vehicle {
    Bike(String d, double r) { super(d,r); }

    @SuppressWarnings("override")
    double fare(double km) { return km * rate; }
}

public class Ride {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Amit", 10);
        Vehicle v2 = new Bike("Riya", 5);

        System.out.println(v1.fare(10));
        System.out.println(v2.fare(10));
    }
}