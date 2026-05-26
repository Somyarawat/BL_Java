import java.util.*;
class Employee {
    int id;
    String name;
    String department;
    Employee next;

    Employee(int id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
        this.next = null;
    }
}

class LinkedList {
    Employee head;
    void addEmployee(int id, String name, String department){
        Employee newNode = new Employee(id, name, department);
        if(head == null){
            head = newNode;
        }
        else{
            Employee temp = null;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Employee added");
    }

    void displayEmployee(){
        if(head == null){
            System.out.println("No Employee Found");
        }
        Employee temp = head;
        while(temp != null){
            System.out.println("Employee ID: " + temp.id);
            System.out.println("Employee Name: " + temp.name);
            System.out.println("Employee Department: " + temp.department);
            temp = temp.next;
        }
    }

    void searchEmployee(int searchId){
        Employee temp = head;
        while(temp != null){
            if(temp.id == searchId){
                System.out.println("Employee ID: " + temp.id);
                System.out.println("Employee Name: " + temp.name);
                System.out.println("Employee Department: " + temp.department);
            }
            temp = temp.next;
        }
        System.out.println("Employee Not Found");
    }

    void deleteEmployee(int deleteId){
        if(head == null){
            System.out.println("No Employee Found");
        }
        if(head.id == deleteId){
            head = head.next;
            System.out.println("Employee deleted");
        }
        Employee temp = head;
        while(temp.next != null){
            if(temp.next.id == deleteId){
                temp.next = temp.next.next;
                System.out.println("Employee Deleted");
            }
            temp = temp.next;
        }
        System.out.println("Employee Not Found");
    }
}
@SuppressWarnings("unused")
class EmployeeRecordManagement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int choice = 0;
        while (choice != 5){
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.println("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.println("Enter name: ");
                    String name = sc.next();
                    System.out.println("Enter department: ");
                    String department = sc.next();
                    ll.addEmployee(id, name, department);
                }
                case 2 -> ll.displayEmployee();
                case 3 -> {
                    System.out.println("Enter search ID: ");
                    int searchId = sc.nextInt();
                    ll.searchEmployee(searchId);
                }
                case 4 -> {
                    System.out.println("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    ll.deleteEmployee(deleteId);
                }
                case 5 -> System.out.println("Exit");
                default -> System.out.println("Invalid Choice");
            }
        }
    }
}