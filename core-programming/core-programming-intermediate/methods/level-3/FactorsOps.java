import java.util.*;

class FactorsOps {

    public static int[] factors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        int[] f = new int[count];
        int idx = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0) f[idx++] = i;

        return f;
    }

    public static int sum(int[] f) {
        int s = 0;
        for (int x : f) s += x;
        return s;
    }

    public static int product(int[] f) {
        int p = 1;
        for (int x : f) p *= x;
        return p;
    }

    public static double cubeProduct(int[] f) {
        double p = 1;
        for (int x : f) p *= Math.pow(x, 3);
        return p;
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] f = factors(n);
        System.out.println(sum(f));
        System.out.println(product(f));
        System.out.println(cubeProduct(f));
    }
}