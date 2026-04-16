import java.util.Scanner;

class UnitConverter3 {

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double poundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    public static double kgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double gallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double litersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value:");
        double value = sc.nextDouble();

        System.out.println("Fahrenheit to Celsius = " + fahrenheitToCelsius(value));
        System.out.println("Celsius to Fahrenheit = " + celsiusToFahrenheit(value));
        System.out.println("Pounds to Kg = " + poundsToKg(value));
        System.out.println("Kg to Pounds = " + kgToPounds(value));
        System.out.println("Gallons to Liters = " + gallonsToLiters(value));
        System.out.println("Liters to Gallons = " + litersToGallons(value));
    }
}