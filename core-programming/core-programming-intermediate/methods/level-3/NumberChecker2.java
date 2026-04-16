import java.util.*;

class NumberChecker2 {

    public static int sum(int[] d) {
        int s = 0;
        for (int x : d) s += x;
        return s;
    }

    public static int sumSquares(int[] d) {
        int s = 0;
        for (int x : d) s += x * x;
        return s;
    }

    public static boolean harshad(int n, int s) {
        return n % s == 0;
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int temp = n, c = 0;
        while (temp > 0) { c++; temp /= 10; }

        int[] d = new int[c];
        temp = n;
        for (int i = c - 1; i >= 0; i--) {
            d[i] = temp % 10;
            temp /= 10;
        }

        System.out.println(sum(d));
        System.out.println(sumSquares(d));
        System.out.println(harshad(n, sum(d)));
    }
}