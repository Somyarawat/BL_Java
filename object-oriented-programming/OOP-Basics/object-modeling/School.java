import java.util.*;

class Course {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    Course(String n) {
        name = n;
    }

    void addStudent(Student s) {
        students.add(s);
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String n) {
        name = n;
    }

    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    void displayCourses() {
        System.out.print(name + " enrolled in: ");
        for (Course c : courses) System.out.println(c.name);
    }
}

class School {
    @SuppressWarnings("unused")
    String name;
    ArrayList<Student> students = new ArrayList<>();

    School(String n) {
        name = n;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    public static void main(String[] args) {
        School s = new School("ABC School");

        Student st = new Student("Somya");
        Course c1 = new Course("Computer Science");

        st.enroll(c1);
        s.addStudent(st);

        st.displayCourses();
    }
}