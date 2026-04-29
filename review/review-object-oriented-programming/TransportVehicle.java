class Vehicle{
    private String vehicleNo;
    private String driverName;
    private int capacity;
    static int totalVehicles = 0;

    Vehicle(String vehicleNo, String driverName, int capacity){
        this.vehicleNo = vehicleNo;
        this.driverName = driverName;
        this.capacity = capacity;
        totalVehicles++;
    }

    public String getVehicleNo(){
        return vehicleNo;
    }

    public String getDriverName(){
        return driverName;
    }

    public int getCapacity(){
        return capacity;
    }

    protected String getVehicleType() {
        return "Generic Vehicle";
    }

    @Override
    public String toString() {
        return "Vehicle No: " + vehicleNo +
        ", Driver: " + driverName +
        ", Capacity: " + capacity +
        ", Type: " + getVehicleType();
    }
}

class Bus extends Vehicle {
    private int routeNo;
    private boolean isAC;

    Bus(String vehicleNo, String driverName, int capacity, int routeNo, boolean isAC){
        super(vehicleNo, driverName, capacity);
        this.routeNo = routeNo;
        this.isAC = isAC;
    }
    @Override
    protected String getVehicleType() {
        return "Bus";
    }

    public void showBusDetails() {
        System.out.println("Route No: " + routeNo + ", AC: " + isAC);
    }

    @Override
    public String toString() {
        return super.toString() +
        ", Route No: " + routeNo +
        ", AC: " + isAC;
    }
}

class Taxi extends Vehicle{
    private String cabType;
    private int farePerKm;

    Taxi(String vehicleNo, String driverName, int capacity, String cabType, int farePerKm){
        super(vehicleNo, driverName, capacity);
        this.cabType = cabType;
        this.farePerKm = farePerKm;
    }

    @Override
    protected String getVehicleType() {
        return "Taxi";
    }

    public void showTaxiDetails(){
        System.out.println("Cab Type: " + cabType + ", Fare/KM: " + farePerKm);
    }

    @Override
    public String toString() {
        return super.toString() +
        ", Cab Type: " + cabType +
        ", Fare/KM: " + farePerKm;
    }
}

class TransportVehicle{
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];

        vehicles[0] = new Bus("B1", "Ram", 70, 4, true);
        vehicles[1] = new Bus("B2", "Hari", 50, 6, false);
        vehicles[2] = new Taxi("T1", "Pranav", 4, "Mini", 20);
        vehicles[3] = new Taxi("T2", "Abhay", 4, "Mini", 20);

        for(Vehicle v: vehicles){
            System.out.println(v);

            if(v instanceof Bus b){

                b.showBusDetails();
            }
            else if(v instanceof Taxi t){

                t.showTaxiDetails();
            }
        }

        System.out.println("Total Vehicles Created: " + Vehicle.totalVehicles);
    }
}