import java.util.*;
class MinMax {
    public static int[] find(int a, int b, int c){
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));

        return new int[]{min,max};

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter Third Number: ");
        int c = sc.nextInt();

        int[] result = find(a, b, c);

        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
    }
}
