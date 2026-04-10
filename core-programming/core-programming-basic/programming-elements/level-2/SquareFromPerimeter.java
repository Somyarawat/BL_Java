import java.util.*;
class SquareFromPerimeter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Perimeter: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is: " + side + " whose perimeter is: " + perimeter);
    }
}
