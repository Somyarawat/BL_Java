interface MedicalRecord {
    void addRecord();
}

abstract class Patient {
    @SuppressWarnings("unused")
    String name;

    Patient(String name) { this.name = name; }

    abstract double bill();
}

class InPatient extends Patient implements MedicalRecord {
    InPatient(String n) { super(n); }

    @SuppressWarnings("override")
    double bill() { return 5000; }
    @SuppressWarnings("override")
    public void addRecord() { System.out.println("Record Added"); }
}

class OutPatient extends Patient {
    OutPatient(String n) { super(n); }

    @SuppressWarnings("override")
    double bill() { return 1000; }
}

public class Hospital {
    public static void main(String[] args) {
        Patient p1 = new InPatient("Amit");
        Patient p2 = new OutPatient("Riya");

        System.out.println(p1.bill());
        System.out.println(p2.bill());
    }
}