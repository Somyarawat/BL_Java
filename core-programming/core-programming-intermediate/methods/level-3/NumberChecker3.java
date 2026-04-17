import java.util.*;

class NumberChecker3 {

    public static int count(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
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

    public static int[] reverseArray(int[] d) {
        int[] r = new int[d.length];
        for (int i = 0; i < d.length; i++) {
            r[i] = d[d.length - 1 - i];
        }
        return r;
    }

    public static boolean equal(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static boolean palindrome(int[] d) {
        return equal(d, reverseArray(d));
    }

    public static boolean duck(int[] d) {
        for (int x : d) {
            if (x == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int c = count(n);
        int[] d = digits(n, c);
        int[] rev = reverseArray(d);

        System.out.println(c);
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(rev));
        System.out.println(equal(d, rev));
        System.out.println(palindrome(d));
        System.out.println(duck(d));
    }
}