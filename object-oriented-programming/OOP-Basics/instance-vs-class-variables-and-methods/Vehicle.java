class Vehicle {
    String ownerName;
    String vehicleType;
    static int fee = 500;

    Vehicle(String o, String t) {
        ownerName = o;
        vehicleType = t;
    }

    void displayVehicleDetails() {
        System.out.println(ownerName + " " + vehicleType + " Fee: " + fee);
    }

    static void updateRegistrationFee(int f) {
        fee = f;
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Kush", "Car");
        v.displayVehicleDetails();
        Vehicle.updateRegistrationFee(700);
        v.displayVehicleDetails();
    }
}