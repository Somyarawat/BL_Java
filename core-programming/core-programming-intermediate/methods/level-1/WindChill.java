import java.util.*;
class WindChill {
    public static double Calculate(double temp, double speed){
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(speed, 0.16);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Enter Speed: ");
        double speed = sc.nextDouble();

        System.out.println("Wind Chill: " + Calculate(temp, speed));
    }
}