import java.util.*;
class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter number of elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value you want to search: ");
        int target = sc.nextInt();

        int result = -1;
        for(int i = 0; i < n; i++){
        if(arr[i] == target){
            result = i;
            break;
        }
        }
        if(result == -1) {
            System.out.println("Target is not found");
        }
        else{
            System.out.println("Target found at " + result);
        }

    }
}
