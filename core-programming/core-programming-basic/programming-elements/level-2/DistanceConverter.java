import java.util.*;
class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceFeet = sc.nextDouble();

        double distanceYard = distanceFeet / 3;
        double distanceMiles = distanceYard / 1760;

        System.out.println("The distance in yards is: " + distanceYard + " while the distance in miles is: " + distanceMiles);
    }
}