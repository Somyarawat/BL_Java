class EmployeeModifier {

    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        Manager m = new Manager();

        m.employeeID = 1001;   
        m.department = "IT";   
        m.setSalary(60000);   

        m.display();
    }
}

class Manager extends EmployeeModifier {

    void display() {
        System.out.println("ID: " + employeeID);
        System.out.println("Department: " + department);


        System.out.println("Salary: " + getSalary());
    }
}