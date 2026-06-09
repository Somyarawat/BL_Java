
interface Provider {
    Student1 getStudent();
}


class Student1{

    Student1() {
    System.out.println("Student Object Created");
    }
    void display(){
        System.out.println("I am a student");
    }
    
}


public class ConstructorReference {
    public static void main(String[] args) {
        Provider provider = Student1::new;
        Student1 student = provider.getStudent();
        student.display();
    }
}


