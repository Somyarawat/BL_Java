import java.util.Scanner;

class Quadratic {

    public static void findRoots(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println(r1 + " " + r2);
        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println(r);
        } else {
            System.out.println("No real roots");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        findRoots(a, b, c);
    }
}