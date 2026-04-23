import java.util.*;

class Faculty {
    @SuppressWarnings("unused")
    String name;

    Faculty(String n) {
        name = n;
    }
}

class Department {
    String name;

    Department(String n) {
        name = n;
    }
}

class University {
    @SuppressWarnings("unused")
    String name;
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String n) {
        name = n;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public static void main(String[] args) {
        University u = new University("DU");

        u.addDepartment(new Department("CS"));
        u.addFaculty(new Faculty("Dr. Sharma"));

        System.out.println("University created");
    }
}