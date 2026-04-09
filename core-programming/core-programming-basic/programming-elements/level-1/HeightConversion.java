import java.util.*;
class HeightConversion {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        double cm = sc.nextDouble();

        double inches = cm / 2.54;
        double feet = inches / 12;

        System.out.println("Feet: " + feet + " Inches: " + inches);
        sc.close();
    }
}
