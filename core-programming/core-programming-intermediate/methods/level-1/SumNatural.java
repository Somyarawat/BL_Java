import java.util.*;
class SumNatural {
    public static int sum(int n) {
        int s = 0;

        for (int i = 0; i <= n; i++) {
            s += i;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println("Sum: " + sum(n));
    }
}