import java.util.*;
class MergeArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array: ");
        int m = sc.nextInt();

        System.out.println("Enter size of second array: ");
        int n = sc.nextInt();

        int[] nums1 = new int[m];
        int[] nums2 = new int[n];
        int[] merged = new int[m+n];

        System.out.println("Enter first sorted array: ");

        for(int i = 0; i < m; i++){
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter second sorted array: ");

        for(int i = 0; i < n; i++){
            nums2[i] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n){
            if(nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                i++;
            }
            else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < m){
            merged[k++] = nums1[i++];
        }
        while(j < n){
            merged[k++] = nums2[j++];
        }

        System.out.println("Merged Array: ");

        for(int x : merged){
            System.out.println(x + " ");
        }
    }
}