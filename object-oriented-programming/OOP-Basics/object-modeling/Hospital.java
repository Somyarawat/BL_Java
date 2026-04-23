class Patient {
    String name;

    Patient(String n) {
        name = n;
    }
}

class Doctor {
    String name;

    Doctor(String n) {
        name = n;
    }

    void consult(Patient p) {
        System.out.println(name + " is treating " + p.name);
    }
}

@SuppressWarnings("unused")
class Hospital {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. A");
        Patient p = new Patient("Nandini");

        d.consult(p);
    }
}