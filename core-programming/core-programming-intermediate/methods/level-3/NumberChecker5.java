import java.util.*;

class NumberChecker5 {

    public static int sumDiv(int n) {
        int s = 0;
        for (int i = 1; i < n; i++)
            if (n % i == 0) s += i;
        return s;
    }

    public static boolean perfect(int n) {
        return sumDiv(n) == n;
    }

    public static boolean abundant(int n) {
        return sumDiv(n) > n;
    }

    public static boolean deficient(int n) {
        return sumDiv(n) < n;
    }

    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static boolean strong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            sum += fact(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(perfect(n));
        System.out.println(abundant(n));
        System.out.println(deficient(n));
        System.out.println(strong(n));
    }
}