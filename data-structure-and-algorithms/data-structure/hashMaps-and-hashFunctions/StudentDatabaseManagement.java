import java.util.*;
class Student {
    int id;
    String name;
    String course;
    
    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
}

public class StudentDatabaseManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Student> studentMap = new HashMap<>();
        int choice = 0;
        while (choice != 5) {
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");

            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Student ID : ");
                    int id = sc.nextInt();
                    System.out.print("Enter Student Name : ");
                    String name = sc.next();
                    System.out.print("Enter Course : ");
                    String course = sc.next();
                    Student s = new Student(id, name, course);
                    studentMap.put(id, s);
                    System.out.println("Student Added");
                }
                case 2 -> {
                    if (studentMap.isEmpty()) {
                        System.out.println("No Student Records");
                    }
                    else {
                        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
                            Student s = entry.getValue();
                            System.out.println("Student ID : " + s.id);
                            System.out.println("Student Name : " + s.name);
                            System.out.println("Course : " + s.course);
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Enter Student ID to Search : ");
                    int searchId = sc.nextInt();
                    if (studentMap.containsKey(searchId)) {
                        Student s = studentMap.get(searchId);
                        System.out.println("Student Found!");
                        System.out.println("Student ID : " + s.id);
                        System.out.println("Student Name : " + s.name);
                        System.out.println("Course : " + s.course);
                    }
                    else {
                        System.out.println("Student Not Found!");
                    }
                }
                case 4 -> {
                    System.out.print("Enter Student ID to Remove : ");
                    int removeId = sc.nextInt();
                    if (studentMap.containsKey(removeId)) {
                        studentMap.remove(removeId);
                        System.out.println("Student Removed");
                    }
                    else {
                        System.out.println("Student Not Found!");
                    }
                }
                case 5 -> System.out.println("Program Ended.");
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}