import java.util.*;
class MajorityElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int majority = 0;

        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > n/2) {
                majority = arr[i];
                break;
            }
        }
        System.out.println("Majority Element: " + majority);
    }
}