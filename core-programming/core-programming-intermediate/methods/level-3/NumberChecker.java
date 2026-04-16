import java.util.*;

class NumberChecker1 {

    public static int count(int n) {
        int c = 0;
        while (n > 0) { c++; n /= 10; }
        return c;
    }

    public static int[] digits(int n, int c) {
        int[] d = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    public static boolean duck(int[] d) {
        for (int x : d) if (x == 0) return true;
        return false;
    }

    public static boolean armstrong(int[] d) {
        int sum = 0;
        int p = d.length;
        for (int x : d) sum += Math.pow(x, p);
        int num = 0;
        for (int x : d) num = num * 10 + x;
        return sum == num;
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int c = count(n);
        int[] d = digits(n, c);

        System.out.println(duck(d));
        System.out.println(armstrong(d));
    }
}