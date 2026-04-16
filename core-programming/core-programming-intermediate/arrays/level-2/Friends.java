import java.util.Scanner;

class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        int[] height = new int[3];

        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }

        int minAge = age[0], maxHeight = height[0];

        for (int i = 1; i < 3; i++) {
            if (age[i] < minAge) minAge = age[i];
            if (height[i] > maxHeight) maxHeight = height[i];
        }

        System.out.println("Youngest = " + minAge);
        System.out.println("Tallest = " + maxHeight);
    }
}