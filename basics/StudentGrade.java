package basics;

import java.util.Scanner;

/**
 * Calculates student grade based on marks
 */
public class StudentGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();

        // Validate input
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks!");
            return;
        }

        // Ternary for pass/fail
        String status = (marks >= 40) ? "Pass" : "Fail";

        // if-else ladder for grade
        char grade;
        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 60) grade = 'C';
        else if (marks >= 40) grade = 'D';
        else grade = 'F';

        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);

        scanner.close();
    }
}