import java.util.*;

class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int phy = sc.nextInt();
            int chem = sc.nextInt();
            int math = sc.nextInt();

            int total = phy + chem + math;
            double percent = total / 3.0;

            char grade;

            if (percent >= 80) grade = 'A';
            else if (percent >= 70) grade = 'B';
            else if (percent >= 60) grade = 'C';
            else if (percent >= 50) grade = 'D';
            else if (percent >= 40) grade = 'E';
            else grade = 'R';

            System.out.println("Percent: " + percent + " Grade: " + grade);
        }
    }
}