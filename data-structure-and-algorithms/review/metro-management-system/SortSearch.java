import java.util.*;

public class SortSearch {

    static void bubbleSort(int arr[]) {
        int n = arr.length;
        
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == key)
                return mid;
            else if(arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Array Elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Before Sorting");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        bubbleSort(arr);
        System.out.println("After Bubble Sort");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.print("Enter Element to Search: ");
        int key = sc.nextInt();
        int result = binarySearch(arr, key);
        if(result != -1)
            System.out.println("Element Found at Index: " + result);
        else
            System.out.println("Element Not Found");
    }
}