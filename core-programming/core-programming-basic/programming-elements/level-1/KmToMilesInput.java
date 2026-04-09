import java.util.*;
class KmToMilesInput {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter km: ");
        double km = sc.nextDouble();

        double miles = km / 1.6;

        System.out.println("Miles: " + miles);
        sc.close();
        }
}