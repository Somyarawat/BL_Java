import java.util.*;
class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.print("Enter elements of Array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();

            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println("Even");
                }
                else {
                    System.out.println("Odd");
                }
            }
            else if (arr[i] < 0){
                System.out.println("Negative");
            }
            else {
                System.out.println("Zero");
            }
        }
        if (arr[0] > arr[4]) {
            System.out.println("First element is greater");
        }
        else if (arr[0] < arr[4]) {
            System.out.println("Last element is greater");
        }
        else {
            System.out.println("They are equal");
        }
    }
}