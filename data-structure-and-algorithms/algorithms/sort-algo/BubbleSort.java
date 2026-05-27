import java.util.*;
class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean s;
        for (int i = 0; i < n - 1; i++) {
            s = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    s = true;
                }
            }
            if (!s) break;
        }
    }
    
    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + Arrays.toString(data));
        
        bubbleSort(data);
        
        System.out.println("Sorted array:   " + Arrays.toString(data));
    }
}
