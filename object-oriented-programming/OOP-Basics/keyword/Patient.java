class Patient {

    static String hospitalName = "AIIMS";
    static int total = 0;

    final int patientID;
    String name;
    int age;
    String disease;

    Patient(String name, int age, String disease, int patientID) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.patientID = patientID;
        total++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + total);
    }

    void display() {
        System.out.println(name + " " + age + " " + disease + " " + patientID + " " + hospitalName) ;
    }

    public static void main(String[] args) {

        Patient p = new Patient("Somya", 20, "Flu", 101);

        if (p instanceof Patient) {
            p.display();
        }

        Patient.getTotalPatients();
    }
}