import java.util.*;

public class RemoveDuplicates2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 1;

        System.out.println("Output:");

        System.out.print(arr[0] + " ");

        for(int i = 1; i < n; i++) {

            if(arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if(count <= 2) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}