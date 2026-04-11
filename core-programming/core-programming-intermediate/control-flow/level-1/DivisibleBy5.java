import java.util.*;
class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n % 5 == 0) {
            System.out.println("Is the number: " + n + " divisible by 5? " + true);
        }
        else {
            System.out.println("Is the number: " + n + " divisible by 5? " + false);
        }
    }
}