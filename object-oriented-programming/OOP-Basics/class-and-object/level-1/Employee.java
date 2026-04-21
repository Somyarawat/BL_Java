class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void details(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Amol", 101, 35000);
        Employee e2 = new Employee("Anmol", 102, 35000);

        e1.details();
        e2.details();
    }
}