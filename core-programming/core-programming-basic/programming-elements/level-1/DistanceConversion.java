import java.util.*;
class DistanceConversion{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("Enter Yards: " + yards + " Enter Miles: " + miles);
        sc.close();
    }
}