import java.util.Scanner;

class Friends {

    public static int findYoungest(int[] age) {
        int min = age[0];
        for (int a : age) if (a < min) min = a;
        return min;
    }

    public static int findTallest(int[] height) {
        int max = height[0];
        for (int h : height) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        int[] height = new int[3];

        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }

        System.out.println("Youngest = " + findYoungest(age));
        System.out.println("Tallest = " + findTallest(height));
    }
}