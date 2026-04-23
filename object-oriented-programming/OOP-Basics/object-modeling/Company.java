import java.util.*;

class Employee {
    String name;

    Employee(String n) {
        name = n;
    }
}

class Department {
    String name;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String n) {
        name = n;
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }
}

class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String n) {
        name = n;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void display() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            System.out.println("Dept: " + d.name);
            for (Employee e : d.employees) {
                System.out.println(" - " + e.name);
            }
        }
    }

    public static void main(String[] args) {
        Company c = new Company("TechCorp");

        Department d = new Department("IT");
        d.addEmployee(new Employee("Amol"));

        c.addDepartment(d);
        c.display();
    }
}