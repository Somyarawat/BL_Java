import java.util.*;
class DivisionDetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Two Numbers: ");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

        double quotient = number1 / number2;
        double remainder = number1 % number2;

        System.out.println("The Quotient is: " + quotient + 
        " and Reminder is: " + remainder + 
        " of two numbers: " + number1 + " and" + number2);
    }
}