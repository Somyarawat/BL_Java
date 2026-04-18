import java.util.*;
class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll NO.: ");
        int roll_no = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.println("Enter marks in physics: ");
        double phy = sc.nextDouble();
        System.out.println("Enter marks in chemistry: ");
        double chem = sc.nextDouble();
        System.out.println("Enter marks in maths: ");
        double maths = sc.nextDouble();
        System.out.println("Enter marks in eng: ");
        double eng = sc.nextDouble();
        System.out.println("Enter marks in java: ");
        double java = sc.nextDouble();

        double avg = (phy + chem + maths + eng + java) / 5;

        if(avg >= 90) {
            System.out.println("Pass");
            System.out.println("Grade A+");
        }
        else if(avg >= 80) {
            System.out.println("Pass");
            System.out.println("Grade A");
        }
        else if(avg >= 70){
            System.out.println("Pass");
            System.out.println("Grade B+");
        }
        else if(avg >= 60) {
            System.out.println("Pass");
            System.out.println("Grade B");
        }
        else if(avg >= 50) {
            System.out.println("Pass");
            System.out.println("Grade C+");
        }
        else if(avg >= 40) {
            System.out.println("Pass");
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
            System.out.println("Grade F");
        }
    }
}