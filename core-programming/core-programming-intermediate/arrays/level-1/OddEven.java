import java.util.*;
class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("Invalid Number");
            return;
        }

        int[] even = new int[n];
        int[] odd = new int[n];

        int o =0;
        int e = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even[e++] = i;
            }
            else {
                odd[o++] = i;
            }
        }
        System.out.println("Odd");
            for (int j = 0; j < o; j++) {
                System.out.println(odd[j] + " ");
            }
            System.out.println("Even");
            for(int k =0; k < e; k++) {
                System.out.println(even[k] + " ");
            }
    }
}