import java.util.*;
class Employee {
    int id;
    String name;
    String dept;

    Employee(int id, String name, String dept){
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    void display(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Department: " + dept);
    }
}

@SuppressWarnings("unused")
class EmployeeRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Employee> map = new HashMap<>();
        System.out.println("Enter number of Employees: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Enter ID: ");
            int id = sc.nextInt();

            System.out.println("Enter Name: ");
            String name = sc.next();

            System.out.println("Enter Department: ");
            String dept = sc.next();

            map.put(id, new Employee(id, name, dept));
        }
        System.out.println("Enter search ID: ");
        int searchID = sc.nextInt();
        if(map.containsKey(searchID)){
            System.out.println("Employee Found");
            map.get(searchID).display();
        }
        else{
            System.out.println("Employee Not Found");
        }
    }
}