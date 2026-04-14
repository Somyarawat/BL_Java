import java.util.*;
class Division {
    public static int[] find(int n, int d) {
        int q = n / d;
        int r = n % d;

        return new int[]{q, r};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Numerator: ");
        int n = sc.nextInt();
        System.out.print("Enter Denominator: ");
        int d = sc.nextInt();

        int[] res = find(n, d);

        System.out.println("Quotient: " + res[0]);
        System.out.println("Remainder: " + res[1]);
    }
}