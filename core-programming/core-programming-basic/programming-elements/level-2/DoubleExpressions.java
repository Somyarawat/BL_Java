import java.util.*;
class DoubleExpressions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Integer Values: ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        System.out.println(a + b * c);
        System.out.println(a * b + c);
        System.out.println(c + a / b);
        System.out.println(a % b + c);
        
    }
}