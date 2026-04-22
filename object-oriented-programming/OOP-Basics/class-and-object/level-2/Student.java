class Student {
    String name;
    int rollNo;
    double marks;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    char grade(){
        if(marks >= 90)
            return 'A';

        else if(marks >= 75)
            return 'B';

        else if(marks >= 50)
            return 'C';

        else
            return 'F';
    }

    void display(){
        System.out.println(name + " Roll No. " + rollNo + " Grade " + grade());
    }

    public static void main(String[] args) {
        Student s1 = new Student("Amol", 1, 80);
        Student s2 = new Student("Anmol", 2, 75);
        s1.display();
        s2.display();
    }
}