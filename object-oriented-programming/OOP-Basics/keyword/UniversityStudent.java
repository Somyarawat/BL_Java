class UniversityStudent {

    static String universityName = "DU";
    static int total = 0;

    final int rollNumber;
    String name;
    char grade;

    UniversityStudent(String name, int roll, char grade) {
        this.name = name;
        this.rollNumber = roll;
        this.grade = grade;
        total++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + total);
    }

    void display() {
        System.out.println(name + " " + rollNumber + " " + grade + " " + universityName);
    }

    public static void main(String[] args) {

        UniversityStudent s1 = new UniversityStudent("Amol", 1, 'A');
        UniversityStudent s2 = new UniversityStudent("Anmol", 2, 'A');

        if (s1 instanceof UniversityStudent && s2 instanceof UniversityStudent) {
            s1.display();
            s2.display();
        }

        UniversityStudent.displayTotalStudents();
    }
}