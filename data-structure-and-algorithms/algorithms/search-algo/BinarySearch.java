import java.util.*;
class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high - low)/ 2;

            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.println("Search Value: ");
        int target = sc.nextInt();

        int result = binarySearch(arr, target);

        if(result == -1){
            System.out.println("Target not found");
        }
        else{
            System.out.println("Target found at " + result);
        }
    }
}