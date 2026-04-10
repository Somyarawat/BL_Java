import java.util.*;
class IntegerExpressions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Integer Values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a + b * c);
        System.out.println(a * b + c);
        System.out.println(c + a / b);
        System.out.println(a % b + c);
        
    }
}