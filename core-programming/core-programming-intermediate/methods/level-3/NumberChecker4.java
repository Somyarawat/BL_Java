import java.util.*;

class NumberChecker4 {

    public static boolean prime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static boolean neon(int n) {
        int sq = n * n, sum = 0;
        while (sq > 0) { sum += sq % 10; sq /= 10; }
        return sum == n;
    }

    public static boolean spy(int n) {
        int sum = 0, prod = 1;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            prod *= d;
            n /= 10;
        }
        return sum == prod;
    }

    public static boolean automorphic(int n) {
        int sq = n * n;
        return sq % (int)Math.pow(10, String.valueOf(n).length()) == n;
    }

    public static boolean buzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(prime(n));
        System.out.println(neon(n));
        System.out.println(spy(n));
        System.out.println(automorphic(n));
        System.out.println(buzz(n));
    }
}