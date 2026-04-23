class VehicleRegistration {

    static int registrationFee = 500;

    final int regNo;
    String ownerName, type;

    VehicleRegistration(String owner, String type, int regNo) {
        this.ownerName = owner;
        this.type = type;
        this.regNo = regNo;
    }

    static void updateRegistrationFee(int fee) {
        registrationFee = fee;
    }

    void display() {
        System.out.println(ownerName + " " + type + " RegNo: " + regNo + " Fee: " + registrationFee);
    }

    public static void main(String[] args) {

        VehicleRegistration v = new VehicleRegistration("Anand", "Car", 123);

        if (v instanceof VehicleRegistration) {
            v.display();
        }

        VehicleRegistration.updateRegistrationFee(700);
        v.display();
    }
}