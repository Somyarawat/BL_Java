class CompanyEmployee {

    static String companyName = "TCS";
    static int total = 0;

    final int id;
    String name, designation;

    CompanyEmployee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        total++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total: " + total);
    }

    void display() {
        System.out.println(name + " " + id + " " + designation + " " + companyName);
    }

    public static void main(String[] args) {

        CompanyEmployee e = new CompanyEmployee("Somya", 1, "Developer");

        if (e instanceof CompanyEmployee) {
            e.display();
        }

        CompanyEmployee.displayTotalEmployees();
    }
}