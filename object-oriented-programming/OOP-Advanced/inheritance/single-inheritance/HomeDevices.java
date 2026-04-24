class Device {
    int deviceID;
    String status;

    Device(int id, String status){
        this.deviceID = id;
        this.status = status;
    }

    void displayStatus(){
        System.out.println("Device with device ID: " + deviceID + " having status " + status);
    }
}

class Thermostat extends Device{
    double temperatureSetting;

    Thermostat(int id, String status, double setting){
        super(id, status);
        this.temperatureSetting = setting;
    }

    @Override
    void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting);
    }
}

@SuppressWarnings("unused")
class HomeDevices {
    public static void main(String[] args) {
        Thermostat thermo = new Thermostat(101, "ON", 24.5);
        thermo.displayStatus();
    }
}