import java.util.*;
class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Elements: ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter elements to remove: ");
        int remove = sc.nextInt();

        System.out.println("Array after removal: ");

        for(int i = 0; i < n; i++){
            if(arr[i] != remove){
                System.out.println(arr[i] + " ");
            }
        }
    }
}