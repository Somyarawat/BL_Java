import java.util.*;
class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] rotated = new int[n];

        System.out.println("Enter elements: ");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter k: ");
        int k = sc.nextInt();

        k = k % n;

        for(int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        System.out.println("Rotated Array: ");

        for(int x: rotated){
            System.out.println(x + " ");
        }
    }
}
