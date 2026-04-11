import java.util.*;
class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        System.out.println("Is the first number the largest? " + (num1 > num2 && num1 > num3));
        System.out.println("Is the first number the largest? " + (num2 > num1 && num2 > num3));
        System.out.println("Is the first number the largest? " + (num3 > num1 && num3 > num2));
    }
}
