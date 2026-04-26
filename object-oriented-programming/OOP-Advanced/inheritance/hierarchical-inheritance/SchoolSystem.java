class Person {
    String name;
    @SuppressWarnings("unused")
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + " is a Teacher of " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println(name + " is a Student of grade " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println(name + " works in " + department + " department");
    }
}

@SuppressWarnings("unused")
class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Amit", 35, "Math");
        Student s = new Student("Riya", 18, "12th");
        Staff st = new Staff("Raj", 40, "Admin");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}