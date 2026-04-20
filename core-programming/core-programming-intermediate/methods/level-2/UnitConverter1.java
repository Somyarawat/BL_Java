import java.util.Scanner;

class UnitConverter1 {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value:");
        double value = sc.nextDouble();

        System.out.println("Kilometers to Miles = " + convertKmToMiles(value));
        System.out.println("Miles to Kilometers = " + convertMilesToKm(value));
        System.out.println("Meters to Feet = " + convertMetersToFeet(value));
        System.out.println("Feet to Meters = " + convertFeetToMeters(value));
    }
}