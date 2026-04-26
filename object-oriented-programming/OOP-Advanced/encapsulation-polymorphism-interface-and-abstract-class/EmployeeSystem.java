import java.util.*;

// Interface
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

// Abstract Class
abstract class Employee {
    private final int employeeId;
    private final String name;
    private final double baseSalary;

    // Constructor
    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters (Encapsulation)
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Abstract Method
    abstract double calculateSalary();

    // Concrete Method
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

// Full-Time Employee
class FullTimeEmployee extends Employee implements Department {
    private String department;
    private final double bonus;

    FullTimeEmployee(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @SuppressWarnings("override")
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @SuppressWarnings("override")
    public String getDepartmentDetails() {
        return department;
    }
}

// Part-Time Employee
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private final int hoursWorked;
    private final double hourlyRate;

    PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, rate);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @SuppressWarnings("override")
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @SuppressWarnings("override")
    public String getDepartmentDetails() {
        return department;
    }
}

// Main Class
public class EmployeeSystem {
    public static void main(String[] args) {

        // Polymorphism (Parent reference)
        Employee e1 = new FullTimeEmployee(101, "Amit", 50000, 10000);
        Employee e2 = new PartTimeEmployee(102, "Riya", 500, 80);

        // Assign departments
        ((Department) e1).assignDepartment("IT");
        ((Department) e2).assignDepartment("HR");

        // List of employees
        ArrayList<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);

        // Processing employees
        for (Employee e : list) {
            e.displayDetails();
            System.out.println("Department: " + ((Department) e).getDepartmentDetails());
            System.out.println("Final Salary: " + e.calculateSalary());
        }
    }
}