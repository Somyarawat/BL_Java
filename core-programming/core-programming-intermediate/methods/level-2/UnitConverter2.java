import java.util.Scanner;

class UnitConverter2 {

    public static double yardsToFeet(double yards) {
        return yards * 3;
    }

    public static double feetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double metersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double inchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double inchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value:");
        double value = sc.nextDouble();

        System.out.println("Yards to Feet = " + yardsToFeet(value));
        System.out.println("Feet to Yards = " + feetToYards(value));
        System.out.println("Meters to Inches = " + metersToInches(value));
        System.out.println("Inches to Meters = " + inchesToMeters(value));
        System.out.println("Inches to Cm = " + inchesToCm(value));
    }
}