class Course {
    String name;

    Course(String n) {
        name = n;
    }
}

class Professor {
    String name;

    Professor(String n) {
        name = n;
    }

    void assignCourse(Course c) {
        System.out.println(name + " teaches " + c.name);
    }
}

class Student {
    String name;

    Student(String n) {
        name = n;
    }

    void enrollCourse(Course c) {
        System.out.println(name + " enrolled in " + c.name);
    }

    public static void main(String[] args) {
        Student s = new Student("Somya");
        Course c = new Course("Java");
        Professor p = new Professor("Dr. A");

        s.enrollCourse(c);
        p.assignCourse(c);
    }
}