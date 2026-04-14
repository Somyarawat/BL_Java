import java.util.*;
class Athlete {
    public static double rounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (5000 / perimeter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        System.out.println("Number Of Rounds: " + rounds(a , b , c));
    }
}