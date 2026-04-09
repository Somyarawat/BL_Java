import java.util.*;
class SquareSide{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Perimeter: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("Side: " + side);
        sc.close();
    }
}
